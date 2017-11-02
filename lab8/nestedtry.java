class nestedtry{
   public static void main(String args[]){
	
     try{

         try{
            System.out.println("Inside block1");
             int c =45/0;
            int b[] =new int[5];
            System.out.println(b[5]);
         }
         catch(ArithmeticException e1){
            System.out.println("Exception: e1");
         }
       
         try{
            System.out.println("Inside block2");
                                   int b[] =new int[5];
            System.out.println(b[5]);
         }
         catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: e2");
         }
        System.out.println("Just other statement");
    }
    catch(ArithmeticException e3){
    	 System.out.println("Arithmetic Exception");
         System.out.println("Inside parent try catch block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.println("ArrayIndexOutOfBoundsException");
         System.out.println("Inside parent try catch block");
    }
    catch(Exception e5){
    	System.out.println("Exception");
         System.out.println("Inside parent try catch block");
    }
    System.out.println("Next statement..");
  }
}