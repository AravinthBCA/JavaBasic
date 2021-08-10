//it's used to create a clone object     

class ObjectCloning implements Cloneable{  
    int rollno;  
    String name;  
      
    ObjectCloning(int rollno,String name){  
    this.rollno=rollno;  
    this.name=name;  
    }  
      
    public Object clone()throws CloneNotSupportedException{  //not compulsory for this method
    return super.clone();  
    }  
      
    public static void main(String args[]){  
    try{  
    	ObjectCloning  s1=new ObjectCloning (10,"amit");  
      
    	ObjectCloning  s2=(ObjectCloning )s1.clone();  
      
    System.out.println(s1.rollno+" "+s1.name);  
    System.out.println(s2.rollno+" "+s2.name);  
      
    }catch(CloneNotSupportedException c){}  
      
    }  
    }  