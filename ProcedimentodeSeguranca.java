import java.util.Scanner;

public class ProcedimentodeSeguranca {

    String nomeProduto;
    String comoUsar;
    String exemploPratico;

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }

    public void setComoUsar(String comoUsar) {

        this.comoUsar = comoUsar;

    }

    public void setExemploPratico(String exemploPratico) {

        this.exemploPratico = exemploPratico;

    }

    public String toString() {

        return "Nome Produto: " + this.nomeProduto
                + "\nComo Usar: " + this.comoUsar
                + "\nExemplo Pratico: " + this.exemploPratico;

    }
    public String cadastrarProdutoSegurança() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.comoUsar= scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("Como Usar: " + this.comoUsar );
        System.out.println("Exemplo Prático: " + this.exemploPratico);

        return "Produto cadastrado: " + this.nomeProduto + " - " + this.comoUsar + "-" + this.exemploPratico;


    }















}