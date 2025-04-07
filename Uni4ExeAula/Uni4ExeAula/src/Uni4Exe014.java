import java.util.Scanner;

public class Uni4Exe014{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Digite o dia: ");
        dia = l.nextInt();
        System.out.println("Digite o mês:");
        mes = l.nextInt();
        System.out.println("Digite o ano: ");
        ano = l.nextInt();

        boolean valida = false;

      
         if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {


            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31) {
                    valida = true;
                }

    
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    valida = true;
                }

           
            } else if (mes == 2) {
                boolean fevereiro = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if ((fevereiro && dia <= 29) || (!fevereiro && dia <= 28)) {
                    valida = true;
                }
            }
        }

        if (valida) {
            System.out.println("Válida");
        } else {
            System.out.println("Não válida");
        }

        l.close();
    }
}
 
    
    

