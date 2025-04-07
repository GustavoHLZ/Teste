import java.util.Scanner;

public class Uni4Exe024{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int valor1,valor2,valor3;
        System.out.println("Valor1:");
        valor1 = l.nextInt();
        System.out.println("Valor2");
        valor2 = l.nextInt();
        System.out.println("Valor3");
        valor3 = l.nextInt();
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = l.nextInt();
        
        if(valor1 > valor2){
          int troca = valor1; 
          valor1 = valor2; 
          valor2 = troca; 
        }
        if(valor1 > valor3){
          int troca = valor1; 
          valor1 = valor3; 
          troca = valor3;
        }
        if(valor2 > valor3){
          int troca = valor2;
          valor2 = valor3;
          valor3 = troca;
        }
        switch (opcao) {
          case 1:
          System.out.println(valor1 + "" + valor2 + "" + valor3);
            break;
          case 2:
          System.out.println(valor3 + "" + valor2 + "" + valor1);
            break;
            case 3:
          System.out.println(valor2 + "" + valor3 + "" + valor1);
            break;
            default:
            System.out.println("Opção Invalida");
            break;
        }

        l.close();


    }
  }

    
      



 
    
    

