import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema Bancario");
        System.out.println("\n");

        PessoaFisica pf1 = new PessoaFisica(

                "Leandro",
                "Concordia, BH - MG",
                "222222",
                27,
                'M'
        );

        PessoaFisica pf2 = new PessoaFisica(

                "Xavier",
                "Renascença, BH - MG",
                "12345667",
                72,
                'M'
        );

        PessoaJuridica pj1 = new PessoaJuridica(

                "Araujo",
                "Savassi, BH - MG",
                "777777",
                6,
                "Distribuidora"

        );

        PessoaJuridica pj2 = new PessoaJuridica(

                "Alves",
                "Carlos Prates, BH - MG",
                "999865",
                9,
                "Marketing"

        );

        Cliente[] clientes = new Cliente[4];

        clientes[0] = pf1;
        clientes[1] = pf2;
        clientes[2] = pj1;
        clientes[3] = pj2;

        for (Cliente atual : clientes){
            atual.imprimir();
        }


        System.out.println("Historico Conta");
        System.out.println("\n");


        Conta c1 = new Conta(
                444,
                "22234",
                879,
                pf1,
                1000
        );

        Conta c2 = new Conta(
                888,
                "43222",
                978,
                pf2,
                3000
        );


        c1.depositar(1234);
        c1.depositar(4321);
        c1.sacar(920);
        c1.sacar(2129);
        c1.depositar(777);
        c1.sacar(878);

        c1.imprimirExtrato();

        int totalContas = Conta.getTotalContas();
        int totalOperacoes = Operacao.getTotalOperacoes();

        double media = totalOperacoes / totalContas;


        System.out.println("contas no sistema: "+ totalContas);
        System.out.println("operacoes no sistema: " + totalOperacoes);
        System.out.println("media: "+ media);

    }

}