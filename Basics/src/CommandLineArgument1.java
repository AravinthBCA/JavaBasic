import java.util.Scanner;


public class CommandLineArgument1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner in=new Scanner(System.in);
		i=in.nextInt();
		for(String str:args){
			System.out.println(str);
		}
		
	}

}
