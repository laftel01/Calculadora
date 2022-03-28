package calculadora;

import java.util.Scanner;

public class Interface {
    private final Controle c;
    public Interface(Controle c){
        this.c = c;
    }
    public void calc(){
    Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor1:");
        c.setValor1(s.nextDouble());
        String resumo =  "" + c.getValor1();
        System.out.println("Digite a operacao: 1 para soma,2 para subtracao, 3 para multiplicacao, 4 para divisao, 5 para resultado");
        int operacao = s.nextInt();
        while(operacao!=5){
            System.out.println("Digite o valor2:");
            c.setValor2(s.nextDouble());
            switch(operacao){
                case 1 -> {
                    resumo = "(" + resumo + "+" + c.getValor2() + ")";
                    c.setValor1(c.Soma());
                }
                case 2 -> {
                    resumo = "(" + resumo + "-" + c.getValor2() + ")";
                    c.setValor1(c.Subtracao());
                }
                case 3 -> {
                    resumo = resumo + "*" + c.getValor2();
                    c.setValor1(c.Multiplicacao());
                }
                case 4 -> {
                    resumo = resumo + "/" + c.getValor2();
                    c.setValor1(c.Divisao());
                }
                default -> System.out.println("Operacao invalida.");
            }
            System.out.println("Digite a operacao: 1 para soma,2 para subtracao, 3 para multiplicacao, 4 para divisao, 5 para resultado");
            operacao = s.nextInt();
        }
        System.out.println("O resultado da operacao " + resumo + " eh: "+ c.getValor1());
    }
}
