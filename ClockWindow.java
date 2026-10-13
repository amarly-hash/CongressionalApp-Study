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
    Color Y1Palette = new Color(251, 242, 53);
    Color Y2Palette = new Color(255, 201, 14);
    Color Y3Palette = new Color(255, 224, 118);
    Color Y4Palette = new Color(255, 196, 119);
    public ClockWindow()
    {
        JLabel timeLabel = new JLabel(hour + ":" + min +":"+ sec);
        setBorder(BorderFactory.createBevelBorder(0,Y3Palette, Y1Palette, Y2Palette, Y4Palette));
        //timeLabel.setBackground(Y6Palette);
        setBackground(Y1Palette);
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