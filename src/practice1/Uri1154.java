package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = scanner.nextInt();
        if(n>=0) {
            double sum = 0;
            int counter = 0;
            while (n >= 0) {
                counter++;
                sum += n;
                n = scanner.nextInt();
            }
            double avg = sum / counter;
            System.out.println(Double.parseDouble(df.format(avg))); //failed to find out problem
        }
        scanner.close();
    }
}
