import java.util.Scanner;

//Entrada: valor.
//Saída: Casas decimais foram digitadas ou Casa decimais não foram digitadas.
//Processos: ler o valor, fazer o calculo para ver se decimal ou não, e no final exibir o resultado:
//Testes: 28 e 14. O valor 28 é maior do que o valor 14.

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double valor;
        System.out.println("Digite um valor");
        valor = l.nextDouble();
        if(valor %2 ==1){
            System.out.println("Casas decimais foram digitadas");
        } else{
            System.out.println("Casas decimais não foram digitadas");
        }

        l.close();
       
    }
}
