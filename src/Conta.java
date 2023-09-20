import java.util.Date;
public class Conta {
    // Atributos
    protected Cliente cliente;
    public String Dono;
    protected int numeroConta;
    protected double saldoConta;
    protected double limiteConta;
    Operacao[] operacoes = new Operacao[1000];
    public static int totalContas = 0;
    protected Date date;

    // Construtor - possui o mesmo nome da Classe
    // Define valores padrões para inicialização
    // Método especial invocado toda vez que um novo objeto é criado
    public Conta() {
        this.numeroConta = -1;
        this.saldoConta = 0;
        this.Dono = null;
    }

    public Conta(String dono, int numeroConta, double saldoConta, double limiteConta) {
        Dono = dono;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;
        totalContas++;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public Operacao[] getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(Operacao[] operacoes) {
        this.operacoes = operacoes;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        Conta.totalContas = totalContas;
    }

    // Método para Depositar
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldoConta += valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao('d', valor) {
                @Override
                public void imprimirExtrato() {
                    System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);
                }
            };
            return true;
        } else {
            return false;
        }
    }

    // Método para Sacar
    public boolean sacar(double valor) {
        if (valor <= this.saldoConta) {
            this.saldoConta -= valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao('s', valor) {
                @Override
                public void imprimirExtrato() {
                    System.out.println(this.data + " \t " + this.tipo + " \t " + this.valor);

                }
            };
            return true;
        } else {
            return false;
        }
    }
    public void dadosConta(){
        System.out.println("Dono da conta: " + Dono);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldoConta);
        System.out.println("Limite: " + limiteConta);
    }

    public void imprimirExtrato() {

        if (Operacao.getTotalOperacoes() > 0) {
            for (int i=0; i< Operacao.getTotalOperacoes(); i++) {
                operacoes[i].exibirOperacao();
            }
        } else {
            System.out.println("Sem registro de operações na conta atual");
        }
    }
}