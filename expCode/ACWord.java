import java.util.ArrayList;
import java.util.List;

//import com.hankcs.hanlp.collection.dartsclone.Pair;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;

public class ACWord{
    /**
     * word	分词内容
     */
    private String word;   // 词
    /**
     * pos	词性标注
     */
    private String pos; // 词性
    /**
     * nerType	命名实体类型: 0,1,2 表示人名，地名，机构名，-1表示非命名实体
     */
    private int nerType=-1;
//    private List<Pair<String, Double>> freebaseURI;    //  对应KB中的URI及权重,若不存在对应关系则为默认值null
    private int type = 0;   //  -1,0,1表示other, entity, relation
    private double weight = -1.0;   //-1.0表示初始值，正值表示相似词与原词的相似度
    private List<ACWord> hyponyms = new ArrayList<ACWord>();    // 下位词
    private List<ACWord> synonyms = new ArrayList<ACWord>();    // 同义词

//    public ACWord(){
//        init();
//    }
//
//    public ACWord(String json){
//        init();
//        this.fromJSONObject(json);
//    }
//    public String toString(){
//
//        return this.toJSONObject();
//    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getPos() {
        return pos;
    }
    public void setPos(String pos) {
        this.pos = pos;
    }
    public int getNerType() {
        return nerType;
    }
    public void setNerType(int nerType) {
        this.nerType = nerType;
    }

    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public List<ACWord> getHyponyms() {
//		String[] strings={"一","二","三","四","五","六","七","八"};
//		List<ACWord> temp=new ArrayList<>();
//		for(int i=0;i<5;i++){
//			ACWord kk=new ACWord();
//			kk.setWord("同义"+strings[i]);
//			kk.setWeight((double)i/6.0);
//			temp.add(kk);
//		}
//		return temp;
        return hyponyms;
    }
    public void setHyponyms(List<ACWord> hyponyms) {
        this.hyponyms = hyponyms;
    }
//    public static List<ACWord> parseACWordList(String jsonstr) {
//        JSONArray array = JSONArray.fromObject(jsonstr);
//        List<ACWord> list = new ArrayList<ACWord>();
//        for (Object s: array){
//            list.add(new ACWord(s.toString()));
//        }
//        return list;
//    }
//    public static List<ACWord> parseACWordList(JSONArray array) {
//        List<ACWord> list = new ArrayList<ACWord>();
//        for (Object s: array){
//            list.add(new ACWord(s.toString()));
//        }
//        return list;
//    }
//    public void setHyponyms(String hyponyms) {
//        this.hyponyms = parseACWordList(hyponyms);
//    }
    public List<ACWord> getSynonyms() {
//		String[] strings={"一","二","三","四","五","六","七","八"};
//		List<ACWord> temp=new ArrayList<>();
//		for(int i=0;i<4;i++){
//			ACWord kk=new ACWord();
//			kk.setWord("下位"+strings[7-i]);
//			kk.setWeight((double)i/5.0);
//			temp.add(kk);
//		}
//		return temp;
        return synonyms;
    }
    public void setSynonyms(List<ACWord> synonyms) {
        this.synonyms = synonyms;
    }
//    public void setSynonyms(String synonyms) {
//        this.synonyms = parseACWordList(synonyms);
//    }
//    public List<Pair<String, Double>> getFreebaseURI() {
//        return freebaseURI;
//    }
//    public void setFreebaseURI(List<Pair<String, Double>> freebaseURI) {
//        this.freebaseURI = freebaseURI;
//    }
//    public void setFreebaseURI(String freebaseURI) {
//        JSONArray array = JSONArray.fromObject(freebaseURI);
//        List<Pair<String, Double>> list = new ArrayList<Pair<String, Double>>();
//        for (Object object : array){
//            JSONObject jsonObject = (JSONObject)object;
//            Pair<String, Double> pair = new Pair<String, Double>((String)jsonObject.keySet().toArray()[0], (Double)jsonObject.get(jsonObject.keySet().toArray()[0]));
//            list.add(pair);
//        }
//        this.freebaseURI = list;
//    }

}