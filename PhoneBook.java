import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      displayMenu();
	}
public static void callContact(String name)
{
	System.out.println("Calling  "+name);
}
public static void saveContact(String name,Long num) {
	System.out.println("saving "+name +"Number "+num);
}
public static void findContact(String name)
{
	System.out.println("Could not find");
}

public static void displayMenu()
{
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("What do yu want to choose ");
	System.out.println("1.Call a number");
	System.out.println("2.Save a number");
	System.out.println("3.Find a number");
	
	int choice=sc.nextInt();
	sc.nextLine();
	switch(choice)
	{
	case 1: 
		System.out.println("Who would yu like to call?");
		 name=sc.nextLine();
		callContact(name);
	break;
	
	case 2:
		System.out.println("What is the name of the person yu would like to save?");
		name=sc.nextLine();
		System.out.println("What is the number of the person which yu like to save?");
		Long num=sc.nextLong();
		sc.nextLine();
		saveContact(name,num);
		break;

	case 3:
		System.out.println("What is the name of the person whose number yu are searching?");
		findContact(sc.nextLine());
				
		break;
	default:
		System.out.println();
		
		break;

	}
}
}
