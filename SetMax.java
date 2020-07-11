import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class SetMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("Enetr the no.of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			set.add(sc.nextInt());
			
		}
		int max=0;
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			int element=Integer.parseInt(it.next().toString());
			if(element>max)
			{
				max=element;
			}
		}
		System.out.println("The size of the set is " +set.size());
		System.out.println("The max element is "+ max);
		

	}

}
