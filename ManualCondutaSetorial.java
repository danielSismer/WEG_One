import java.util.Scanner;

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
    public String cadastrarProdutoSetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        this.nomeSetor = scanner.nextLine();

        System.out.print("Digite como usar o produto: ");
        this.condutaEsperada= scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.observacoes = scanner.nextLine();

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Nome: " + this.nomeSetor);
        System.out.println("Como Usar: " + this.condutaEsperada );
        System.out.println("Exemplo Prático: " + this.observacoes);

        return "Produto cadastrado: " + this.nomeSetor + " - " + this.condutaEsperada + "-" + this.observacoes;


    }
}
