import java.util.Scanner;

    //Entradas: respostaCor
    //Saídas: se é azul ou não
    //Processo: perguntar sobre a cor, ler a resposta e 
    //converter de valor lógico para português
    //Fluxograma e testes: se encontram no enunciado

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("A cor é azul?");
        boolean resposta = l.nextBoolean();
        if (resposta) {//if (resposta == true) -> se o usuário escreveu true
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        l.close();
       
    }
}
