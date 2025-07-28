package net.weg.services;
import net.weg.services.ProjectJava;

import java.util.Scanner;

public class ProcedimentodeSeguranca {

    Scanner input = new Scanner(System.in);

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
        return "================================================================================================================================="
                + "\nNome Orientação: " + this.nomeProduto
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nComo Usar: " + this.comoUsar
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nExemplo Pratico: " + this.exemploPratico
                + "\n=================================================================================================================================";
    }

    public void cadastrarProdutoSegurança(int escolhaIdioma) {
        Scanner scanner = new Scanner(System.in);

        if (escolhaIdioma == 1) {
            System.out.print("\nGeben Sie den Namen des Produkts ein: ");
            this.nomeProduto = scanner.nextLine();

            System.out.print("Geben Sie an, wie das Produkt verwendet wird: ");
            this.comoUsar = scanner.nextLine();

            System.out.print("Geben Sie ein praktisches Beispiel ein: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("\nAnleitung erfolgreich registriert!");

        } else if (escolhaIdioma == 2) {
            System.out.print("\nDigite o nome do produto: ");
            this.nomeProduto = scanner.nextLine();

            System.out.print("Digite como usar o produto: ");
            this.comoUsar = scanner.nextLine();

            System.out.print("Digite um exemplo prático: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("\nOrientação cadastrada com sucesso!");
        } else if (escolhaIdioma == 3) {
            System.out.print("\nEnter the product name: ");
            this.nomeProduto = scanner.nextLine();

            System.out.print("Enter how to use the product: ");
            this.comoUsar = scanner.nextLine();

            System.out.print("Enter a practical example: ");
            this.exemploPratico = scanner.nextLine();

            System.out.println("\nInstruction successfully registered!");
        }
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
                this.comoUsar = scanner.nextLine();

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
                this.comoUsar = scanner.nextLine();

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
                this.comoUsar = scanner.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Enter a practical example: ");
                this.exemploPratico = scanner.nextLine();

            }

            System.out.println("\nInstruction successfully edited!");
        }

    }

    public void pesquisar(int escolhaIdioma){

        Scanner scanner = new Scanner(System.in);

        if (escolhaIdioma == 1) {

            System.out.println("\n================================================================================================================================="
                    + "\nName der Orientierung: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nWie zu verwenden: " + this.comoUsar
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nPraktisches Beispiel: " + this.exemploPratico
                    + "\n=================================================================================================================================");

        } else if (escolhaIdioma == 2) {

            System.out.println("\n================================================================================================================================="
                    + "Nome Orientação: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nComo Usar: " + this.comoUsar
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nExemplo Pratico: " + this.exemploPratico
                    + "\n=================================================================================================================================");
        } else if (escolhaIdioma == 3) {

            System.out.println("\n================================================================================================================================="
                    + "\nInstruction Name: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nHow to Use: " + this.comoUsar
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nPractical Example: " + this.exemploPratico
                    + "\n=================================================================================================================================");

        }



    }



}
