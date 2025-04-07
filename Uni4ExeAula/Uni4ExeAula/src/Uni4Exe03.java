import java.util.Scanner;

//Entrada: valor e valor2.
//Saída: Exibir qual valor é maior.
//Processos: ler o primeiro valor e o segundo e no final exibir qual é maior.
//Testes: 28 e 14. O valor 28 é maior do que o valor 14.

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int valor,valor2;
        System.out.println("Digite dois valores inteiros:");
        valor = l.nextInt();
        valor2 = l.nextInt();
        if(valor > valor2){
            System.out.println("O valor " + valor + " é maior do que o valor " + valor2);
        }
        else{
            System.out.println("O valor " + valor2 + " é maior do que o valor " + valor);
        }
        l.close();
       
    }
}
