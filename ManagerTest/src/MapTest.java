import com.corejava.*;

import java.util.*;


/**
 * Created by mavis on 4/21/16.
 */
public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee> staff = new HashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Amy Lee", 10000, 2011, 12, 4));
        staff.put("567-24-2546", new Employee("Harry Hacker", 8000, 2008, 2, 14));
        staff.put("157-62-7935", new Employee("Garry Cooper", 7000, 2009, 6, 25));
        System.out.println(max(staff.values()));
//        for (Map.Entry<String, Employee> entry:staff.entrySet())
//        {
//            System.out.println("Key = " + entry.getKey() +" Value = " + entry.getValue());
//        }
//
//        for (Employee values: staff.values()
//             ) {
//            System.out.println("Value = " + values);
//        }
//
//        for (String key:staff.keySet()
//             ) {
//            System.out.println("Key = " +key);
//        }


    }
    public static <Employee extends Comparable> Employee max(Collection<Employee> c)
    {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<Employee> iter = c.iterator();
        Employee max = iter.next();
        while(iter.hasNext())
        {
            Employee next = iter.next();
            if(max.compareTo(next)<0) max = next;
        }
        return max;
    }
}
