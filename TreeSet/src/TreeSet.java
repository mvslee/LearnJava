import java.util.Comparator;
import java.util.SortedSet;

/**
 * Created by mavis on 4/21/16.
 */
public class TreeSet {
    public static void main(String[] args)
    {
        SortedSet<Item> part = new java.util.TreeSet<Item>();
        part.add(new Item("Toaster", 1234));
        part.add(new Item("Widget", 4562));
        part.add(new Item("Modem", 1612));
        System.out.println(part);

        SortedSet<Item> sortedbyDescription = new java.util.TreeSet<Item>(
                new Comparator<Item>() {
                    public int compare(Item o1, Item o2) {
                        return o1.getDescription().compareTo(o2.getDescription());
                    }
                }
        );
        sortedbyDescription.addAll(part);
        System.out.println(sortedbyDescription);
    }

}
