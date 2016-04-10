
import java.util.Date;

public class CandidateResult {
    private String queryID;		//	查询ID
    private String sessionID;		//	会话ID
    private String resultID;		//	候选答案ID
    private String resultTitle;		//	候选答案标题
    private String resultSummary;  //	候选答案摘要
    private String resultBody;		//	候选答案正文
    private String resultType = "MetaSearch";		//	MetaSearch或 KnowledgeGraph
    private double score;		//	候选答案质量打分
    private Date publishTime;  //	网页发表时间
    private String URL;		//	候选答案网页URL
    private String author;		//	候选答案作者(贴吧论坛等)
    private String sourceWebsite;  //	答案来源网站(例如百度贴吧，新浪体育，百度知道)
    // 针对CQA
    private int viewNum;		//	浏览数目
    private int replyNum;  // 回复数目
    private Boolean bestAnswer;		//	是否是最佳答案
    public String getQueryID() {
        return queryID;
    }
    public void setQueryID(String queryID) {
        this.queryID = queryID;
    }
    public String getSessionID() {
        return sessionID;
    }
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    public String getResultID() {
        return resultID;
    }
    public void setResultID(String resultID) {
        this.resultID = resultID;
    }
    public String getResultTitle() {
        return resultTitle;
    }
    public void setResultTitle(String resultTitle) {
        this.resultTitle = resultTitle;
    }
    public String getResultSummary() {
        return resultSummary;
    }
    public void setResultSummary(String resultSummary) {
        this.resultSummary = resultSummary;
    }
    public String getResultBody() {
        return resultBody;
    }
    public void setResultBody(String resultBody) {
        this.resultBody = resultBody;
    }
    public String getResultType() {
        return resultType;
    }
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public Date getPublishTime() {
        return publishTime;
    }
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getSourceWebsite() {
        return sourceWebsite;
    }
    public void setSourceWebsite(String sourceWebsite) {
        this.sourceWebsite = sourceWebsite;
    }
    public int getViewNum() {
        return viewNum;
    }
    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }
    public int getReplyNum() {
        return replyNum;
    }
    public void setReplyNum(int replyNum) {
        this.replyNum = replyNum;
    }
    public Boolean getBestAnswer() {
        return bestAnswer;
    }
    public void setBestAnswer(Boolean bestAnswer) {
        this.bestAnswer = bestAnswer;
    }
}
