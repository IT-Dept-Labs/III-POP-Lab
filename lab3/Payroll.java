public class Payroll{
	int salary;
	public Payroll(int sal){
		salary=sal;
	}
	

public static void main(String[] args) {
	Payroll it=new Payroll(200000);
	System.out.println(it.salary);
	Payroll mech=new Payroll(25000);
	System.out.println(mech.salary);

}
	

}