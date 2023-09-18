public class Conta {

    private int numero;
    String senha;
    private double saldo;
    private Cliente dono;
    private double limite;
    Operacao[] operacoes;
    int ProxOperacao;
    private static int totalContas = 0;

    public Conta(int numero, String senha, double saldo,Cliente dono,double limite){

        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
        this.limite = limite;
        operacoes = new Operacao[1000];
        ProxOperacao = 0;
        totalContas++;

    }


    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;

            Operacao operacao = new OperacaoDeposito(valor);
            RegistrarOperacoes(operacao);

            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(double valor){

        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;

            Operacao operacao = new OperacaoSaque(valor);
            RegistrarOperacoes(operacao);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public void RegistrarOperacoes(Operacao operacao){

        if (ProxOperacao < 1000) {
            operacoes[ProxOperacao] = operacao;
            ProxOperacao++;
        }

    }

    public void imprimirExtrato(){

        for(int i = 0; i < ProxOperacao; i++){

            Operacao operacao = operacoes[i];
            System.out.println(operacao.getData() + "\t" + operacao.getTipo() + "\t" + operacao.getValor());
        }
    }

    public Cliente getDono(){
        return this.dono;
    }
    public Cliente setDono(){
        return this.dono;
    }

    public int getNumero(){
        return this.numero;
    }
    public int setNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(double limite){

        return this.limite;
    }

    public double setLimite(double limite){
        if(numero >= 0){
            this.limite = limite;
        }
        return this.limite = 0;
    }

    public static int getTotalContas(){
        return totalContas;
    }

}
