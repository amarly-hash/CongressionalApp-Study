/*# Writes to notes.txt for future reference, and allows user to make new notes files.(Might add, if i do, make sure to go to notes container, and mess with the file ref)*/
import NoteReader.Notes; 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;
public class notesTaker extends JPanel implements ActionListener
{
    private String NotesTaken = "";
    public void notesTaker()
    {
        
        
        //creating the text area
        JTextArea NoteText = new JTextArea("Type your notes here!");
        NoteText.setFont(new Font("Serif", Font.ITALIC, 16)); //sets the font (might wanna change it l8r)
        NoteText.setLineWrap(true);
        NoteText.setWrapStyleWord(true);

        //scrolling functionality so it can wrap text, and display large strings
        JScrollPane NoteScroll = new JScrollPane(NoteText);
        NoteScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //prolly wanna change the dimensions l8r, idc about that rn tho :/
        NoteScroll.setPreferredSize(new Dimension(250,250));
        add(NoteScroll);
        
        //creating save button
        JButton save = new JButton("Save");
        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //write to file
                File UserNotes = new File();
                NotesTaken = NoteText.getText();
                Scanner FileWrite = new Scanner(UserNotes);
            }
        }
        );
    }

    public void actionPerformed(ActionEvent e)
    {
        //add save function
    }
}