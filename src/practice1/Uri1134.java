package practice1;

import java.util.Scanner;

public class Uri1134 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean end = false;
	int alCount =0,gCount =0,dCount =0;
	
	while (!end) {
		int input = scanner.nextInt();
		if(input==1) {
			alCount++;
		}
		if(input==2) {
			gCount++;
		}
		if(input==3) {
			dCount++;
		}
		if(input==4) {
			end = true;
		}
	}
	
	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: "+alCount);
	System.out.println("Gasolina: "+gCount);
	System.out.println("Diesel: "+dCount);
	scanner.close();
}
}
