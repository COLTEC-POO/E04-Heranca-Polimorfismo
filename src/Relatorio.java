public class Relatorio {

    public void imprimeComissoes(Funcionario[] funcionarios){
        for(Funcionario fAtual : funcionarios){
            System.out.println("Comissão de " +
                    fAtual.getNome() +
                    ": " +
                    fAtual.calculaComissao());
        }

    }
}
