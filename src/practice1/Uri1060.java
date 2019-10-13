package practice1;

import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] numbers = new double[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			numbers[i] = scanner.nextDouble();
			if(numbers[i]>=0) {
				count++;
			}
		}
		System.out.println(count+" valores positivos");
		scanner.close();

	}

}
