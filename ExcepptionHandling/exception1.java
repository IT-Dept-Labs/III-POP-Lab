class exception1
{
 public static void main(String arg[])
   {
dostuff();
    }
public static void dostuff()
{
domorestuff();
}
public static void domorestuff()
{
System.out.println("method1");
System.out.println(10/0);
dolittlestuff();
}
public static void dolittlestuff()
{
System.out.println("method1");
}

}