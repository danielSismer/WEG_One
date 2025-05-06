import java.util.Scanner;

public class TesteDiagnostico {

    String nomeProduto;
    String exemploPratico;
    String descricaoDiagnostico;

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }

    public void setexemploPratico(String exemploPratico) {

        this.exemploPratico = exemploPratico;

    }

    public void setDescricaoDiagnostico(String descricaoDiagnostico) {

        this.descricaoDiagnostico = descricaoDiagnostico;

    }

    public String toString() {

        return "\n==================================================================================================================================="
                + "\nNome Orientação: " + this.nomeProduto
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nExemplo Pratico: " + this.exemploPratico
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nDescrição diagnostico: " + this.descricaoDiagnostico
                + "\n=================================================================================================================================";
    }

    public String cadastrarProdutoDiagnostico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.descricaoDiagnostico = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("\nOrientação cadastrada com sucesso!");


        return "Produto cadastrado: " + this.nomeProduto + " - " + this.descricaoDiagnostico + "-" + this.exemploPratico;


    }


}

