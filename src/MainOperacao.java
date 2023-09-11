import java.util.Scanner;

public class MainOperacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====Sistema Bancário====");

        // Testando inicalizacao da OperacaoSaque
        Operacao.OperacaoSaque Mano = new Operacao.OperacaoSaque(20);
        Mano.imprimirExtrato();
    }
}
