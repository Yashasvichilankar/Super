import java.util.Scanner;

class A{
	Scanner sc=new Scanner(System.in);
	void print()
	{
		int a,b;
		System.out.println("Enter any two number:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition: "+(a+b));
	}
}
class B extends A{
	void print()
	{
		int a,b;
		System.out.println("Enter any two number:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Multiplication: "+(a*b));
	}
	void display()
	{
		super.print();
		print();
	}
}
public class SuperExample {
	public static void main(String[] args) {
	 B b=new B();
	 b.display();
	}

}
