import java.util.*;
import java.io.*;

public class String_Buffer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer(); //initial capacity of stringbuilder is 16
		str.append("GFG");
		System.out.println("String ="+str.toString());
		StringBuilder str1=new StringBuilder("AAABBBCCC");
		System.out.println("String 1 ="+str1.toString());
		StringBuilder str2=new StringBuilder(10);
		System.out.println("String 2 capacity ="+str2.capacity());
		StringBuilder str3=new StringBuilder(str1.toString());
		System.out.println("String3 ="+str3.toString());
	}

}
