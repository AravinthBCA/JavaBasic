
public class MathRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=Math.random();  //by default 0 to 1
		Double d1=Math.random();
		System.out.println(d);
		System.out.println(d1);
		double d2=(Math.random())*20;  //user set the end point o to 20
		System.out.println(d2);  
		double d3 =10+(Math.random());  //user set the start point 10 to 11
		System.out.println(d3);
		double d4= 5+(Math.random())*30;  //user set the start and end point +5 to *30 
		System.out.println(d4);
	}

}
