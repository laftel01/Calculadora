package calculadora;

public class Controle {
    private final Dados d;
    public Controle(Dados d){
        this.d = d;
    }
    public double Soma(){
        return d.getValor1()+d.getValor2();
    }
    public double Subtracao(){
        return d.getValor1()-d.getValor2();
    }
    public double Multiplicacao(){
        return d.getValor1()*d.getValor2();
    }
    public double Divisao(){
        return d.getValor1()/d.getValor2();
    }
    public double getValor1(){
        return d.getValor1();
    }
    public double getValor2(){
        return d.getValor2();
    }
    public void setValor1(double v1){
        d.setValor1(v1);
    }
    public void setValor2(double v2){
        d.setValor2(v2);
    }
}
