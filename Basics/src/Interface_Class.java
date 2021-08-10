import java.util.*;
import java.io.*;

interface c{
	abstract class b{
		abstract void display();
		void d(){
			System.out.println("aravinth");
		}
	}
	abstract void dis();
}

class bcd implements c{
		void d(){
			System.out.println("d");
		}
		public void dis() {
			// TODO Auto-generated method stub
			System.out.println("dis");
		}
		void display(){
			System.out.println("display");	
		}
}

public class Interface_Class extends bcd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bcd ara=new bcd();
		ara.display();
		ara.dis();
		ara.d();
	}
}
