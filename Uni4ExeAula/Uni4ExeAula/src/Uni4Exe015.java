import java.util.Scanner;

public class Uni4Exe015{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
      int meses;
      System.out.println("Digite os meses:");
      meses = l.nextInt();
      if(meses <= 12){
        System.out.println("O funcionário irá receber 5% de reajuste");
      }
      else if(meses > 12 && meses <=48){
        System.out.println("O funcionário irá receber 7% de reajuste");
      } else{
        System.out.println("Reajuste não informado");
      }
      l.close();
}
}
 
    
    

