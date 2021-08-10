
public class CallByValue1 {
	 int data=50;  
	  
	 void change(CallByValue1 op){  
	 op.data=op.data+100;//object contains the variable and methods it will change the value to effect parent object and methods.
	 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue1 op=new CallByValue1();
		System.out.println("before change "+op.data);  
		op.change(op);//passing object  
		System.out.println("after change "+op.data);  
	}

}
