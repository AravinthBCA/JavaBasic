import java.util.Scanner;

class factorial{
	int fact(int i){
		if(i==1)
			return 1;
		else
			return (i*fact(i-1));
	}
}

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		factorial obj=new factorial();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=in.nextInt();
		System.out.println(obj.fact(n));
	}

}
