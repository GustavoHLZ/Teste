import java.util.Scanner;

   /*Entrada: marquinhos, zezinho e luluzinha
   Saída: Mostra quem é o caçula
   Processo: ler a idades dos filhos as variaveis estão com o nome respectivos deles, e mostra no final quem é caçula.
   Fluxogram e testes:  presentes no enunciado
     */

public class Uni4Exe013{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
      int carta1,carta2,carta3;
      System.out.println("Informe as 3 cartas:");
      carta1 = l.nextInt();
      carta2 = l.nextInt();
      carta3 = l.nextInt();
        int qntcartasboas = 0;
        if(carta1 == 1 || carta1 == 2|| carta1 == 3){
            qntcartasboas += 1;
        }
         if(carta2 == 1 || carta2 == 2|| carta2== 3){
            qntcartasboas += 1;
        }
         if(carta3 == 1 || carta3 == 2|| carta3== 3){
            qntcartasboas++;
        }
         if(qntcartasboas == 1){
            System.out.println("TRUCO");
        }
        else if (qntcartasboas == 2){
            System.out.println("SEIS");
        }
        else if(qntcartasboas == 3){
            System.out.println("NOVE");
        }
        else{
            System.out.println("---");
        }
        
        l.close();
    }
}
