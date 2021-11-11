import java.util.Date;
public class Cliente {

    //Conteudo classe cliente

    String nome;
    String endereco;
    Date data;

    Cliente (){
        this.data =  new Date();
    }

    void imprimirCliente (){
        System.out.println("Cliente invalido");
    }

//-----------------------------------------------------------------------------------------------------//
}