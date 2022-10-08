import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Conta contacoltec = new Conta(new PessoaJuridica());
        contacoltec.depositar(100000);
        contacoltec.sacar(5000);

        Conta minhaConta = new Conta(new PessoaFisica());
        minhaConta.depositar(1000);
        minhaConta.sacar(500);

        minhaConta.imprimeExtrato();
        contacoltec.imprimeExtrato();

    }
}
