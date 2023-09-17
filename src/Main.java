public class Main {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancário====");

        // Chama a função regContas
        Conta[] contas = Conta.regContas();

        // Fazendo saques com cliente cadastrado no index 0
        contas[0].depositar(2000);
        contas[0].sacar(550);

        // Imprime dados dos clientes cadastrados
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
//                System.out.println("Dados como cliente:");
//                cliente.imprimir();

            System.out.println("==== Dados das Contas Completas ====");
            conta.imprimirConta();

                System.out.println("==== Extrato da Conta ====");
                conta.imprimirExtrato();

            // Espaco entre as contas
            System.out.println();
        }
    }
}