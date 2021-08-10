import java.util.*;
import java.io.*;

public class ContentComparison_ReferenceComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("A");
		String str1=new String("A");
		System.out.println(str==str1); //false
		System.out.println(str.equals(str1));  //true
	}

}
