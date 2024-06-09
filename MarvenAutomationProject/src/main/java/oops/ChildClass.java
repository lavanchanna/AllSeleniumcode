package oops;

public class ChildClass implements FatherInterface,MotherInterface {



	@Override
	public void height() {
		// TODO Auto-generated method stub
		
		float HT=(FatherInterface.ht+MotherInterface.ht)/2;
		System.out.println(HT);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FatherInterface f1=new ChildClass();
		f1.height();
	}

}
