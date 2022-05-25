package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String args[])
	{
		ArrayList <String> name=new ArrayList<String>();
		LinkedList <Integer> val=new LinkedList<Integer>();
		name.add("Lilly");
		name.add("John");
		name.add("Nick");
		for(String s:name)
			System.out.println(s);
		System.out.println("using Iterator");
		Iterator i= name.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		val.add(3);
		val.addFirst(60);
		val.addLast(99);
		Collections.sort(val);
		val.forEach(System.out::println);
		
	}
}
