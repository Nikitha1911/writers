import java.util.Scanner;

public class Calculation

{
	public  void  add(int a, int b){

		System.out.println(a+b); 
	}

	//	    public int add(String a, String b){
	//	        
	//	        return Integer.parseInt(a)+Integer.parseInt(b);
	//	    }

	//	    public float add(int a, float b){
	//	        	        return a+b;
	//	    }
	//	    
	//	    public double add(int a, double b){
	//	        
	//	        return a+b;
	//	    }

	//	    public int add(int a){
	//	        
	//	        return a+1;
	//	    }
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int  b)
	{
		System.out.println(a/b);
	}
	public void sub(int a, int b){

		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculation calc=new Calculation();
		String reply = null;
		String answer;
		int choice,a,b;
		do {
			System.out.println("Would yu like to have calculation");

			answer=sc.next();
			if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("1.Addition 2.Sub 3.Multiplication 4.Division");

				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println(" Enter 2 inputs");       
					a=sc.nextInt();
					b=sc.nextInt();
					calc. add(a,b);

					break;

				case 2:
					System.out.println(" Enter 2 inputs");       
					a=sc.nextInt();
					b=sc.nextInt();
					calc.mul(a,b);

					break;

				case 3:
					System.out.println(" Enter 2 inputs");       
					a=sc.nextInt();
					b=sc.nextInt();
					calc.sub(a,b);

					break;

				case 4:
					System.out.println(" Enter 2 inputs");       

					a=sc.nextInt();
					try {  b=sc.nextInt();
					calc.div(a,b);
					}
					catch(ArithmeticException e)
					{
						System.out.println("Divide by zero error");
					}


					break;

				default:
					System.out.println(" Enter valid number");


				}
				System.out.println("Do yu want further calculation");
				reply=sc.next();

			}

		}while(reply.equals("yes"));


	}

}