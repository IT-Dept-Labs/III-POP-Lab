import attendance.PackageClass;
import java.util.Scanner;

public class PackageChild{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PackageClass pc=new PackageClass();
		pc.print("Enter the absentee roll: ");
		int roll=sc.nextInt();
		while(roll!=0){
			pc.absentee(roll);
			pc.print("Enter 0 to quit");
			pc.print("Enter the absentee roll: ");
			roll=sc.nextInt();

		}	
		pc.print("List of absentees: ");
		for (int i=0;i<50;i++){
			if (pc.ab[i]!=0)
				System.out.println(i);
		}
	}
}