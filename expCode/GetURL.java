import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import  java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GetURL {
    List<URLproperty> urlcandidate = new ArrayList<>();
    HashMap<String,List<URLproperty>> urlMap;
    public GetURL(){
        urlMap = new HashMap<String,List<URLproperty>>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e1){
            System.out.println("can not find sql drivers");
            e1.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/urltable";
        Connection conn;
        Statement stmt=null;
        try {
            conn = DriverManager.getConnection(url,    "root","woshi123");
            stmt = conn.createStatement();
            String sql="select * from url;";
            ResultSet urls = stmt.executeQuery(sql);
            List<URLproperty> zh_common = new ArrayList<>();
            List<URLproperty> en_common = new ArrayList<>();
            while(urls.next()){
                String uurl = urls.getString("url");
                String type = urls.getString("type").toLowerCase();
                String language = urls.getString("language").toLowerCase();
                boolean bool_support = urls.getBoolean("bool_support");
                String label = type+"_"+language;
                URLproperty tempurl=new URLproperty();
                tempurl.setBool_support(bool_support);
                tempurl.setUrl(uurl);
                if (type.equals("common")){
                    if (language.equals("zh")){
                        zh_common.add(tempurl);
                    }else if (language.equals("en")){
                        en_common.add(tempurl);
                    }
                    continue;
                }
                List<URLproperty> urllist;
                if (urlMap.containsKey(label)){
                    urllist = urlMap.get(label);
                }else{
                    urllist=new ArrayList<>();//get corresponding urls for each type
                    urlMap.put(label, urllist);
                }
                urllist.add(tempurl);
            }
            for (Entry<String,List<URLproperty>> e: urlMap.entrySet()){
                if (e.getKey().endsWith("_zh")){
                    e.getValue().addAll(zh_common);
                }else if (e.getKey().endsWith("_en")){
                    e.getValue().addAll(en_common);
                }
            }
            urlMap.put("common_zh", zh_common);
            urlMap.put("common_en", en_common);
            stmt.close();
        } catch (Exception e){
            System.out.println("error during myql");
        }


    }

    public List<String> get(Query query) {
        if(query==null){
//            RLog.debug("query is empty");
            System.exit(-1);
        }
        BoolExp boolexp=new BoolExp(query);
        SegExp segexp=new SegExp(query);
        List<String> ret = new ArrayList<>();

        urlcandidate=urlMap.get(query.getClassificationLabel()+"_"+query.getLanguage());
        if(urlcandidate==null){
            System.out.println("No exactly matched classification");
            return ret;
        }
        for (URLproperty u : urlcandidate){
            String Title = "";
            String url=u.getUrl();
            if(u.isBool_support()) {
                Title+=boolexp.getAll_these();
                if (url.contains("baidu")){
                    Title+="("+boolexp.getAny_these().trim().replace(" "," | ")+")";
                }
                else if (url.contains("google")){
                    Title+=boolexp.getAny_these().trim().replace(" "," OR ");
                }
                //only support baidu and google search
            }
            else
                Title = segexp.getSegments();
            Title=Title.trim();
            Title=Title.replace(" ","+");
            Title=Title.replace("(","%28");
            Title=Title.replace(")","%29");
            Title=Title.replace("|","%7C");
            ret.add(url+(Title));
        }
        return ret;
    }

}


//
//public class GetURL {
//    Query query = null;
//    int counter = -1;
//    String Title = null;
//    String URL = null;
//    List<String> urlcandidate = new ArrayList<>();
//    static HashMap<String,List<String>> urlMap;
//    static{
//        urlMap = new HashMap<String,List<String>>();
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch(ClassNotFoundException e1){
//            System.out.println("can not find sql drivers");
//            e1.printStackTrace();
//        }
//        String url="jdbc:mysql://localhost:3306/mysql";
//        Connection conn;
//        List<String> typelist=new ArrayList<>();
//        try {
//            conn = DriverManager.getConnection(url,    "nudt1","bjgdFristAnswercow666");
//            Statement stmt = conn.createStatement();
//            String sql="select distinct type from urltable;";
//            ResultSet types = stmt.executeQuery(sql);
//            int i=0;
//            while (types.next()){
//                System.out.println(types.getString(1));
//                typelist.add(types.getString(1));//get type and keep it in a list
//            }
//            if(typelist.isEmpty()){
//                System.out.println("the url table is empty\nexiting...");
//                System.exit(-1);
//            }
//            else{
//                for(String tp:typelist){
//                    sql="select url from urltable where type="+"\""+tp+"\";";
//                    ResultSet urls=stmt.executeQuery(sql);
//                    List<String> urllist=new ArrayList<>();//get corresponding urls for each type
//                    while(urls.next()){
//                        urllist.add(urls.getString(1));
//                    }
//                    urlMap.put(tp, urllist);
//                }
//            }
//            stmt.close();
//            conn.close();
//
//        } catch (SQLException e){
//            System.out.println("connect to mysql failed");
//            System.out.println("urlMap is empty");
//            e.printStackTrace();
//        }
//    }
//    /**
//     * @param query,mode
//     * @author gutten
//     * @query query object
//     * @mode {0,1} 0 means searching for title;1 means searching for boolean expression
//     */
//    public GetURL(Query query,int mode) {
//        this.query = query;
//        if(mode==0){
//            Title = URLEncoder.encode(query.getQueryTitle());
//        }
//        else if(mode==1){
//
//        }
//        String ll=query.getClassificationLabel();
//        List<String> uc=new ArrayList<>();
//        HashMap<String,List<String>> um = new HashMap<String,List<String>>(urlMap);
//
//        uc=um.get(ll);
//        uc.get(0);
//        if(urlcandidate==null){
//            System.out.println("related url template is not exist");
//            System.exit(-1);
//        }
//    }
//
//    public int getWebsiteNumber(){
//        return urlcandidate.size();
//    }
//
//    public String getUrl() {
//        counter++;
//
//        if(urlcandidate==null){
//            System.out.println("[warning:] urls relevanted to "+query.getClassificationLabel()+" not found");
//            return null;
//        }
//        else if(counter>=urlcandidate.size()){
//            System.out.println("[warning:] Index Out Of Bounds Exception，return null");
//            return null;
//        }
//        URL=urlcandidate.get(counter)+Title;
//        return URL;
//    }
//}
