class a5{
	void a5method(){
		System.out.println("a5method");
	}
}

public class DynamicBinding extends a5{

//	void a5method(){
//		System.out.println("main method");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a5 obj=new DynamicBinding();   //object type cannot be determined by the compiler, because the 
		obj.a5method();      //instance of a5 is also an instance of DynamicBinding.So compiler doesn't
	}                        //know its type, only its base type.

}
