interface Printable{}  
    class A6 implements Printable{  
    public void a(){System.out.println("a method");}  
    }  
    class B6 implements Printable{  
    public void b(){System.out.println("b method");}  
    }  
      
    class Call{  
    void invoke(Printable p){//upcasting  
    if(p instanceof A6){  
    A6 a=(A6)p;//Downcasting   
    a.a();  
    }  
    if(p instanceof B6){  
    B6 b=(B6)p;//Downcasting   
    b.b();  
    }  
      
    }  
    }//end of Call class  
      
    class Test4{  
    public static void main(String args[]){  
    Printable p=new B6();  //this is not object for instance it means interface instance refers to B6 class
    Call c=new Call();     //so instanceof b is created
    c.invoke(p);  
    }  
    }  