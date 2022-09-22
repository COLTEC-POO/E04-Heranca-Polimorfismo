public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Sistema Bancario.");

        Conta contaErick = new Conta();
        contaErick.setDono(new PessoaJuridica());

        Conta contaTata = new Conta();
        contaTata.setDono(new PessoaFisica());



        contaErick.getDono().imprimeCliente();
        System.out.println("\n\n");
        contaTata.getDono().imprimeCliente();
        System.out.println("\n\n");


        contaTata.getDono().setNome("Tata Linda");
        contaTata.setNumConta(30220353);
        contaTata.setLimite(200.0);
        contaTata.getDono().setEnd("pintor renato lima 2algumacoisa7");
        contaTata.getDono().setCpf("03262140598");
        contaTata.getDono().setSexo('f');
        contaTata.getDono().setIdade(19);

        contaErick.getDono().setNome("Erick E.");
        contaErick.setNumConta(31741480);
        contaErick.setLimite(200.0);
        contaErick.getDono().setEnd("Olbiano Sausmikat 188");
        contaErick.getDono().setCnpj("14479890661");
        contaErick.getDono().setNumFunc(33);
        contaErick.getDono().setSetor("Dev");

        contaErick.getDono().imprimeCliente();
        System.out.println("\n\n");
        contaTata.getDono().imprimeCliente();










    }
}
