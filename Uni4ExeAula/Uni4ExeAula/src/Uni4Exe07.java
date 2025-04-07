import java.util.Scanner;

   /*Entrada: peso
     * Saída: valorPagar
     * Processo: ler peso, verificar se ele é maior que 50 gramas ou menor, e
     * mostrar o custo do selo
     * Fluxograma e Testes: enunciado
     */

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double peso,valorPagar,pesoexcedido,qtAdicional;
        valorPagar = 0;
        System.out.println("Digite o peso: ");
        peso = l.nextDouble();
        if(peso <= 50){
            valorPagar = 0.45;
            System.out.println("Custo do selo: "+valorPagar);
        } else{
        pesoexcedido = peso -50;
        qtAdicional = (pesoexcedido/20) + 1;
        valorPagar = 0.45f + 0.45f * qtAdicional;
        System.out.printf("Custo de selo %.4f",valorPagar);
        }
        l.close();
     
    
       
    }
}
