package com.stream.generate;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.stream.pojo.Student;

public class StreamFilter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("1", "Raj", "BLR", "KA", 45));
		students.add(new Student("2", "Ram", "BLR", "KA", 30));
		students.add(new Student("3", "Pavan", "TNI", "MP", 90));
		students.add(new Student("4", "Sonu", "GWL", "MP", 65));
		students.add(new Student("5", "Dinesh", "BOM", "MH", 22));
		students.add(new Student("6", "Ganesh", "IDR", "MP", 33));

		// Filter as per the State
		Consumer<Student> c = stud -> System.out
				.println("Student Name:" + stud.getName() + "  State:" + stud.getState());
		students.stream().filter(s -> s.getState().equals("MP")).forEach(c);

		System.out.println(".......................");
		// filter as per the marks to get passed student
		Consumer<Student> passed = stud -> System.out
				.println("Student Name:" + stud.getName() + "  Marks:" + stud.getMarks());
		Predicate<Student> pass = stud -> stud.getMarks() > 33;
		students.stream().filter(pass).forEach(passed);

		System.out.println(".......................");
		// filter as per the marks to get passed student
		Predicate<Student> fail = stud -> stud.getMarks() < 33;
		Long failedStudent = students.stream().filter(fail).count();
		System.out.println("Failed Student :" + failedStudent);

		System.out.println(".......................");
		// filter as per the marks to short
		students.stream().map(student -> student.getMarks()).sorted().forEach(i -> {
			System.out.print(" " + i);
		});

	}

}
