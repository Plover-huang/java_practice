
/**
 * @author gutten
 * @date 2016骞�1鏈�13鏃�
 * @description
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ttt {
//	public static void main(String[]  args) throws Exception{
//		W2VWebService ws=new W2VWebService();
//		System.out.println(ws.getProxy().word_similarity_zh("涓浗", "澶ч檰"));
//	}

    //	public static void main(String[] args){
//		Map urlhashmap=new HashMap();
//		Query query=new Query();
//		query.setClassificationLabel("life");
//
//        try{
//            //璋冪敤Class.forName()鏂规硶鍔犺浇椹卞姩绋嬪簭
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("鎴愬姛鍔犺浇MySQL椹卞姩锛�");
//        }catch(ClassNotFoundException e1){
//            System.out.println("鎵句笉鍒癕ySQL椹卞姩!");
//            e1.printStackTrace();
//        }
//
//        String url="jdbc:mysql://rdf.answercow.org:6012/Answercow";    //JDBC鐨刄RL
//        //璋冪敤DriverManager瀵硅薄鐨刧etConnection()鏂规硶锛岃幏寰椾竴涓狢onnection瀵硅薄
//        Connection conn;
//        try {
//            conn = DriverManager.getConnection(url,    "nudt1","bjgdFristAnswercow666");
//            //鍒涘缓涓�涓猄tatement瀵硅薄
//            Statement stmt = conn.createStatement(); //鍒涘缓Statement瀵硅薄
//            System.out.println("鎴愬姛杩炴帴鍒版暟鎹簱锛�");
//            String sql="select * from urltable where type="+"\""+query.getClassificationLabel()+"\";";
//            System.out.println(sql);
//            List<String> url1=new ArrayList();
//            ResultSet rs = stmt.executeQuery(sql);
////            System.out.println(rs.absolute(2));
////            String[] url1 = new String();
//
////            for(int i=0;i<rs.getFetchSize();i++){
////            	System.out.println(rs.getFetchSize());
////            }
//            	int i=0;
//            while (rs.next()){
//            	System.out.print(rs.getInt(1) + "\t");
//            	System.out.print(rs.getString(2) + "\t");
//            	System.out.print(rs.getString(3) + "\t");
////            	url1[i++]=rs.getString(2);
//            	url1.add(rs.getString(2));
//            	System.out.println();
//            }
//            for(String l:url1){
//            	System.out.println(l);
//            }
//            System.out.println("鎵撳嵃鎴愬姛");
//            stmt.close();
//            conn.close();
//        } catch (SQLException e){
//        	System.out.println("杩炴帴鏁版嵁搴撳け璐�");
//            e.printStackTrace();
//        }
//  	}
    public static void main(String[] args){
//        Query query1=new Query();
//        query1.setClassificationLabel("commom");
//        List<ACWord> aw=new ArrayList<>();
//        ACWord w1=new ACWord();
//        ACWord w2=new ACWord();
//        w1.setWord("鍖椾含");
//        w2.setWord("闄嗗啗");
//        aw.add(w1);
//        aw.add(w2);
//        query1.setTitleSegment(aw);
//        query1.setClassificationLabel("common");
//        query1.setLanguage("zh");
//        query1.setLogicQuery("{\"required\":(鍖椾含||棣栭兘)&&(闄嗗啗||鍩哄湴),\"optional\":(涓ぎ||鍐涘),\"nein\":NULL}");
//
//        GetURL test1=new GetURL();
//        List<String> ls1=test1.get(query1);
//        for(String ss:ls1){
//            System.out.println(ss);
//        }
//        HashMap<Character, Integer> xx=new HashMap<>();
//        xx.put('a', 1);
//        xx.put('b', 2);
//        String bb="abcdabcabacbsd";
//        char[] cc=bb.toCharArray();
//        for(Character tt:cc){
//        	if(xx.containsKey(tt))
//        	xx.put(tt, xx.get(tt)+1);
//        	else {
//				xx.put(tt, 1);
//			}
//        }
        
        HashMap<String, List<Double>> asdf=new HashMap<>();
        List<Double> bDoubles=new ArrayList<>();
        bDoubles.add(1.0);
        bDoubles.add(2.0);
        asdf.put("1", bDoubles);
        asdf.put("2", bDoubles);
        System.out.println(asdf);
        
        Set<String> bb=new HashSet<>();
        bb.add("1");
        bb.add("2");
        bb.add("4");
        bb.add("1");
        System.out.println();
    }
}
