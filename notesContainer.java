import javax.swing.*;
import java.awt.*;
import NoteReader.Notes;
import java.awt.event.*;
import java.io.*;

public class notesContainer extends JPanel implements ActionListener
{
    String notePath = "notes.txt";
    private String noteString = Notes.getNotes(notePath);
    JTextArea NoteText = new JTextArea(noteString);
    //so far, the program creates the window for the notes, then it puts it in the panel. Notes window has scrolling and tech wrapping
    public notesContainer()
    {
        //Setting up the notes window, getting notes from the note package
        
        //Formatting
        NoteText.setFont(new Font("Serif", Font.ITALIC, 16)); //sets the font (might wanna change it l8r)
        NoteText.setLineWrap(true);
        NoteText.setWrapStyleWord(true);
        NoteText.setEditable(false); //this line makes the text area NOT editable

        //scrolling functionality so it can wrap text, and display large strings
        JScrollPane NoteScroll = new JScrollPane(NoteText);
        NoteScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton NoteLoadButton = new JButton("Open notes");
        NoteLoadButton.addActionListener(this);
        
        //prolly wanna change the dimensions l8r, idc about that rn tho :/
        NoteScroll.setPreferredSize(new Dimension(250,250));
        add(NoteLoadButton);
        add(NoteScroll);
    }
    public void actionPerformed(ActionEvent e)
    {
        String FilePath = JOptionPane.showInputDialog(this, "Please enter the file path for your notes. (Must be a .txt file) )", null);
        File GivenFile = new File(FilePath);
        if (GivenFile.exists() == true)
        {
            NoteText.setEditable(true);
            notePath = FilePath;
            noteString = Notes.getNotes(FilePath);
            NoteText.setText(noteString);
            this.repaint();
            System.out.println(noteString);
            NoteText.setEditable(false);
        }
        else
        {
            //Popup telling user that it doesn't work
            JOptionPane.showMessageDialog(this, "No file was found at the given path.");
        }   
    }
}