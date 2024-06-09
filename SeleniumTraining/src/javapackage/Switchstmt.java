package javapackage;

public class Switchstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=25;
		switch (number) {
		case 10:
		
		System.out.println("not matched:10");
			break;
		case 15:
			
		System.out.println("not matched:15");
		break;
		case 25:
			
		System.out.println("Matched:25");
		break;
		case 35:
			
		System.out.println("not matched:35");
	break;
		default:
			System.out.println("No anycase value match with expression");
			break;
		}
		

	}

}
