import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream1 {
	@Test
	public void streamFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Bali");
		names.add("Akash");
		names.add("Rajesh");
		names.add("Anirudh");
		names.add("Amulya");
		//there is no life of intermediate operation, if no terminal operator
		//Count is terminal operator
		//terminal operation will execute only if intermidate operator(filter) returns true
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//Directly we can use Stream.of instead of list
		Long d=Stream.of("Baliraj","Akash","Rajesh","Anirudh","Amulya").filter(s->s.startsWith("A")).count();;
		System.out.println(d);
		// if there is more filter condition
		Long e=Stream.of("Baliraj","Akash","Rajesh","Anirudh","Amulya").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(e);
		//print all the names of array list
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		// Print only first result
		names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		
		
	}
	
	@Test
	public void streamMap()
	{ 
		ArrayList<String> names= new ArrayList<String>();
		names.add("Don");
		names.add("Man");
		names.add("Abhi");
		names.add("Andy");
		names.add("Lokesh");
		// print names which have last letter a and convert them to uppercase
		Stream.of("Balira","Akash","Rajesh","Anirudh","Amulya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		// print names first letter as a with uppercase and sorted
	List<String> names1=Arrays.asList("Balira","Akash","Rajesh","Anirudh","Amulya");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	//Merging 2 different lists 		
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
	//newStream.sorted().forEach(s->System.out.println(s));
	// Below is to find "Rajesh" exist in the list and send boolean
	boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Rajesh"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect()
	{
		System.out.println("Collect");
		List<String> newList=Stream.of("Balira","Akash","Rajesh","Anirudh","Amulya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(newList.get(0));
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array- then 3rd index-< 1,2,3,5,7,9
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> lv=values.stream().distinct().sorted().collect(Collectors.toList());		
		System.out.println("3rd value" + lv.get(2));
	}
	
	
}
