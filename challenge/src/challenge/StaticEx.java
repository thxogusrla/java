package challenge;
class ArrayUtil{
	public static int [] concat(int [ ] a, int [] b){
		int sum = a.length + b.length;
		int c[] = new int [sum];
		for(int i = 0 ; i<c.length; i++)
		{
			if(i<a.length) c[i] = a[i];
			else if(i >= a.length) {
				int j = i-a.length; 
				c[i] = b[j];
			}				
		}
		return c;
		}
	
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i = 0 ; i< a.length; i++)
		{
		System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}

public class StaticEx {
	public static void main(String [] args)
	{
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}	
}