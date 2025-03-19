import java.util.Scanner;

public class Beecrowd{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int valor;
        valor = l.nextInt();
        int nota100 = valor / 100;
        valor %= 100;
        int nota50 = valor / 50;
        valor %= 50;
        int nota20 = valor/20;
        valor %= 20;
        int nota10 = valor/10;
        valor%= 10;
        int nota5 = valor/5;
        valor%= 5;
        int nota2 = valor/2;
        valor%=2;
        int nota1 = valor;
       System.out.println(nota100 + " notas(s) de 100,00");
       System.out.println(nota50 + " notas(s) de 50,00");
       System.out.println(nota20 + " notas(s) de 20,00");
       System.out.println(nota10 + " notas(s) de 10,00");
       System.out.println(nota5 + " notas(s) de 5,00");
       System.out.println(nota2 + " notas(s) de 2,00");
       System.out.println(nota1 + " notas(s) de 1,00");
      
        



}
}