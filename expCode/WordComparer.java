import java.util.Comparator;

/**
 * Created by gutten on 2016/1/11.
 */
public class WordComparer implements Comparator<ACWord> {
    @Override
    public int compare(ACWord x, ACWord y) {
        // TODO: Handle null x or y values
        int startComparison = compared(x.getWeight(), y.getWeight());
        return startComparison;
//        return startComparison != 0 ? startComparison
//                : compared(x.getWeight(), y.getWeight());
    }

    // I don't know why this isn't in Long...
//    private static int compares(String a, String b) {
//        return a.compareTo(b) ?
//                : a > b ? 1
//                : 0;
//    }
    private static int compared(double a, double b) {
        return a < b ? 1
                : a > b ? -1
                : 0;
    }
}
