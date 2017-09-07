import java.util.Scanner;

class area{
	int len=-1;
	int wid=-1;
	int ht=-1;
	int rad=-1;

	//Constructor for square and cube
	public area(){
		len=5;
	}

	//Constructor for rectangle(a=0) and cylinder (a=1)
	public area(int lt,int width,int a){
		if(a==0){
		len=lt;
		wid=width;
		}
		else{
			rad=len;
			ht=width;
		}
	}

	//Construtor for sphere
	public area(int rad){
		this.rad=rad;
	}

	public double calculate(){
		//Square
		if(wid==-1)
			return len*len;
		//Rectangle
		else if(ht==-1)
			return len*wid;
		//Cylinder
		else if(len==-1)
			return 2*3.142*rad*rad+3.142*rad*ht;
		else
			return 4*3.142*rad*rad; 

	}

}
public class Area{
	public static void main(String[] args) {
		area a=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println(a.calculate());
		System.out.println("Enter the length and width of the rectangle: ");
		int len=sc.nextInt();
		int wid=sc.nextInt();
		area a1=new area(len,wid,0);
		System.out.println(a1.calculate());
		System.out.println("Enter the length and width of the cylinder: ");
		int rad=sc.nextInt();
		int ht=sc.nextInt();
		area a2=new area(rad,ht,1);
		System.out.println(a2.calculate());
	}
}