package lab7;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> first = new LinkedList<String>();
		LinkedList<String> second = new LinkedList<String>();
		LinkedList<String> second_dcopy = new LinkedList<String>();
		
		first.add("Tulsa");
		first.add("Ada");
		first.add("Broken Arrow");
		first.add("Owasso");
		
		first.add(1,"OKC");
		System.out.println(first);
		
		second.add("74101");
		second.add("74135");
		second.add("foo");
		second.add("hello world");
		second.add("777");
		System.out.println(second);
		
		ListIterator<String> iter_first = first.listIterator();
		ListIterator<String> iter_second = second.listIterator();
		//String next = iter.next();
		//String next = iter_city.next();
		//System.out.println(next);
		
		for (; iter_second.hasNext();) 
		{
			//String string = (String) iterlist.next();
			String s= (String)iter_second.next();
			first.offerLast(s);
			second_dcopy.add(s);
			
		}
		System.out.println(first);
		
		int idx=1;
		while(iter_first.hasNext() && idx<5)
		{
			first.remove(idx);
			idx+=1;
		}
		
		System.out.println(first);
		System.out.println(second_dcopy);
	}
	
	
	/**
	 * OUTPUT:
	 * 	[Tulsa, OKC, Ada, Broken Arrow, Owasso]
		[74101, 74135, foo, hello world, 777]
		[Tulsa, OKC, Ada, Broken Arrow, Owasso, 74101, 74135, foo, hello world, 777]
		[Tulsa, Ada, Owasso, 74135, hello world, 777]
		[74101, 74135, foo, hello world, 777]

	 */

}
