package org.example;

import java.util.Scanner;

public class ManualCondutaSetorial {

    String nomeSetor;
    String condutaEsperada;
    String observacoes;

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

        return  "================================================================================================================================="
                + "\nNome Orientação: " + this.nomeSetor
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nConduta Esperada: " + this.condutaEsperada
                + "\n----------------------------------------------------------------------------------------------------------------------------------"
                + "\nObservacoes: " + this.observacoes
                + "\n=================================================================================================================================";

    }

    public String cadastrarProdutoSetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome do produto: ");
        this.nomeSetor = scanner.nextLine();

        System.out.print("Digite como usar o produto: ");
        this.condutaEsperada = scanner.nextLine();

        System.out.print("Digite um exemplo prático: ");
        this.observacoes = scanner.nextLine();

        System.out.println("\nOrientação cadastrada com sucesso!");

        return "Produto cadastrado: " + this.nomeSetor + " - " + this.condutaEsperada + "-" + this.observacoes;


    }
}
