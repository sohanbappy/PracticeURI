package practice1;

import java.util.Scanner;

public class Uri1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x>1 && x<20 && y>x && y<100000){
                for (int i=1;i<=y;i++){
                    counter++;
                    if(counter<x){
                        System.out.print(i+" ");
                    }else{
                        if(counter==y){   //space problem (at last, no space)
                            System.out.print(i);
                        }else{
                        System.out.print(i);
                        System.out.println(); //new line
                        counter=0;
                        }
                    }
                }
        }

        scanner.close();
    }
}
