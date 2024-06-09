package javapackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a=300;
		int b=300;
		String p="Selenium Class";
		String q="selenium class";
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());
		
				if (a==b)
				{
					System.out.println("a==b");
				}
				else 
				{
					System.out.println("a!=b");
				}
					
				if (p==q)
				{
					System.out.println("p==q");
				}
				else
				{System.out.println("p!=q");
					
				}
				//equal method string comparision
				if (p.equals(q))
				{
					System.out.println("p==q using equal method");
				}
				else
				{System.out.println("p!=q using equal method");
					
				}	
				//equalignore method using string comparision
				
				if (p.equalsIgnoreCase(q))
				{
					System.out.println("p==q using equalignore method");
				}
				else
				{System.out.println("p!=q using equalignore method");
					
				}	
	}
}
