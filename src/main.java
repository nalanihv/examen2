public class main {
    public static void main(String[] args) {
        calculadora basica=new calculadora("patito",false);
        calculadora cientifica=new calculadora("casio",true);
         basica.setPrimerValor(284.9);
         basica.setSegundoValor(0.0);
         cientifica.setPrimerValor(45.83);
         cientifica.setSegundoValor(13.6);

         System.out.println(basica.sumar(basica.getPrimerValor(), basica.getSegundoValor()));
         System.out.println(basica.sumar(basica.getPrimerValor(), basica.getSegundoValor()));
         System.out.println(basica.restar(basica.getPrimerValor(), basica.getSegundoValor()));
         System.out.println(basica.multiplicar(basica.getPrimerValor(), basica.getSegundoValor()));
        System.out.println(basica.dividir(basica.getPrimerValor(),basica.getSegundoValor()));
        System.out.println(basica.elevarPotencia(basica.getPrimerValor(), basica.getSegundoValor()));
         basica.toString();


        System.out.println(cientifica.sumar(cientifica.getPrimerValor(),cientifica.getSegundoValor()));
        System.out.println(cientifica.restar(cientifica.getPrimerValor(), cientifica.getSegundoValor());
        System.out.println(cientifica.multiplicar(cientifica.getPrimerValor(),cientifica.getSegundoValor());
        System.out.println(cientifica.dividir(cientifica.getPrimerValor(), cientifica.getSegundoValor()));
        System.out.println(cientifica.elevarPotencia(cientifica.getPrimerValor(), cientifica.getSegundoValor()));
         cientifica.toString();




    }
}
