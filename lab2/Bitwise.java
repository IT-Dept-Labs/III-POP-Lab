import java.util.*;

public class Bitwise{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=scan.nextInt();
		System.out.print("Enter number of bits: ");
		int bit=scan.nextInt();
		System.out.println("Enter the operation\n1. Right Shift-Unsigned\n2. Right Shift\n3. Left Shift");
		int op=scan.nextInt();
		int res=-5;
		switch(op){

			case 1: res= num>>>bit;
					break;
			case 2: res=num>>bit;
					break;
			case 3: res=num<<bit;	
					break;
			default: System.out.println("Invalid");
					java.lang.System.exit(0);
		}
		System.out.println("Result: "+res);

	}

}