

import java.util.Scanner;

public class MilesToKm {



	public static void main(String[] args) {

		int choice;
		double miles,kilometers,cm,meter;
		String answer,reply = null;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Would youlike to have a conversion?");
			answer=sc.next();
			if(answer.equalsIgnoreCase("Yes")) 
			{
				System.out.println("Enter your choice..1. to convert miles to km ..2.To convert cm to m ...3..both");
				choice=sc.nextInt();

				switch(choice)
				{
				case 1:  
					System.out.println("Please enter miles");
					miles=sc.nextDouble();
					kilometers=miles*1.6;
					System.out.println(kilometers + "km");

					break;

				case 2:
					System.out.println("Please enter cm");
					cm=sc.nextDouble();
					meter=cm/100.0;
					System.out.println(meter +"m");
					break;

				case 3:
					System.out.println("Please enter miles ");
					miles=sc.nextDouble();
					System.out.println("Please enter cm");
					cm=sc.nextDouble();
					kilometers=miles*1.6;
					meter=cm/100.0;
					System.out.println(kilometers + " km " + meter +" m ");

					break;
				default:
					System.out.println("Please enter a valid number");

				}

				System.out.println(" Do yu want to have conversion once again");
				reply=sc.next();


			} 
		}while(reply.equalsIgnoreCase("yes"));
	}

}

