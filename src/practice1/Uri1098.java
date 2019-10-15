package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        DecimalFormat df2 = new DecimalFormat("0.0");
        float i,j;
        for(i=0;i<2.2;i+=.20){
            for(j=1;j<=3;j++){
                if(i==0.0){
                    System.out.println("I="+df.format(i)+" J="+df.format(j));
                } else if(i==1.0){
                    System.out.println("I="+df.format(i)+" J="+df.format(j+i));
                } else if(i>=2.0){
                    System.out.println("I="+df.format(i)+" J="+df.format(j+i));
                }else {
                    System.out.println("I=" + df2.format(i) + " J=" + df2.format(i+j));
                }
            }
        }


        scanner.close();
    }
}
