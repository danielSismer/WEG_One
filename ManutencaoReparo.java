import java.util.Scanner;

public class ManutencaoReparo {

    String nomeProduto;
    String descricaoManutencao;
    String exemploPratico;

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }

    public void setDescricaoManutencao(String descricaoManutencao) {

        this.descricaoManutencao = descricaoManutencao;

    }

    public void setExemploPratico(String exemploPratico) {

        this.exemploPratico = exemploPratico;
    }

    public String toString() {

        return  "================================================================================================================================="
                + "\nNome Orientação: " + this.nomeProduto
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nDescrição Manutencao: " + this.descricaoManutencao
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nExemplo Pratico: " + this.exemploPratico
                + "\n=================================================================================================================================";

    }

    public String cadastrarProdutoReparo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.descricaoManutencao = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("\nOrientação cadastrada com sucesso!");


        return "Produto cadastrado: " + this.nomeProduto + " - " + this.descricaoManutencao + "-" + this.exemploPratico;


    }
}