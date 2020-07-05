package ua.lviv.lgs.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		Integer [] array1 = new Integer[7];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = new Random().nextInt();
		}
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println(Arrays.toString(array1));
	}

}
