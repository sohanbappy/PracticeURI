package practice1;


import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1040 {
 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");//it's a string
    
    double N1,N2,N3,N4;
    N1 = sc.nextDouble();
    N2 = sc.nextDouble();
    N3 = sc.nextDouble();
    N4 = sc.nextDouble();
    double average = Double.parseDouble(df.format(((2*N1)+(3*N2)+(4*N3)+N4)/10));
    
    if(average>=7.0){
        System.out.println("Media: "+average);
        System.out.println("Aluno aprovado.");
    }else if(average<5.0){
        System.out.println("Media: "+average);
        System.out.println("Aluno reprovado.");
    }else if(average>= 5.0 && average<=6.9){
        System.out.println("Media: "+average);
        System.out.println("Aluno em exame.");
        double test = sc.nextDouble();
        System.out.println("Nota do exame: "+test);
        double reAvg = Double.parseDouble(df.format((average + test)/2));
        if(reAvg>=5.0){
        System.out.println("Aluno aprovado.");
        System.out.println("Media final: "+reAvg);
        }else if(reAvg<5.0){
        System.out.println("Aluno reprovado.");
        System.out.println("Media final: "+reAvg);
        }
        
    }  
    sc.close();
    }
    
}
