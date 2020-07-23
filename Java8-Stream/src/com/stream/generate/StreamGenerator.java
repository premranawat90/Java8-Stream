package com.stream.generate;

import java.util.stream.Stream;

/**
 * @author Prem Ranawat
 *
 */
public class StreamGenerator {

	public static void main(String[] args) {

		System.out.println("Using Array-->");
		int i = 0;
		StreamGenerator.generateStreamUsingArray().forEach(y -> {
			System.out.println(y[i]);
		});
	}

	private static Stream<int[]> generateStreamUsingArray() {
		int array[] = { 1, 2, 3, 4 };
		return Stream.of(array);
	}

}
