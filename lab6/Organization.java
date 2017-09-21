import java.util.Scanner;

class Details{
	int id;
	String name;
	long contact;
	public Details(int id,String name,long contact){
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	protected void printDetails(){
		System.out.println("\nID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contact);
	}

}

class Appraisal extends Details{
	int score;
	public Appraisal(int id,String name,long contact,int score){
		super(id,name,contact);
		this.score=score;
	}
	protected double calculateAppraisal(){
		//-------check---------------------------------//
		return score*85/100;
		//-------check--------------------------------//
	}
}

class Payroll extends Appraisal{
	protected Payroll(int id,String name,long contact,int score){
		super(id,name,contact,score);
	}
	protected int calculatePay(){
			return 20000*score;
	}
}

public class Organization{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name=sc.nextLine();
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		System.out.print("Enter the Contact: ");
		long contact=sc.nextLong();
		System.out.print("Enter the score: ");
		int score=sc.nextInt();
		Payroll p=new Payroll(id,name,contact,score);
		p.printDetails();
		System.out.println("Appraisal: "+p.calculateAppraisal());
		System.out.println("Pay: "+p.calculatePay());
	}
}