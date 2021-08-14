import java.util.*;
import java.io.*;
public class PerfectNumber {
	static void per(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,sum=0;
		per();
		System.out.println("Enter the number: ");
		n=in.nextInt();
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum+=i;
				System.out.println("Sum: "+sum);
			}
		}
		if(sum==n){
			System.out.println(n+"is perfect number...");
		}
		else{
			System.out.println("Sorry...");
		}
	}

}
