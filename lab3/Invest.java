import java.util.Scanner;
public class Invest{
	int p;
	double r;
	int t;
	int n;
	public double compute(int p, double r, int t, int n){
		double amt=p*Math.pow((1+(r/n)),n*t);
		return amt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Invest o1=new Invest();
		double amt;
		o1.p=sc.nextInt();
		o1.r=sc.nextDouble();
		o1.r/=100;
		o1.t=sc.nextInt();
		System.out.println("Years\tAmount");
		for(int i=1;i<=o1.t;i++){
		amt=o1.compute(o1.p,o1.r,i,12); //Monthly computed
		System.out.println(i+"\t"+Math.round(amt*1000.0)/1000.0);
	}

	}
}