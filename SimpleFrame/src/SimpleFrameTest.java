import com.sun.java.accessibility.util.java.awt.TextComponentTranslator;
import com.sun.javafx.css.Size;

import javax.swing.*;
import java.awt.*;



/**
 * Created by mavis on 4/13/16.
 */
public class SimpleFrameTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setTitle("Simple Frame Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame
{

    public SimpleFrame()
    {
        Toolkit kit = getToolkit();
        Dimension screensize = kit.getScreenSize();
        setSize(screensize.width/2, screensize.height/2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("Icon.gif").getImage();
        setIconImage(img);
        add(new myComponents());
    }
}

class myComponents extends JComponent
{
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g)
    {
        g.drawString("Hello World", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}