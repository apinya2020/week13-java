package week13;

public class Son implements Father,Mather {

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Mom cooks nice");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Father work ");
		
	}
	
	public static void main(String[]args) {
		Son s1 = new Son();
		s1.cook();
		s1.work();
	}
	
}
