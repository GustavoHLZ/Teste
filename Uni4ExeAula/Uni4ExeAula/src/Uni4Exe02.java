import java.util.Scanner;

//Entrada: valor
//Saída: Se é par ou ímpar
//Processos: informar o número e retonar se é impar ou par
//Fluxograma e testes: Se encontram no enunciado

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entre com um valor inteiro" + 
                " maior que zero: ");   
        int valor = s.nextInt();

        //se o valor digitado for par:
        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        s.close();
    }
}
