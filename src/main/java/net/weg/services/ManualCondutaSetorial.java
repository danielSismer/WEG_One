package net.weg.services;
import net.weg.services.ProjectJava;

import java.util.Scanner;

public class ManualCondutaSetorial {

    String nomeSetor;
    String condutaEsperada;
    String observacoes;

    Scanner input = new Scanner(System.in);

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
        return "================================================================================================================================="
                + "\nNome Orientação: " + this.nomeSetor
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nConduta Esperada: " + this.condutaEsperada
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nObservacoes: " + this.observacoes
                + "\n=================================================================================================================================";
    }

    public void cadastrarProdutoSetor(int escolhaIdioma) {
        Scanner scanner = new Scanner(System.in);
        if (escolhaIdioma == 1) {
            System.out.print("\nGeben Sie den Namen des Produkts ein: ");
            this.nomeSetor = scanner.nextLine();

            System.out.print("Geben Sie an, wie das Produkt verwendet wird: ");
            this.condutaEsperada = scanner.nextLine();

            System.out.print("Geben Sie ein praktisches Beispiel ein: ");
            this.observacoes = scanner.nextLine();

            System.out.println("\nAnleitung erfolgreich registriert!");

        } else if (escolhaIdioma == 2) {
            System.out.print("\nDigite o nome do produto: ");
            this.nomeSetor = scanner.nextLine();

            System.out.print("Digite como usar o produto: ");
            this.condutaEsperada = scanner.nextLine();

            System.out.print("Digite um exemplo prático: ");
            this.observacoes = scanner.nextLine();

            System.out.println("\nOrientação cadastrada com sucesso!");
        } else if (escolhaIdioma == 3) {
            System.out.print("\nEnter the product name: ");
            this.nomeSetor = scanner.nextLine();

            System.out.print("Enter how to use the product: ");
            this.condutaEsperada = scanner.nextLine();

            System.out.print("Enter a practical example: ");
            this.observacoes = scanner.nextLine();

            System.out.println("\nInstruction successfully registered!");
        }
    }

    public void editar(int escolhaIdiona) {
        Scanner scanner = new Scanner(System.in);

        if (escolhaIdiona == 1) { // Alemão
            System.out.print("Welches Element möchten Sie ändern?\n1 - Name der Anleitung\n2 - Verwendung\n3 - Praktisches Beispiel\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {
                System.out.print("\nGeben Sie den Namen des Produkts ein: ");
                this.nomeSetor = scanner.nextLine();
            } else if (escolhaEdit == 2) {
                System.out.print("Geben Sie die Beschreibung des Produkts ein: ");
                this.condutaEsperada = scanner.nextLine();
            } else if (escolhaEdit == 3) {
                System.out.print("Geben Sie ein praktisches Beispiel ein: ");
                this.observacoes = scanner.nextLine();
            }

            System.out.println("\nAnleitung erfolgreich bearbeitet!");
        } else if (escolhaIdiona == 2) { // Português
            System.out.print("Qual item deseja modificar?\n1 - Nome da Orientação\n2 - Como Usar\n3 - Exemplo Prático\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {
                System.out.print("\nDigite o nome do produto: ");
                this.nomeSetor = scanner.nextLine();
            } else if (escolhaEdit == 2) {
                System.out.print("Digite a descrição do produto: ");
                this.condutaEsperada = scanner.nextLine();
            } else if (escolhaEdit == 3) {
                System.out.print("Digite um exemplo prático: ");
                this.observacoes = scanner.nextLine();
            }

            System.out.println("\nOrientação editada com sucesso!");
        } else if (escolhaIdiona == 3) { // Inglês
            System.out.print("Which item would you like to modify?\n1 - Instruction Name\n2 - How to Use\n3 - Practical Example\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {
                System.out.print("\nEnter the product name: ");
                this.nomeSetor = scanner.nextLine();
            } else if (escolhaEdit == 2) {
                System.out.print("Enter the product description: ");
                this.condutaEsperada = scanner.nextLine();
            } else if (escolhaEdit == 3) {
                System.out.print("Enter a practical example: ");
                this.observacoes = scanner.nextLine();
            }

            System.out.println("\nInstruction successfully edited!");
        }
    }

    public void pesquisar(int escolhaIdioma){

        Scanner scanner = new Scanner(System.in);

        if (escolhaIdioma == 1) {

            System.out.println("\n================================================================================================================================="
                    + "\nName der Orientierung: " + this.nomeSetor
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nErwartetes Verhalten: " + this.condutaEsperada
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nBeobachtungen: " + this.observacoes
                    + "\n=================================================================================================================================");

        } else if (escolhaIdioma == 2) {

            System.out.println("\n================================================================================================================================="
                    + "\nNome Orientação: " + this.nomeSetor
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nConduta Esperada: " + this.condutaEsperada
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nObservacoes: " + this.observacoes
                    + "\n=================================================================================================================================");

        } else if (escolhaIdioma == 3) {

            System.out.println("\n================================================================================================================================="
                    + "\nName der Orientierung: " + this.nomeSetor
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nErwartetes Verhalten: " + this.condutaEsperada
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nBeobachtungen: " + this.observacoes
                    + "\n=================================================================================================================================");

        }



    }





}
