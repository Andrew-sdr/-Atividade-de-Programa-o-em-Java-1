import java.util.Scanner;

public class DescontoDeProduto {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        float valorProduto = entrada.nextFloat();

        System.out.print("Digite a porcentagem de desconto: ");
        float porcentagemDesconto = entrada.nextFloat();

        float valorDesconto = valorProduto * (porcentagemDesconto/100);
        float precoFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Preco final do produto: " + precoFinal);
    }
}
