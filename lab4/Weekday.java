import java.util.Scanner;

class Weekday{
	int day;
	public Weekday(int a){
		day=a;
	}
	public void findDay(){
		switch(this.day){
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

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter a number between 1 and 7: ");
		n=sc.nextInt();
		Weekday we=new Weekday(n%7);
		we.findDay();
	}
}