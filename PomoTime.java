import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import java.awt.event.*;

/*#NOT FINISHED*/
public class PomoTime extends JPanel implements ActionListener
{
    private int Currenthour = 0;
    private int Currentmin = 0;
    private int Currentsec = 0;
    private int timeMin = 0;
    private int timeHour = 0;
    Color Y1Palette = new Color(251, 242, 53);
    Color Y3Palette = new Color(255, 255, 255);
    JLabel PomoLabel = new JLabel();
    JButton PomoButton = new JButton("Set Pomodoro");
    public PomoTime()
    {
        String Currenttime = ("Time Remaining: " + Currenthour + ":" + Currentmin + ":" + Currentsec);
        //displays time
        PomoLabel.setText(Currenttime);
        
        //💫?Graphic design is my passion💫
        setBackground(Y1Palette);
        setBorder(BorderFactory.createBevelBorder(0,Y3Palette, Y1Palette));
        //Gets the time using popups
        
        PomoButton.addActionListener(this);
        //adding
        add(PomoLabel);
        add(PomoButton);
        
        //add the input from the gui field
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int) (Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));
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