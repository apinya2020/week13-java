package week13;
//Human is parent class,base class or super class
public class Human {
	
	void work() {
		System.out.println("Human can work");
	}
}

//Engineer is Intermediatory class
class Engineer3 extends Human {
	void eat() {
		System.out.println("Engineer can eat");
	}
}

//derived class 
class Student3 extends Engineer3{
	public static void main(String[]args) {
		Student3 std1 = new Student3(); //object
		std1.work();
		std1.eat();
	}
}