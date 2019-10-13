package practice1;

import java.util.Scanner;

public class Uri1180 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int length = scanner.nextInt();
	int[] numbers = new int[length];
	int min =0,position=0;
	for(int i=0;i<length;i++) {
		numbers[i] = scanner.nextInt();
	} 
	
	for(int j=0;j<length;j++) {
		if(numbers[j]<min) {
			min = numbers[j];
			position = j;
		}
	}
	System.out.println("Menor valor: "+min);
	System.out.println("Posicao: "+position);
	scanner.close();
}
}
