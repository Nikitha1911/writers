import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class Exception {
	public static void main(String args[]) 
    { 
        try { 
        	
        	 int a[]=null;
         	System.out.println(a[4]);

        	Scanner sc=new Scanner (System.in);
        	
            int i =sc.nextInt();
            int j=sc.nextInt();
            int k = i/j;  
            System.out.println ("Result = " + k); 
                   } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
        
        catch(ArrayBoundException e)
        {
        	System.out.println("Goes beyond the limit");
        }
        catch(NullPointerException e)
        {
        	System.out.println(" No values can be accessed from null");
        }
        
        
        
        finally
        {
        	System.out.println("At the end of the code");
        }
    
}
}