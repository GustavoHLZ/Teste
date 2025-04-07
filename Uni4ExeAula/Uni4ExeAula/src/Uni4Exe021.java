import java.util.Scanner;

public class Uni4Exe021{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
       double imc, massa, altura;
       System.out.println("Digite a altura:");
        altura = l.nextDouble();
        System.out.println("Digite a massa corporal(kg): ");
        massa = l.nextDouble();
      
        imc = massa / Math.pow(altura, 2);

      if(imc < 18.5){
        System.out.println("Magreza");
      } else if(imc >=18.5 && imc <= 24.9){
        System.out.println("Saudável");
      } else if(imc >= 25.0 && imc <= 29.9){
        System.out.println("Sobrepeso");
      } else if(imc >= 30 && imc <=34.9){
        System.out.println("Obesidade Grau I");
      } else if(imc >= 35 && imc <= 39.9){
        System.out.println("Obesidade Grau II (severa)");
      } else{
        System.out.println("Obesidade Grau III (mórbida)");
      }
      l.close();
    }
  }

    
      



 
    
    

