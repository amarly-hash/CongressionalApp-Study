import java.util.*;
public class PomoTimer
{
    //initializing variables for the constructor (realistically, you probably shouldve checked the documentation for the timer)
    int hour;
    int Min;
    int breakHour;
    int breakMin;
    Timer pomoTime = new Timer();
    TimerTask handler = new TimerHandler();
    public PomoTimer(int hour, int min, int breakHour, int breakMin)
    {
        this.hour = hour;
        this.Min = Min;
        this.breakHour = breakHour;
        this.breakMin = breakMin;
    }
    //we writing setter methods now ✌️#movingupintheworld
    public void setWorkPomoTimer(int newHour, int newMin)
    {
        hour = newHour;
        Min = newMin;
    }
    //gonna switch up on my day 1s
    public void setBreakPomoTimer(int newBreakHour, int newBreakMin)
    {
        breakHour = newBreakHour;
        breakMin = newBreakMin;
    }
    //a getter method? how absurd
    public int getWorkPomoHour()
    {
        return hour;
    }
    public int getWorkPomoMin()
    {
        return Min;
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
    //This method basically starts the timer and forces the program to pause for that long. returns true once its done
    public boolean startPomodoro() throws InterruptedException
    {
        //so basically, what i gotta do is take the value from the getter, and turn it into miliseconds 
        int TotalWorkTime = (hour * 3600000) + (Min * 60000);
        pomoTime.schedule(1000,TotalWorkTime);
        System.out.println("WorkTimerUp");
        return true;
    }
    //same as the previous, just takes the break times instead
    public boolean startPomodoroBreak() throws InterruptedException
    {
        int TotalBreakTime = (breakHour * 3600000) + (breakMin * 60000);
        
        System.out.println("WorkTimerUp");
        return true;
    }
    
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
