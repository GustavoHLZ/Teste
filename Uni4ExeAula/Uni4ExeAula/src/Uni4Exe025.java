import java.util.Scanner;

public class Uni4Exe025{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite dois valores:");
        int valor1 = l.nextInt();
        int valor2 = l.nextInt();
        System.out.println("Escolha uma opção:");
        System.out.println(" 1- Soma de dois números.");
        System.out.println(" 2 - Diferença entre dois números.");
        System.out.println(" 3 - Produto entre dois números.");
        System.out.println(" 4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = l.nextInt();

        switch (opcao) {
          case 1:
           int soma = valor1 + valor2;
           System.out.println(soma);
            break;
          case 2:
           int diferenca = valor1 - valor2;
           System.out.println(diferenca);
          break;
          case 3:
            int produto = valor1 * valor2;
            System.out.println(produto);
          break;
            case 4:
            int divisao = valor1 / valor2;
            System.out.println(divisao);
            break;
        }

        l.close();
    }
  }

    
      



 
    
    

