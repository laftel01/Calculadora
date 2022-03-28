package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        Dados d = new Dados();
        Controle c = new Controle(d);
        Interface i = new Interface(c);
        i.calc();
    }
    
}
