import java.util.Scanner;
class Read
{   int n1;
    int n2;
    int n3;
   
	void info()
	{
		System.out.println("Calculating average of any three numbers");
	}
}
class Enter extends Read
{
     void info()
	{
		super.info();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
	}
}
class Average extends Enter
{	
	void info()
	{   
		super.info();
		int avg=(n1+n2+n3)/3;
		System.out.println("Average of given three numbers is: "+avg);
	}
}
public class UsingSuper {
public static void main(String[] args) {
	Average a=new Average();
	a.info();
}
}
