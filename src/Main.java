
public class Main {
    public static void main(String[] args) {

       // Atividade 01
       Conta contaMaria = new Conta();
       contaMaria.depositar(500);
       contaMaria.depositar(300);
       contaMaria.depositar(400);
       contaMaria.sacar(300);
        System.out.println("Extrato Bancario");
       contaMaria.extrato();
        System.out.println("");

        // Atividade 02

        Cliente clienteJose, clienteMaria;

        clienteJose = new PessoaFisica("Jose", "Rua das Gracas",
                "12345678912", 23, 'm' );
        clienteMaria = new PessoaJuridica("Maria", "Rua dos Anjos",
                "555555555", 55, "educacao");

        clienteJose.imprimirDadosCliente();
        System.out.println("");
        clienteMaria.imprimirDadosCliente();


    }
}
