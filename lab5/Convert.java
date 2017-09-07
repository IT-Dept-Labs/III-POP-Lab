import java.util.Scanner;

public class Convert{
	int dec;
	static int count=0;
public Convert(int num){ dec=num;}

	public static int[] hexToDeci(int num){
		int arr[]=new int[15];
			while(num!=0){
			int rem=num%16;
			arr[count]=rem;
			count++;
			num/=16;

		}
		return arr;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a decimal number: ");
	int d=sc.nextInt();
	int hex[]=new int[15];
	hex=Convert.hexToDeci(d);
	System.out.print("Hexadecimal value= ");
	for(int i=Convert.count-1;i>=0;i--)
		System.out.print(hex[i]);

	System.out.println("");
}

}