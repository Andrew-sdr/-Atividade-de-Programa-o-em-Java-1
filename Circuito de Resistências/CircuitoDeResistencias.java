import java.util.Scanner;

public class CircuitoDeResistencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valor = new int[4];
        int total = 0, maior = 0, menor = 100000;

        for (int i = 0; i < 4; i++){
            System.out.print("Digite o valor da resistencia " + (i + 1) + ": ");
            valor[i] = entrada.nextInt();
            total += valor[i];
            if (valor[i] > maior) maior = valor[i];
            if (valor[i] < menor) menor = valor[i];
        }
        System.out.println("Resistencia equivalente: " + total);
        System.out.println("A maior resistencia e: " + maior);
        System.out.println("A menor resistencia e: " + menor);
    }
}
