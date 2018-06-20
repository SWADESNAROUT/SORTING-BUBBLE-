import java.util.*;

public class Bubblesorting 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number:");
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		for( i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			//System.out.println("Before sorting:" + arr[i]);
			
		}
	    System.out.println("Before sorting:");
		for( i=0; i<n; i++)
		{
			System.out.print( arr[i] + "\t");
		}
		
		System.out.print("\n");
		for(i = 0; i< n-1 ; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] > arr[j+1])  //for descending <
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted List is:");
		for( i=0; i<n; i++)
		{
			System.out.print( arr[i] + "\t");
		}
		
		
		
	}
	


}


