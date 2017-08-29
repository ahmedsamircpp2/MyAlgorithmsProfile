package Mathematics.fundamentals;

/**
 * Created by Ahmed on 5/26/17.
 */
public class EvenOddQuery {
    private static EvenOddQuery ourInstance = new EvenOddQuery();

    private EvenOddQuery() {
    }

    public static EvenOddQuery getInstance() {
        return ourInstance;
    }
}
