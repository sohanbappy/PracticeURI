package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df_per = new DecimalFormat("0"); //for percentage

        salary = Float.parseFloat(df.format(salary)); //up to 2 decimal point

        float percentage = 0;
        float increment = 0;
        double groosSalary = 0;

        if(salary>=0 && salary<=400.00){
            percentage = 15;
            percentage = percentage/100;
        }else if(salary>=400.01 && salary<=800.00){
            percentage = 12;
            percentage = percentage/100;
        }else if(salary>800.01 && salary<=1200.00){
            percentage = 10;
            percentage = percentage/100;
        }else if(salary>=1200.01 && salary<=2000.00){
            percentage = 7;
            percentage = percentage/100;
        }else if(salary>=2000.01){
            percentage = 4;
            percentage = percentage/100;
        }
        //calculation
        increment = salary*percentage;
        groosSalary = salary + increment;

        System.out.println("Novo salario: "+df.format(groosSalary));
        System.out.println("Reajuste ganho: "+df.format(increment));
        System.out.println("Em percentual: "+df_per.format(percentage*100)+" %");

        scanner.close();
    }
}
