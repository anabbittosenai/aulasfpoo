package Atividades;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe seu salario:");
        float salario = scanner.nextFloat();
        if(salario > 1350) {
            System.out.println("Seu percentual de aumneto é de 10%");
            float aumento = (10 * salario) / 100;
            System.out.println("Seu salario terá um aumento de R$" + aumento + ".");
        }else{
            System.out.println("Seu percentual de aumento é de 15%");
            float aumento = (15 * salario) / 100;
            System.out.println("Seu salario tera um aumento de R$" + aumento +".");
            
        }
    }
}
