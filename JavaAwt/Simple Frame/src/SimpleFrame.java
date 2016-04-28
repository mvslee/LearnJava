package simpleFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

import javax.tools.Tool;

/**
 * Created by mavis on 4/22/16.
 */
public class SimpleFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Simple frame = new Simple();
//                frame.setExtendedState(Frame.MAXIMIZED_BOTH);    //set frame size as max of this screen
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                    }
                });
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class Simple extends JFrame
{
    private JPanel buttonpanel;
    public Simple() throws HeadlessException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        int screensizeWidth =(int) screensize.getWidth();
        int screensizeHeight = (int)screensize.getHeight();
        setSize(screensizeWidth/2, screensizeHeight/2);
        setLocationByPlatform(true);
        Image img = new ImageIcon("Icon.gif").getImage();
        setIconImage(img);
//        add(new MyComponent());
        buttonpanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info: infos
             ) {
            makeButton(info.getName(), info.getClassName());
        }
        add(buttonpanel);        // remember this code, add panel to frame.
        pack();
    }
    public void makeButton(String name, final String plafName)
    {
        JButton button = new JButton(name);
        buttonpanel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    UIManager.setLookAndFeel(plafName);
                    SwingUtilities.updateComponentTreeUI(Simple.this);
                    pack();
                }
                catch (Exception exp)
                {
                    exp.printStackTrace();
                }
            }
        });

    }


}

class MyComponent extends JComponent
{
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    private static int DEFAULT_WIDTH = 300;
    private static int DEFAULT_HEIGHT = 200;
    public void paintComponent(Graphics g)
    {
        g.drawString("Hello World!", MESSAGE_X, MESSAGE_Y);
    }
//
//    public Dimension getPreferredSize()
//    {
//        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//    }
}