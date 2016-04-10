import java.util.ArrayList;
import java.util.List;

/**
 * Created by gutten on 2016/1/21.
 */
public class gyb{
    public List<String> getLl() {
        return ll;
    }
    private int len=0;

    private List<String> ll= new ArrayList<>();
        public  void getList(List<List<String>> ls, String s, int k) {
            if (k < ls.size()) {
                for (int j = 0; j < ls.get(k).size(); j++) {
                    s = s + ls.get(k).get(j)+" ";
                    k = k + 1;
                    getList(ls, s, k);

                    k=k-1;
                    len=ls.get(k).get(j).length()+1;
                    len=s.length()-len;
                    s =s.substring(0, len);
//                    len=0;
                }
            } else {
                ll.add(s);
            }
        }

    public static void main(String[] args){
        List<List<String>> ttList=new ArrayList<List<String>>();
        List<String> tempList=new ArrayList<String>();
        tempList.add("陆军");
        tempList.add("基地");
        tempList.add("a");
//        tempList.add("b");
//        tempList.add("c");
        ttList.add(tempList);
        List<String> tempList2=new ArrayList<String>();
        tempList2.add("北京");
        tempList2.add("首都");

        tempList2.add("X");
//        tempList2.add("Y");
        ArrayList<String> l3 = new ArrayList<String>();
//        l3.add("A");
//        l3.add("B");
        l3.add("C");
        ttList.add(l3);
        ttList.add(tempList2);
        System.out.println(ttList);
        String s = "";
        gyb bb=new gyb();
        bb.getList(ttList, s, 0);
        System.out.println(bb.getLl());
    }
}
