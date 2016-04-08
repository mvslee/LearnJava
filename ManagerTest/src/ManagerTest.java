import com.corejava.*;

/**
 * Created by mavis on 4/7/16.
 */
public class ManagerTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        Manager boss = new Manager("Carl", 8000, 2000, 3, 12);
        boss.setBonus(2000);
        staff[0] = boss;
        staff[1] = new Employee("Mike", 6000, 2005, 4, 10);
        staff[2] = new Employee("Jack", 5000, 2011, 5, 12);
        for (Employee e:staff)
        {
            e.setId();
            System.out.println(e.getId() + " " +e.getName() + " " + e.getSalary());
            e.getDescription();
        }

    }
}
