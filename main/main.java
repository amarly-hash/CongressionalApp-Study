import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import NoteReader.Notes;
import NoteReader.NoteReader;
import Clock.Clock;

public class main
{
    public void PomoWindow()
    {
        JPanel PomoPanel = new JPanel();
        //you gotta make a smaller window that'll allow for the user to give input, and then pass it to the Pomodoro constructor
        
        int Currenthour = 0;
        int Currentmin = 0;
        int Currentsec = 0;
        String Currenttime = (Currenthour + ":" + Currentmin + ":" + Currentsec);
        
        //displays time
        Label PomoLabel = new Label(("Time Remaining: " + Currenttime));
        
        
        
        
        //add the input from the gui field
        /**
        * PomoTimer Pomodoro = new PomoTimer();
        */
       
        //Get the border lib later
        //PomoPanel.setBorder(BorderFactory.createLineBorder(Color.orange));
        
    }
    public void notesContainer()
    {
        //so far, the program creates the window for the notes, then it puts it in the panel. Notes window has scrolling and tech wrapping
        JPanel NoteViewPanel = new JPanel();
        
        //Setting up the notes window, getting notes from the note package
        JTextArea NoteText = new JTextArea(Notes.getNotes());
        NoteText.setFont(new Font("Serif", Font.ITALIC, 16)); //sets the font (might wanna change it l8r)
        NoteText.setLineWrap(true);//you know what this does, don't play dumb
        NoteText.setWrapStyleWord(true);// same here
        NoteText.setEditable(false); //this line makes the text area editable
        
        //scrolling functionality so it can wrap text
        JScrollPane NoteScroll = new JScrollPane();
        NoteScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        //prolly wanna change the dimensions l8r, idc about that rn tho :/
        NoteScroll.setPreferredSize(new Dimension(250,250));
        
        //adds the stuff for the panels 
        NoteViewPanel.add(NoteText); NoteViewPanel.add(NoteScroll);
        
    }
    public void notesTaker()
    {
        //YO
    }
    public void clockDisplayer()
    {
        
    }
}
