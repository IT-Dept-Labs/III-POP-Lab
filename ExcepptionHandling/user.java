class FoundException extends Exception
{
FoundException(String a)
{
super(a);
}
}
class user 
{

static void disp(int s) throws FoundException

{
if(s>5)  
      throw new FoundException ("accessing higher value");  
     else  
      System.out.println("can be accessed");  

   } 
public static void main(String args[]){  
      try{  
      disp(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}   