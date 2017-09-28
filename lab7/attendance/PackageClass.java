package attendance;

public class PackageClass{

	public static int ab[]=new int [50];
	public PackageClass(){
	for (int i=0;i<30;i++)
			ab[i]=0;
	}
	public void print(String s){
		System.out.println(s);
	}
	
	public void absentee(int roll){

		
		//ab[i]=0 implies studenti is present else absent
		ab[roll]=1;
	}
}
