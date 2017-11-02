/*
//1. try instead of throws

class throws1
{
 public static void main(String[] args) 
{
try
{
Thread.sleep(10000);
}
catch (InterruptedException e)
{
}
}
}
*/

//2.Using throws

class throws1
{
 public static void main(String[] args) throws InterruptedException
{
Thread.sleep(10000);
}
}