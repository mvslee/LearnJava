import java.util.*;


/**
 * Created by mavis on 4/21/16.
 * A priority queue in which there's a comparator, compare by month instead of year.
 */
public class PriorityQueue {
    public static void main(String[] args)
    {
        java.util.PriorityQueue<GregorianCalendar> pq = new java.util.PriorityQueue<GregorianCalendar>
                (
                new Comparator<GregorianCalendar>() {
                    public int compare(GregorianCalendar o1, GregorianCalendar o2) {
                        return (o1.get(GregorianCalendar.MONTH) - o2.get(GregorianCalendar.MONTH));
                    }
                }
        );
        pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1910, Calendar.FEBRUARY, 22));
        pq.add(new GregorianCalendar(1908, Calendar.JUNE,12));
        for (GregorianCalendar e:pq
             ) {
            System.out.println(e.get(Calendar.MONTH));

        }

//        GregorianCalendar d1 = new GregorianCalendar(1906, Calendar.DECEMBER, 9);
//        GregorianCalendar d2 = new GregorianCalendar(1910, Calendar.JUNE, 22);
//        System.out.print(d1.get(GregorianCalendar.MONTH)- d2.get(GregorianCalendar.MONTH));
    }
}
