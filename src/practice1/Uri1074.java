package practice1;

import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] inputs = new int[n];
		for(int i=0;i<n;i++) {
			inputs[i] = scanner.nextInt();
		}
		for(int j=0;j<inputs.length;j++) {
			if(inputs[j]==0) {
				System.out.println("NULL");
			}else if (inputs[j]>0) {
				if(inputs[j]%2==0) {
				System.out.println("EVEN POSITIVE");	
				}else {
				System.out.println("ODD POSITIVE");	
				}
				
			}else if(inputs[j]<0){
				if(inputs[j]%2==0) {
				System.out.println("EVEN NEGATIVE");	
				}else {
				System.out.println("ODD NEGATIVE");	
				}
			}
		}
				scanner.close();
	}
}
