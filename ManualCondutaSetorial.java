public class ManualCondutaSetorial {

    String nomeSetor;
    String condutaEsperada;
    String observacoes;

    public void setNomeSetor(String nomeSetor) {

        this.nomeSetor = nomeSetor;

    }

    public void setCondutaEsperada(String condutaEsperada) {

        this.condutaEsperada = condutaEsperada;

    }

    public void setObservacoes(String observacoes) {

        this.observacoes = observacoes;

    }

    public String toString() {

        return "Nome Setor: " + this.nomeSetor
                + "\nConduta Esperada: " + this.condutaEsperada
                + "\nObservacoes: " + this.observacoes;

    }
}
