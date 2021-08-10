//the base class static method hides the derived class static method, so override in static method is not possible 
//it means method hiding.

class Base{
	
	public static void display() {
		System.out.println("static or class method from Base");
	}
	
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

class Derived extends Base{
	
	public static void display() {
		System.out.println("static or class method from Derived");
	}
	
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}


public class OverridingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj=new Derived();
		obj.display();
		obj.print();
	}

}
