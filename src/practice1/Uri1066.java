package practice1;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] five = new int[5];
        int countEven=0,countOdd=0,countPos=0,countNeg=0;

        for(int i=0;i<five.length;i++){
            five[i] = scanner.nextInt();
        }

        for (int j=0;j<five.length;j++){
            if(five[j]%2==0){
                countEven++;
            }else{
                countOdd++;
            }

            if(five[j]>0){
                countPos++;
            }else if(five[j]<0){
                countNeg++;
            }
        }

        System.out.println(countEven+" valor(es) par(es)");
        System.out.println(countOdd+" valor(es) impar(es)");
        System.out.println(countPos+" valor(es) positivo(s)");
        System.out.println(countNeg+" valor(es) negativo(s)");

        scanner.close();
    }
}
