import java.util.Date;

public class OperacaoSaque extends Operacao{
    public OperacaoSaque(double valor){
        this.setTipo('s');
        this.setValor(valor);
        this.setData(new Date());
        setnOperacoes();
    }
}
