public class Main {
    
    public static void main(String[] args) {
        
        Conta contaGabi;
        Cliente gabi;
        Cliente empresaGabi;

        contaGabi = new Conta();

        contaGabi.depositar(2500);
        contaGabi.depositar(1500);
        contaGabi.sacar(200);
        contaGabi.sacar(3000);
        contaGabi.depositar(150);
        contaGabi.sacar(50);

        System.out.println("Saldo após saques e depositos: "+ contaGabi.saldo);
        contaGabi.imprimirExtrato();

        gabi = new PessoaFisica("Gabriella", "Rua Alta", 19, "147.890.756-98", 'f');
        gabi.imprimirDadosCliente();

        empresaGabi = new PessoaJuridica("GSA COMERCIO", "Rua Baixo", 76, "23.345.210/0001-34", "comercio");
        empresaGabi.imprimirDadosCliente();    
    
    }

}