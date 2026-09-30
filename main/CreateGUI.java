import javax.swing.*;
import java.awt.*;
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
        JFrame mainFrame = new JFrame();
        JPanel TimePanel = new JPanel();
        JPanel NotePanel = new JPanel();
  
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
        //Colors from palette, for easy ref
        Color Y1Palette = new Color(251, 242, 53);
        Color Y2Palette = new Color(247, 241, 143);
       
        Color Y4Palette = new Color(246, 243, 188);
        Color Y5Palette = new Color(245, 247, 255);
        Color Y6Palette = new Color(218, 218, 218);
        
        Color Y8Palette = new Color(233, 171, 68);
        Color Y9Palette = new Color(98, 59, 52);
        Color Y10Palette = new Color(255, 224, 118);
        Color Y11Palette = new Color(239, 228, 176);
        mainFrame.getContentPane().setBackground(Y11Palette);
        TimePanel.setBackground(Y10Palette);
        NotePanel.setBackground(Y2Palette);
        //resizes the window based off the returned value
        mainFrame.setSize((WindowSize.width / 5), WindowSize.height);

        //final touches
        mainFrame.setVisible(true);
        
    }
}