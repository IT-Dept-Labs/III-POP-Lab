interface Inter1{
	public void meth1(int a,int b);
	public void meth2();
}
class Class1 implements Inter1{
	public void meth2(){
		System.out.println("Interface implemented!!");
	}
	public void meth1(int a,int b){
		System.out.println(a+"^"+b+" = "+Math.pow(a,b));
	}

}
public class Inter{
	public static void main(String[] args) {
		Inter1 i=new Class1();
		i.meth1(25,3);
		i.meth2();
	}
}