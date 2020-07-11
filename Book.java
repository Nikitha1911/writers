import java.util.Scanner;

 class Phone {
	
	Scanner sc=new Scanner(System.in);
	public void name()
	{
	String array[]=new String[5];
	
	System.out.println("Enter the names");
	for(int i=0;i<5;i++)
	{
		array[i]= sc.nextLine();
		
	}
	System.out.println(array[i]);
	}
	public void number()
	{
	int arr[]=new int[5];
	System.out.println("Enter the number");
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
		

}
	System.out.println(arr[i]);

}
}
class Location extends Phone
{
	public void place()
	{
	String loc[]=new String[5];
	System.out.println("Enter the location");
	for(int i=0;i<5;i++)
	{
		loc[i]= sc.nextLine();
	}
	public void display()
	{
		for(int i=0;i<5;i++)
		{
			
		}
	}
	
	}
}
public	class Book{
		
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location obj=new Location();
		obj.name();
		obj.number();
		obj.place();
}
	}

