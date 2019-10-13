package practice1;

import java.util.Scanner;

public class Uri1095 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		for(int j=60;j>=0;j-=5) {
			System.out.println("I="+i+" J="+j);
			i+=3;
		}
		
		scanner.close();
	}
}
