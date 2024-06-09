package javapackage;

public class Nestedifelse {

	public static void main(String[] args) {
//Nested if else stmt
		int age=25;
		int weight=45;
		
		// outer if block
		if(age>18)
		{
			//inner if block
			if (weight==50)
			{
				System.out.println("Eligble for blood donation");
			}
			else {
				System.out.println("Not eligible for blood donation");
			}
		}
		else 
		{
			System.out.println("Age should be greater than 18 years");
		}
			
			
		}
		
		

	}


