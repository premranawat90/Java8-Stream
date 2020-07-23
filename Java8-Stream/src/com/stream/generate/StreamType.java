package com.stream.generate;

import java.util.ArrayList;

import com.stream.pojo.Student;

public class StreamType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("1", "Raj", "BLR", "KA", 45));
		students.add(new Student("2", "Ram", "BLR", "KA", 30));
		students.add(new Student("3", "Pavan", "TNI", "MP", 90));
		students.add(new Student("4", "Sonu", "GWL", "MP", 65));
		students.add(new Student("5", "Dinesh", "BOM", "MH", 22));
		students.add(new Student("6", "Ganesh", "IDR", "MP", 33));

		long startTime = System.currentTimeMillis();
		students.stream().forEach(s -> System.out.println(s.getName()));
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken" + endTime);

		long startTime1 = System.currentTimeMillis();
		students.parallelStream().forEach(s -> System.out.println(s.getName()));
		long endTime1 = System.currentTimeMillis() - startTime1;
		System.out.println("Time taken" + endTime1);

	}

}
