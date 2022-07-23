package Iteratorpractice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class employei {	

	public static void main(String[] args) {

		//collection
		Vector v = new Vector<Object>();		

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		// Iterate using Enumeration

		Enumeration elements = v.elements();

		while (elements.hasMoreElements()) {
			Object object = elements.nextElement();
			System.out.println(object);

		}

		System.out.println("Enumeration: "+v);

		// Iterate using Iterator

		Iterator iterator = v.iterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object.equals(10)) {
				iterator.remove();
			}
			System.out.println(object);
		}

		System.out.println("Iteration: "+v);

		// Iterate using ListIterator

		ListIterator listIterator = v.listIterator();

		while (listIterator.hasNext()) {
			Object object = listIterator.next();
			if (object.equals(30)) {
				listIterator.add(50);
			}
			else if (object.equals(20)) {
				listIterator.set(80);

			}
			else if (object.equals(40)) {
				listIterator.remove();

			}

			System.out.println(object);
		}
		System.out.println("ListIteration: "+v);

		// by reverse

		while (listIterator.hasPrevious()) {
			Object object =  listIterator.previous();
			System.out.println(object);

		}

	}	
}
