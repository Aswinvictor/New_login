package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(63);
		l.add(563);
		l.add(76);
		l.add(54);
		System.out.println("Input List:  " + l);

		ListIterator li = l.listIterator();
		System.out.println("\nhasnext: ");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("\nhasprevious: ");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		Iterator it = l.iterator();
		System.out.println("\nIterator:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
