
interface a1{
	int a=10;
	public void aravi();  //not allow to implementation of the method
	abstract void arav(); // interface methods only allow default, public and abstract modifiers.
	public void ruba();      //by default,public and abstract
}

class b1 implements a1{
	public void aravi(){
		System.out.println("aravi");
	}

	public void arav() {
		// TODO Auto-generated method stub
		System.out.println("arav");
	}

	public void ruba() {
		// TODO Auto-generated method stub
		System.out.println("ruba");
	}
}

public class Interfaces{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 bcd=new b1();
		bcd.ruba();
		bcd.aravi();
		bcd.arav();
	}
}
