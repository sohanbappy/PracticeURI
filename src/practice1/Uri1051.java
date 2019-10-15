package practice1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        float salary = scanner.nextFloat();
        float per=0;
        double total = 0,temp_salary=0,temp_gross=0;
        if(salary>=0.00 && salary<=2000){
            total = salary;
        }else if(salary>=2000.01 && salary<=3000){
            temp_salary = salary - 2000;
            per = 8;
            temp_gross = temp_salary*(per/100);
            total+=temp_gross;
        }else if(salary>=3000.01 && salary<=4500){
            temp_salary = salary - 3000;
            per = 18;
            temp_gross = temp_salary*(per/100)+(.08*1000);
            total+=temp_gross;
        }else if(salary>=4500.01){
            temp_salary = salary - 4500;
            per = 28;
            temp_gross = temp_salary*(per/100)+(.08*1000)+(.18*1500);
            total+=temp_gross;
        }


        if(salary==total){
            System.out.println("Isento");
        }else{
            System.out.println("R$ "+df.format(total));
        }
        scanner.close();
    }
}
