import javax.swing.*;
import java.awt.*;
import NoteReader.Notes;
public class notesContainer extends JPanel
{
    private String noteString = Notes.getNotes();
    //so far, the program creates the window for the notes, then it puts it in the panel. Notes window has scrolling and tech wrapping
    public notesContainer()
    {
        //Setting up the notes window, getting notes from the note package
        JTextArea NoteText = new JTextArea(noteString);
        //Formatting
        NoteText.setFont(new Font("Serif", Font.ITALIC, 16)); //sets the font (might wanna change it l8r)
        NoteText.setLineWrap(true);
        NoteText.setWrapStyleWord(true);
        NoteText.setEditable(false); //this line makes the text area NOT editable

        //scrolling functionality so it can wrap text, and display large strings
        JScrollPane NoteScroll = new JScrollPane(NoteText);
        NoteScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //prolly wanna change the dimensions l8r, idc about that rn tho :/
        NoteScroll.setPreferredSize(new Dimension(250,250));
        add(NoteScroll);
    }
}