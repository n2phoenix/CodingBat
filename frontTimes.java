public class frontTimes
{
    public String frontTimes(String str, int n) 
    {
        String st = "";
        if (str.length() < 3)
            st = str;
        else
            st = str.substring (0, 3);
        String x = st;

        if (n != 0)
        {
            for (int i = 1; i <= n - 1; i++)
                st += x;
        }
        else
            st = "";

        return st;
    }

}
