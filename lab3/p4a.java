import java.util.Scanner;
public class p4a{
	
	public static void main(String[] args){
		int[] arr1=new int[100];
		int[] arr2=new int[100];
		Scanner inp=new Scanner(System.in);
		int n1,n2,v=-1;
		boolean flag=false, f=false;
		System.out.print("Enter size of array1: ");
		n1=inp.nextInt();
		System.out.print("Enter elements of array1: ");
		for(int i=0;i<n1;i++)
			arr1[i]=inp.nextInt();

		System.out.print("Enter size of array2: ");
		n2=inp.nextInt();
		System.out.print("Enter elements of array2: ");
		for(int i=0;i<n2;i++)
			arr2[i]=inp.nextInt();

		System.out.print("Common elements: ");

		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				if(arr1[i]==arr2[j]){
						v=arr1[i];
						flag=true;
						f=true;
					}
				}
				if (flag==true){
					System.out.print(v+" ");
					flag=false;
				}
				
		}

				if(!f)
					System.out.print("No common elements");
			
		
		System.out.println("");



	}
}