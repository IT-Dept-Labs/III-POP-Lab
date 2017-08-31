import java.util.Scanner;

class Index{
	public int findIndex(int[] arr, int num){
		for (int i=0;i<arr.length;i++){
			if(arr[i]==num)
				return i;
		}
		System.out.println(num+" not found!");
		System.exit(0);
		return 2;	
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.print("Enter the elements of the array: ");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	Index i=new Index();
	System.out.print("Enter the element to be searched: ");
	int num=sc.nextInt();
	System.out.println("Result: "+i.findIndex(arr,num));

}

}
