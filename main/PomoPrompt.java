import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.beans.*;
public class PomoPrompt{
    public void PomoPrompt()
    {
        //sets up all of the window stuff, like the layout, size, visibilty, and makes it visible
        JFrame PromptWindow = new JFrame();
        PromptWindow.setLayout(new FlowLayout());
        PromptWindow.setSize(350, 200);

        // all of the elements i need in the window 
        JLabel TimeQuestion = new JLabel("How long do you want the Pomodoro to be?");
        JLabel SecQuestion = new JLabel("How many second(s) do you want to work for?");
        JLabel MinQuestion = new JLabel("How many minute(s) do you want to work for?");
        JLabel HourQuestion = new JLabel("How many hour(s) do you want to work for?");
        //input fields
        JFormattedTextField PomoSec = new JFormattedTextField("");
        PomoSec.setPreferredSize(new Dimension(25, 20));
        JFormattedTextField PomoMin = new JFormattedTextField("");
        PomoMin.setPreferredSize(new Dimension(25, 20));
        JFormattedTextField PomoHour = new JFormattedTextField("   ");
        PomoHour.setPreferredSize(new Dimension(25, 20));
        JButton PomoEnter = new JButton("Set Timer");

        //adds everything to the frame
        PromptWindow.add(TimeQuestion);
        PromptWindow.add(SecQuestion);
        PromptWindow.add(PomoSec);
        PromptWindow.add(MinQuestion);
        PromptWindow.add(PomoMin);
        PromptWindow.add(HourQuestion);
        PromptWindow.add(PomoHour);
        PromptWindow.add(PomoEnter);
        PromptWindow.setResizable(false);
        PromptWindow.setVisible(true);
        //PromptWindow.setBackground(Color.black);
        PromptWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    public void propertyChange(PropertyChangeEvent e)
        {
        
        }
}