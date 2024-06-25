import java.util.Scanner;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Informe seu sexo (M/F):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Informe seus anos de contribuição:");
        int anosContribuicao = scanner.nextInt();

        verificarAposentadoria(idade, sexo, anosContribuicao);
    }

    public static void verificarAposentadoria(int idade, char sexo, int anosContribuicao) {
        int idadeParaAposentar = (sexo == 'M') ? 65 : 62;
        int anosContribuicaoParaAposentar = (sexo == 'M') ? 35 : 30;

        boolean podeAposentarPorIdade = idade >= idadeParaAposentar;
        boolean podeAposentarPorContribuicao = anosContribuicao >= anosContribuicaoParaAposentar;

        if (podeAposentarPorIdade || podeAposentarPorContribuicao) {
            System.out.println("Você já pode se aposentar!");
        } else {
            int anosRestantesIdade = idadeParaAposentar - idade;
            int anosRestantesContribuicao = anosContribuicaoParaAposentar - anosContribuicao;

            int anosFaltantes = Math.max(anosRestantesIdade, anosRestantesContribuicao);
            System.out.println("Ainda faltam " + anosFaltantes + " anos para você poder se aposentar.");
        }
    }
}
