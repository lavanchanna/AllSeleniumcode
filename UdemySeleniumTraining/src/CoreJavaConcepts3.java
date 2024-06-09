
public class CoreJavaConcepts3 {

	public static void main(String[] args) {
		
		//String is an object that represent sequence of characters
		//String liternal, if the value is different, it will create new object,
		// if the value is same, it will use the same object instead of creating new object
		
		String S1= "Selenium";
		String S2= "Selenium";
		
		// with new object, it will create new object even if the value is same
		
		String S3= new String("Training");
		String S4= new String("Training");
		
		String S= "Selenium Online Training";
		String[] SplittedString = S.split(" ");// this will split the above string using space
        System.out.println(SplittedString[0]); //output Selenium
        System.out.println(SplittedString[1]);//output Online
        System.out.println(SplittedString[2]);//output Training
        
        String S5= "Selenium Online Training";
		String[] SplittedString1 = S5.split("Online");// this will split the above string 2, Seleninum and Training
        System.out.println(SplittedString1[0]); //output Selenium
        System.out.println(SplittedString1[1]);//output Training
        System.out.println(SplittedString1[1].trim()); // this will trim the space both sides
        for (int i=0; i < S.length(); i++)
        {
        System.out.println(S.charAt(i)); // this will print the characters in the String
	}
        // Printing of characters in reverse
 System.out.println("Below is printing in reverse order");
        for (int i=S.length()-1; i>=0; i--)
        {
        	System.out.println(S.charAt(i)); // this will print the characters in the String
        }
}
	
}
