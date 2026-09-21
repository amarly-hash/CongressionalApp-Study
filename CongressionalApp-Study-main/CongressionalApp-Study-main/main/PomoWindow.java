import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
/*#NOT FINISHED*/
public class PomoWindow extends JPanel
{
    public void PomoWindow()
    {
        JPanel PomoPanel = new JPanel();

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
        PomoPanel.add(PomoLabel);
        //add the input from the gui field
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int)(Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));

        //Get the border lib later
        PomoPanel.setBorder(BorderFactory.createLineBorder(Color.orange));
        //PomoPanel.setVisible(true);
    } 
}