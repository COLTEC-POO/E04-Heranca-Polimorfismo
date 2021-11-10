public class Conta {
    private int numeroDaConta;
    private Cliente dono;
    private double saldo;
    private double limite;
    private int posicaoOperacao = 0;
    static int totalDeContas = 0;
    Operacao [] operacoes = new Operacao [1000];

//    construtores

    public Conta (){
        totalDeContas++;
    }

//     getters

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public Cliente getDono(){
        return this.dono;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

// setters

    public void setDono(Cliente dono){
        this.dono = dono;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setLimite(int limite) {
        if (limite < 0) {
            this.limite = 0;
        } else {
            this.limite = limite;
        }
    }

//    Métodos
    void imprimir(Conta conta) {
        conta.dono.imprimir();
        System.out.println("Numero da conta: " + conta.numeroDaConta);
        System.out.println("Saldo atual da conta: R$ " + conta.saldo);
        System.out.println("Limite: R$ " + conta.limite);
    }

    boolean sacar(double valor) {
        Operacao opr;
        if (valor <= this.saldo) {
            this.saldo -= valor;
            opr = new OperacaoSaque (valor);
            operacoes[posicaoOperacao] = opr;
            posicaoOperacao ++;
            return true;
        } else {
            return false;
        }
    }

    void depositar(double valor) {
        Operacao opr;
        this.saldo += valor;
        opr = new OperacaoDeposito (valor);
        operacoes[posicaoOperacao] = opr;
        posicaoOperacao ++;
    }

    boolean transferir(Conta destino, double valor) {
        boolean saqueRealizado;
        saqueRealizado = this.sacar(valor);
        if (saqueRealizado) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    void imprimirExtrato (){
        int i;
        for (i = 0; i < posicaoOperacao; i++){
            Operacao operacaoAtual;
            operacaoAtual = operacoes [i];
            System.out.println(operacaoAtual.getDataOperacao() + "\t" + operacaoAtual.getTipo() + "\t" + operacaoAtual.getValor());
        }
    }
}
