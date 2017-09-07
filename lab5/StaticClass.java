import java.util.Scanner;

class StaticCl
{

	public static class Student
	{
	int sub[]=new int[5];

	public Student(int[] subject)
	{
		for(int i=0;i<subject.length;i++)
			sub[i]=subject[i];

	//public void print(Calculate c){ System.out.println(c.score)}
	}
	}
 	public class Calculate
 	{

	public int score(Student s)
	{
		int total=0;
		for(int i=0;i<s.sub.length;i++)
			total+=s.sub[i];
		return total;
	}
	}

}

class StaticClass 
 	{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StaticCl stat=new StaticCl();
		System.out.println("Enter the details of student 1\nEnter the scores of 5 subjects: ");
		int sub[]=new int[5];
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		StaticCl.Student st1=new StaticCl.Student(sub);
		

		System.out.println("Enter the details of student 2\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		StaticCl.Student st2=new StaticCl.Student(sub);
		

		System.out.println("Enter the details of student 3\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		StaticCl.Student st3=new StaticCl.Student(sub);

		StaticCl.Calculate cal=stat.new Calculate();
		System.out.println("\nTotal scores of each student is: ");
		System.out.println(cal.score(st1));
		System.out.println(cal.score(st2));
		System.out.println(cal.score(st3));

	}
}
