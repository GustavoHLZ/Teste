import java.util.Scanner;

public class Uni4Exe016{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int idadehomem1, idadehomem2, idademulher1, idademulher2;
      System.out.println("Digite a idade do primeiro homem:");
      idadehomem1 = l.nextInt();
      System.out.println("Digite a idade do segundo homem:");
      idadehomem2 = l.nextInt();
      System.out.println("Digite a idade da primeira mulher:");
      idademulher1 = l.nextInt();
      System.out.println("Digite a idade da segunda mulher:");
      idademulher2 = l.nextInt();
      if(idadehomem1 > idadehomem2 && idademulher1 > idademulher2){

        int soma = idadehomem1 + idademulher2;
        int multi = idadehomem2 * idademulher1;
      System.out.println("Soma: " + soma + " " + "Produto: " + multi);

      } 
      else if(idadehomem2 > idadehomem1 && idademulher2 > idademulher1){

        int soma = idadehomem2 + idademulher1;
        int multi = idadehomem1 * idademulher2;
        System.out.println("Soma: " + soma + " " + "Produto: " + multi);

      } 
      else if(idadehomem1 > idadehomem2 && idademulher2 > idademulher1){

      int soma = idadehomem1 +   idademulher1;
      int multi = idadehomem2 * idademulher2;
      System.out.println("Soma: " + soma + " " + "Produto: " + multi);

      } else if(idadehomem2 > idadehomem1 && idademulher1 > idademulher2){
        int soma = idadehomem2 +   idademulher2;
        int multi = idadehomem1 * idademulher1;
        System.out.println("Soma: " + soma + " " + "Produto: " + multi);
      }

        l.close();
}
}
 
    
    

