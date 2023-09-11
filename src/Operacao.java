import java.util.Date;

public class Operacao {
    double valor;

    Date data;

    char tipo;

    static int qtdOperacao = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;

        data = new Date();

        qtdOperacao++;
    }

    void imprimirExtrato() {
        System.out.println("Extrato da conta ");
            for(int i = 0; i < qtdOperacao; i++) {
                System.out.println(" " + this.data + "  " + (this.tipo == 'd' ? "d" : "s") + "  " + this.valor);
            }
        }

    public static class OperacaoSaque extends Operacao {
        public OperacaoSaque(double valor) {
            super('s', valor);
        }
    }

    public static class OperacaoDeposito extends Operacao {
        public OperacaoDeposito(double valor) {
            super('d', valor);
        }
    }
}



