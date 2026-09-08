import java.io.*;
import java.util.*;
//alright, so my two options are: Have the user pass the path of the notes file to the program, use path class to get data, and then output it. OR use file class to make a new file, and store their text there 
//actually, you probably should make this into a notes taker, and allow the user to save the notes. this app is supposed to help them study, not be the sole thing for it
//put the notereader idea into the won't add pile for now, itll prob be one of the top priorities tho 
public class Notes
{
   
   //very jank. some things to fix are the line wrapping issue (I have an idea on how to fix it, but implementing it without the gui lib is gonna make it rely on magic numbers) 
   public static void Notetaker()
   {
       String notes = "";
       Scanner scan = new Scanner(System.in);
       while (true)
       {
           notes = notes + " " + scan.nextLine();         
           System.out.println(notes);
           
       }
       //return notes;
   }
   public static void main (String args[])
   {
        Notetaker();
   }
}