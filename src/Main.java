
public class Main {
    public static void main(String[] args) {

        Conta contaEmp = new Conta(new PessoaJuridica());
        contaEmp.depositar(150_000);
        contaEmp.imprimirExtratoDetalhado();

        Conta contaUm = new Conta(new PessoaFisica());
        Conta contaDois = new Conta(new PessoaFisica());

        contaEmp.tranferencia(contaUm, 12000);
        contaEmp.tranferencia(contaDois, 20000);

        contaUm.sacar(5000);
        contaDois.sacar(10000);

        contaUm.imprimirExtratoDetalhado();
        contaDois.imprimirExtratoDetalhado();

        System.out.println("\nA media de operações por conta criada é: " + (contaUm.nOperacoesRealizadas()/contaUm.getNumContasCriadas()));
    }
}
