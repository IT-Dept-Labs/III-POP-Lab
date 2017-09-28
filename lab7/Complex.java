import java.util.Scanner;
abstract class Simple{
	public int a;
	public void findDay(int a){}
}
class Compute extends Simple{
	public void findDay(int a){
		switch(a){
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			case 0: System.out.println("Sunday");
					break;
			default: System.out.println("Invalid Input");
		}
	}
}

public class Complex{
	public static void main(String[] args) {
		Compute c=new Compute();
		System.out.print("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		c.findDay(A);
	}
}