import java.util.Scanner;

public class AreasOfShapes {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select 1.Area of rectangle 2.Area of Triangle 3.Area of square");
		int shape=sc.nextInt();
		if (shape==1)
		{
			float l;
			float w;
			System.out.println("Please enteer length ");
			l=sc.nextFloat();
			System.out.println("Please enteer width ");
			w=sc.nextFloat();
			float ar = rectArea(l,w);
			System.out.println("The area of the rectangle is" + ar);
		
			
		}
		else if(shape==2)
		{
			float base,height;
			System.out.println("Please enteer base ");
			base=sc.nextFloat();
			System.out.println("Please enteer height ");
			height=sc.nextFloat();
			float area = rectArea(base,height);
			System.out.println("The area of the triangle is" + area);
		
		}
		else if(shape==3)
		{
			float side;
			System.out.println(" Enter the side of square");
			side=sc.nextFloat();
			float area=sqArea(side);
			System.out.println("The area of the square is" + area);
		}
		

	}
	
	public static float rectArea(float length,float width)
	{
		float area= length*width;
		return area;
		
	}
	public static float triArea(float base ,float height)
	{
		float area= (float) ((base*height)/2.0);
		return area;
	}
	public static float sqArea(float side)
	{
		float area =side*side;
		return area;
	}

}
