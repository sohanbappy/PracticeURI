package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMinimumFractionDigits(2);

        int n = scanner.nextInt();
        int number = 0;
        double rat_sum=0,rabbit_sum=0,frog_sum=0,total=0;
        char type;
        for(int i=0;i<n;i++){
            number = scanner.nextInt();
            type = scanner.next().charAt(0);
            if(type=='C'){
                rabbit_sum+=number;
                total+=number;
            }
            if(type=='R'){
                rat_sum+=number;
                total+=number;
            }
            if(type=='S'){
                frog_sum+=number;
                total+=number;
            }
        }
        //percentage calculation
        double rabbit_per = (rabbit_sum/total)*100;
        double rat_per = (rat_sum/total)*100;
        double frog_per = (frog_sum/total)*100;

        System.out.println("Total: "+(int)total+" cobaias");
        System.out.println("Total de coelhos: "+(int)rabbit_sum);
        System.out.println("Total de ratos: "+(int)rat_sum);
        System.out.println("Total de sapos: "+(int)frog_sum);

        System.out.println("Percentual de coelhos: "+df.format(rabbit_per)+" %");
        System.out.println("Percentual de ratos: "+df.format(rat_per)+" %"); //no need to parse it Double again
        System.out.println("Percentual de sapos: "+df.format(frog_per)+" %"); // not getting 25.00 (solved)
        scanner.close();
    }
}
