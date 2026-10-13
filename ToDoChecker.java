import javax.swing.*;
import java.awt.event.*;

public class ToDoChecker extends JPanel
{
    //Possible - Make a linkedlist composed of JCheckbox that will allow a
    JButton AddAction = new JButton("Add a new task.");
    public ToDoChecker()
    {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        add(AddAction);
        
        AddAction.addActionListener((ActionEvent e) -> 
        {
            String Task = (String) JOptionPane.showInputDialog(this, "What do you need to do?");
            if (Task != null)
            {
                add(new ToDoMaker(Task));
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter a value.");
            }
        });
    }
}
class ToDoMaker extends JCheckBox
{
    public ToDoMaker(String Action)
    {
        setText(Action);
        System.out.println(Action);
        
    }
}