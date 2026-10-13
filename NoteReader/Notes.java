package NoteReader;

import java.io.*;
import java.util.*;
public class Notes
{
   //Write notes, and save to a file
   public static void Notetaker()
   {
       String notes = "";
       Scanner scan = new Scanner(System.in);
       while (true)
       {
           String word = scan.nextLine();
           notes = notes + word + " ";
           try 
           {
               FileWriter myWriter = new FileWriter("notes.txt");
               myWriter.write(notes);
               myWriter.close();
           }
           catch (IOException e)
           {
               System.out.println("An error has occurred.");
               e.printStackTrace();
           }
       }
   }
   //open file, and display contents
   public static String getNotes(String Path)
    {
        String notesString = "";
        File NoteFile = new File(Path);
        try (Scanner scan = new Scanner(NoteFile))
        { 
            while (scan.hasNextLine())
            {
                String data = scan.nextLine();
                notesString = notesString + (data) + "\n";           
            }
        }

        catch(FileNotFoundException e)
        {e.printStackTrace();}
        return notesString;
    }
}
