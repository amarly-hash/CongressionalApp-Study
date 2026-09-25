package main.NoteReader;
//this is an example program to show how to read files
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileRead
{
    public static void main (String args[])
    {       
        try{
            Scanner scanner = new Scanner (System.in);
            System.out.println("Input File Name to Read");
            File file = new File(scanner.nextLine()); // Read file name from standard input
            scanner = new Scanner(file);              // Overwrite scanner to read from file
            FileWriter fw = new FileWriter("File1.txt"); //writes each charcater one at a time
            BufferedWriter bw = new BufferedWriter(fw); // writes a certain amount of characters

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String delimiter = "[? ,!.;]+"; 
                String word[] = line.split(delimiter);
                if (Integer.parseInt(word[1]) % 2 == 0){
                    bw.write(word[0] + "\t" + "Even");
                    bw.newLine();
                }
                else{
                    bw.write(word[0] + "\t" + "Odd");
                    bw.newLine();
                }
            }
            scanner.close();
            bw.close();
        }
        catch(IOException e){
        }
    }
}
