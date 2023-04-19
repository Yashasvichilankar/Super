class Person{
	Person(){
		System.out.println("You called the constructor of class Person");
	}
}
class Child extends Person{
     Child(){
		super();
		System.out.println("You called the constructor of class Child");
	}
}
public class SuperConstructor {
public static void main(String[] args) {
	Child c=new Child();
}
}
