import java.io.*;
import java.util.*;


public class NoteReader 
{
    String FileName;
    public NoteReader(String FileName)
    {
        this.FileName = FileName;
    }
    
    public String getNotes(File Notes)
    {

    try{
    String notesString = "";
    Scanner scan = new Scanner(Notes); 
    while (scan.hasNextLine())
    {
        notesString = notesString + scan.nextLine();
    }
    return notesString;
    }
    
    catch(FileNotFoundException e)
    {e.printStackTrace();}
    
    }
    public String DisplayNotes()
    {
        
        return "hi";
    }
}