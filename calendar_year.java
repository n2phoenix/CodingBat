import java.util.*;
class calendar_year
{
    public static void main()
    {
        int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] mo = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] da = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter day: ");
        int d = Integer.parseInt (in.nextLine());
        int c = d;
        for (int i = 1; i < 13; i++)
        {
            calendar_obj mon = new calendar_obj();
            c = mon.month (da, md, c, md[i - 1]);
        }
    } 
}

