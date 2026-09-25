import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import java.io.File;
import java.awt.event.*;

/*#NOT FINISHED*/
public class PomoTime extends JPanel implements ActionListener
{
    private int Currenthour = 0;
    private int Currentmin = 0;
    private int Currentsec = 0;
    private int timeMin = 0;
    private int timeHour = 0;
    public void PomoTime()
    {
        //Gets the time using popups
        JButton PomoButton = new JButton("Set Pomodoro");
        PomoButton.addActionListener(this);

        String Currenttime = (Currenthour + ":" + Currentmin + ":" + Currentsec);
        //displays time
        JLabel PomoLabel = new JLabel("Time Remaining: " + Currenttime);
        
        //adding
        add(PomoLabel);
        add(PomoButton);
        //add the input from the gui field
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int) (Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));

        //Get the border lib later
        setBorder(BorderFactory.createLineBorder(Color.orange));
        repaint();        
    }
    //Makes a popup window using PomoPrompt to get user input for creating the Pomodoro
    public void actionPerformed(ActionEvent e)
    {
        //Getting input for the minutes, storing as int
        String PomoMin = JOptionPane.showInputDialog(this, "How many minutes do you want the Pomodoro to last?", null);
        try
        {
            int timeMin = Integer.parseInt(PomoMin);
        }
        catch(NumberFormatException error)
        {
            JOptionPane.showMessageDialog(this, "Please enter an integer.");
        }
        Currentmin = timeMin;
        //Getting input for the hours, storing as int
        String PomoHour = JOptionPane.showInputDialog(this, "How many hours do you want the Pomodoro to last?", null);
        try
        {
            int timeHour = Integer.parseInt(PomoHour);
        }
        catch(NumberFormatException error)
        {
            JOptionPane.showMessageDialog(this, "Please enter an integer.");
        }
    }
}