/*# Writes to notes.txt for future reference, and allows user to make new notes files.(Might add, if i do, make sure to go to notes container, and mess with the file ref)*/
import NoteReader.Notes; 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class notesTaker extends JPanel implements ActionListener
{
    private String NotesTaken = "";
    JTextArea UserNoteText = new JTextArea("Type your notes here!");
    public notesTaker()
    {
        //creating the text area
        UserNoteText.setFont(new Font("Serif", Font.ITALIC, 16)); //sets the font (might wanna change it l8r)
        UserNoteText.setLineWrap(true);
        UserNoteText.setWrapStyleWord(true);

        //scrolling functionality so it can wrap text, and display large strings
        JScrollPane UserNoteScroll = new JScrollPane(UserNoteText);
        UserNoteScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //prolly wanna change the dimensions l8r, idc about that rn tho :/
        UserNoteScroll.setPreferredSize(new Dimension(250,250));
        //creating save button
        JButton save = new JButton("Save");
        save.addActionListener(this);
        //makes visible
        add(save);
        add(UserNoteScroll);
    }

    public void actionPerformed(ActionEvent e)
    {
        //write to file
        NotesTaken = UserNoteText.getText();
        //If file doesn't exist, create it 
        try
        {
            File UserNotes = new File("UserNotes.txt");
            if (UserNotes.createNewFile())
            {
                //yay
            }
            else
            {
                //yooo
            }
        }
        catch(IOException execption) 
        {
            System.out.println("An error has occurred.");
            execption.printStackTrace();
        }
        //writes data to file
        try
        {
            FileWriter noteTaker = new FileWriter("UserNotes.txt");
            noteTaker.write(NotesTaken);
        }
        catch(IOException execption) 
        {
            System.out.println("An error has occurred.");
            execption.printStackTrace();
        }
    }
}