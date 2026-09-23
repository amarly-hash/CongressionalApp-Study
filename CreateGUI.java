import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import NoteReader.Notes;
import Clock.Clock;
import java.beans.*;
public class CreateGUI extends JPanel
{
    //creates instances of the panels
    public static PomoTime PomodoroWindow = new PomoTime();
    public static ClockWindow clockInstance = new ClockWindow();
    public static notesContainer notesWindow = new notesContainer();
    public static notesTaker notewriter = new notesTaker(); 
    //constuctor that sets up the frame for the program
    public CreateGUI() 
    {
        
    }
    //main function, self explanitory
    /*#THIS IS NOT THREAD SAFE!!!!!!!!*/
    public static void main(String args[])
    {
        //setting look and feel, and returns the exception if anything goes wrong.
        try
        {
            //sets the look and feel to 
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
        //Create panes and frame for displaying elements
        JPanel TimePanel = new JPanel();
        JPanel NotePanel = new JPanel();
        JFrame mainFrame = new JFrame();
        
        NotePanel.setLayout(new BoxLayout(NotePanel, BoxLayout.PAGE_AXIS));
        
        TimePanel.add(clockInstance);
        TimePanel.add(PomodoroWindow);
        //gets the size of the display 
        Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        NotePanel.add(notesWindow);
        NotePanel.add(notewriter);
        mainFrame.add(TimePanel);
        mainFrame.add(NotePanel);
        //Formatting, adding, and other housekeeping
        mainFrame.setLayout(new FlowLayout());   
        //mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setBackground(Color.BLACK);
        
        //resizes the window based off the returned value
        mainFrame.setSize((WindowSize.width / 5), WindowSize.height);

        //final touches
        mainFrame.setVisible(true);
        
    }

}
