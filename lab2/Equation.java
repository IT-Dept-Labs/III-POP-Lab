import java.util.Scanner;

public class Equation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficients of eq1:");
		double a1=sc.nextDouble();
		double b1=sc.nextDouble();
	    double c1=sc.nextDouble();

	    System.out.println("Enter the coefficients of eq2:");
	    double a2=sc.nextDouble();
	    double b2=sc.nextDouble();
	    double c2=sc.nextDouble();

	    
	    double x;
	    double y;
	    double d=(a1*b2-b1*a2);
	    if(d!=0){
	    x=(b2*c1-b1*c2)/d;
	    y=(a1*c2-a2*c1)/d;
	    System.out.println("x:"+x);
	    System.out.println("y:"+y);
	    }
	    else System.out.println("No Solution");


	}
}