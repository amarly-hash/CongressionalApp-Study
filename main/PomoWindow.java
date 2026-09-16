import javax.swing.*;
import java.awt.*;
import Pomodoro.PomoTimer;
public class PomoWindow extends PomoPrompt
{
    public void PomoWindow()
    {
        JPanel PomoPanel = new JPanel();
        //you gotta make a smaller window that'll allow for the user to give input, and then pass it to the Pomodoro constructor
        int Currenthour = getHour();
        int Currentmin = getMin();
        int Currentsec = getSec();
        String Currenttime = (Currenthour + ":" + Currentmin + ":" + Currentsec);
        PomoPrompt PomoPopup = new PomoPrompt(); 
        //displays time
        JLabel PomoLabel = new JLabel(("Time Remaining: " + Currenttime));

        //add the input from the gui field
        PomoTimer Pomodoro = new PomoTimer(Currenthour, Currentmin, Currentsec, (int)(Currenthour / 2.5), (Currentmin / 2.5), (Currentsec / 2.5));

        //Get the border lib later
        //PomoPanel.setBorder(BorderFactory.createLineBorder(Color.orange));

    } 
}