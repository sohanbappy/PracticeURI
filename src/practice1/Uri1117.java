package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1117 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	int count=1;
	double sum = 0;
	while(count<=2)
	{
		float input = scanner.nextFloat();
		if(input>=0 && input<=10) {
		sum+=input;
		count++;
		}else {
			System.out.println("nota invalida");
		}
		
	}
	double avg = Double.parseDouble(df.format(sum/2));
	System.out.println("media = "+avg);
	scanner.close();
}
}
