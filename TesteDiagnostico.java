public class TesteDiagnostico {

    String nomeProduto;
    String exemploPratico;
    String descricaoDiagnostico;

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }

    public void setexemploPratico (String exemploPratico){

        this.exemploPratico = exemploPratico;

    }

    public void setDescricaoDiagnostico(String descricaoDiagnostico) {

        this.descricaoDiagnostico = descricaoDiagnostico;

    }

    public String toString() {

        return "Nome Produto: " + this.nomeProduto
                + "\nExemplo Pratico: " + this.exemploPratico
                +"\nDescrição diagnostico: " + this.descricaoDiagnostico;
    }
}
