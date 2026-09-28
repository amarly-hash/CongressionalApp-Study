import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class ClockWindow extends JPanel
{
    private int min = 0;
    private int hour = 0;
    private int sec = 0;
    private LocalTime time = LocalTime.now();
    Color Y3Palette = new Color(255, 255, 255);
    Color Y6Palette = new Color(218, 218, 218);
    Color Y9Palette = new Color(0,0,0);
    public ClockWindow()
    {
        JLabel timeLabel = new JLabel(hour + ":" + min +":"+ sec);
        timeLabel.setBackground(Y6Palette);
        Timer timer = new Timer(500, new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent e)    
             {
                LocalTime time = LocalTime.now(); 
                min = time.getMinute();
                hour = time.getHour();
                sec = time.getSecond();
                if (min < 10){timeLabel.setText(hour + ":0" + min + ":" + sec);}            
                else {timeLabel.setText(hour+":"+min+":"+sec);}
                  
             }
        });
        add(timeLabel);
        timer.setRepeats(true);
        timer.start();
        setSize(10,20);
        repaint();
        //Clock.setVisible(true);
    }
}

