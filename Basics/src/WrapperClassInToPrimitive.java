
public class WrapperClassInToPrimitive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Converting Integer to int    
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    
	}

}
