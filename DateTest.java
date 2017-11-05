
package datetest;


public class DateTest {

    
    public static void main(String[] args) {
     Date d = new Date(2004,2,29);
     d.displayaDate();
    }
    
}

class Date{
    private int year;
    private int month;
    private int day;
    
    public static final int[] daysInMonths = 
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date()
    {
        year = 1;
        month = 1;
        day = 1;
    }
    
    public Date(Date d)
    {
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }
    
    public Date(int y, int m, int d)
    {
        year = y;
        month = checkMonth(m);
        day = checkDay(d);
    }
   private int checkMonth(int m)
   {
       if(m >= 1 && m <=12) return m;
       else
           throw new IllegalArgumentException("Month is out of range");
   }
    
   private int checkDay(int d)
   {
       boolean leap = checkLeapLear(year);
       if(d > 1 && d < daysInMonths[month-1]) return d;
       
       if(leap && d == 29 && month == 2) return d;
       
       throw new IllegalArgumentException("Wrong day for that month");
   }
    private boolean checkLeapLear(int y)
    {
        return (y%4 == 0 && y%100 != 0 ) || (y%400==0);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(year));
        sb.append("-");
         sb.append(Integer.toString(month));
        sb.append("-");
        sb.append(Integer.toString(day));
        
        return sb.toString();
    }
    
    public void displayaDate()
    {
        System.out.println(this.toString());
    }
}