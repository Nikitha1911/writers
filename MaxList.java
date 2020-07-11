import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
List<Integer> list=new ArrayList<Integer>();
System.out.println("Enter the  number of elements");
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
	list.add(sc.nextInt());
}
sc.close();
int max=list.get(0);
for(int i=1;i<list.size();i++)
{
	if(list.get(i)>max)
	{
		max=list.get(i);
	}
}
System.out.println("The maximum element is "+ max);
	}

}
