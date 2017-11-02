import java.util.*;
class multitry
{
	public static void main(String[] args) {
		int n1,div;
		String st ="division complete";
		char a;
		int n2;
		Scanner io=new Scanner(System.in);
		System.out.println("enter two numbers ");
			n1=io.nextInt();
			n2=io.nextInt();
		try{
			div=n1/n2;
			System.out.println("quotient="+div);
			}
			
		catch(ArithmeticException e)
		{
		System.out.println("Denominator is zero");	
		}
		catch(InputMismatchException e)
		{
			System.out.println("wrong input data type");
		}
			
			
	}
}
