import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("======== Sistema Bancario ========");
        System.out.println("\n");

        PessoaFisica PF1 = new PessoaFisica(

                "Pedro",
                "Rua Joao e Maria 223, Belo Horizonte, MG",
                "43222-02",
                22,
                'M'
        );

        PessoaFisica PF2 = new PessoaFisica(

                "Julia",
                "Rua Buraco 289,Sao Paulo, SP",
                "09266482-09",
                32,
                'F'
        );

        PessoaJuridica PJ1 = new PessoaJuridica(

                "Joao",
                "Rua Santo Augustinho 312, Porto Alegre, RS",
                "428484-9",
                6,
                "Financeiro"

        );

        PessoaJuridica PJ2 = new PessoaJuridica(

                "Monica",
                "Rua Sao Bernardo 395, Salvador, BA",
                "7652671-7",
                8,
                "Comercio"

        );

        Cliente[] clientes = new Cliente[4];

        clientes[0] = PF1;
        clientes[1] = PF2;
        clientes[2] = PJ1;
        clientes[3] = PJ2;

        for (Cliente atual : clientes){
            atual.imprimir();
        }

        // Conta do Cliente Pedro e Julia exemplo

        System.out.println("===== Historico Conta Pedro =====");
        System.out.println("\n");


        Conta c2 = new Conta(
                7645,
                "ooup876",
                100,
                PF2,
                50000
        );

        Conta c1 = new Conta(
                29298,
                "8328aa",
                0,
                PF1,
                40000
        );


        c1.depositar(2500);
        c1.depositar(1500);
        c1.sacar(200);
        c1.sacar(3000);
        c1.depositar(150);
        c1.sacar(50);

        c1.imprimirExtrato();

        int totalContas = Conta.getTotalContas();
        int totalOperacoes = Operacao.getTotalOperacoes();

        double media = totalOperacoes / totalContas;


        System.out.println("Total de Contas no Sistema: "+ totalContas);
        System.out.println("Total de Operacoes no Sistema: " + totalOperacoes);
        System.out.println("Media: "+ media);

    }

}
