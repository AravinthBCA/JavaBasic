class animal{	
}

public class InstanceOf1 extends animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceOf1 obj=new InstanceOf1();
		System.out.println(obj instanceof animal); //true
		animal ani=new animal();
		System.out.println(ani instanceof animal); //true
		System.out.println(ani instanceof InstanceOf1); //false
	}

}
