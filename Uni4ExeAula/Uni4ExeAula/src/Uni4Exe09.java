import java.util.Scanner;

   /*Entrada:valor,valor2
   Saída: É multiplo
   Processo: ler as variaveis, e verificar se é multiplo.
   Fluxogram e testes:
     */

public class Uni4Exe09{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Informe dois valores: ");
        int valor = l.nextInt();
        int valor2 = l.nextInt();

        if(valor %2 == 0 ){
            System.out.println("É multiplo");
        } else{
            System.out.println("Não é multiplo");
        }
        l.close();
    }

}
