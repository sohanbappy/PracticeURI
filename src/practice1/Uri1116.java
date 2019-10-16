package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int n = scanner.nextInt();
        int x,y;
        double result;
        for(int i=0;i<n;i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(y==0){
                System.out.println("divisao impossivel");
            }else {
                result = (double) x / (double) y;
                System.out.println(df.format(result));
            }
        }
        scanner.close();
    }
}
