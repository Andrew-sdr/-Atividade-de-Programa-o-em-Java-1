import java.util.Scanner;

public class GeradorDeTabuada {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero para gerar a tabuada: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
