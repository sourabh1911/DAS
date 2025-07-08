package dsa.mca.collecction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDSA {

	public static void main(String[] args) 
	{
		ArrayList<Integer> n= new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(3);
		n.addFirst(5);
		n.add(2, 15);
		System.out.println(n.get(4));
		n.remove(2);
		System.out.println(n);
		LinkedBlockingDeque<Integer> n=new LinkedBlockingDeque<>();
		n.add(10);
		n.add(20);
		System.out.println(n);
		TreeSet<Integer> h=new TreeSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(20);
		System.out.println(h);
		HashMap<Integer, String> d=new HashMap<Integer, String>();
		d.put(100, "Desktop");
		d.put(101, "RAM");
		d.put(102, "Laptop");
		d.put(200, "Desktop");
		d.put(201, "Laptop");
		System.out.println(d);
			
		
	}

}
