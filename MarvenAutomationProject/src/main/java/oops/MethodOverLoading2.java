package oops;

public class MethodOverLoading2 extends MethodOverLoading{
	
	public static void main(String[] args) {
		
		MethodOverLoading2 MO= new MethodOverLoading2();
		System.out.println(MO.sum(1, 2));
		System.out.println(MO.sum(1, 2, 3));
		MO.sum("Lavan","Chenna");
	}

}
