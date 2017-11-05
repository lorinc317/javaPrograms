package time2test;

public class Time2Test {

    
    public static void main(String[] args) {
        Time t = new Time();
        System.out.println(t.toString());
        t.setHour(13);
        System.out.println(t.toString());
        System.out.println(t.toUniversalString());
        t.displayTime();
        
        t.setTime(14, 34, 45);
        t.displayTime();
    }
    
}

class Time
{
    private int hour;
    private int minute;
    private int second;
    
    
    public Time(int h, int m, int s)
    {
        if(h < 24 && h >=0)
        {
            this.hour = h;
        }else{
        throw new IllegalArgumentException("Hour is out of range");
        }
        
        if(m < 60 && m >=0)
        {
            this.minute = m;
        }else{
        throw new IllegalArgumentException("Minute is out of range");
        }
        
        if(s < 60 && s >=0)
        {
            this.second = s;
        }else{
        throw new IllegalArgumentException("Seconds is out of range");
        }
    }
    public Time()
    {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public Time(int h)
    {
        this(h,0,0);
    }
    public Time(int h, int m)
    {
        this(h, m, 0);
    }
    
    public void setTime(int h, int m, int s)
    {
        this.setHour(h);
        this.setMinute(m);
        this.setSecond(s);
    }
    public int getSecond(){
        return this.second;
    } 
    
    public int getMinute()
    {
        return this.minute;
    }
    
    public int getHour()
    {
        return this.hour;
    }
    
    public void setHour(int h)
    {
        if(h < 24 && h >=0)
        {
            this.hour = h;
        }
        else
        {
            throw new IllegalArgumentException("Hour is out of range");
        }
    }
    
    public void setMinute(int m)
    {
        if(m < 60 && m >=0)
        {
            this.minute = m;
        }
        else
        {
            throw new IllegalArgumentException("Minute is out of range");
        }
    }
    
    public void setSecond(int s)
    {
        if(s < 60 && s >=0)
        {
            this.second = s;
        }
        else
        {
            throw new IllegalArgumentException("Second is out of range");
        }
    }
    
    @Override
    public String toString()
    {String am = "";
    if(getHour() < 12) am = "AM";
    else am = "PM";
        return getHour() +":"+ getMinute() +":"+ getSecond() + " " + am;
    }
    
    public String toUniversalString()
    {
        String am = "";
    if(getHour() < 12) am = "AM";
    else am = "PM";
        return String.format("%02d:%02d:%02d %s",getHour(), getMinute(), getSecond(), am);
    }
    
    public void displayTime()
    {
        System.out.println(this.toUniversalString());
    }
    
}