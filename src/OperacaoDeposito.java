import java.util.Date;

public class OperacaoDeposito extends  Operacao {
    public OperacaoDeposito(double valor){
        this.setTipo('d');
        this.setValor(valor);
        this.setData(new Date());
        setnOperacoes();
    }
}
