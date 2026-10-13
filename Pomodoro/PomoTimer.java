package Pomodoro;

import java.util.*;
public class PomoTimer
{
    //initializing variables for the constructor 
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

    public void setWorkPomoTimer(int newHour, int newMin, int newSec)
    {
        hour = newHour;
        min = newMin;
        sec = newSec;
    }

    public void setBreakPomoTimer(int newBreakHour, int newBreakMin, int newBreakSec)
    {
        breakHour = newBreakHour;
        breakMin = newBreakMin;
        BreakSec = newBreakSec;
    }

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
        try
        {
            Thread.sleep(x);
        }
        catch(Exception e)
        {
            System.out.println("WorkTimerUp"); 
            System.out.println(e);
        }
        System.out.println(">:/");
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
    public static long ConvertTime(int hour, int min)
    {
        long TimeinMM = (hour * 3600000) + (min * 60000);
        return TimeinMM;
    }
    
    public static long ConvertTime(int hour, int min, int sec)
    {
        long TimeinMM = (hour * 3600000) + (min * 60000) + (sec * 1000);
        return TimeinMM;
    }
}
