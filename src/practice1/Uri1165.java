package practice1;

import java.util.Scanner;

public class Uri1165 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] inputs = new int[n];
	for(int i=0;i<n;i++) {
		inputs[i] = scanner.nextInt();
		
	}
	 
	for(int i=0;i<n;i++) {
		boolean flag = false;
		for(int j=2;j<inputs[i];j++) {
			if(inputs[i]%j==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(inputs[i]+" nao eh primo");
		}else {
			System.out.println(inputs[i]+" eh primo");
		}
	}
	
	scanner.close();
}
}
