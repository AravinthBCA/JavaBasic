class a4{
	void amethod(){
		System.out.println("amethod");
	}
}

public class StaticBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a4 obj=new a4();  //static binding determined at compiler, any private,static,final 
		obj.amethod();    //is called static binding
	}

}
