class Animal2 { }  
  
class DownCastingUsingInstanceOf extends Animal2 {  
  static void method(Animal2 a) {  
    if(a instanceof DownCastingUsingInstanceOf){  
    	DownCastingUsingInstanceOf d=(DownCastingUsingInstanceOf)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    Animal2 a=(Animal2) new DownCastingUsingInstanceOf();  
    DownCastingUsingInstanceOf.method(a);  
  }  
    
 }  