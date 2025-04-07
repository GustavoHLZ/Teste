import java.util.Scanner;

public class Uni4Exe018{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
      int diavencimento, diapagamento;
      double prestacao;
      System.out.println("Digite o dia do vencimento");
      diavencimento = l.nextInt();
      System.out.println("Digite o dia do pagamento");
      diapagamento = l.nextInt();
      System.out.println("Digite a prestação:");
      prestacao = l.nextDouble();
    
      if(diapagamento <= diavencimento){
        double desconto = prestacao * 0.10;
        desconto = prestacao - desconto;
        System.out.println("O pagamento está em dia. O valor da prestação = R$" + desconto);
      } else if ( (diapagamento - diavencimento) > 5) {
        int diaAtrasados= diapagamento - diavencimento;
        double valorfinal = prestacao * Math.pow(1 + 0.02, diaAtrasados);
        System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = " + valorfinal);
        l.close();
        } 

      }
    }

    
      



 
    
    

