import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Binary{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int num=sc.nextInt();
		if(num>=0){
			ArrayList <Integer> res=new ArrayList <Integer>();
			while(num!=0){
				res.add(num%2);
				num/=2;
				}
			Collections.reverse(res);
			for(int i:res){
				System.out.print(i);
			}
			System.out.println("");
			}	
		else
			System.out.println("Enter a positive value");
}
}