
class initalize{
    static int j=0;
	{
		int i=0;               // this block use to initialize variable it execute at the time of class
		System.out.println(i); //  instance created so the constructor executes the after this method.
		final int k=1;
		j=1;
		System.out.println(j);
	}
	initalize(){
		System.out.println("Constructor");
	}
}


public class InitializerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initalize i=new initalize();
		InitializerBlock k=new InitializerBlock();
		k.ara();
	}
	public void ara(){
		System.out.println("adsf");
	}
	
}
