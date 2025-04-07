import java.util.Scanner;

public class Uni4Exe026{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        char opcao = Character.toUpperCase(l.next().charAt(0));
        switch (opcao) {
          case 'T':
            System.out.println("Digite a base e altura do triângulo:");
            double base = l.nextDouble();
            double altura = l.nextDouble();
            double areatriangulo = (base * altura) / 2;;
            System.out.println("Resultado área do triangulo: " + areatriangulo);
            break;
          case 'Q':
          System.out.println("Digite o lado:");
          double lado = l.nextDouble();
          double areaquadrado = Math.pow(lado, 2);
          System.out.println("Resultado área do quadrado: " + areaquadrado);
          break;
          case 'R':
          System.out.println("Digite a base e altura do retângulo: ");
          double b = l.nextDouble();
          double h = l.nextDouble();
          System.out.println("Área do retângulo = "+ b * h);
          break;
          case 'C':
          System.out.println("Digite o Raio: ");
          double r = l.nextDouble();
          System.out.println("Área do círculo = " + Math.PI * Math.pow(r, 2));
          break;
          default :
          System.out.println("Opção Inválida");
          break;
        }
        l.close();
    }
  }

    
      



 
    
    

