package Atividades;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe aqui a velocidade do seu veiculo:");
        float velocidade = scanner.nextFloat();
        if(velocidade > 80) {
            System.out.println("Voce foi multado.");
            float multa = (velocidade - 80) * 5;
            System.out.println("Por favor nao ultapasse a velocidade permitida.");
        }              
    }
}
