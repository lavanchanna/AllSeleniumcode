import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaConcepts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr2= {1,2,3,4,6,7,8,9,10};
		
		//print multiples of 2
		
	for (int i=0; i<arr2.length; i++)
		
	{
		if (arr2[i] % 2 ==0)
		{
			System.out.println(arr2[i]);
			break;// exit the group if first value found
		}
		
		else
		{
			System.out.println(arr2[i] + " is not multiple of 2");
		}
	}
	//Array list a= new ArrayList();
	ArrayList<String> a= new ArrayList<String>();
	a.add("Lavan");
	a.add("Chenna");
	a.add("How");
	a.add("are");
	a.add("you");
	
	for (int i=0; i<a.size();i++)
	{
	System.out.println(a.get(i));	
	}		
	System.out.println("*******");
	
	for( String val :a)
	{
		System.out.println(val);
	}
	//particular value is present in the Arraylist or not
	System.out.println(a.contains("How"));
	
	// check particular value is present in traditional array
	//convert first array to array list using Arrays
	
	String[] name ={"lavan","chenna","How","are","you"};
	List<String> nameArrayList= Arrays.asList(name);
	System.out.println(nameArrayList.contains("are"));

	}
	

	}


