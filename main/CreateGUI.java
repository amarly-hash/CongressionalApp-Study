import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import NoteReader.Notes;
import Clock.Clock;
import java.awt.Frame;
import java.beans.*;
import javax.swing.BoxLayout;
public class CreateGUI extends JPanel
{
    //creates instances of the panels
    public static PomoTime PomodoroWindow = new PomoTime();
    public static ClockWindow clockInstance = new ClockWindow();
    public static notesContainer notesWindow = new notesContainer();
    //constuctor that sets up the frame for the program
    public CreateGUI() 
    {
        //Create a panel that will hold the functions of the programs
        JPanel panel = new JPanel();        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Possible issue: The dimensions of the windows are messing with the formatting?
        clockInstance.setPreferredSize(new Dimension(100,200));
        PomodoroWindow.setPreferredSize(new Dimension(300,200));
        notesWindow.setPreferredSize(new Dimension(400,200));

        //if possible, i'd like to have these in the top two corners later, so I will probably add it to a seperate panel, so i can use gridbag layout
        panel.add(clockInstance);
        panel.add(PomodoroWindow);

        /*#this SHOULD go to its own seperate panel, and if theres any other functions, ill add them to this panel*/
        panel.add(notesWindow);

        //window formatting, and other miscallenous stuff
        PomodoroWindow.setBorder(BorderFactory.createLineBorder(Color.orange));
        clockInstance.setBorder(BorderFactory.createLineBorder(Color.orange));
        notesWindow.setBorder(BorderFactory.createLineBorder(Color.orange));
        //panel.setBackground(Color.black);
        //panel.setVisible(true);
    }
    //main function, self explanitory
    public static void main(String args[])
    {
        
        //setting look and feel, and returns the exception if anything goes wrong.
        try
        {
            //sets the look and feel to 
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch(Exception e){System.out.print(e);}
        //Create panes and frame for displaying elements
        //CreateGUI GuiPanel= new CreateGUI();
        JPanel TimePanel = new JPanel();
        JWindow mainFrame = new JWindow();
        
        TimePanel.add(clockInstance);
        TimePanel.add(PomodoroWindow);
        //gets the size of the display 
        Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        JPanel testing = new JPanel();
        testing.add(notesWindow);
        mainFrame.add(TimePanel);
        mainFrame.add(testing);
        
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
