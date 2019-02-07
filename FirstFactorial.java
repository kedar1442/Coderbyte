import java.util.*; 

import java.io.*;



class FirstFactorial { 
 
  public static int FirstFactorial(int num) {
 
   int factorial = 1;


    for (int i = 1; i <= num; i++) {
  
   // Here multiply each number between 1 and num
     // we'll iterate a loop from 1 to untill is is less than equal to number 
    
    factorial = factorial * i;

      }

 
	 return factorial;
 
  

  } 

  
	public static void main (String[] args) {  
    
    
    Scanner s = new Scanner(System.in);

      System.out.print(FirstFactorial(s.nextLine()));
 
   }   
 
 
}