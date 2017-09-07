import java.util.Scanner;

public class Products{
	String[] productList=new String();
	public Products(String[] prod){
		for(int i=0;i<length(prod);i++){
			productList[i]=prod[i];
		}
	}

	public static void display(){ System.out.println(productList); }

	
	
}