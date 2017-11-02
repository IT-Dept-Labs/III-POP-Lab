class mtep
{
  public static void main (String args[])
   {
	
try
{
int arr[] ={1,2,3,4,5};	
System.out.println(arr[7]);
   }

catch(ArrayIndexOutOfBoundsException e)
{
//e.printStackTrace();
//System.out.println(e);
System.out.println(e.getmessage);
}
}
}