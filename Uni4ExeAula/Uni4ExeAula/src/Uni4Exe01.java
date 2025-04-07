import java.util.Scanner;
    //Entrada: horastrabalhadas e valorhora
    //Saida: salariototal
    //Processos: Perguntar quantas horas trabalhadas e valor hora e mostrar o resultado
    //Fluxograma e testes: Se encontram no enunciado

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int horastrabalhadas;
        double valorhora,salariototal,salarioextra;
        System.out.println("Informe as horas trabalhadas no mês");
        horastrabalhadas = l.nextInt();
        System.out.println("Informe o valor pago por hora");
        valorhora = l.nextDouble();
        salariototal = horastrabalhadas * valorhora;
        if(horastrabalhadas > 40) {
            salarioextra = (horastrabalhadas - 160) * (valorhora /2);
            salariototal = salariototal + salarioextra;
            System.out.println("O salario total é: "+salariototal);
        }
        else {
            System.out.println("O salario total é: " + salariototal);
            }
            l.close();
        
    }
}
