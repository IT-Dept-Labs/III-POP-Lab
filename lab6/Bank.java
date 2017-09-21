import java.util.Scanner;

abstract class Details{
	long ac;
	String name;
	double amt;

	protected Details(long ac,String name, double amt){
		this.ac=ac;
		this.name=name;
		this.amt=amt;
	}

	//protected abstract void printDetails(long ac);
}

class Deposit extends Details{
	protected Deposit(long ac,String name,double amt){
		super(ac,name,amt);
	}
	protected void depositAmt(long ac,double depo){
		if(ac==super.ac){
			super.amt=super.amt+depo;
			System.out.println("Rs."+depo+" deposited to account number "+ac);
		}
		else
			System.out.println("Invalid ac");
	}
	protected void printDetails(long ac){
		if(ac==super.ac){
			System.out.println("A/c: "+super.ac);
			System.out.println("Name: "+super.name);
			System.out.println("Amount: "+super.amt);
		}
		else
			System.out.println("Invalid ac");
	}

}

class Withdraw extends Deposit{
	protected Withdraw(long ac,String name,double amt){
		super(ac,name,amt);
	}
	protected void withdrawAmt(long ac,double amount){
		if(ac==super.ac){
			super.amt=super.amt-amount;

						System.out.println("Rs."+amount+" withdrawn from account number "+ac);
		}
		else
			System.out.println("Invalid ac");
	}
	protected void printDetails(long a){}
}

class Interest extends Withdraw{
	protected Interest(long ac,String name,double amt){
		super(ac,name,amt);
	}
	protected void calculateInterest(long ac){
		if(ac==super.ac)
			super.amt=super.amt+super.amt*0.04;
		else
			System.out.println("Invalid ac");
	}
	protected void printDetails(long ac){
		if(ac==super.ac){
			System.out.println("A/c: "+super.ac);
			System.out.println("Name: "+super.name);
			System.out.println("Amount: "+super.amt);
		}
		else
			System.out.println("Invalid ac");
	}
	

}

public class Bank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Name: ");
		String name=sc.nextLine();
		System.out.print("Enter the A/c number: ");
		long ac=sc.nextLong();
		System.out.print("Enter the amount in the bank: ");
		double amt=sc.nextDouble();

		long n;
		double a;
		Interest i;
		i=new Interest(ac,name,amt);

		System.out.println("\n1.Deposit\n2.Withdraw\n3.Calculate Interest\n4.Print Details");
		System.out.println("Press q to Quit");
		System.out.print("Enter the type of the transaction:");
		char c=sc.next().charAt(0);
		while(c!='q'){
			switch(c){
				case '1':	System.out.print("Enter the A/c: ");
						n=sc.nextLong();
						System.out.print("Enter the amount: ");
						a=sc.nextDouble();
						i.depositAmt(n,a);
						break;

				case '2':	System.out.print("Enter the A/c: ");
						n=sc.nextLong();
						System.out.print("Enter the amount: ");
						a=sc.nextDouble();
						i.withdrawAmt(n,a);
						break;

				case '3': System.out.print("Enter the A/c: ");
						n=sc.nextLong();
						i=new Interest(ac,name,amt);
						i.calculateInterest(n);
						System.out.println("Done!");
						break;

				case '4':	System.out.print("Enter the A/c: ");
						n=sc.nextLong();
						//i=new Interest(ac,name,amt);
						i.printDetails(n);
						break;

				default: System.out.println("Invalid Input!");

		}

		System.out.println("\n1.Deposit\n2.Withdraw\n3.Calculate Interest\n4.Print Details");
		System.out.println("\nPress q to Quit");
		System.out.print("Enter the type of the transaction:");
		c=sc.next().charAt(0);
			
	}

	}
}