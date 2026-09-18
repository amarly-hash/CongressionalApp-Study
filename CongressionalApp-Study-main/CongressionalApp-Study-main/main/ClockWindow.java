import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class ClockWindow extends JPanel
{
    private int min = 0;
    private int hour = 0;
    private LocalTime time = LocalTime.now();
    public ClockWindow()
    {
        super(new BorderLayout());
        JPanel Clock = new JPanel();//new GridLayout(0,1));
        JLabel timeLabel = new JLabel(hour + ":" + min);
        Timer timer = new Timer(1000, new ActionListener()
        {
             public void actionPerformed(ActionEvent e)    
             {
                  min = time.getMinute();
                  hour = time.getHour();
                  if (min < 10){timeLabel.setText(hour + ":0" + min);}            
                  else {timeLabel.setText(hour+":"+min);}
             }
        });
        Clock.add(timeLabel);
        timer.start();
        Clock.setSize(10,20);
        Clock.setVisible(true);
    }
}

