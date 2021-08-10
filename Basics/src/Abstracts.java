abstract class ruban{
	int i=10;
	abstract void meht();
}

class san extends ruban{

	@Override
	void meht() {
		// TODO Auto-generated method stub
		System.out.println("san"+i);
	}
	
}
public class Abstracts{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubara
		san s=new san();
		s.meht();
	}
}
