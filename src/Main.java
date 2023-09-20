public class Main {

    public static void main (String [] args){
<<<<<<< HEAD
        System.out.println("============== Sistema Bancário ================");

        Conta c1 = new Conta(
                "Marina LVM",
                20423423,
                1000,
                5000
        );

        c1.depositar(1500);
=======
        System.out.println("============== Sistema Bancário ===============");

        Conta c1 = new Conta();
        c1.setDono("Marina LVM");
        c1.setNumeroConta(20423423);
        c1.depositar(1500);
        c1.sacar(300);
>>>>>>> origin/main
        c1.sacar(100);
        c1.dadosConta();
        c1.imprimirExtrato();

<<<<<<< HEAD
        PessoaFisica pf = new PessoaFisica(
                "Filipe Ret",
                "Avenida Princesa Isabel 130 - RJ",
                "123.123.123",
                28,
                'M');

        pf.imprimir();


        PessoaJuridica pj = new PessoaJuridica(
                "Apple Inc",
                "Cupertino, California, EUA",
                "222.222.222",
                30579,
                "Tecnologia"
        );

=======
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
>>>>>>> origin/main
        pj.imprimir();



    }
}

