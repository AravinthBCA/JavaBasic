    //Creating the custom wrapper class  
    class Javatpoint{  
    private int i;  
    Javatpoint(){}  
    Javatpoint(int i){  
    this.i=i;  
    }  
    public int getValue(){  
    return i;  
    }  
    public void setValue(int i){  
    this.i=i;  
    }  
    @Override  
    public String toString() {    //not include this method output is Javatpoint@15db9742 means class name and object hashcode
      return Integer.toString(i);  //include this methodobject hashcode convert into integer so the value is 10
    }  
    }  
    //Testing the custom wrapper class  
    public class CustomWrapperClass{  
    public static void main(String[] args){  
    Javatpoint j=new Javatpoint(10);  
    System.out.println(j);  
    }}  