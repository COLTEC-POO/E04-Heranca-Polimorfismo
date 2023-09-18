import java.util.Date;

public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

    @Override
    public Date getData() {
        return super.getData();
    }

    @Override
    public void setData(Date data) {
        super.setData(data);
    }

    @Override
    public char getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(char tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);

    }
}
