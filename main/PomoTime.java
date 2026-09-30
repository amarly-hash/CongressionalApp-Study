import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

// 25/5 Pomodoro
public class PomoTime extends JPanel
{
    Color Y1Palette = new Color(251, 242, 53); Color Y2Palette = new Color(255, 201, 14); Color Y3Palette = new Color(255, 224, 118); Color Y4Palette = new Color(255, 196, 119);
    JLabel PomoLabel = new JLabel();
    JButton PomoButton = new JButton("Set Pomodoro");
    Timer time;
    int Mintime;
    int Hourtime;
    public PomoTime()
    {
        String Currenttime = ("Time Remaining: 0:00");
        //displays time
        PomoLabel.setText(Currenttime);

        //💫Graphic design is my passion💫
        setBackground(Y1Palette);
        setBorder(BorderFactory.createBevelBorder(0,Y3Palette, Y1Palette, Y2Palette, Y4Palette));
        PomoButton.setBackground(Y4Palette);
        
        //Gets the time using popups
        PomoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed (ActionEvent e)
                {
                    PomoTime Pomodoro = new PomoTime(); 
                    int Mintime = Pomodoro.MinPopup();
                    int HourTime = Pomodoro.HourPopup();
                    PomoLabel.setText("Remaining time: "+ Mintime + ":" + Hourtime);
                    time.start();
                }
            });

        ActionListener Countdown = new ActionListener() 
        {
            double timeinMM = (Mintime*60000) + (Hourtime*3600000);
            public void actionPerformed(ActionEvent e)
            {
                timeinMM--;
                SimpleDateFormat timeDisplay = new SimpleDateFormat("H:mm:ss");
                PomoLabel.setText("Time Remaining: "+ timeDisplay.format(timeinMM));
                if (timeinMM <= 0)
                {time.stop();}
            }
        };
        
        Timer time = new Timer(1,Countdown);
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
}