import java.util.Scanner;

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
    public String cadastrarProdutoDiagnostico( ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        this.nomeProduto = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        this.descricaoDiagnostico = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.exemploPratico = scanner.nextLine();

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("Como Usar: " + this.descricaoDiagnostico );
        System.out.println("Exemplo Prático: " + this.exemploPratico);

        return "Produto cadastrado: " + this.nomeProduto + " - " + this.descricaoDiagnostico + "-" + this.exemploPratico;


    }




}

