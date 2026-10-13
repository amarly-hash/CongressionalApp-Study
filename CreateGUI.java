import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import java.io.*;
import javax.imageio.ImageIO;

public class CreateGUI extends JFrame
{
    //creates instances of the panels
    public static PomoTime PomodoroWindow = new PomoTime();
    public static ClockWindow clockInstance = new ClockWindow();
    public static notesContainer notesWindow = new notesContainer();
    public static notesTaker notewriter = new notesTaker(); 
    public static ToDoChecker ToDo = new ToDoChecker();
    //constuctor that sets up the frame for the program
    public CreateGUI() 
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
        add(TimePanel);
        add(NotePanel);
        add(ToDo);
        //Formatting, adding, and other housekeeping
        setLayout(new FlowLayout());
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("StudyIcon.jpg"));

        //Colors from palette, for easy ref
        Color Y2Palette = new Color(247, 241, 143);
        Color Y10Palette = new Color(255, 224, 118);
        Color Y11Palette = new Color(239, 228, 176);
        getContentPane().setBackground(Y11Palette);
        TimePanel.setBackground(Y10Palette);
        NotePanel.setBackground(Y2Palette);
        setIconImage(img.getImage());
        
        //resizes the window based off the returned value
        setSize((WindowSize.width / 5), WindowSize.height);
        setResizable(false);
        //final touches
        setVisible(true);        
    }
    //main function, self explanitory
    /*#THIS IS NOT THREAD SAFE!!!!!!!!*/
    public static void main(String args[])
    {
        CreateGUI StudySupplement = new CreateGUI();
    }
}