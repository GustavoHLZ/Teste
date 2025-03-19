import java.util.Scanner;

public class NotasComCentavos{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double valor;
        valor = l.nextDouble();
        int valorinteiro = (int) valor;
        int centavos = (int) ((valor - valorinteiro) *100);
        int nota100 = (int) Math.floor(valor/100);
        valor %= 100;
        int nota50 = (int) Math.floor(valor / 50);
        valor %= 50;
        int nota20 = (int) Math.floor(valor/20);
        valor %= 20;
        int nota10 = (int) Math.floor(valor/10);
        valor%= 10;
        int nota5 = (int) Math.floor(valor/5);
        valor%= 5;
        int nota2 = (int) Math.floor(valor/2);
        valor%=2;
        int nota1 = (int) Math.floor(valor);

        int centavos50 = centavos /50;
        centavos%=50;
        int centavos25 = centavos /25;
        centavos%=25;
        int centavos10 = centavos /10;
        centavos%=10;
        int centavos5 = centavos /5;
        centavos%=5;
        int centavos1 = centavos;
       System.out.println(nota100 + " notas(s) de 100,00");
       System.out.println(nota50 + " notas(s) de 50,00");
       System.out.println(nota20 + " notas(s) de 20,00");
       System.out.println(nota10 + " notas(s) de 10,00");
       System.out.println(nota5 + " notas(s) de 5,00");
       System.out.println(nota2 + " notas(s) de 2,00");
       System.out.println(nota1 + " notas(s) de 1,00");
       System.out.println(centavos50 + " notas(s) de 0,50");
       System.out.println(nota1 + " notas(s) de 0,25");
       System.out.println(nota1 + " notas(s) de 0,10");
       System.out.println(nota1 + " notas(s) de 0,05");
       System.out.println(nota1 + " notas(s) de 0,01");
       
        l.close();

}
}