
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Query{
    private String queryID;		//	查询ID
    private String queryTitle;		//	查询标题
    private String queryBody;		//	查询描述
    private String sessionID;		//	会话ID
    private Date queryTime;		//	查询提交时间
    private String classificationLabel;		//	查询分类标签
    private List<ACWord> titleSegment = new ArrayList<ACWord>();		//	查询标题分词结果
    private List<ACWord> bodySegment = new ArrayList<ACWord>();		//	查询描述分词结果
    private String language="zh";
//    private CoNLLSentence titleDependencyParser;      //  查询标题句法分析结果
//    private CoNLLSentence bodyDependencyParser;      //  查询描述句法分析结果
    // metasearch
    private String logicQuery;		//	查询布尔逻辑表示
//    private List<CandidateResult> clickedResult = new ArrayList<CandidateResult>();  // 历史查询结果，来自log
    private List<Query> history = new ArrayList<Query>();		//	历史查询，来自log
    // knowledge graph
    private List<Map<String,Object>> sparqlQuery;		//	查询sparql表示

    private int streamNum;   //do not need save in json

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private int detailPageCrawlNum;   //do not need save in json
//    public Query(){
//        init();
//    }
//    public Query(String v){
//        init();
//        this.fromJSONObject(v);
//    }
    public int getDetailPageCrawlNum() {
        return detailPageCrawlNum;
    }
    public void setDetailPageCrawlNum(int detailPageCrawlNum) {
        this.detailPageCrawlNum = detailPageCrawlNum;
    }
    public int getStreamNum() {
        return streamNum;
    }
    public void setStreamNum(int websiteCrawlNum) {
        this.streamNum = websiteCrawlNum;
    }

//    public String toString(){
//        return this.toJSONObject().toString();
//    }
    public String getQueryID() {
        return queryID;
    }
    public void setQueryID(String queryID) {
        this.queryID = queryID;
    }
    public String getQueryTitle() {
        return queryTitle;
    }
    public void setQueryTitle(String queryTitle) {
        this.queryTitle = queryTitle;
    }
    public String getQueryBody() {
        return queryBody;
    }
    public void setQueryBody(String queryBody) {
        this.queryBody = queryBody;
    }
    public String getSessionID() {
        return sessionID;
    }
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    public Date getQueryTime() {
        return queryTime;
    }
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }
    public void setQueryTime(Long queryTime) {
        this.queryTime = new Date(queryTime);
    }
    public String getClassificationLabel() {
        return classificationLabel;
    }
    public void setClassificationLabel(String classificationLabel) {
        this.classificationLabel = classificationLabel;
    }
    public List<Map<String, Object>> getSparqlQuery() {
        return sparqlQuery;
    }
    public void setSparqlQuery(List<Map<String, Object>> sparqlQuery) {
        this.sparqlQuery = sparqlQuery;
    }
//    public void setSparqlQuery(String jsonstr) {
//        JSONArray array = JSONArray.fromObject(jsonstr);
//
//        this.sparqlQuery = new ArrayList<Map<String,Object>>();
//        ACJsonUtils.JsonArray2HashMap(array, sparqlQuery);
//    }

    public String getLogicQuery() {
        return logicQuery;
    }
    public void setLogicQuery(String logicQuery) {
        this.logicQuery = logicQuery;
    }
//    public List<CandidateResult> getClickedResult() {
//        return clickedResult;
//    }
//    public void setClickedResult(List<CandidateResult> clickedResult) {
//        this.clickedResult = clickedResult;
//    }
//    public void setClickedResult(String jsonstr) {
//        this.clickedResult = CandidateResult.parseCandidateList(jsonstr);
//    }

//    public static List<Query> parseQueryList(String jsonstr){
//        JSONArray array = JSONArray.fromObject(jsonstr);
//        return parseQueryList(array);
//    }
//    public static List<Query> parseQueryList(JSONArray arry){
//        List<Query> list = new ArrayList<>();
//        JSONArray jsonArray = arry;
//        for (Object o:jsonArray){
//            list.add(new Query(o.toString()));
//        }
//        return list;
//    }
    public List<Query> getHistory() {
        return history;
    }
    public void setHistory(List<Query> history) {
        this.history = history;
    }

    public List<ACWord> getTitleSegment() {
        return titleSegment;
    }
    public void setTitleSegment(List<ACWord> titleSegment) {
        this.titleSegment = titleSegment;
    }
//    public void setTitleSegment(String titleSegment) {
//        this.titleSegment = ACWord.parseACWordList(titleSegment);
//    }
//    public void setTitleSegment(JSONArray titleSegment) {
//        this.titleSegment = ACWord.parseACWordList(titleSegment);
//    }
    public List<ACWord> getBodySegment() {
        return bodySegment;
    }
    public void setBodySegment(List<ACWord> bodySegment) {
        this.bodySegment = bodySegment;
    }
//    public void setBodySegment(String bodySegment) {
//        this.bodySegment = ACWord.parseACWordList(bodySegment);
//    }
//    public void setBodySegment(JSONArray bodySegment) {
//        this.bodySegment = ACWord.parseACWordList(bodySegment);
//    }
//    public CoNLLSentence getTitleDependencyParser() {
//        return titleDependencyParser;
//    }
//    public void setTitleDependencyParser(CoNLLSentence titleDependencyParser) {
//        this.titleDependencyParser = titleDependencyParser;
//    }
//    public CoNLLSentence getBodyDependencyParser() {
//        return bodyDependencyParser;
//    }
//    public void setBodyDependencyParser(CoNLLSentence bodyDependencyParser) {
//        this.bodyDependencyParser = bodyDependencyParser;
//    }

}
