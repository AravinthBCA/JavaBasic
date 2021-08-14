import java.util.*;
import java.io.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,s1,n1,s2,n2;
		System.out.println("Enter the number: ");
		n=in.nextInt();
		s1=(5*n*n)+4;
		n1=(int)Math.sqrt(s1);
		s2=(5*n*n)-4;
		n2=(int)Math.sqrt(s2);
		if((s1==(n1*n1)) ||(s2==(n2*n2))){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
