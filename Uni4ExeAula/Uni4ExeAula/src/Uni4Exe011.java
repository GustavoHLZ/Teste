import java.util.Scanner;

   /*Entrada: marquinhos, zezinho e luluzinha
   Saída: Mostra quem é o caçula
   Processo: ler a idades dos filhos as variaveis estão com o nome respectivos deles, e mostra no final quem é caçula.
   Fluxogram e testes:  presentes no enunciado
     */

public class Uni4Exe011{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int idade1,idade2,idade3;
        idade1 = l.nextInt();
        idade2 = l.nextInt();
        idade3 = l.nextInt();
        if( idade1 == idade2 && idade1 == idade3){
        System.out.println("Trigêmeos");
        }
        else if(idade1 == idade2 || idade1 == idade3 || idade2 == idade3){
            System.out.println("Gêmeos");
        } else{
            System.out.println("APENAS IRMÃOS");
        }

       
        l.close();
    
    }
}
