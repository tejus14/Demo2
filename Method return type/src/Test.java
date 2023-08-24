
public class Test
{
public int m1()
{
	return 10;
}
 public Object m2()
{
	return "abc";
	}

public static void main(String[]args)
{
	Test t=new Test();
	     int x=t.m1();
	     
	     String y=(String)t.m2();
	     System.out.println(y);
	     System.out.println(x); 
}
}