public class Main {
    public static void main(String[] args){

        int media;

        // inicialização Cliente

        PessoaFisica jessica = new PessoaFisica();
        jessica.nome = "Jéssica Alves";
        jessica.cpf = "123.455.789-11";
        jessica.endereco = "Rua Laranjeiras";
        jessica.idade = 21;
        jessica.sexo = 'f';

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.nome = "Banco X";
        empresa.cnpj = "10.510.789/0001-12";
        empresa.endereco = "Avenida Raja Gabaglia, 822";
        empresa.setor = "Financeiro";
        empresa.numFuncionarios = 52;

        // inicialização Conta

        Conta minhaConta = new Conta();
        Conta suaEmpresa = new Conta();

        minhaConta.setDono(jessica);
        minhaConta.setNumConta(1013);
        minhaConta.setLimite(10000);

        suaEmpresa.setDono(empresa);
        suaEmpresa.setNumConta(1212);
        suaEmpresa.setLimite(90000);

        // ações

        minhaConta.depositar(1500);
        minhaConta.sacar(1000);
        suaEmpresa.depositar(2000);
        suaEmpresa.depositar(70000);
        suaEmpresa.sacar(5400);
        suaEmpresa.sacar(3500);
        suaEmpresa.sacar(900);
        minhaConta.depositar(420);

        // impressão dados da conta

        System.out.println("--------------------- Dados Conta Física ----------------------");

        jessica.imprimirPF();
        System.out.print("\n");

        System.out.println("--------------------- Dados Conta Jurídica ----------------------");

        empresa.imprimirPJ();
        System.out.print("\n");

        // impressão extrato

        System.out.println("--------------------- Extrato de Conta ----------------------");

        Operacao.imprimirExtrato();
        System.out.print("\n");

        // impressão total contas e operações

        System.out.println("--------------------- Contas e Operações ----------------------");

        System.out.println("Total Contas: " + Conta.totalContas);
        System.out.println("Total Operacoes: " + Operacao.totalOperacoes);
        media = Operacao.totalOperacoes / Conta.totalContas;
        System.out.println("Media: " + media);

    }
}