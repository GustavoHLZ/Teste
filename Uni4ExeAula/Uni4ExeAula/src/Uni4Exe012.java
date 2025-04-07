import java.util.Scanner;

   /*Entrada: marquinhos, zezinho e luluzinha
   Saída: Mostra quem é o caçula
   Processo: ler a idades dos filhos as variaveis estão com o nome respectivos deles, e mostra no final quem é caçula.
   Fluxogram e testes:  presentes no enunciado
     */

public class Uni4Exe012{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int lado1,lado2,lado3;
        lado1 = l.nextInt();
        lado2 = l.nextInt();
        lado3 = l.nextInt();

        if(lado1< (lado2 + lado3 ) && lado2 < (lado1+lado3) && lado3 < (lado1 + lado2)) {
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("é equilátero ");
        }
        else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("é isósceles ");
        }
        else {
            System.out.println("é escaleno");
        }
       
        } else{
            System.out.println("Não forma um triângulo");
        }
        l.close();
    }
}
