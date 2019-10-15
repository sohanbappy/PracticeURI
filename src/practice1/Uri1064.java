package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int counter = 0;
        float n;
        double avg = 0,sum=0;
        for(int i=0;i<6;i++){
            n = scanner.nextFloat();
            if(n>=0){
                counter++;
                sum+=n;
            }
        }

        if(counter>=1){
            avg = sum/counter;
            System.out.println(counter+" valores positivos");
            System.out.println(df.format(avg));
        }

        scanner.close();
    }
}
