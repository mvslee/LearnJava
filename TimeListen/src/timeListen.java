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
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        ActionListener listener = clock.new TimerPrinter();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        ActionListener listener = this.new TimerPrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
    public class TimerPrinter implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone, time is " + now);
            if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
