package practice1;

import java.util.Scanner;

public class Uri1164 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] inputs = new int[n];
	for(int i=0;i<n;i++) {
		inputs[i] = scanner.nextInt();
		
	}
	for(int i=0;i<n;i++) {
		int sum = 0;
		for(int j=1;j<=(inputs[i]/2);j++) {
			if(inputs[i]%j==0) {
				sum+=j;
			}
		}                
		if(sum==inputs[i]) {
			System.out.println(inputs[i]+" eh perfeito");
		 }else {
			 System.out.println(inputs[i]+" nao eh perfeito");
		 }	
	}
	
	scanner.close();
}
}
