import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
        System.out.println("Unsorted list"+ list);
        Collections.sort(list);
        System.out.println("Ascending order is"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order"+list);
	}

}
