package br.com.dio.calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b;
                //Entrada do valor a
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
                //Entrada do valor b
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = soma(a,b);
        double subtracao = subtracao(a,b);
        double multiplicacao = multiplicacao(a,b);
        double divisao = divisao(a,b);

        System.out.println("Soma é: " + soma);
        System.out.println("Subtração é: " + subtracao);
        System.out.println("Multiplicação é: " + multiplicacao);
        System.out.println("Divisão é: " + divisao)  ;

    }

    public static double soma (double a, double b){
        return a + b;
    }

    public static double subtracao (double a, double b){
        return  a - b;
    }

    public static double multiplicacao (double a, double b){
        return  a * b;
    }

    public static double divisao (double a, double b){
        return a / b;
    }
}
