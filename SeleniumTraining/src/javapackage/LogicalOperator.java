package javapackage;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=20;
		// logical operator &&
		System.out.println(a<b  && a++<c ); 
		// first condition false, second contion will not check, output false
		System.out.println(a); //output 10
		System.out.println(a>b  && a++<c );
		// first condition true, second contion true, output true
		
		System.out.println(a); //output 11
		
		//bitwise &
		
		System.out.println(a<b  & a++<c ); 
		// first condition false, second contion will check true, output false
		System.out.println(a); //output 12
		System.out.println(a>b  & a++<c );
		// first condition true, second contion will check true, output true
		
		System.out.println(a); //output 13
		
	}

}
