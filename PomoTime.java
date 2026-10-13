import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

// 25/5 Pomodoro
public class PomoTime extends JPanel
{
    Color Y1Palette = new Color(251, 242, 53); Color Y2Palette = new Color(255, 201, 14); Color Y3Palette = new Color(255, 224, 118); Color Y4Palette = new Color(255, 196, 119);
    JLabel PomoLabel = new JLabel();
    JButton PomoButton = new JButton("Start Pomodoro");
    int numHour = 0;
    int numMin = 0;
    int timeinMM = 1800000;
    int timeinsec = 1800;
    ActionListener Countdown = new ActionListener()
    {
       long startTime = System.currentTimeMillis();
       @Override
       public void actionPerformed(ActionEvent e)
       {
           timeinMM--;
           timeinsec--;
           long now = System.currentTimeMillis();
           long clockTime = now - startTime;   
           if (timeinMM <= 0)
           {
               time.stop();
           }
           if (timeinMM == (300000/1000))
           {PomoTime.BreakPopup();}
           SimpleDateFormat df = new SimpleDateFormat("mm:ss");
           PomoLabel.setText(df.format(timeinsec*1000));
       }
    };
    Timer time = new Timer(500, Countdown);
    public PomoTime()
    {
        PomoLabel.setText("Time Remaining: 0:00");
        //Gets the time using popups
        PomoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed (ActionEvent e)
                {
                    PomoTime Pomodoro = new PomoTime(); 
                    //int Mintime = Pomodoro.MinPopup();
                    //int HourTime = Pomodoro.HourPopup();
                    time.start();
                }
            });
        //💫Graphic design is my passion💫
        setBackground(Y1Palette);
        setBorder(BorderFactory.createBevelBorder(0,Y3Palette, Y1Palette, Y2Palette, Y4Palette));
        PomoButton.setBackground(Y4Palette);
        
        // //adding
        add(PomoLabel);
        add(PomoButton);
    }

    //returns the time in hours and minutes in an integer array, using indexes 0 and 1 respectively
    public int MinPopup()
    {
        //Getting input for the minutes, storing as int
        int timeMin = 0;
        String PomoMin = JOptionPane.showInputDialog(this, "How many minutes do you want the Pomodoro to last?", null);
        try
        {
            timeMin = Integer.parseInt(PomoMin);
        }
        catch(NumberFormatException error)
        {
            JOptionPane.showMessageDialog(this, "Please enter an integer.");
        }
        //Getting input for the hours, storing as int
        return timeMin;
    }
    public int HourPopup()
    {
        int timeHour = 0;
        String PomoHour = JOptionPane.showInputDialog(this, "How many hours do you want the Pomodoro to last?", null);
        try
        {
            timeHour = Integer.parseInt(PomoHour);
        }
        catch(NumberFormatException error)
        {
            JOptionPane.showMessageDialog(this, "Please enter an integer.");
        }
        return timeHour;
    }
    public static void BreakPopup()
    {
        JOptionPane.showMessageDialog(null, "Go take a quick break, you've earned it!");
    }
}