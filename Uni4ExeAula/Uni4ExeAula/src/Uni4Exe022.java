import java.util.Scanner;

public class Uni4Exe022{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int numero;
        System.out.println("Digite a opção do curso");
        numero = l.nextInt();
        if(numero == 1){
          System.out.println("Bacharel em Ciência da Computação");
        } else if(numero == 2){
          System.out.println("Licenciado em Computação");
        }
        else if(numero == 3){
          System.out.println("Bacharel em Sistemas de Informação");
        } else{
          System.out.println("Não há essa opção de curso");
        }
      l.close();
    }
  }

    
      



 
    
    

