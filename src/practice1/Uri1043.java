package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("0.0");
		
		float n1,n2,n3;
		n1 = scanner.nextFloat();
		n2 = scanner.nextFloat();
		n3 = scanner.nextFloat();
		
		if(n1>(n2-n3) && n1<(n2+n3)) {
			float perimeter = Float.parseFloat(df.format(n1+n2+n3));
			System.out.println("Perimetro = "+perimeter);
		}else {
			float area = Float.parseFloat(df.format((.5*((n1+n2)*n3)))); //trapezium area = .5*(a+b)*h
			System.out.println("Area = "+area);
		}
		scanner.close();
	}

}
