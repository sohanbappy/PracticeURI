package practice1;

import java.util.Scanner;

public class Uri1158 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	for(int i=0;i<n;i++) {
		int sum = 0;
		int previous =0;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a%2==0) {
			sum = a+1;
			previous = sum;
			for(int j=1;j<b;j++) {
				int now = previous+2;
				sum+=now;
				previous = now;
			}
		}else {
			sum = a;
			previous = sum;
			for(int j=1;j<b;j++) {
				int now = previous+2;
				sum+=now;
				previous = now;
			}
		}
		System.out.println(sum);
	}
	
	scanner.close();
}
}
