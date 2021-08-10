import java.util.*;
import java.io.*;

public class Strings_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aravinth";//String is Immuteable(Not changeable) you want to change to create another object
		//(or)String str=new String("Aravinth");
		str.concat("BCA");
		System.out.println(str);
		System.out.println("Addition operator in string: "+(str+"BCA"));
		String str1=str.concat("BCA");//new object to store the concat of the exicting object
		System.out.println(str1);
		StringBuffer strbuf=new StringBuffer("Ruban");//StringBuffer is Muteable(changeable)
		strbuf.append("Kaliyamoorthy");
		System.out.println(strbuf);
	}

}
