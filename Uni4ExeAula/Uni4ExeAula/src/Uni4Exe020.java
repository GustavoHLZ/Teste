import java.util.Scanner;

public class Uni4Exe020{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double media, nota1,nota2,nota3, notaexercicios;
        Boolean valida = false;
       System.out.println("Informe a nota 1");
        nota1 = l.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = l.nextDouble();
        System.out.println("Informe a nota 3");
        nota3 = l.nextDouble();
        System.out.println("Informe a media dos exercicios");
        notaexercicios = l.nextDouble();
      media = (nota1 + nota2*2+ nota3*3 + notaexercicios)/7;
      if (media >= 9) {
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: A. Aprovado", media);
      } else if (media >= 7.5 && media < 9.0) {
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: B. Aprovado", media);
    } else if(media >= 6.0 && media <7.5){
      System.out.printf("A média de aproveitamento foi: %.2f. Conceito: C. Aprovado", media);

      } else if(media >= 4.0 && media < 6.0){
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: D. Reprovado", media);

      } else {
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: E. Reprovado", media);
      }
   

      l.close();

    
    }
  }

    
      



 
    
    

