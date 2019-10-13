package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1079 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	float[][] two_dim = new float[n][3]; //column size fixed
	DecimalFormat df =new DecimalFormat("0.0");
	float avg;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<3;j++) {
			two_dim[i][j]=scanner.nextFloat();
		}
	}
	for(int i=0;i<n;i++) {
		avg = Float.parseFloat(df.format(((two_dim[i][0]*2)+(two_dim[i][1]*3)+(two_dim[i][2]*5))/10));
		System.out.println(avg);
	}
	
	
//	avg1 = Float.parseFloat(df.format(((two_dim[0][0]*2)+(two_dim[0][1]*3)+(two_dim[0][2]*5))/10));
//	avg2 = Float.parseFloat(df.format(((two_dim[1][0]*2)+(two_dim[1][1]*3)+(two_dim[1][2]*5))/10));
//	avg3 = Float.parseFloat(df.format(((two_dim[2][0]*2)+(two_dim[2][1]*3)+(two_dim[2][2]*5))/10));
//	
//	System.out.println(avg1);
//	System.out.println(avg2);
//	System.out.println(avg3);
	scanner.close();
 }
}
