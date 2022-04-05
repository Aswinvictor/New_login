package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_List {

	public static void main(String[] args) {
		List<Object> a = new LinkedList<Object>();
		a.add(5465);
		a.add('d');
		a.add("List");
		a.add(658.987f);
		a.add(false);
		System.out.println(a);

		List<Object> b = new Vector<Object>();
		b.add(5465);
		b.add('d');
		b.add("List");
		b.add(658.987f);
		b.add(false);
		System.out.println(b);

	}

}
