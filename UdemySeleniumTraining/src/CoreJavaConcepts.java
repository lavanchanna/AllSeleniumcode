
public class CoreJavaConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mynum=5;
		String website="Rahul Academy";
		char letter ='r';
		double dec=5.99;
		boolean mycard=true;
		System.out.println(mynum + "is the value");
		System.out.println(website);
		System.out.println(letter);
	System.out.println(dec);
System.out.println(mycard);
//Arrays
int[] arr= new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
int [] arr2= {1,2,3,4,6,7,8,9,10};
System.out.println(arr2[2]);
//for loop

for(int i = 0; i< arr.length; i++)
{
	System.out.println(arr[i]);
	
}

for (int i=0; i<arr2.length;i++)
{
	System.out.println(arr2[i]);
	}
String[] name ={"lavan","chenna","How","are","you"};

for (int i=0; i < name.length; i++)
{
	System.out.println(name[i]);
}
//enhanced for loop, Write the array name right side and left side create new variable
for ( String s: name)
{System.out.println(s);
	}
	}

}
