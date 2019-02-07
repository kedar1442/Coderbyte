class PrintLargestFour 
{ 
	/* Function to print four largest elements */
	static int printTwoLargest(int arr[], int arr_size) 
	{ 
		int i, first, second, third, four=0, sum=0; 
	
		
		if (arr_size < 5) 
		{ 
			System.out.print(" Invalid Input "); 
			return; 
		} 
		
		third = first = second = 0; 
		for (i = 0; i < arr_size ; i ++) 

		/* Here we'll iterate through all array elements */
		{ 
			/* If current element is smaller than 
			first in this way we'll find largest four*/
			if (arr[i] > first) 
			{ 
              			four = third;
				third = second; 
				second = first; 
				first = arr[i]; 
			} 
		
			/* If arr[i] is in between first and 
			second then update second */
			else if (arr[i] > second) 
			{  
                		four = third;
				third = second; 
				second = arr[i]; 
			} 
		
			else if (arr[i] > third)
           		 {
                		four = third;
				third = arr[i]; 
            		}
          
          		else if (arr[i] > four)
                		four = arr[i];
			} 
		
		System.out.println("Four largest elements are " + 
					first + " " + second + " " + third + " " +four); 
		sum=four+third+second+first;
		return sum;

	} 

	/* Driver program to test above function*/
	public static void main (String[] args) 
	{ 
		int arr[] = {12, 13, 1, 10, 34, 1, 15}; 
		int n = arr.length; 
		int result=printTwoLargest(arr, n); 
		System.out.println("Sum of largest four" +result);
	} 
} 