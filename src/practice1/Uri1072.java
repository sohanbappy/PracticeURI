package practice1;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] inputs = new int[n];
		int in =0;
		int out =0;
		for(int i =0;i<n;i++) {
			inputs[i]=scanner.nextInt();
			if(inputs[i]>=10 && inputs[i]<=20) {
				in++;
			}else {
				out++;
			}
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
		scanner.close();
	}
}
