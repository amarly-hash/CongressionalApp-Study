import javax.swing.*;
import java.awt.*;
/*#For testing purposes only, do NOT keep this in the final version!!!!*/
public class test
{
    public test()
    {
        //creates a frame. (other constructors take a title, the GraphicsConfiguration class (https://docs.oracle.com/javase/8/docs/api/java/awt/GraphicsConfiguration.html), or both )
        //can be passed without parameters, but this example has a title
        JFrame frame = new JFrame("TestWindow");

        //sets the layout manager
        frame.setLayout(new FlowLayout());

        //allows for the frame to be decorated
        frame.setUndecorated(false);

        //creates a panel to hold the elements
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new PomoTime());
        panel.add(new ClockWindow());
        //creates a border using the BorderFactory class
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(panel);
        
        //maskes the frame visible (based off of boolean, so you could make it conditional if you wanted to)
        frame.setVisible(true);
        frame.pack();
    }
}