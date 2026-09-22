import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;

public class test
{
    public static notesTaker n = new notesTaker();
    public test()
    {
        JFrame f = new JFrame();
        f.add(n);
        f.pack();
        f.setVisible(true);
    }
}