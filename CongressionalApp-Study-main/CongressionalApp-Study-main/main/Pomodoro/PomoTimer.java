package Pomodoro;

import java.util.*;
public class PomoTimer
{
    //THE TIMER WORKS, HUZZAH

    //initializing variables for the constructor (realistically, you probably shouldve checked the documentation for the timer)
    double hour;
    double min;
    double sec;
    double breakHour;
    double breakMin;
    double BreakSec;
    //Constructor
    public PomoTimer(double hour, double min, double sec, double breakHour, double breakMin, double BreakSec)
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

    public double getWorkPomoHour()
    {
        return hour;
    }

    public double getWorkPomoMin()
    {
        return min;
    }

    public double getWorkPomoSec()
    {
        return sec;        
    }
    // i guess we're doing getters now
    public double getPomoBreakHour()
    {
        return breakHour;
    }

    public double getPomoBreakMin()
    {
        return breakHour;
    }

    public double getPomoBreakSec()
    {
        return BreakSec;        
    }
    //This method basically starts the timer and forces the program to pause for that long. returns true once its done
    public boolean startPomodoro() 
    {
        //so basically, what i gotta do is take the value from the getter, and turn it into miliseconds 
        long TotalWorkTime = (long) ((hour * 3600000) + (min * 60000) + (sec * 1000));
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

    public boolean startPomodoro(long x) 
    {
        //so basically, what i gotta do is take the value from the getter, and turn it into miliseconds 
        try
        {
            Thread.sleep(x);
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
        long TotalBreakTime = (long) ((breakHour * 3600000) + (breakMin * 60000) + (BreakSec * 1000));
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
        System.out.println("please enter a number of seconds for the pomodoro: ");
        int sec = scan.nextInt();
        System.out.println("please enter a number of hour(s) for the break: ");
        int hourBreak = scan.nextInt();
        System.out.println("please enter a number of minutes for the break: ");
        int minBreak = scan.nextInt();
        System.out.println("please enter a number of seconds for the break: ");
        int secBreak = scan.nextInt();

        PomoTimer pomodoro = new PomoTimer(hour, min, sec, hourBreak, minBreak, secBreak);
        pomodoro.startPomodoro();

    }
}
