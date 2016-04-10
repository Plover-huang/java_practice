/**
 * Created by gutten on 2016/1/20.
 */
public class SegExp {
    private String segments="";

    public SegExp(Query query) {
        if(query.getTitleSegment()==null){
//            RLog.debug("the title segments of query is empty");
        }
        String input="";
        for(ACWord word:query.getTitleSegment()){
            input+=word.getWord()+" ";
        }
        this.segments = input;
    }

    public String getSegments() {
        return segments;
    }
}
