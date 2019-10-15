package practice1;

import java.util.Scanner;

public class Uri1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,to=5,from=3,count=0;
        for(i=1;i<=9;i+=2){
            from+=2;
            to+=2;
            for(j=to;j>=from;j--){
                System.out.println("I="+i+" J="+j);
            }
        }


        scanner.close();
    }
}
