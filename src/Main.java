public class Main {

    public static void main (String [] args){
        System.out.println("============== Sistema Bancário ================");

        Conta c1 = new Conta(
                "Marina LVM",
                20423423,
                1000,
                5000
        );

        c1.depositar(1500);
        c1.sacar(100);
        c1.dadosConta();
        c1.imprimirExtrato();

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

        pj.imprimir();



    }
}

