package LinkedList;

public class PrependLinkedList {
	
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
		
		public void prepend(int data)
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
		
		public void printList()
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
		
		PrependLinkedList ll = new PrependLinkedList();
		ll.prepend(11);
		ll.prepend(13);
		
		ll.printList();

	}

}
