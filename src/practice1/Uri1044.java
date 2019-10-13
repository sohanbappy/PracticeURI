package practice1;

import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1,n2;
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		scanner.close();
	}

}
