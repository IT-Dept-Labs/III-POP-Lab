import java.util.Scanner;

public class Volume{

	public double computeVolume(double side){
		return side*side*side;
	}
	public double computeVolume(double len, double wid, double heit){
		return len*wid*heit;
	}

	public double computeVolume(double rad,double heit, char a){
		if (a=='c')
		return 3.14*rad*rad*heit;
	
	//public double computeVolume(double rad, double heit){
	else
		return (1.0/3)*3.14*rad*rad*heit;
	}
	public static void main(String[] args) {
		Volume v=new Volume();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of the cube: ");
		double s=sc.nextInt();
		System.out.print("Enter the length of the cuboid: ");
		double l=sc.nextInt();
		System.out.print("Enter the width of the cuboid: ");
		double w=sc.nextInt();
		System.out.print("Enter the height of the cuboid: ");
		double h=sc.nextInt();
		System.out.print("Enter the radius of the cylinder: ");
		double r=sc.nextInt();
		System.out.print("Enter the height of the cylinder: ");
		double he=sc.nextInt();
		System.out.print("Enter the radius of the cone: ");
		double rad=sc.nextInt();
		System.out.print("Enter the height of the cone: ");
		double height=sc.nextInt();
		System.out.println("Volume of the cube ="+ v.computeVolume(l));
		System.out.println("Volume of the cuboid ="+ v.computeVolume(l,w,h));
		System.out.println("Volume of the Cylinder ="+ v.computeVolume(r,he,'c'));
		System.out.println("Volume of the Cone ="+ v.computeVolume(rad,height,'C'));


	}
}
