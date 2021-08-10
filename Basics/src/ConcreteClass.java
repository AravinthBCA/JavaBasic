
interface ara{               // 100% abstraction
	int i=10;
	abstract void vinth();
}

abstract class ruba{           // partial abstraction 
	static void ruban(){
		int i=0;
		System.out.println("ruban");
	}
}

class depak extends ruba {      // a class not allow to abstract method but allow abstract inner class
    static void ruba(){                  
    	System.out.println("deepak");
    }
    abstract class san{
    	void santh(){
    		System.out.println("deepak");
    	}
    	
    }
}

class mani extends depak{  //a class is not contain abstract keyword is called concrete class.
	void ma(){
		
	}
}

//public class ConcreteClass extends depak{}   //depak is not allow to use extends because this class implements interface
//public class ConcreteClass extends depak,mani{} // error java does not support multiple inheritance
public class ConcreteClass extends depak{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ruba();
		ruban();
		
	}

}
