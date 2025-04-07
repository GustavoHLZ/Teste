import java.util.Scanner;

   /*Entrada: sexoC
     * Saída: sexoString
     * Processo: ler o sexo abreviado, verificar 
     * a opção (M, F, I) e imprimir a respostas
     * se for outra informação imprimir incorreto
     * Fluxograma:
     * Testes: enunciado
     */

public class Uni4Exe06 {
    @SuppressWarnings("unused")    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("Informe M, F ou I: ");
        String resposta = l.next();
        //resposta = resposta.toUpperCase(); //coloca em maiúsculo
        //char sexo = resposta.charAt(0); //pega o primeiro caracter da String
        char sexo = l.next().toUpperCase().charAt(0);
        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Valor inválido");
        }
        l.close();
    
       
    }
}
