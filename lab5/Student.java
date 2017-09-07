import java.util.Scanner;

public class Student{

	int sub[]=new int[5];

	public Student(int[] subject){
		for(int i=0;i<subject.length;i++)
			sub[i]=subject[i];
	}



public static class Calculate{

	public static int score(Student s){
		int total=0;
		for(int i=0;i<s.sub.length;i++)
			total+=s.sub[i];
		return total;
	}
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of student 1\nEnter the scores of 5 subjects: ");
		int sub[]=new int[5];
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		Student st1=new Student(sub);
		

		System.out.println("Enter the details of student 2\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		Student st2=new Student(sub);
		

		System.out.println("Enter the details of student 3\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		Student st3=new Student(sub);

		System.out.println("Enter the details of student 4\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		Student st4=new Student(sub);
		

		System.out.println("Enter the details of student 5\nEnter the scores of 5 subjects: ");
		for(int i=0;i<5;i++)
			sub[i]=sc.nextInt();
		Student st5=new Student(sub);


		System.out.println("\nTotal scores of each student is: ");
		System.out.println(Calculate.score(st1));
		System.out.println(Calculate.score(st2));
		System.out.println(Calculate.score(st3));
		System.out.println(Calculate.score(st4));
		System.out.println(Calculate.score(st5));
		

	}
}
