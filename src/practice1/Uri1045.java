package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		double[] inputs = {a,b,c};
		Arrays.sort(inputs);
		
		//in reverse order
		a = inputs[2];
		b = inputs[1];
		c = inputs[0];
		
		//square
		double sa = Math.pow(a, 2);
		double sb = Math.pow(b, 2);
		double sc = Math.pow(c, 2);
		
		//1st phase
		if(a>=(b+c)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if(sa==(sb+sc)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		
		else if(sa>(sb+sc)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		
		else if(sa<(sb+sc)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		//2nd phase
		if(a==b && a==c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if((a==b && a!=c) || (b==c && a!=b) || (a==c && a!=b)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		scanner.close();
		
	}

}
