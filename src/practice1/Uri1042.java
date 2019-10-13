package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unsort = new int[3];
		int[] sort = new int[3];
		//input
		for(int i=0;i<3;i++) {
			unsort[i] = scanner.nextInt();
			sort[i] = unsort[i];
		}
		//sorting
		Arrays.sort(sort);
		
		//output sorted
		for(int i=0;i<3;i++) {
			System.out.println(sort[i]);
		}
		System.out.println();
		
		//output unsorted
		for(int i=0;i<3;i++) {
			System.out.println(unsort[i]);
		}
		scanner.close();
	}

}
