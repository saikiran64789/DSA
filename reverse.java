import java.util.*;
import java.lang.*;

public class reverse {
    public static void main(String[] args) {
        int num = 23597;
        
        int ans = 0;

        while(num> 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
            System.out.println(ans);
        }
    }
    

