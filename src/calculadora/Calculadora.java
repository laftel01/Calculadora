package calculadora;

import java.util.Scanner;

public class Calculadora {

    public double Soma(double a,double b){
        return a+b;
    }
    public double Subtracao(double a,double b){
        return a-b;
    }
    public double Multiplicacao(double a,double b){
        return a*b;
    }
    public double Divisão(double a,double b){
        return a/b;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor1:");
        double valor1 = s.nextDouble();
        String resumo =  "" + valor1;
        System.out.println("Digite a operacao: 1 para soma,2 para subtracao, 3 para multiplicacao, 4 para divisao, 5 para resultado");
        int operacao = s.nextInt();
        while(operacao!=5){
            System.out.println("Digite o valor2:");
            double valor2 = s.nextDouble();
            System.out.println("Digite a operacao: 1 para soma,2 para subtracao, 3 para multiplicacao, 4 para divisao, 5 para resultado");
            operacao = s.nextInt();
        }
        System.out.println("O resultado da operacao " + resumo + "eh:"+ valor1);
    }
    
}
