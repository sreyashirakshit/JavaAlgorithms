package LinkedList;

public class DeleteNodeAtPosition {
	
	public class Node
	{
			Node next;
			int data;
			
			public Node(int data)
			{
				this.data = data;
			}
	}
	
	Node head;
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
			head = newNode;
		else
		{
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public void deleteNode (int position)
	{
		Node temp = head;
		
		if(position == 0)
		{

			head = temp.next;
			return;
	    }
		
		for(int i=0; i<position-1;i++)
		{
			System.out.println("Position "+i+" and data:"+temp.data);
			temp = temp.next;
		}
		
		Node nextNode = temp.next.next;
		temp.next = nextNode;
	}

	public void printData()
	{
		Node tnode = head;
		
		while(tnode != null)
		{
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		DeleteNodeAtPosition test = new DeleteNodeAtPosition();
		
		
		test.add(12);
		test.add(15);
		test.add(2);
		test.add(9);
		
		test.printData();
		System.out.println("after delete");
		test.deleteNode(0);
		test.printData();
		

	}

}
