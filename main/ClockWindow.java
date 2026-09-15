import javax.swing.JPanel;
import javax.swing.JLabel;
import java.time.LocalTime;
import java.awt.*;
import javax.swing.JFrame;

public class ClockWindow extends JPanel
{
    private int min = 0;
    private int hour = 0;
    public ClockWindow()
    {
        super(new BorderLayout());
        JFrame Clock = new JFrame();//new GridLayout(0,1));
        JLabel timeLabel = new JLabel(hour + ":" + min);
        Clock.setVisible(true);
        while (true)
        {
            LocalTime time = LocalTime.now();
            min = time.getMinute();
            hour = time.getHour();
            timeLabel.setText(hour+":"+min);
            Clock.add(timeLabel);
        }
    }
}
