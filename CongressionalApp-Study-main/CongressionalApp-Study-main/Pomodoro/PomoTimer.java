import java.util.*;
public class PomoTimer
{
    //THE TIMER WORKS, HUZZAH
    
    //initializing variables for the constructor (realistically, you probably shouldve checked the documentation for the timer)
    int hour;
    int min;
    int sec;
    int breakHour;
    int breakMin;
    int BreakSec;
    //Constructor
    public PomoTimer(int hour, int min, int sec, int breakHour, int breakMin, int BreakSec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.breakHour = breakHour;
        this.breakMin = breakMin;
        this.BreakSec = BreakSec;
        
    }
    //we writing setter methods now ✌️#movingupintheworld

    public void setWorkPomoTimer(int newHour, int newMin, int newSec)
    {
        hour = newHour;
        min = newMin;
        sec = newSec;
    }
    //gonna switch up on my day 1s

    public void setBreakPomoTimer(int newBreakHour, int newBreakMin, int newBreakSec)
    {
        breakHour = newBreakHour;
        breakMin = newBreakMin;
        BreakSec = newBreakSec;
    }
    //a getter method? how absurd

    public int getWorkPomoHour()
    {
        return hour;
    }

    public int getWorkPomoMin()
    {
        return min;
    }
    
    public int getWorkPomoSec()
    {
        return sec;        
    }
    // i guess we're doing getters now
    public int getPomoBreakHour()
    {
        return breakHour;
    }
    
    public int getPomoBreakMin()
    {
        return breakHour;
    }
   
    public int getPomoBreakSec()
    {
        return BreakSec;        
    }
    //This method basically starts the timer and forces the program to pause for that long. returns true once its done
    public boolean startPomodoro() 
    {
        //so basically, what i gotta do is take the value from the getter, and turn it into miliseconds 
        long TotalWorkTime = (hour * 3600000) + (min * 60000) + (sec * 1000);
        try
        {
            Thread.sleep(TotalWorkTime);
        }
        catch(Exception e)
        {
            System.out.println("WorkTimerUp"); 
            System.out.println(e);
        }
        
       return true;
    }
    //same as the previous, just takes the break times instead
    public boolean startPomodoroBreak() 
    {
        long TotalBreakTime = (breakHour * 3600000) + (breakMin * 60000) + (BreakSec * 1000 );
        try
        {
            Thread.sleep(TotalBreakTime);
        }
        catch(Exception e)
        {
            System.out.println("BreakTimerUp"); 
            System.out.println(e);
        }
        return true;
    }
    // dont forget to actually remove this, and connect it to a gui dude, you ARE presenting this to a panel of judges
    public static void main(String args[]) throws InterruptedException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number of hour(s) for the pomodoro: ");
        int hour = scan.nextInt();
        System.out.println("please enter a number of minutes for the pomodoro: ");
        int min = scan.nextInt();
        System.out.println("please enter a number of hour(s) for the break: ");
        int hourBreak = scan.nextInt();
        System.out.println("please enter a number of minutes for the break: ");
        int minBreak = scan.nextInt();
        PomoTimer pomodoro = new PomoTimer(hour, min, hourBreak, minBreak);
        pomodoro.startPomodoro();
        
    }
}
