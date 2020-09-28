package week13;
public class Human2 {
	void work() {
		System.out.println("Human can work");
	}
	
	void eat() {
		System.out.println("Engineer can eat");
	}
}
//Engineer is sub class
class Engineer extends Human2{
	void run() {
		System.out.println("Engineer can run");
	}
}
//sub class 
class Student extends Human2{
	public static void main(String[]args) {
		Student std1 = new Student(); //object
		Engineer en = new Engineer();
		std1.work();
		std1.eat();
		en.run();
	}
}