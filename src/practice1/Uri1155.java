package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double sum =0;
        double temp=0;

        for(double i=1;i<=100;i++){
            temp = (1/i);
            sum+=temp;
        }

        System.out.println(df.format(sum));

        scanner.close();
    }
}
