//Recursion in java is a process in which a method calls itself continuously. 
//A method in java that calls itself is called recursive method.

import java.util.*;
import java.io.*;

class fibonacci{
	int j1=0,j2=1,j3=0;
	void fibo(int i){
		if(i>0){
			j3=j1+j2;
			j1=j2;
			j2=j3;
			System.out.println(j3);
			fibo(i-1);
		}
	}
}

public class FibonacciRecursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("How many digits you want fibonacci series: ");
		n=in.nextInt();
		fibonacci obj=new fibonacci();
		System.out.println("Your series are: "+0+1);
		obj.fibo(n-2);
	}
}
