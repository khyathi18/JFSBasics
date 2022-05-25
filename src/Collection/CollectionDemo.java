package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import inheritance.Person_;

public class CollectionDemo {

	public void show(List<Integer> val)
	{
		System.out.println(val);
	}
	public static void main(String args[])
		{
			ArrayList <String> name=new ArrayList<String>();
			LinkedList <Integer> val=new LinkedList<Integer>();
			name.add("Lilly");
			name.add("John");
			name.add("Nick");
			for(String s:name)
				System.out.println(s);
			System.out.println("\n ***Using Iterator***\n");
			Iterator i= name.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			val.add(3);
			val.addFirst(60);
			val.addLast(99);
			Collections.sort(val);
			val.forEach(System.out::println);
			LinkedList<Person_> p1=new LinkedList<Person_>();
			Person_ p2=new Person_("John",40);
			p1.add(p2);
			p1.add(new Person_("peter",16));
			p1.forEach(System.out::println);    //for each expression
			System.out.println(p1.get(1));
			System.out.println("*******************");
			Person_ p3=p1.get(0);
			System.out.println("John Age is: "+p3.getAge());
			new CollectionDemo().show(val);
			val.forEach((n)->{System.out.println(n);});   //lambda expression
			val.forEach((n)->{n=n*2;System.out.println(n);});
			System.out.println("Using consumer interface");
			Consumer<Integer> value=(n)->{System.out.println(n*2);};
			val.forEach(value);
		}
	}


