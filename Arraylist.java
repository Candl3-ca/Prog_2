import java.util.*;


public class Arrays{
	public static void main (String[] args){

//	Arraylist<String> a1 = new Arraylist<String>;
//
//	a1.add("Hi");
//	a1.add("Hello");
//	a1.add("Hey");
//	a1.add("What's up");
//	a1.add("AYO?");
//
//	System.out.println("Different ways to salute people are : " + a1);
//
//	a1.remove("Hi"); 


	Arraylist<Integer> a2 = new Arraylist<Integer>;
	
	a2.add(32);
	a2.add(5);
	a2.add(9);
	a2.add(847);
	a2.add(-123);
	a2.add(31);
	a2.add(745);
	a2.add(2, -52); // adding a number base on the position of the index 2, thus making -52 the 3rd number 
	
	System.out.println("The different numbers are : " + a2);
	System.out.println("\nThe size of the array is : " + a2.size());
	
	a2.remove(Integer.valueof(745)); // removing based on value 
	a2.remove(2); // at the index of 2 from the array thus the 3rd element 
	
	
//	(Your array list).trimToSize(); # This trims the size for your array to its current content amount
//	(Your array list).ensureCapacity(int cap); # This ensures an initial size for your array

//  Using this to change your arraylist to an array 
//  int s = a2.size();
//  String a3[] = a2.toArray(new String[s]);


	Arraylist<String> S = new Arraylist<String>(10);
	
	Scanner sc = new Scanner(System.in);
		
  int num = 0;
    
	for (int i = 0; i < S.size; i++ ) {
		  System.out.println("Enter string " + (num + 1) + " : " );
		    S<i> = sc.nextString;
	}
	
	boolean isYaman = false;
	
	for (int i = 0; i < S.length; i++) {
	if ( isYaman == false ) {
	S.remove(0);
	isYaman = true;
	} else if ( isYaman == true) {
	S.remove(1);
	isYaman = false;
	     }
	   }
	}
}
