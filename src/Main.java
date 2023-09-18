public class Main {

    public static void main (String [] args){
        System.out.println("============== Sistema Bancário ===============");

        Conta c1 = new Conta();
        c1.setDono("Marina LVM");
        c1.setNumeroConta(20423423);
        c1.depositar(1500);
        c1.sacar(300);
        c1.sacar(100);
        c1.dadosConta();
        c1.imprimirExtrato();

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Filipe RL");
        pf.setEndereco("Avenida Atlâtica 820 - Salvador");
        pf.setCpf("123.123.123");
        pf.setIdade(25);
        pf.setSexo('M');
        pf.imprimir();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa X");
        pj.setEndereco("Rua das Flores 190 - Belo Horizonte");
        pj.setCnpj("333.333.333");
        pj.setNumFuncionarios(75);
        pj.setSetor("Informática");
        pj.imprimir();



    }
}

