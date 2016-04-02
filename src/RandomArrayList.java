import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rezina Sharmin on 4/1/2016.
 */
public class RandomArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);

        Random r = new Random();

        System.out.print(list.get(r.nextInt(list.size())));
    }
}
