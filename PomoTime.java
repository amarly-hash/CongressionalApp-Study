import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
import java.awt.event.ActionEvent;
import java.io.File;

/*#NOT FINISHED*/
public class PomoTime extends PomoPrompt
{
    public void PomoTime()
    {
        //Makes a popup window using PomoPrompt to get user input for creating the Pomodoro
        PomoPrompt PopupDialog = new PomoPrompt();
        //gets values from PomoPrompt
        int Currenthour = PopupDialog.getHour();
        int Currentmin = PopupDialog.getMin();
        int Currentsec = PopupDialog.getSec();
        
        String Currenttime = (Currenthour + ":" + Currentmin + ":" + Currentsec);
        PomoPrompt PomoPopup = new PomoPrompt(); 
        //displays time
        JLabel PomoLabel = new JLabel(("Time Remaining: " + Currenttime));
        
        //adding
        add(PomoLabel);
        //add the input from the gui field
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int)(Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));

        //Get the border lib later
        setBorder(BorderFactory.createLineBorder(Color.orange));
        //PomoPanel.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String PomoMin = JOptionPane.showInputDialog(this, "How many minutes do you want the Pomodoro to last?", null);
        String PomoHour = JOptionPane.showInputDialog(this, "How many hours do you want the Pomodoro to last?", null);
        try{int time = Integer.parseInt(PomoMin);}
        catch(NumberFormatException error){JOptionPane.showMessageDialog(this, "Please enter a number.");}
    }
}