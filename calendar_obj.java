import java.util.*;
public class calendar_obj
{
    public int month (String da[], int[] md, int d, int m)
    {
        String[][] cal = new String [7][7];

        for (int i = 0; i < 7; i++)     //Initialization
        {
            for (int j = 0; j < 7; j++)
            {
                cal[i][j] = "";
            }
        }

        for (int i = 0; i < 7; i++)
            cal [0][i] = da[i];

        int x = 1;
        int c = 0;
        
        for (int i = 1; i < 7; i++)
        {
            for (int j = d - 1; j < 7; j++)
            {
                cal[i][j] = String.valueOf (x);
                x++;
                if (x > m)
                {
                    c = j + 1;
                    break;
                }
            }
            d = 1;
            if (x > m)
                break;
        }

        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                System.out.print (cal[i][j] + "\t");
            }
            System.out.println ();
        }
        System.out.println ();
        return c;
    }
}