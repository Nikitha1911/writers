class Node
{
	int data;
	Node next;
}

 class Linky
{
	Node head;
	public void insert(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			
		}
		else
		{
			Node n=head;
			while(n.next!= null)
			{
				n=n.next;
				
			}
			n.next=node;
		}
	}
	public void show()
	{
		Node n2= head;
		while(n2.next!=null)
		{
			System.out.println((n2.data));
			n2=n2.next;
			
		}
		System.out.println(n2.data);
	}
//	public void insertAtStart(int data)
//	{
//		Node node= new Node();
//		node.data=data;
//		node.next=null;
//		node.next=head;
//		head=node;
//		
//	}
//	public void insert(int index,int data)
//	{
//		Node node= new Node();
//		node.data=data;
//		node.next=null;
//		Node n=head;
//		for(int i=0;i<index-1;i++)
//		{
//			n=n.next;
//		}
//		node.next=n.next;
//	}
}
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linky l=new Linky();
l.insert(18);
l.insert(45);
l.insert(12);
//l.insertAtStart(55);
//l.insert(2,19);
l.show();


	}

}
