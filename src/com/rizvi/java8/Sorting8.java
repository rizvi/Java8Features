package com.rizvi.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting8 {
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Mohammad");
		names1.add("Salma");
		names1.add("Rahman");
		names1.add("Nur");
		names1.add("Kibria");

		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(45);
		intValues.add(23);
		intValues.add(12);
		intValues.add(56);
		intValues.add(98);

		Sorting8 tester = new Sorting8();

		System.out.println("Sort String using Java 7 syntax: ");
		tester.sortUsingJava7(names1);
		System.out.println(names1);
		
		System.out.println("Sort String using Java 8 syntax: ");
		tester.sortUsingJava8(names1);
		System.out.println(names1);

		System.out.println("Sort Integer using Java 7 syntax: ");
		tester.sortIntegerUsing7(intValues);
		System.out.println(intValues);

		System.out.println("Sort Integer using Java 8 syntax: ");
		tester.sortIntegerUsing8(intValues);
		System.out.println(intValues);
	}

	// sort String using java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// sort Integer using Java 7
	private void sortIntegerUsing7(List<Integer> intValues) {
		Collections.sort(intValues, new Comparator<Integer>() {
			@Override
			public int compare(Integer val1, Integer val2) {
				return val1.compareTo(val2);
			}
		});
	}

	// sort String using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

	// sort Integer using Java 8
	private void sortIntegerUsing8(List<Integer> intValues) {
		Collections.sort(intValues, (s1, s2) -> s1.compareTo(s2));
	}

}
