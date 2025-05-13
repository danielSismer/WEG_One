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

    public void editar(int escolhaIdiona) {
        Scanner scanner = new Scanner(System.in);

        if (escolhaIdiona == 1) {

            System.out.print("Welches Element möchten Sie ändern?\n1 - Name der Anleitung\n2 - Verwendung\n3 - Praktisches Beispiel\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nGeben Sie den Namen des Produkts ein: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Geben Sie die Beschreibung des Produkts ein: ");
                this.descricaoDiagnostico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Geben Sie ein praktisches Beispiel ein: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("\nAnleitung erfolgreich bearbeitet!");

        } else if (escolhaIdiona == 2) {

            System.out.print("Qual item deseja modificar?\n1 - Nome da Orientação\n2 - Como Usar\n3 - Exemplo Prático\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nDigite o nome do produto: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Digite a descrição do produto: ");
                this.exemploPratico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Digite um exemplo prático: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("\nOrientação editada com sucesso!");

        } else if (escolhaIdiona == 3) {

            System.out.print("Which item would you like to modify?\n1 - Instruction Name\n2 - How to Use\n3 - Practical Example\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nEnter the product name: ");
                this.nomeProduto = scanner.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Enter the product description: ");
                this.exemploPratico = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Enter a practical example: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("\nInstruction successfully edited!");
        }

    }

}

