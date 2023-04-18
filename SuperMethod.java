import java.util.Scanner;
class Integer
{
int num;

 void data()
{
Scanner sc=new Scanner(System.in);

System.out.println("Input six non negative Digits: ");
num=sc.nextInt();
}}

class BreakInteger extends Integer{
 void data()
{
	super.data();
int d1=num / 100000 % 10;
int d2=num / 10000 % 10;
int d3=num / 1000 % 10;
int d4=num / 100 % 10;
int d5=num / 10 % 10;
int d6=num % 10;
System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6);
}
}
public class SuperMethod {
	public static void main(String[] args) {
		
BreakInteger obj=new BreakInteger();
obj.data();
}
}