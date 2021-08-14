import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class ArmstrongNumberInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,armstrong = 0,temp;
		Scanner in=new Scanner(System.in);
		LinkedList<Integer>ll=new LinkedList<Integer>();
		System.out.println("Enter the array of number: ");
		for(int i=0;i<5;i++){
			System.out.println("Enter : ");
			ll.add(in.nextInt());
		}
		ListIterator<Integer> li=ll.listIterator();
		while(li.hasNext()){
			Integer l=(Integer)li.next();
			System.out.println(l);
			armstrong=0;
			temp=l;
			while(l!=0){
				number=l%10;
				armstrong+=(number*number*number);
				l=l/10;
			}
			l=temp;
			if(l==armstrong){
				System.out.println("It is a ARMSTRONG number...");
			}
			else{
				System.out.println("not");
			}
		}
	}

}
