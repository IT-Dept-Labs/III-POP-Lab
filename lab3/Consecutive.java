import java.util.Scanner;

public class Consecutive{
int n;
int[] arr1=new int[n];

public void sort(arr1){
	int t;
	for(int i=0;i<arr.len-1;i++){
		for(j=i;j<arr.len;j++){
			if (a[j]>a[j+1]){
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
} 
public int compute(int[] arr){
	sort(arr);
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Consecutive c=new Consecutive();
	System.out.println("Enter the array size: ");
	c.n=sc.nextInt();
	System.out.println("Enter the array elements: ");
	for(int i=0;i!='\0';i++){
		c.arr1[i]=sc.nextInt();
	}
	System.out.println(c.compute(c.arr1));
}

}