import java.util.Scanner;

public class ManutencaoReparo {

    String nomeProduto;
    String descricaoManutencao;
    String exemploPratico;
    public void setNomeProduto (String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }

    public void setDescricaoManutencao (String descricaoManutencao) {

        this.descricaoManutencao = descricaoManutencao;

    }

    public void setExemploPratico (String exemploPratico) {

        this.exemploPratico = exemploPratico;
    }
    public String toString(){

        return "Nome Produto: " + this.nomeProduto
                + "\nDescrição Manutencao: " + this.descricaoManutencao
                + "\nExemplo Pratico: " + this.exemploPratico;

    }
    public String cadastrarProdutoReparo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.descricaoManutencao  = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("Como Usar: " + this.descricaoManutencao );
        System.out.println("Exemplo Prático: " + this.exemploPratico);

        return "Produto cadastrado: " + this.nomeProduto + " - " + this.descricaoManutencao  + "-" + this.exemploPratico;


    }
}