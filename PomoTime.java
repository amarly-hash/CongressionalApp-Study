import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import java.awt.event.*;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

/*#NOT FINISHED*/
public class PomoTime extends JPanel implements ActionListener
{
    private int Currenthour = 0;
    private int Currentmin = 0;
    private int Currentsec = 0;
    private int timeMin = 0;
    private int timeHour = 0;
    Color Y1Palette = new Color(251, 242, 53);
    Color Y2Palette = new Color(255, 201, 14);
    Color Y3Palette = new Color(255, 224, 118);
    Color Y4Palette = new Color(255, 196, 119);
    JLabel PomoLabel = new JLabel();
    JButton PomoButton = new JButton("Set Pomodoro");
    private Timer timer;
    public PomoTime()
    {
        String Currenttime = ("Time Remaining: " + Currenthour + ":" + Currentmin + ":" + Currentsec);
        //displays time
        PomoLabel.setText(Currenttime);

        //💫Graphic design is my passion💫
        setBackground(Y1Palette);
        setBorder(BorderFactory.createBevelBorder(0,Y3Palette, Y1Palette, Y2Palette, Y4Palette));
        PomoButton.setBackground(Y4Palette);
        //Gets the time using popups
        PomoButton.addActionListener(this);
        timer = new Timer(10, new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e){
                long duration = PomoTimer.ConvertTime(timeMin, timeHour);
                long startTime = System.currentTimeMillis();
                long ClockTime = startTime - System.currentTimeMillis();
                if (ClockTime >= duration) {ClockTime = PomoTimer.ConvertTime(timeMin, timeHour);
                timer.stop();}
                long totalhour = duration / 3600000;
                long totalmin = totalhour / 60000;
                PomoLabel.setText("Time Remaining: "+totalmin + ":"+ totalhour);
        }
    });
        
        //adding
        add(PomoLabel);
        add(PomoButton);

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
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int) (Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));
        long timeElapsed = (timeHour * 3600000) + (timeMin * 60000);
        System.out.println(timeElapsed); 
        if (!timer.isRunning())
        {timer.start();}
    }
}