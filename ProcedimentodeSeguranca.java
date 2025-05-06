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

        return  "================================================================================================================================="
                + "Nome Orientação: " + this.nomeProduto
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nComo Usar: " + this.comoUsar
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nExemplo Pratico: " + this.exemploPratico
                + "\n=================================================================================================================================";
    }

    public String cadastrarProdutoSegurança() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.comoUsar = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("\nOrientação cadastrada com sucesso!");

        return "Produto cadastrado: " + this.nomeProduto + " - " + this.comoUsar + "-" + this.exemploPratico;


    }


}