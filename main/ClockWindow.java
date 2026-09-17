import javax.swing.JPanel;
import javax.swing.JLabel;
import java.time.LocalTime;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class ClockWindow extends JPanel
{
    private int min = 0;
    private int hour = 0;
    private LocalTime time = LocalTime.now();
    public ClockWindow()
    {
        super(new BorderLayout());
        JFrame Clock = new JFrame();//new GridLayout(0,1));
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

