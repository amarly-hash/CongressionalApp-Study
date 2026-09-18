package NoteReader;

import java.io.*;
import java.util.*;
//alright, so my two options are: Have the user pass the path of the notes file to the program, use path class to get data, and then output it. OR use file class to make a new file, and store their text there 
//actually, you probably should make this into a notes taker, and allow the user to save the notes. this app is supposed to help them study, not be the sole thing for it
//put the notereader idea into the won't add pile for now, itll prob be one of the top priorities tho 
//IT WORKS
// all i gotta do is take care of the wrapping now, and its done
public class Notes
{

   //very jank. some things to fix are the line wrapping issue (I have an idea on how to fix it, but implementing it without the gui lib is gonna make it rely on magic numbers) 
   
   //TL;DR: Write notes, and save to a file
   public static void Notetaker()
   {
       String notes = "";
       Scanner scan = new Scanner(System.in);
       while (true)
       {
           String word = scan.nextLine();
           notes = notes + word + " ";
           //this is just printing it out for now, so make sure to get rid of it l8r
           System.out.println(";P");
           //ALL OF THIS CODE IS FOR SAVING THE NOTES. CONNECT THIS TO A SAVE FUNCTION LATER
           try 
           {
               
               FileWriter myWriter = new FileWriter("notes.txt");
               myWriter.write(notes);
               System.out.print(":}");
               //you should prob connect this to the button code later
               myWriter.close();
           }
           catch (IOException e)
           {
               System.out.println("An error has occurred.");
               e.printStackTrace();
           }
       }
       //return notes;
   }
   //TL;DR: open file, and display contents
   public static String getNotes()
    {
        String notesString = "";
        File NoteFile = new File("notes.txt");
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
        System.out.println(notesString);
        return notesString;
    }

   
   public static void main (String args[])
   {
        Notetaker();
   }
}
