import java.util.*;

public class  missingElement{
	
	// Function to find two missing numbers in range
	// [1, n]. This function assumes that size of array
	// is n-2 and all array elements are distinct
	static void findTwoMissingNumbers(int arr[], int n)
	{
		/* Get the XOR of all elements in arr[] and
		{1, 2 .. n} */
		int XOR = arr[0];
		for (int i = 1; i < n-2; i++)
			XOR ^= arr[i];
		for (int i = 1; i <= n; i++)
			XOR ^= i;
	
		// Now XOR has XOR of two missing elements.
		// Any set bit in it must be set in one missing
		// and unset in other missing number
	
		// Get a set bit of XOR (We get the rightmost
		// set bit)
		int set_bit_no = XOR & ~(XOR-1);
	
		// Now divide elements in two sets by comparing
		// rightmost set bit of XOR with bit at same
		// position in each element.
		int x = 0, y = 0; // Initialize missing numbers
		for (int i = 0; i < n-2; i++)
		{
			if ((arr[i] & set_bit_no) > 0)
				
				/*XOR of first set in arr[] */
				x = x ^ arr[i];
			else
				/*XOR of second set in arr[] */
				y = y ^ arr[i];
		}
		
		for (int i = 1; i <= n; i++)
		{
			if ((i & set_bit_no)>0)
			
				/* XOR of first set in arr[] and
				{1, 2, ...n }*/
				x = x ^ i;
			else
				/* XOR of second set in arr[] and
					{1, 2, ...n } */
				y = y ^ i;
		}
	
		System.out.println("Two Missing Numbers are ");
		System.out.println( x + " " + y);
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] = {1, 3, 5, 6};
		
		// Range of numbers is 2 plus size of array
		int n = 2 +arr.length;
		
		findTwoMissingNumbers(arr, n);
	
		}
	}

// This code is contributed by Arnav Kr. Mandal.	


