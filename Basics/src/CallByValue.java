
public class CallByValue { 
		 int data=50;  
		  
		 void change(int data){  
		 data=data+100;//changes will be in the local variable only  
		 System.out.println(data);
		 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue op=new CallByValue();
		System.out.println("before change "+op.data);  
		   op.change(500);  
		   System.out.println("after change "+op.data);  
	}

}
