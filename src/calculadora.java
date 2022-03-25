import java.util.ArrayList;

public class calculadora {

    // ArrayList,R,S
    private String marca;
   private boolean esCientifica;
   private double primerValor;
   private double segundoValor;

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public boolean isEsCientifica() {return esCientifica;}

    public void setEsCientifica(boolean esCientifica) {this.esCientifica = esCientifica;}

    public double getPrimerValor() {return primerValor;}

    public void setPrimerValor(double primerValor) {this.primerValor = primerValor;}

    public double getSegundoValor() {return segundoValor;}

    public void setSegundoValor(double segundoValor) {this.segundoValor = segundoValor;}

    public calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }
    double sumar(double primerValor,double segundoValor){
        return primerValor+segundoValor;
    }
    double restar(double primerValor,double segundoValor){
        return primerValor-segundoValor;
    }
    double multiplicar(double primerValor,double segundoValor){
        return primerValor*segundoValor;
    }
    double dividir(double primerValor,double segundoValor){
        if(segundoValor==0){
            return 0;
        }
         else{
            return primerValor/segundoValor;
        }

    }
    double elevarPotencia (double primerValor,double segundoValor){
        if(esCientifica==true){
            //Math.pow(primerValor,segundoValor);
           // System.out.println(""+Math.pow(primerValor,segundoValor);
            return System.out.println(""+Math.pow(primerValor,segundoValor);
        }else {
            System.out.println("su calculadora no es cientifica, no puede realizar esta operacion");
            return 0;
        }
    }

    @Override
    public String toString() {
        if(esCientifica==true){
            return "La calculadora es" +
                    " de marca '" + marca + '\'' +
                    ", es Cientifica=" + esCientifica +
                    '}';
        }else{
            return "La calculadora es" +
                    " de marca '" + marca + '\'' +
                    ", no es Cientifica=" + esCientifica +
                    '}';
        }
    }

}
