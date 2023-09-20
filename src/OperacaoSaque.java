public class OperacaoSaque extends Operacao{

    // Construtor
    public OperacaoSaque(double valor) {
        super('s', valor);

    }

<<<<<<< HEAD
=======
    @Override
    public char getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);

    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
>>>>>>> origin/main

}
