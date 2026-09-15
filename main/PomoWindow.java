import javax.swing.JPanel;
import javax.swing.JLabel;

public class PomoWindow
{
    public void PomoWindow()
    {
        JPanel PomoPanel = new JPanel();
        //you gotta make a smaller window that'll allow for the user to give input, and then pass it to the Pomodoro constructor

        int Currenthour = 0;
        int Currentmin = 0;
        int Currentsec = 0;
        String Currenttime = (Currenthour + ":" + Currentmin + ":" + Currentsec);

        //displays time
        JLabel PomoLabel = new JLabel(("Time Remaining: " + Currenttime));

        //add the input from the gui field
        /**
         * PomoTimer Pomodoro = new PomoTimer();
         */

        //Get the border lib later
        //PomoPanel.setBorder(BorderFactory.createLineBorder(Color.orange));

    }

}