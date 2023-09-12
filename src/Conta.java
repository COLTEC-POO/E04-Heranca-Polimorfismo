import java.util.Scanner;

public class Conta {

    // Variaveis privadas basicas da conta
    private int numero;
    private String senha;
    private double saldo;
    private String dono;
    private double limite;

    // inicializando cliente;
    private Cliente cliente;

    // Inicializando o array de operacoes
    private Operacao[] operacoes;

    // Numeros de Operacoes;
    private int numOp;

    //Numero de Contas;
    private static int numdeContas = 0;

    // Construtor da Conta
    public Conta(int numero, String senha, double saldo, String dono, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;

        this.cliente = cliente;

        setLimite(limite);

        this.operacoes = new Operacao[1000];

        this.numOp = 0;
        numdeContas++;
    }

    // Metodo para verificar o valor depositado e salvar a operacao
    public void depositar(double valor) {
        saldo += valor;

        if (valor >= 0) {
            this.saldo += valor;

            this.operacoes[numOp] = new Operacao.OperacaoDeposito(valor);
            numOp++;
        } else {
            System.out.println("Depositado R$: " + valor);
        }
    }

    // Metodo para verificar o valor a ser sacado e salvar a operacao
    public void sacar(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
            numOp++;
        } else {
            System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + valor);
        }
    }

    // Metodo para registrar contas no array
    public static Conta[] regContas() {
        Scanner linhaDeComando = new Scanner(System.in);

        // TIPO[] nomeArray = new TIPO[TAMANHO];
        int tamanho;

        System.out.println("Informe a quantidade de contas: ");
        tamanho = linhaDeComando.nextInt();
        linhaDeComando.nextLine();
        Conta[] contas = new Conta[tamanho];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o nome do dono:");
            String dono = linhaDeComando.nextLine();

            System.out.println("Digite o numero da conta:");
            int numero = linhaDeComando.nextInt();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite a senha da conta:");
            String senha = linhaDeComando.nextLine();

            System.out.println("Digite o saldo da conta:");
            double saldo = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite 'P' para Pessoa Fisica ou 'J' para Pessoa Juridica:");
            char tipoCliente = linhaDeComando.nextLine().charAt(0);

            Cliente cliente;

            if(tipoCliente == 'P' || tipoCliente == 'p') {
                System.out.println("Digite o CPF:");
                String cpf = linhaDeComando.nextLine();

                System.out.println("Digite a idade:");
                int idade = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o Sexo: ");
                char sexo = linhaDeComando.nextLine().charAt(0);

                cliente = new Cliente.PessoaFisica(dono, "", cpf, idade, sexo);
            } else if (tipoCliente == 'J' || tipoCliente == 'j') {
                System.out.println("Digite o CNPJ:");
                String cnpj = linhaDeComando.nextLine();

                System.out.println("Digite a idade:");
                int numFunc = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o setor:");
                String setor = linhaDeComando.nextLine();

                cliente = new Cliente.PessoaJuridica(dono, "", setor, cnpj, numFunc);
            } else {
                System.out.println("Tipo de cliente inválido. A conta não será criada.");
                continue;
            }

            contas[i] = new Conta(numero, senha, saldo, dono, cliente);
        }

        for (Conta contaAtual : contas) { System.out.println("Dono da conta: " + contaAtual.getDono()); }
        return contas;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta de " + this.getDono());
        for (int i = 0; i < numOp; i++) {
            Operacao operacao = operacoes[i];
            System.out.println(" " + operacao.data + "  " + (operacao.tipo == 'd' ? "d" : "s") + "  " + operacao.valor);
        }
    }

    public static int getNumdeContas() {
             return numdeContas;
    }

    public String getDono() { return dono; }

    public String setDono(String dono) {
        this.dono = dono;
        return dono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setLimite(double limite) {
        if(limite >= 0) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }
    }
}