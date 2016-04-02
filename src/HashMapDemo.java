import java.util.*;
import java.util.Iterator;

/**
 * Created by Rezina Sharmin on 4/1/2016.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> item = new LinkedHashMap<String, Double>();

        item.put("Shirt", 22.23);
        item.put("Tshirt", 1.00);
        item.put("Jeans Pent", 55.99);
        item.put("Slacks", 88.00);

       //Using Iterator
        Set a = item.entrySet();

        Iterator it = a.iterator();

        while(it.hasNext()){
            Map.Entry b = (Map.Entry)it.next();
            System.out.print(b.getKey()+ ": ");
            System.out.print(b.getValue()+ " ");
        }
        //Using for each loop

        for (Map.Entry<String, Double> abc:item.entrySet()){
            System.out.println("Key: " + abc.getKey()+" "+ "Value: " + abc.getValue());
        }

    }


}
