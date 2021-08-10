import java.util.*;
import java.io.*;

class stat{
	static int k=0;  //you want change the static variable value, it's use static methods and constructor
//	k=1; //error
	stat(){
		k++;
	}
	void display(){
		System.out.println(k);
	}
	
}

public class StaticVariables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat obj=new stat();
		obj.display();
		stat obj1=new stat();
		obj1.display();
		stat obj2=new stat();
		obj2.display();
	}

}
