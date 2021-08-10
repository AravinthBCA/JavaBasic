import java.util.*;
import java.io.*;

class a{      //only the file name of the class is public is not public,private protected,static
	public void aravinth(int f){
		System.out.println("Aravinth");
	}
	 public  void aravinth(float f){
		System.out.println("Aravinth1");
//		return 1;
	}
}

class b extends a{
	public void aravinth(int i){
		super.aravinth(i);
		System.out.println("Aravinth2");
	}
}

public class Overloading_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b=new b();
		int f = 0;
		b.aravinth(f);
	}
}
