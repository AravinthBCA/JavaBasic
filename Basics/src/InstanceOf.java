
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceOf obj=new InstanceOf();   //to check the object is instance of the class or not 
		System.out.println(obj instanceof InstanceOf); //true
		InstanceOf obj1 = null;      //to create the object but not instance so return false
		System.out.println(obj1 instanceof InstanceOf);  //false
	}

}
