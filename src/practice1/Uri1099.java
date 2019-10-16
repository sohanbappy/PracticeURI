package practice1;

import java.util.Scanner;

public class Uri1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start,end;
        int x,y,sum;
        int temp_start;
        for(int i=0;i<n;i++){
            sum =0;
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(x>0 && y>0) {
                if (x > y) {
                    start = y;
                    end = x;
                } else {
                    start = x;
                    end = y;
                }
                temp_start = start + 1;
                for (int j = temp_start; j<end; j++) {
                    if (j%2 == 1) {
                        sum += j;
                    }
                }
            }
            System.out.println(sum);
        }


        scanner.close();
    }
}
