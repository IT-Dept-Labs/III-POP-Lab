import java.util.Scanner;
interface bank
{
	void display();
	void deposit(int x);
	void withdraw(int x);
	void add_account();
}
class myclass implements bank //adapter class
{
	int money;
	public void display()
	{

	}
	public void add_account()
	{

	}
	public void deposit(int x)
	{
		
	}
	public void withdraw(int x)
	{

	}
}

class partial extends myclass
{
	int x, y;
	Scanner in = new Scanner(System.in);
	public void display()
	{   if (money >=0)
		{
		System.out.println("Money available is " + money);
		}
		else
				System.out.println("low balance can't withdraw" );
	}

	public void withdraw(int x)
	{
		money = money - x;
	}

	public static void main(String[] args)
	{
		partial obj = new partial();
		obj.test();
	}

	public 
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
	public void deposit(int x)
	{
		money = money + x;
	}
}