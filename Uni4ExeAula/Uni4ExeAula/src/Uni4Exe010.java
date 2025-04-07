import java.util.Scanner;

   /*Entrada: marquinhos, zezinho e luluzinha
   Saída: Mostra quem é o caçula
   Processo: ler a idades dos filhos as variaveis estão com o nome respectivos deles, e mostra no final quem é caçula.
   Fluxogram e testes:  presentes no enunciado
     */

public class Uni4Exe010{
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int marquinhos, zezinho,luluzinha;

        System.out.println("Digite a idade do marquinhos:");
        marquinhos = l.nextInt();
        System.out.println("Digite a idade de zezinho:");
        zezinho = l.nextInt();
        System.out.println("Digite a idade da luluzinha: ");
        luluzinha= l.nextInt();
        if(zezinho < marquinhos && zezinho < luluzinha){
            System.out.println("Zezinho caçula");
        }
        else if (marquinhos < zezinho && marquinhos < luluzinha){
            System.out.println("Marquinhos caçula");
        }
        else{
            System.out.println("Luluzinha caçula");
        }
        l.close();
    
    }
}
