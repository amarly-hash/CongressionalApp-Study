import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import NoteReader.Notes;
import Clock.Clock;
import java.awt.Frame;
import java.beans.*;
public class MainPanel extends JFrame
{
    public MainPanel()
    {
        try
        {
            //sets the look and feel to 
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        ClockWindow clockInstance = new ClockWindow();
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        //maybe try adding the bounds for each of these?
        panel.add(clockInstance);
        PomoWindow PomodoroWindow = new PomoWindow();
        panel.add(PomodoroWindow);
        notesContainer notesWindow = new notesContainer();
        panel.setBackground(Color.black);
        panel.add(notesWindow);
        panel.setVisible(true);
    }

    public static void CreateGUI(String[] args) 
    {
        MainPanel m = new MainPanel();
        JFrame Studyframe = new JFrame("StudyBuddy");
        Studyframe.add(m);

        Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        Studyframe.setSize((WindowSize.width / 5), WindowSize.height);
        Studyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Studyframe.getContentPane().setBackground(Color.BLACK);        
        Studyframe.setUndecorated(false);
        Studyframe.setResizable(false);
        Studyframe.setVisible(true);
    }
}
