class Unary
{
	public static void main (String charn[])
	{
	   int a = 10;
       System.out.println("++a: " + (++a));  // 11
	   
       System.out.println("a++: " + (a++));  // 11 (post-increment)
       System.out.println("a after a++: " + a);  // 12
       System.out.println("--a: " + (--a));  // 11 (pre-increment)
	
	}
}