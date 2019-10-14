package practice1;

import java.util.Scanner;

public class Uri1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inter,gremio;
        int total = 1;
        int sum_inter = 0;
        int sum_gremio = 0;
        int draw =0;

        //for first inputs
        inter = scanner.nextInt();
        gremio = scanner.nextInt();

        if(inter>gremio){
            sum_inter++;
        }else if(inter<gremio){
            sum_gremio++;
        }else{
            draw++;
        }


        System.out.println("Novo grenal (1-sim 2-nao)");
        int option = scanner.nextInt();
        //for rest of inputs
        while(option==1){
            total++;

            inter = scanner.nextInt();
            gremio = scanner.nextInt();
            if(inter>gremio){
             sum_inter++;
            }else if(inter<gremio){
                sum_gremio++;
            }else{
                draw++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            option = scanner.nextInt();
        }
        if(option==2) {
            System.out.println(total + " grenais");
            System.out.println("Inter:" + sum_inter);
            System.out.println("Gremio:" + sum_gremio);
            System.out.println("Empates:" + draw);
            System.out.println("Inter venceu mais");
        }
        scanner.close();
    }
}
