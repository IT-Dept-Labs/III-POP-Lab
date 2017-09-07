import java.util.*;
public class Payroll{
	int salary;
	String dept;
	public Payroll(int sal,String de){
		salary=sal;
		dept=de;
	}
	

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the salary for IT dept");
	
	int s=sc.nextInt();
	Payroll it=new Payroll(s, "IT");
	System.out.println(it.salary+" "+it.dept);
	System.out.print("Enter the salary for Mech dept");
	s=sc.nextInt();
	Payroll mech=new Payroll(s,"Mech");
	System.out.println(mech.salary+" "+mech.dept);

}
	

}