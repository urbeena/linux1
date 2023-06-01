import java.util.*;
public class tax {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the income");
        float a = s.nextFloat();
        float x =0.0f; //if we are intitializing it with with float it is considered to be double, therefore we will write 0f else we can declare it with


        if (a<2.5)
        {
            x = x + 0.0;
        }
        else if (a > 2.5 && a <= 5.0) // 5% of the amount exceeding 250000
        {
            x = x +( 0.05 * (x- 2.5)); 
        }
        
        else if (a> 5.0 && a <= 10.0) // 20% of the amount exceeding 500000
        {
            x = x+( 0.05 * (x - 2.5)); 
            x = x+ ( 0.2 * (x - 5.0)); 
        }
        
        else if (a >10.0) // 30% of the amount exceeding 1000000
        {
            x = x +( 0.05 * (x - 2.5)); 
            x = x+( 0.2 * (x- 5.0));
            x = x +( 0.3 * (x- 10.0));
        }
       
        System.out.println("tax to be paid is: " + x);
    
    }
}
