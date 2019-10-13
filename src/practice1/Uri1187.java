package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1187 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double[][] numbers = new double[12][12]; 
	double sum=0,avg=0;
	
	DecimalFormat df = new DecimalFormat("0.0");
	
	char test = scanner.next().charAt(0);
	
	for(int i=0;i<12;i++) {
		for(int j=0;j<12;j++) {
			numbers[i][j] = scanner.nextDouble();
		}
	}
	
	
	if(test=='S') {
		sum = Double.parseDouble(df.format(calcSum(numbers)));
		System.out.println(sum);
	}else if(test=='M') {
		sum = calcSum(numbers);
		avg = Double.parseDouble(df.format((sum/144)));
		System.out.println(avg);
	}
	
	
	scanner.close();
}
	static double calcSum(double[][] numbers) {
		double total =0;
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				total+=numbers[i][j];
			}
		}
		return total;
	}

}
