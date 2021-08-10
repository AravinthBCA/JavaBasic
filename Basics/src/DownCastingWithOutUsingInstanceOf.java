class Animal5 { }  
   class Dog4 extends Animal5 {  
      static void method(Animal5 a) {  
           Dog4 d=(Dog4)a;//downcasting  
           System.out.println("ok downcasting performed");  
      }  
    public static void main (String [] args) {  
        Animal5 a=new Dog4();  
        Dog4.method(a);  
      }  
}  