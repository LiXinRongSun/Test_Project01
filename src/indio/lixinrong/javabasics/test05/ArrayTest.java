package indio.lixinrong.javabasics.test05;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		double[] score = new double[10];
		System.out.println(score[1]);
		for (int i = 0; i < 10; i++) {
			score[i] = sc.nextDouble();
			sum += score[i];
		}
		double average = sum / 10;
		System.out.println("average score=" + average);

	}

}