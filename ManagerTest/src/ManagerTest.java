import com.corejava.*;

import java.util.*;

/**
 * Created by mavis on 4/7/16.
 */
public class ManagerTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Employee> staff = new ArrayList<Employee>();
        Manager boss = new Manager("Carl", 6000, 2000, 12, 2);
        boss.setBonus(2000);
        staff.add(boss);
        staff.add(new Employee("Mike", 6000, 2004, 4, 5));
        staff.add(new Employee("Jhon", 7500, 2010, 5,19));
        Employee stafflist[] = new Employee[staff.size()];
        stafflist[0] = staff.get(0).clone();
        stafflist[1] = staff.get(1).clone();
        stafflist[2] = staff.get(2).clone();
        Arrays.sort(stafflist);
        for (Employee e:stafflist)
        {
            System.out.println(e.getId() + " " +e.getName() + " " + e.getSalary());
            System.out.println(e.toString());
            System.out.println(e.hashCode());
        }
    }
}
