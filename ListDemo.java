import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> values=new ArrayList<Integer>();
 values.add(3);
 values.add(88);
 values.add(77);
 values.add(1,9);
 
 Iterator i= values.iterator();
 while(i.hasNext())
 {
	 System.out.println(i.next());
 }
 Collections.sort(values);
 System.out.println(values);
 
	}

}
