package practice1;

import java.util.Scanner;

public class Uri1564 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int temp = scanner.nextInt();
			if(temp>0) {
				System.out.println("vai ter duas!");
			}else {
				System.out.println("vai ter copa!");
			}
		}
		
		scanner.close();
	}
}
