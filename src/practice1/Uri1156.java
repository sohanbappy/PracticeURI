package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double sum =0;
        double temp=0;
        double j = 0;

        for(double i=1;i<=39;i+=2){
            temp = (i/Math.pow(2,j));
            sum+=temp;
            j++;
        }

        System.out.println(df.format(sum));

        scanner.close();
    }
}
