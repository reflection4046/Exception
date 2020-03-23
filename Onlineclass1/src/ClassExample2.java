
public class ClassExample2 {
 
		public static void main (String[] args) {
		// array of size 4.
		int[] arr = new int[4];
		// this statement causes an exception
		
		try {
			int i = arr[3];}
		catch(ArithmeticException e){System.out.println(e);}
		// the following statement will never execute
		System.out.println("Hi, I want to execute");

}}
