import java.util.*;
import java.io.*;

public class StringBuilder_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("java");   //Hello java
		System.out.println(sb);
		sb.insert(1,"java"); //Hjavaellojava
		System.out.println(sb);
		sb.replace(1,3,"java");  //it means starting point 1 to end is 2
		System.out.println(sb);  //Hjavavaellojava
		sb.delete(1, 3);// delete point 1 to 2
		System.out.println(sb); //Hvavaellojava
		sb.reverse(); //avajolleavavh
		System.out.println(sb);
		System.out.println("capacity = "+sb.capacity());

		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity()); //16
		sb1.append("Hello");
		System.out.println(sb1.capacity());  //16
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity()); //now (16*2)+2=34
	}

}
