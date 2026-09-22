import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.*;
import javax.swing.JButton;
import java.beans.*;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import javax.swing.JPanel;

public class PomoPrompt extends JPanel implements ActionListener{
    int[] PomoTimearray = {1,2,3};
    JFormattedTextField PomoSec = new JFormattedTextField("");
    JFormattedTextField PomoMin = new JFormattedTextField("");
    JFormattedTextField PomoHour = new JFormattedTextField("");
    JButton PomoEnter = new JButton("Set Timer");
    public PomoPrompt()
    {
        //sets up all of the window stuff, like the layout, size, visibilty, and makes it visible
        JPanel PromptWindow = new JPanel();
        PromptWindow.setLayout(new FlowLayout());
        PromptWindow.setSize(350, 200);

        // all of the elements i need in the window 
        JLabel TimeQuestion = new JLabel("How long do you want the Pomodoro to be?");
        JLabel SecQuestion = new JLabel("How many second(s) do you want to work for?");
        JLabel MinQuestion = new JLabel("How many minute(s) do you want to work for?");
        JLabel HourQuestion = new JLabel("How many hour(s) do you want to work for?");
        //PomoEnter.addActionListener(new PomoPrompt());
        //input fields
        PomoSec.setPreferredSize(new Dimension(25, 20)); PomoMin.setPreferredSize(new Dimension(25, 20)); PomoHour.setPreferredSize(new Dimension(25, 20));        //

        //adds everything to the frame
        PromptWindow.add(TimeQuestion);
        PromptWindow.add(SecQuestion);
        PromptWindow.add(PomoSec);
        PromptWindow.add(MinQuestion);
        PromptWindow.add(PomoMin);
        PromptWindow.add(HourQuestion);
        PromptWindow.add(PomoHour);
        PromptWindow.add(PomoEnter);
        /**PromptWindow.setResizable(false);*/
        PromptWindow.setVisible(true);
        /**PromptWindow.setBackground(COLOR.black);*/
        /**PromptWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        //saves values to an array
    }
        public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Set Timer")) {
            // set the text of the label to the text of the field
        int[] PomoTimearray = {Integer.parseInt(PomoSec.getText()), Integer.parseInt(PomoMin.getText()), Integer.parseInt(PomoHour.getText())};
        System.out.println(PomoTimearray[0]);

        }
    }
    public int getMin(){return PomoTimearray[1];}
    public int getSec(){return PomoTimearray[0];}
    public int getHour(){return PomoTimearray[2];}
}