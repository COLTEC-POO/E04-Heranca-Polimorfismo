import java.util.Date;

public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);

    }
}
