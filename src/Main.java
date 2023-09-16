
public class Main {

    public static void main (String[] args){

        // Clientes e contas da atividade 03 modificados para testar o método imprimir()

        Cliente userVicente = new Cliente("Rua ABC, 123", "Vicente do Carmo");
        Conta contaVicente = new Conta(69420, userVicente, 100.00, 500.00); 

        Cliente userSilvana = new Cliente("Rua CDE, 456", "Silvana Mara");
        Conta contaSilvana = new Conta(196223, userSilvana, 5000.00, 10000.00);
 
        contaSilvana.depositar(2000); 
        contaSilvana.depositar(1000);
        contaSilvana.sacar(500);
        contaSilvana.depositar(100);
        contaSilvana.sacar(-100000);        // Testes para ver se o contador de operações não contabiliza erros

        contaSilvana.extrato();

        contaVicente.depositar(500);
        contaVicente.depositar(1000);
        contaVicente.sacar(40);
        contaVicente.depositar(10);
        contaVicente.sacar(400);
        contaVicente.depositar(-1000);      // Testes para ver se o contador de operações não contabiliza erros

        contaVicente.extrato();


        // Novos clientes e contas criados para a atividade 04

        Cliente vicenteF = new PessoaFisica("Rua Física", "Vicente Silva", "777-777-777.77", 25, 'M');
        Cliente vicenteJ = new PessoaJuridica("Rua Jurídica", "Empresa do Vicente", "888-888-888-88", 3, "Entretenimento");
        Conta contaFisica = new Conta(6969, vicenteF, 100, 300);
        Conta contaJuridica = new Conta(7777, vicenteJ, 50000, 100000);

        vicenteF.imprimir();
        
        contaFisica.depositar(100);
        contaFisica.sacar(50);

        contaFisica.extrato();

        vicenteJ.imprimir();

        contaJuridica.depositar(500);
        contaJuridica.sacar(9000);

        contaJuridica.extrato();
        
        System.out.println("Número de contas: " +  Conta.totalContas);
        System.out.println("Total de operações realizadas: " + Operacao.totalOperacoes);

        double media = (Operacao.totalOperacoes / Conta.totalContas);

        System.out.println("Média de operações por conta: " + media); 

        // Testes com os clientes criados na atividade 03 com o método que foi sobrescrito

        userVicente.imprimir();
        userSilvana.imprimir();

    }
}