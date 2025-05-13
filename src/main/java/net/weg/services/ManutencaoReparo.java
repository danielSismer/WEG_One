package net.weg.services;
import net.weg.services.ProjectJava;

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


    public void editar(int escolhaIdiona) {


            Scanner input = new Scanner(System.in);

        if (escolhaIdiona == 1) {

            System.out.print("Welches Element möchten Sie ändern?\n1 - Name der Anleitung\n2 - Verwendung\n3 - Praktisches Beispiel\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nGeben Sie den Namen des Produkts ein: ");
                this.nomeProduto = input.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Geben Sie die Beschreibung des Produkts ein: ");
                this.descricaoManutencao = input.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Geben Sie ein praktisches Beispiel ein: ");
                this.exemploPratico = input.nextLine();

            }

            System.out.println("\nAnleitung erfolgreich bearbeitet!");

        } else if (escolhaIdiona == 2) {

            System.out.print("Qual item deseja modificar?\n1 - Nome da Orientação\n2 - Como Usar\n3 - Exemplo Prático\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nDigite o nome do produto: ");
                this.nomeProduto = input.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Digite a descrição do produto: ");
                this.descricaoManutencao = input.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Digite um exemplo prático: ");
                this.exemploPratico = input.nextLine();

            }

            System.out.println("\nOrientação editada com sucesso!");

        } else if (escolhaIdiona == 3) {

            System.out.print("Which item would you like to modify?\n1 - Instruction Name\n2 - How to Use\n3 - Practical Example\n");
            int escolhaEdit = input.nextInt();

            if (escolhaEdit == 1) {

                System.out.print("\nEnter the product name: ");
                this.nomeProduto = input.nextLine();

            } else if (escolhaEdit == 2) {

                System.out.print("Enter the product description: ");
                this.descricaoManutencao = input.nextLine();

            } else if (escolhaEdit == 3) {

                System.out.print("Enter a practical example: ");
                this.exemploPratico = input.nextLine();

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
                    + "\nBeschreibung der Wartung: " + this.descricaoManutencao
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nPraktisches Beispiel: " + this.exemploPratico
                    + "\n=================================================================================================================================");


        } else if (escolhaIdioma == 2) {

            System.out.println("\n================================================================================================================================="
                    + "\nNome Orientação: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nDescrição Manutencao: " + this.descricaoManutencao
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nExemplo Pratico: " + this.exemploPratico
                    + "\n=================================================================================================================================");

        } else if (escolhaIdioma == 3) {

            System.out.println("\n================================================================================================================================="
                    + "\nInstruction Name: " + this.nomeProduto
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nMaintenance Description: " + this.descricaoManutencao
                    + "\n----------------------------------------------------------------------------------------------------------------------------------"
                    + "\nPractical Example: " + this.exemploPratico
                    + "\n=================================================================================================================================");


        }



    }
}