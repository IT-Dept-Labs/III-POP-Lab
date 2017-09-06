import java.util.Scanner;


public class Area{

	public double computeArea(double rad, double len,int a){

		if (a==0)

			return 3.1428*rad*(rad+len);

		else

        		return 2*3.142*rad*len+2*3.142*rad*rad;
 
   	}

      public double computeArea(double len,double wid,double het ){
	
        return 2*(len*wid+wid*het+het*len);
  
	  }

  	public double computeArea(double len,double wid,double s1,double s2){
	
        return len*wid+len*s1+wid*s2;

    }

    
    public double computeaArea(double rad){


        return 2*3.142*rad*rad;
	
    }
  
	  public static void main(String[] args){

	        Scanner sc=new Scanner(System.in);

	        Area a=new Area();
	
        System.out.print("Enter the radius and length of cone: ");

	        double rad=sc.nextDouble();
 
	        double len=sc.nextDouble();

    		double area=a.computeArea(rad,len,0);

	        System.out.println("Area ="+area);

        
        System.out.print("Enter the radius and height of cylinder: ");
	        rad=sc.nextDouble();

	        len=sc.nextDouble();
	        area=a.computeArea(rad,len,1);

        	System.out.println("Area ="+area);

        
        System.out.print("Enter the length width and height of rectangular Prism: ");
	        rad=sc.nextDouble();

	        len=sc.nextDouble();

	        double height=sc.nextDouble();
	        area=a.computeArea(rad,len,height);
	
        System.out.println("Area ="+area);

       
    }

}
