package practice1;

import java.util.Scanner;

public class Uri1115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y;
        //for first inputs
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x!=0 && y!=0){
            if(x>0){
                if(y>0){
                    System.out.println("primeiro");
                }else{
                    System.out.println("quarto");
                }
            }else{
                if(y>0){
                    System.out.println("segundo");
                }else{
                    System.out.println("terceiro");
                }
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while (x!=0 && y!=0){
            if(x>0){
                if(y>0){
                    System.out.println("primeiro");
                }else{
                    System.out.println("quarto");
                }
            }else{
                if(y>0){
                    System.out.println("segundo");
                }else{
                    System.out.println("terceiro");
                }
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();
    }
}
