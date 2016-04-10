/**
 * Created by gutten on 2016/1/20.
 */
//import org.json.*;

public class BoolExp {
    private String all_these;
    private String any_these;
    private String whole_these;
    private String query_req;
    private String[] segs;
    Query query;

    public BoolExp(Query query) {
        this.query=query;
        String logic=query.getLogicQuery();
//        JSONObject req=null;
        try{
//            req=new JSONObject(logic);
//            query_req=(String) req.get("required");
            segs=query_req.split("&&");
        }catch (Exception e){
//            RLog.debug("required part convert to json failed");
//            RLog.error(e.getMessage());
            System.exit(-1);
        }
    }

    public String getAll_these() {
        setAll_these();
        return all_these;
    }

    private void setAll_these() {
        String all_these="";
        for(String seg:segs){
            if(seg.isEmpty()){
                continue;
            }
            String[] words=seg.split("\\(|\\)|\\|");
            for(String word:words){
                if(word.isEmpty()){
                    continue;
                }
                all_these+=word+" ";
                break;
            }
        }
        this.all_these = all_these;
    }

    public String getAny_these() {
        setAny_these();
        return any_these;
    }

    private void setAny_these() {
        String any_these="";
        for(String seg:segs){
            if(seg.isEmpty()){
                continue;
            }
            int flag=0;
            String[] words=seg.split("\\(|\\)|\\|");
            for(int i=0;i<words.length;i++){
                String word=words[i];
                if(word.isEmpty()){
                    flag++;
                    continue;
                }
                if(i>flag){
                    any_these+=word+" ";
                }
            }
        }
        this.any_these = any_these;
    }

    private String getWhole_these() {
        return whole_these;
    }

    private void setWhole_these(String whole_these) {
        this.whole_these = whole_these;
    }

}
