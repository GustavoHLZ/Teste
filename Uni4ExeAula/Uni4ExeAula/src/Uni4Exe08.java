import java.util.Scanner;

   /*Entrada:
     */

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char letra = l.next().toLowerCase().charAt(0);
        if(letra == 'a'|| letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u'){
            System.out.println("É vogal");
        } else{
            System.out.println("Não é vogal");
        }
    l.close();
       
    }
}
