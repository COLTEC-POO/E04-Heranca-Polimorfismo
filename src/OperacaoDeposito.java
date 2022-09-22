public class OperacaoDeposito extends Operacao {


    public void OperacaoDeposito(){
        setTipo('d');
        setValor(valor);
    }

    public OperacaoDeposito(char tipo, double valor) {
        super(tipo, valor);
    }
}
