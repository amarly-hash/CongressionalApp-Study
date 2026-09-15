import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import NoteReader.Notes;
public class notesContainer extends JPanel
{
    public notesContainer()
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

        NoteViewPanel.setVisible(true);
    }
}