//package java33;
import javaa4.java4;
import java.util.Scanner;

class j3{
	public int a;
	public void setvalue()
	{
		Scanner aa=new Scanner(System.in);	
		System.out.println("please enter the value          ## inside the package java33");
		a=aa.nextInt();
	}

	public void getvalue()
	{
		System.out.println("the value ## inside the package java33 is     "+a);	
	}
}

public class java3{
public static void main(String[] args)
{
	System.out.println("inside the main code , importing java4 package");
		java4 aa=new java4();
		aa.setvalue();
		aa.getvalue();
	System.out.println("inside the main code , from same package java33");
		j3 aaa=new j3();
		aaa.setvalue();
		aaa.getvalue();
}
}
