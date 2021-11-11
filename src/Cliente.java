public class Cliente {
    private String nome;
    private int idade;
    private String profissao;

    public Cliente(){
        this.nome="INVALIDO";
        this.idade=0;
        this.profissao="INVALIDO";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setProfissao(String profissao){
        this.profissao=profissao;
    }

}
