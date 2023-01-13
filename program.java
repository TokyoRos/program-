package myprject;

public class MyClass {

	public static void main(String[] args) {
		
		// this prints in upper class
		System.out.print("Wait\n".toLowerCase());
		
		// this prints in lower case
		System.out.print("patiently\n".toUpperCase());
		
		// this adds a tab
		System.out.print("\tand the\n");
		
		// this left justifies two springs
		System.out.format("%-10s%-10s", "fruit", "will fall");
		System.out.print("\n");
		
		// this right justifies
		System.out.format("%10s", "into your hand.\n");
		
		System.out.println(" \n");
		// this print normally
		System.out.print("Wait patiently and the fruit will fall into your hand.\n");
	} 

}
