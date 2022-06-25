import java.io.*;
import java.util.*;
class ALLFACTORS
    {
        public static void main()
        {
            System.out.println(" Please enter the number for which you want all the factors ");
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            
            for( int i = 1; i<= N; i++)
            {
                if(N % i == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
            