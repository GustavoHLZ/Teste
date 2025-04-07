import java.util.Scanner;

public class Uni4Exe027{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Digite a hora e minuto de chegada (HH MM): ");
        int horaChegada = l.nextInt();
        int minutoChegada = l.nextInt();

        System.out.print("Digite a hora e minuto de saída (HH MM): ");
        int horaSaida = l.nextInt();
        int minutoSaida = l.nextInt();

        // Validação de horário
        if (!horarioValido(horaChegada, minutoChegada) || !horarioValido(horaSaida, minutoSaida)) {
            System.out.println("Horário inválido.");
            return;
        }

        // Conversão para minutos totais
        int minutosChegada = horaChegada * 60 + minutoChegada;
        int minutosSaida = horaSaida * 60 + minutoSaida;

        // Verifica se saída é após a chegada
        if (minutosSaida <= minutosChegada) {
            System.out.println("A saída deve ser após a chegada no mesmo dia.");
            return;
        }

        // Cálculo do tempo total em minutos
        int tempoTotalMin = minutosSaida - minutosChegada;

        // Arredondamento das horas
        int horas = tempoTotalMin / 60;
        int minutosRestantes = tempoTotalMin % 60;

        if (tempoTotalMin <= 30) {
            horas = 1;
        } else if (minutosRestantes >= 30) {
            horas += 1;
        }

        // Cálculo do valor a ser cobrado
        double preco = 0.0;

        for (int i = 1; i <= horas; i++) {
            if (i <= 2) {
                preco += 5.00;
            } else if (i <= 4) {
                preco += 7.50;
            } else {
                preco += 10.00;
            }
        }

        // Saída dos resultados
        System.out.println("\nTempo estacionado: " + horas + " hora(s)");
        System.out.printf("Preço a pagar: R$ %.2f\n", preco);
        l.close();
    }

    // Função para validar o horário
    public static boolean horarioValido(int hora, int minuto) {
        return (hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59);
      
    }

}
        
 
    
  

    
      



 
    
    

