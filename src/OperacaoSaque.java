public class OperacaoSaque extends Operacao {


    public void OperacaoSaque(){
        setTipo('s');
        setValor(valor);
    }

    public OperacaoSaque(char tipo, double valor) {
        super(tipo, valor);
    }
}
