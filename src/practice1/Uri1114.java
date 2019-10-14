package practice1;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n!=2002){
            System.out.println("Senha Invalida");
            n = scanner.nextInt();
            if(n==2002){
                System.out.println("Acesso Permitido");
                break;
            }
        }

        scanner.close();
    }
}
