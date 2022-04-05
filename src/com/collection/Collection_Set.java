package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {
		
		Set<Object> r = new LinkedHashSet<Object>();
		
		r.add(348);
		r.add("text");
		r.add(748.893f);
		r.add('t');
		r.add(false);
		r.add(56);
		System.out.println(r);

		int a = r.size();
		System.out.println("Size of Set: " + a);

		r.remove(56);
		System.out.println(r);

		boolean b = r.contains('t');
		System.out.println(b);

		Set<Object> s = new LinkedHashSet<Object>();
		s.add(673.893f);
		s.add(8464479874983l);
		s.add(348);
		s.add(true);
		System.out.println(s);

		r.addAll(s);
		System.out.println(r);

		r.retainAll(s);
		System.out.println(r);

		boolean c = r.equals(s);
		System.out.println(c);

		r.removeAll(s);
		System.out.println(r);

	}

}
