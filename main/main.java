import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import NoteReader.NoteReader;
import Clock.Clock;
import java.util.Set;
import java.beans.*;
import java.time.LocalTime;
import java.awt.Frame;

public class main
{
    private static void createGUI()
    {
        JFrame frame = new JFrame("StudyBuddy");
        frame.add(new ClockWindow());
        //frame.add(new PomoWindow);
        frame.add(new notesContainer());
        frame.pack();
        frame.setVisible(true);
    }
      public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
            UIManager.put("swing.boldMetal", Boolean.FALSE);
                createGUI();
            }
        });
    }
}
