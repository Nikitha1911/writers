import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		int num = 0 ,count=1,i;
		System.out.println("Enter the no.of rows");
		Scanner sc=new Scanner (System.in);
		try
		{
			num=sc.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Only number should be entered");
		}
		while(count<=num)
		{
			i=0;
			while(i<= (num-count))
			{
				System.out.print(" ");
				i++;
			}
			i=0;
			while(i<(2*count-1))
			{
				System.out.print("*");
				i++;
			}
			System.out.println();
			count++;
		}
	}


}


