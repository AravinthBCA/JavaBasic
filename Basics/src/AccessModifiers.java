class Animal1{  
	void eat(){
		System.out.println("eating...");
	}  
    void at(){
		
	}
}  
class Dog extends Animal1{
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
//	super.at();  //error
	void work(){  
		super.eat(); 
		super.at();
		bark();  
	}  
}  

class AccessModifiers{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.work();  
	}
} 