class a7{
	static int a7method(int i){
		return i*i*i;
	}
}

class b7{
	static a7 entity;  //aggregation
	 static int b7method(int j){
		 entity=new a7();
		 int number=entity.a7method(j);  //code reusability
		return number;
	 }
}

public class Aggregation {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		b7 obj=new b7();
		System.out.println(obj.b7method(10));
	}

}
