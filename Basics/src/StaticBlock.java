import java.util.*;
import java.io.*;

class sta{
	static String name="Aravinth";
	String name1="Aravinth";
	static{
		System.out.println(name);
//		System.out.println(name1);  //error you should only use static data memeber inside the static block
	}
}

public class StaticBlock {
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sta obj=new sta();   //static block it runs only onces
		sta obj2=new sta();
		sta obj3=new sta();
	}

}
