package net.weg.services;
import net.weg.services.ProjectJava;

import java.util.Scanner;

public class TesteDiagnostico {

    Scanner input = new Scanner(System.in);

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

    public void cadastrarProdutoDiagnostico(int escolhaIdioma) {
        Scanner scanner = new Scanner(System.in);


        if (escolhaIdioma == 1) {
            System.out.println("\nGeben Sie den Namen des Produkts ein: ");
            this.nomeProduto = scanner.nextLine();

            System.out.println("Geben Sie an, wie das Produkt verwendet wird: ");
            this.descricaoDiagnostico = scanner.nextLine();

            System.out.println("Geben Sie ein praktisches Beispiel ein: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("Anleitung erfolgreich registriert!");

        } else if (escolhaIdioma == 2) {
            System.out.println("Digite o nome do produto: ");
            this.nomeProduto = scanner.nextLine();

            System.out.print("Digite como usar o produto: ");
            this.descricaoDiagnostico = scanner.nextLine();

            System.out.print("Digite um exemplo prático: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("Orientação cadastrada com sucesso!");
        } else if (escolhaIdioma == 3) {
            System.out.print("Enter the product name: ");
            this.nomeProduto = scanner.nextLine();

            System.out.print("Enter how to use the product: ");
            this.descricaoDiagnostico = scanner.nextLine();

            System.out.print("Enter a practical example: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("Instruction successfully registered!");
        }

    }

    public void editar(int escolhaIdiona) {
        Scanner scanner = new Scanner(System.in);

        if (escolhaIdiona == 1) {

            System.out.print("Welches Element möchten Sie ändern?\n1 - Name der Anleitung\n2 - Verwendung\n3 - Praktisches Beispiel\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("Geben Sie den Namen des Produkts ein: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Geben Sie die Beschreibung des Produkts ein: ");
                this.descricaoDiagnostico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Geben Sie ein praktisches Beispiel ein: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("Anleitung erfolgreich bearbeitet!");

        } else if (escolhaIdiona == 2) {

            System.out.print("Qual item deseja modificar?\n1 - Nome da Orientação\n2 - Como Usar\n3 - Exemplo Prático\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("Digite o nome do produto: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Digite a descrição do produto: ");
                this.exemploPratico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Digite um exemplo prático: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("Orientação editada com sucesso!");

        } else if (escolhaIdiona == 3) {

            System.out.print("Which item would you like to modify?\n1 - Instruction Name\n2 - How to Use\n3 - Practical Example\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("Enter the product name: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Enter the product description: ");
                this.exemploPratico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Enter a practical example: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("Instruction successfully edited!");
        }

    }

    public void pesquisar(int escolhaIdioma){

        Scanner scanner = new Scanner(System.in);

        if (escolhaIdioma == 1) {

            System.out.println("\n==================================================================================================================================="
                    + "\nNome Orientação: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nExemplo Pratico: " + this.exemploPratico
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nDescrição diagnostico: " + this.descricaoDiagnostico
                    + "\n=================================================================================================================================");

        } else if (escolhaIdioma == 2) {

            System.out.println("\n==================================================================================================================================="
                    + "\nNome Orientação: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nExemplo Pratico: " + this.exemploPratico
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nDescrição diagnostico: " + this.descricaoDiagnostico
                    + "\n=================================================================================================================================");
        } else if (escolhaIdioma == 3) {

            System.out.println("\n==================================================================================================================================="
                    + "\nNome Orientação: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nExemplo Pratico: " + this.exemploPratico
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nDescrição diagnostico: " + this.descricaoDiagnostico
                    + "\n=================================================================================================================================");

        }



    }

}

