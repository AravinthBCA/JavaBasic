  
// Encapsulation = Data hiding + Data Abstraction

class encap{
	private int balance;             // this is called data hiding it achieves using private, protected
	public int getbalance(){
		return balance;
	}
	public void setbalance(int balance){
		this.balance=balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap obj=new encap();
		obj.setbalance(100);               // Abstraction you don't about implementation but use it services
		System.out.println("your balance is: "+obj.getbalance());
	}

}
