import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;


/**
 * Created by mavis on 4/12/16.
 */
public class timeListen
{
    public static void main(String[] args)
    {
        ActionListener  listener= new TimerPrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
class TimerPrinter implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}