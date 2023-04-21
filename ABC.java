
public class ABC {
public static void main(String[] args)
{
	StringBuffer s=new StringBuffer("hello ");
	s.append("java");
	
	System.out.println(s);
	System.out.println(s.indexOf("hello"));
	System.out.println(s.capacity());
	System.out.println(s.reverse());
	System.out.println(s.replace(0,10,"java hello"));
	
}
}
