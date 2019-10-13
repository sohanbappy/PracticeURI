package practice1;

import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x,y;
		x = scanner.nextFloat();
		y = scanner.nextFloat();
		
		if(x==0 && y==0) {
		System.out.println("Origem");
		}else if(x==0 && (y>0 || y<0)) {
		System.out.println("Eixo Y");	
		}
		else if(x>0) {
			if(y==0) {
				System.out.println("Eixo X");
			}else if(y>0) {
				System.out.println("Q1");
			}else {
				//y negative
				System.out.println("Q4");
			}
		}else {
			//x negative
			if(y==0) {
				System.out.println("Eixo X");
			}else if(y>0) {
				System.out.println("Q2");
			}else {
				//y negative
				System.out.println("Q3");
			}
		}
		scanner.close();
	}

}
