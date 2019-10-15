package practice1;

import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        if(first.equals("vertebrado")){
            if(second.equals("ave")){
                if(third.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(third.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(second.equals("mamifero")){
                if(third.equals("onivoro")){
                    System.out.println("homem");
                }else if(third.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(first.equals("invertebrado")){
            if(second.equals("inseto")){
                if(third.equals("hematofago")){
                    System.out.println("pulga");
                }else if(third.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(second.equals("anelideo")){
                if(third.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(third.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }


        scanner.close();
    }
}
