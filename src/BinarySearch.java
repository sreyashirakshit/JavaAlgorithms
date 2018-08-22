
public class BinarySearch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,8,10,14,20};
		int start = 0;
		int end = a.length-1;
		int x= 3;
		
		BinarySearch b = new BinarySearch();
		b.search(a, x, start, end);

	}
	
	public void search(int[] a,int x, int start, int end)
	{
		int n = end-start;
		
		int mid = (n-1+1)/2;
		
		System.out.println(a[mid]);
		
		if(x==a[mid])
			System.out.println("Index of element "+x+" is"+mid);
		
		if(x<a[mid])
		{
			search(a,x,start,mid);

		}
	
		if(x>a[mid+1])
		{
			search(a,x,mid+1,end);
	
		}
			
	}

}
