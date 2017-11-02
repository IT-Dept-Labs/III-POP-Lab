import java.util.Scanner;
class lesscash extends Exception
{

}

abstract class myclass
{
	int money;
	abstract void display();
	void deposit(int x)
	{
		money = money + x;
	}
	abstract void withdraw(int x);
}

class prog1 extends myclass
{
	int x, y;
	Scanner in = new Scanner(System.in);
	void display()
	{
		System.out.println("Money available is " + money);
	}

	void withdraw(int x)
	{ try{ if (money-x<0)
		throw new lesscash() ;
		money = money - x;}
	  catch(lesscash e)
	  {
	  	System.out.println("low balance can't withdraw" );
	  }
	}

	public static void main(String[] args)
	{
		prog1 obj = new prog1();
		obj.test();
	}

	void test()
	{
		System.out.println("Enter money to deposit:");
		x = in.nextInt();
		deposit(x);
		display();
		System.out.println("Enter money to withdraw:");
		y = in.nextInt();
		withdraw(y);
		display();
	}
}