import java.util.Scanner;

public class Calculator{
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the operand1: ");
		double n1=sc.nextDouble();
		System.out.println("Enter the operand2: ");
		double n2=sc.nextDouble();
		System.out.println("Enter the operator: ");
		char op=sc.next(".").charAt(0);
		double result;

		switch(op){
			case '+': result=n1+n2;
					  break;
			case '-': result=n1-n2;
					  break;
			case '*': result=n1*n2;
					  break;
			case '/': result=n1/n2;
					  break;
			default: result=0;
					  break;		  		  		   
		}

		System.out.println("Result: "+result);

	}

}