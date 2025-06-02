package net.weg.services;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class ProjectJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ManualDeOperacao[] itensManualDeOperacao = new ManualDeOperacao[20];
        ManualCondutaSetorial[] itensManualCondutaSetorial = new ManualCondutaSetorial[20];
        ProcedimentodeSeguranca[] itensProcedimentodeSeguranca = new ProcedimentodeSeguranca[20];
        TesteDiagnostico[] itensTesteDiagnostico = new TesteDiagnostico[20];
        ManutencaoReparo[] itensManutencaoReparo = new ManutencaoReparo[20];

        ManualDeOperacao manualMotor = new ManualDeOperacao();
        ManualDeOperacao manualGerador = new ManualDeOperacao();
        itensManualDeOperacao[0] = manualMotor;
        itensManualDeOperacao[1] = manualGerador;

        ProcedimentodeSeguranca procedimentoEletrico = new ProcedimentodeSeguranca();
        ProcedimentodeSeguranca procedimentoChoque = new ProcedimentodeSeguranca();
        itensProcedimentodeSeguranca[0] = procedimentoChoque;
        itensProcedimentodeSeguranca[1] = procedimentoEletrico;

        ManutencaoReparo manutencaoReparoMotorEletrico = new ManutencaoReparo();
        ManutencaoReparo manutencaoReparoTransformadores = new ManutencaoReparo();

        itensManutencaoReparo[0] = manutencaoReparoMotorEletrico;
        itensManutencaoReparo[1] = manutencaoReparoTransformadores;

        TesteDiagnostico testeDiagnosticoMotores = new TesteDiagnostico();
        TesteDiagnostico testeDiagnosticoFalhas = new TesteDiagnostico();

        itensTesteDiagnostico[0] = testeDiagnosticoMotores;
        itensTesteDiagnostico[1] = testeDiagnosticoFalhas;

        ManualCondutaSetorial manualCondutaSetorialMontagem = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorialManutencao = new ManualCondutaSetorial();

        itensManualCondutaSetorial[0] = manualCondutaSetorialMontagem;
        itensManualCondutaSetorial[1] = manualCondutaSetorialManutencao;

        int escolhaIdioma, menuEscolha = 0;
        int escolha = 0, categoria, retorno, verificarVazio = 0;
        boolean continuarCadastro = true, idioma = true;

        LogoWegOne logo = new LogoWegOne();
        logo.getLogoWegOne();

        while(idioma) {
            do {
                System.out.println("\nChoose the language you want:\nEscolha o idioma que você deseja:\nWählen Sie die gewünschte Sprache:\n");
                System.out.println("-------------------------------\nEN-US\t\tPT-BR\t\tDE-DE\n-------------------------------");
                System.out.println("  1\t\t      2\t\t      3");
                System.out.println("\nEnter:\nInsira:\nEingeben:");


                escolhaIdioma = input.nextInt();

                if (escolhaIdioma <= 0 || escolhaIdioma >= 4) {
                    System.out.println("\n===============================");
                    System.out.println("\nPlease, choose a existing language\nPorfavor, escolha uma linguagem existente\nBitte wählen Sie eine vorhandene Sprache.");
                    System.out.println("\n===============================");
                }
            } while (escolhaIdioma <= 0 || escolhaIdioma >= 4);

            switch (escolhaIdioma) {

                case 1:
                    Locale localeEN = new Locale("en", "US");
                    ResourceBundle messages_en = ResourceBundle.getBundle("messages", localeEN);

                    manualMotor.setNomeProduto(messages_en.getString("manualMotorTitle"));
                    manualMotor.setComoUsar(messages_en.getString("manualMotorDesc"));
                    manualMotor.setExemploPratico(messages_en.getString("manualMotorEx"));

                    manualGerador.setNomeProduto(messages_en.getString("manualGeneratorTitle"));
                    manualGerador.setComoUsar(messages_en.getString("manualGeneratorDesc"));
                    manualGerador.setExemploPratico(messages_en.getString("manualGeneratorEx"));

                    procedimentoEletrico.setNomeProduto(messages_en.getString("eletricProceedTitle"));
                    procedimentoEletrico.setComoUsar(messages_en.getString("eletricProceedDesc"));
                    procedimentoEletrico.setExemploPratico(messages_en.getString("eletricProceedEx"));

                    procedimentoChoque.setNomeProduto(messages_en.getString("shockProceedTitle"));
                    procedimentoEletrico.setComoUsar(messages_en.getString("shockProceedDesc"));
                    procedimentoChoque.setExemploPratico(messages_en.getString("shockProceedEx"));

                    manutencaoReparoMotorEletrico.setNomeProduto(messages_en.getString("motorRepairTitle"));
                    manutencaoReparoMotorEletrico.setDescricaoManutencao(messages_en.getString("motorRepairDesc"));
                    manutencaoReparoMotorEletrico.setExemploPratico(messages_en.getString("motorRepairEx"));

                    manutencaoReparoTransformadores.setNomeProduto(messages_en.getString("transfRepairTitle"));
                    manutencaoReparoTransformadores.setDescricaoManutencao(messages_en.getString("transfRepairDesc"));
                    manutencaoReparoTransformadores.setExemploPratico(messages_en.getString("transfRepairEx"));

                    testeDiagnosticoMotores.setNomeProduto(messages_en.getString("motorTestTitle"));
                    testeDiagnosticoMotores.setDescricaoDiagnostico(messages_en.getString("motorTestDesc"));
                    testeDiagnosticoMotores.setexemploPratico(messages_en.getString("motorTestEx"));

                    testeDiagnosticoFalhas.setNomeProduto(messages_en.getString("failTestTitle"));
                    testeDiagnosticoFalhas.setDescricaoDiagnostico(messages_en.getString("failTestDesc"));
                    testeDiagnosticoFalhas.setexemploPratico(messages_en.getString("failTestEx"));

                    manualCondutaSetorialMontagem.setNomeSetor(messages_en.getString("assemblyManualTitle"));
                    manualCondutaSetorialMontagem.setCondutaEsperada(messages_en.getString("assemblyManualDesc"));
                    manualCondutaSetorialMontagem.setObservacoes(messages_en.getString("assemblyManualEx"));

                    manualCondutaSetorialManutencao.setNomeSetor(messages_en.getString("maintenanceManualTitle"));
                    manualCondutaSetorialManutencao.setCondutaEsperada(messages_en.getString("maintenanceManualDesc"));
                    manualCondutaSetorialManutencao.setObservacoes(messages_en.getString("maintenanceManualEx"));

                    do {

                        System.out.println(messages_en.getString("menu"));
                        System.out.print("\nYour choice: ");
                        menuEscolha = input.nextInt();

                        System.out.println();


                        switch (menuEscolha) {
                            case 1:

                                System.out.println("\nIn which orientation would you like to register?" + messages_en.getString("categoryOrientations"));
                                System.out.print("\nYour selection: ");
                                int resposta = input.nextInt();

                                System.out.println();


                                continuarCadastro = true;

                                while (continuarCadastro) {
                                    switch (resposta) {
                                        case 1:
                                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                                if (itensManualDeOperacao[i] == null) {
                                                    ManualDeOperacao novocadastro = new ManualDeOperacao();
                                                    novocadastro.cadastrarProdutoOperacao(3);
                                                    itensManualDeOperacao[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                                if (itensProcedimentodeSeguranca[i] == null) {
                                                    ProcedimentodeSeguranca novocadastro = new ProcedimentodeSeguranca();
                                                    novocadastro.cadastrarProdutoSegurança(3);
                                                    itensProcedimentodeSeguranca[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                                if (itensManutencaoReparo[i] == null) {
                                                    ManutencaoReparo novocadastro = new ManutencaoReparo();
                                                    novocadastro.cadastrarProdutoReparo(3);
                                                    itensManutencaoReparo[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                                if (itensTesteDiagnostico[i] == null) {
                                                    TesteDiagnostico novocadastro = new TesteDiagnostico();
                                                    novocadastro.cadastrarProdutoDiagnostico(3);

                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                                if (itensManualCondutaSetorial[i] == null) {
                                                    ManualCondutaSetorial novocadastro = new ManualCondutaSetorial();
                                                    novocadastro.cadastrarProdutoSetor(3);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Please, enter a valid number to register.");

                                    }

                                    System.out.println("\nWould you like to register another item? (1 - Yes / 0 - No)");
                                    System.out.print("Your choice: ");
                                    int continuar = input.nextInt();

                                    System.out.println();

                                    if (continuar == 0) {
                                        continuarCadastro = false;
                                    }
                                }

                                break;

                            case 2:
                                do {
                                    System.out.println(messages_en.getString("categoryOrientations"));
                                    System.out.print("\nYour choice: ");
                                    categoria = input.nextInt();

                                    System.out.println();

                                    int encontrados = 0;

                                    if (categoria == 1) {
                                        for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                            if (itensManualDeOperacao[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNo items found in this category!");
                                            System.out.println("Type 0 to return to the menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nReturning to the menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWhich item would you like to search for?");
                                            System.out.print("\nYour choice: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(3);
                                        }
                                    } else if (categoria == 2) {
                                        for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                            if (itensProcedimentodeSeguranca[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNo items found in this category!");
                                            System.out.println("Type 0 to return to the menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nReturning to the menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWhich item would you like to search for?");
                                            System.out.print("\nYour choice: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(3);
                                        }
                                    } else if (categoria == 3) {
                                        for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                            if (itensManutencaoReparo[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManutencaoReparo[cont].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNo items found in this category!");
                                            System.out.println("Type 0 to return to the menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nReturning to the menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            System.out.print("\nYour choice: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(3);
                                        }
                                    } else if (categoria == 4) {
                                        for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                            if (itensTesteDiagnostico[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensTesteDiagnostico[cont].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNo items found in this category!");
                                            System.out.println("Type 0 to return to the menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nReturning to the menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            System.out.print("\nYour choice: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(3);
                                        }
                                    } else if (categoria == 5) {
                                        for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                            if (itensManualCondutaSetorial[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualCondutaSetorial[cont].nomeSetor);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNo items found in this category!");
                                            System.out.println("Type 0 to return to the menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nReturning to the menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWhich item would you like to search for?");
                                            System.out.print("\nYour choice: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(3);
                                        }
                                    }

                                    System.out.println("\n\nWould you like to search for another item? (1 - Yes / 0 - No)");
                                    System.out.print("Your choice: ");
                                    int continuar = input.nextInt();
                                    System.out.println();

                                    if (continuar == 1) {
                                        continuarCadastro = true;
                                    } else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);

                                break;

                            case 3:
                                System.out.println(messages_en.getString("categoryOrientations"));
                                System.out.print("\nYour choice: ");
                                categoria = input.nextInt();

                                System.out.println();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    System.out.print("\nYour choice: ");

                                    int escolhaEdicao = input.nextInt();

                                    System.out.println();

                                    itensManualDeOperacao[escolhaEdicao - 1].editar(3);

                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensProcedimentodeSeguranca[escolhaEdicao - 1].editar(3);

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensManutencaoReparo[escolhaEdicao - 1].editar(3);

                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensTesteDiagnostico[escolhaEdicao - 1].editar(3);

                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensManualCondutaSetorial[escolhaEdicao - 1].editar(3);
                                }

                                continue;

                            case 4:
                                System.out.println("\n\nType in which category you would like to delete: ");
                                System.out.println(messages_en.getString("categoryOrientations"));
                                System.out.print("\nYour choice: ");
                                categoria = input.nextInt();

                                System.out.println();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i  + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    System.out.print("Your choice: ");
                                    int escolhaExclusao = input.nextInt();

                                    System.out.println();

                                    itensManualDeOperacao[escolhaExclusao - 1] = null;

                                    System.out.println("\nOperation manual successfully deleted!");

                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i +  1) +": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    System.out.print("Your choice: ");
                                    int escolhaExclusao = input.nextInt();
                                    System.out.println();

                                    itensProcedimentodeSeguranca[escolhaExclusao - 1] = null;

                                    System.out.println("\nSecurity procedure successfully deleted!");

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i +  1)+ ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    System.out.print("Your choice: ");
                                    int escolhaExclusao = input.nextInt();

                                    System.out.println();

                                    itensManutencaoReparo[escolhaExclusao - 1] = null;

                                    System.out.println("\nMaintenance and repair manual successfully deleted!");

                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i +  1) + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    System.out.print("Your choice: ");
                                    int escolhaExclusao = input.nextInt();

                                    System.out.println();

                                    itensTesteDiagnostico[escolhaExclusao] = null;

                                    System.out.println("\nDiagnostic and testing successfully deleted!");

                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i +  1) + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    System.out.print("Your choice: ");
                                    int escolhaExclusao = input.nextInt();

                                    System.out.println();

                                    itensManualCondutaSetorial[escolhaExclusao - 1] = null;

                                    System.out.println("\nSectoral conduct manual successfully deleted!");

                                }
                                break;

                            case 5:
                                System.out.println("\nExiting the program...");
                                input.close();
                                return;

                        }

                    } while (menuEscolha != 6);

                    break;

                case 2:
                    Locale localePT = new Locale("pt", "BR");
                    ResourceBundle messages_pt = ResourceBundle.getBundle("messages", localePT);

                    manualMotor.setNomeProduto(messages_pt.getString("manualMotorTitulo"));
                    manualMotor.setComoUsar(messages_pt.getString("manualMotorDesc"));
                    manualMotor.setExemploPratico(messages_pt.getString("manualMotorEx"));

                    manualGerador.setNomeProduto(messages_pt.getString("manualGeradorTitulo"));
                    manualGerador.setComoUsar(messages_pt.getString("manualGeradorDesc"));
                    manualGerador.setExemploPratico(messages_pt.getString("manualGeradorEx"));

                    procedimentoEletrico.setNomeProduto(messages_pt.getString("procedEletricoTitulo"));
                    procedimentoEletrico.setComoUsar(messages_pt.getString("procedEletricoDesc"));
                    procedimentoEletrico.setExemploPratico(messages_pt.getString("procedEletricoEx"));

                    procedimentoChoque.setNomeProduto(messages_pt.getString("procedChoqueTitulo"));
                    procedimentoEletrico.setComoUsar(messages_pt.getString("procedChoqueDesc"));
                    procedimentoChoque.setExemploPratico(messages_pt.getString("procedChoqueEx"));

                    manutencaoReparoMotorEletrico.setNomeProduto(messages_pt.getString("reparoMotorTitulo"));
                    manutencaoReparoMotorEletrico.setDescricaoManutencao(messages_pt.getString("reparoMotorDesc"));
                    manutencaoReparoMotorEletrico.setExemploPratico(messages_pt.getString("reparoMotorEx"));

                    manutencaoReparoTransformadores.setNomeProduto(messages_pt.getString("reparoTransfTitulo"));
                    manutencaoReparoTransformadores.setDescricaoManutencao(messages_pt.getString("reparoTransfDesc"));
                    manutencaoReparoTransformadores.setExemploPratico(messages_pt.getString("reparoTransfEx"));

                    testeDiagnosticoMotores.setNomeProduto(messages_pt.getString("testeMotorTitulo"));
                    testeDiagnosticoMotores.setDescricaoDiagnostico(messages_pt.getString("testeMotorDesc"));
                    testeDiagnosticoMotores.setexemploPratico(messages_pt.getString("testeMotorEx"));

                    testeDiagnosticoFalhas.setNomeProduto(messages_pt.getString("testeFalhasTitulo"));
                    testeDiagnosticoFalhas.setDescricaoDiagnostico(messages_pt.getString("testeFalhasDesc"));
                    testeDiagnosticoFalhas.setexemploPratico(messages_pt.getString("testeFalhasEx"));

                    manualCondutaSetorialMontagem.setNomeSetor(messages_pt.getString("manualMontagemTitulo"));
                    manualCondutaSetorialMontagem.setCondutaEsperada(messages_pt.getString("manualMontagemDesc"));
                    manualCondutaSetorialMontagem.setObservacoes(messages_pt.getString("manualMontagemEx"));

                    manualCondutaSetorialManutencao.setNomeSetor(messages_pt.getString("manualManutencaoTitulo"));
                    manualCondutaSetorialManutencao.setCondutaEsperada(messages_pt.getString("manualManutencaoDesc"));
                    manualCondutaSetorialManutencao.setObservacoes(messages_pt.getString("manualManutencaoEx"));




                    do {
                        System.out.println(messages_pt.getString("menu"));
                        System.out.print("\nSua escolha: ");
                        menuEscolha = input.nextInt();
                        System.out.println();

                        switch (menuEscolha) {
                            case 1:
                                System.out.println("\nEm qual orientação deseja cadastrar?" + messages_pt.getString("categoriaOrientacoes"));
                                System.out.print("\nSua escolha: ");
                                int resposta = input.nextInt();
                                System.out.println();

                                continuarCadastro = true;
                                while (continuarCadastro) {
                                    switch (resposta) {
                                        case 1:
                                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                                if (itensManualDeOperacao[i] == null) {
                                                    ManualDeOperacao novo = new ManualDeOperacao();
                                                    novo.cadastrarProdutoOperacao(2);
                                                    itensManualDeOperacao[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                                if (itensProcedimentodeSeguranca[i] == null) {
                                                    ProcedimentodeSeguranca novo = new ProcedimentodeSeguranca();
                                                    novo.cadastrarProdutoSegurança(2);
                                                    itensProcedimentodeSeguranca[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                                if (itensManutencaoReparo[i] == null) {
                                                    ManutencaoReparo novo = new ManutencaoReparo();
                                                    novo.cadastrarProdutoReparo(2);
                                                    itensManutencaoReparo[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                                if (itensTesteDiagnostico[i] == null) {
                                                    TesteDiagnostico novo = new TesteDiagnostico();
                                                    novo.cadastrarProdutoDiagnostico(2);
                                                    itensTesteDiagnostico[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                                if (itensManualCondutaSetorial[i] == null) {
                                                    ManualCondutaSetorial novo = new ManualCondutaSetorial();
                                                    novo.cadastrarProdutoSetor(2);
                                                    itensManualCondutaSetorial[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Por favor, digite um número válido para cadastrar.");
                                    }
                                    System.out.println("\nDeseja cadastrar outro item? (1 - Sim / 0 - Não)");
                                    System.out.print("Sua escolha: ");
                                    int continuar = input.nextInt();
                                    System.out.println();
                                    if (continuar == 0) continuarCadastro = false;
                                }
                                break;

                            case 2:
                                do {
                                    System.out.println(messages_pt.getString("categoriaOrientacoes"));
                                    System.out.print("\nSua escolha: ");
                                    categoria = input.nextInt();
                                    System.out.println();

                                    int encontrados = 0;
                                    if (categoria == 1) {
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManualDeOperacao[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNenhum item encontrado nesta categoria!");
                                            System.out.println("Digite 0 para voltar ao menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nVoltando ao menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nQual item deseja pesquisar?");
                                            System.out.print("\nSua escolha: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(2);
                                        }
                                    } else if (categoria == 2) {
                                        for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                            if (itensProcedimentodeSeguranca[i] != null) {
                                                System.out.println((i + 1) + " - " + itensProcedimentodeSeguranca[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNenhum item encontrado nesta categoria!");
                                            System.out.println("Digite 0 para voltar ao menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nVoltando ao menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nQual item deseja pesquisar?");
                                            System.out.print("\nSua escolha: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(2);
                                        }
                                    } else if (categoria == 3) {
                                        for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                            if (itensManutencaoReparo[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManutencaoReparo[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNenhum item encontrado nesta categoria!");
                                            System.out.println("Digite 0 para voltar ao menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nVoltando ao menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nQual item deseja pesquisar?");
                                            System.out.print("\nSua escolha: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(2);
                                        }
                                    } else if (categoria == 4) {
                                        for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                            if (itensTesteDiagnostico[i] != null) {
                                                System.out.println((i + 1) + " - " + itensTesteDiagnostico[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNenhum item encontrado nesta categoria!");
                                            System.out.println("Digite 0 para voltar ao menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nVoltando ao menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nQual item deseja pesquisar?");
                                            System.out.print("\nSua escolha: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(2);
                                        }
                                    } else if (categoria == 5) {
                                        for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                            if (itensManualCondutaSetorial[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManualCondutaSetorial[i].nomeSetor);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nNenhum item encontrado nesta categoria!");
                                            System.out.println("Digite 0 para voltar ao menu");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nVoltando ao menu...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nQual item deseja pesquisar?");
                                            System.out.print("\nSua escolha: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(2);
                                        }
                                    }
                                    System.out.println("\n\nDeseja pesquisar outro item? (1 - Sim / 0 - Não)");
                                    System.out.print("Sua escolha: ");
                                    int continuar = input.nextInt();
                                    System.out.println();
                                    if (continuar == 1) continuarCadastro = true;
                                    else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);
                                break;

                            case 3:
                                System.out.println(messages_pt.getString("categoriaOrientacoes"));
                                System.out.print("\nSua escolha: ");
                                categoria = input.nextInt();
                                System.out.println();

                                if (categoria == 1) {
                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }
                                    System.out.print("\nSua escolha: ");
                                    int escolhaEdicao = input.nextInt();
                                    System.out.println();
                                    itensManualDeOperacao[escolhaEdicao - 1].editar(2);
                                } else if (categoria == 2) {
                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    itensProcedimentodeSeguranca[escolhaEdicao - 1].editar(2);
                                } else if (categoria == 3) {
                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    itensManutencaoReparo[escolhaEdicao - 1].editar(2);
                                } else if (categoria == 4) {
                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    itensTesteDiagnostico[escolhaEdicao - 1].editar(2);
                                } else if (categoria == 5) {
                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    itensManualCondutaSetorial[escolhaEdicao - 1].editar(2);
                                }
                                continue;

                            case 4:
                                System.out.println("\n\nDigite em qual categoria deseja excluir: ");
                                System.out.println(messages_pt.getString("categoriaOrientacoes"));
                                System.out.print("\nSua escolha: ");
                                categoria = input.nextInt();
                                System.out.println();

                                if (categoria == 1) {
                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    itensManualDeOperacao[escolhaExclusao - 1] = null;
                                    System.out.println("\nManual de operação excluído com sucesso!");
                                } else if (categoria == 2) {
                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    itensProcedimentodeSeguranca[escolhaExclusao - 1] = null;
                                    System.out.println("\nProcedimento de segurança excluído com sucesso!");
                                } else if (categoria == 3) {
                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    itensManutencaoReparo[escolhaExclusao - 1] = null;
                                    System.out.println("\nManual de manutenção e reparo excluído com sucesso!");
                                } else if (categoria == 4) {
                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    itensTesteDiagnostico[escolhaExclusao - 1] = null;
                                    System.out.println("\nDiagnóstico e teste excluído com sucesso!");
                                } else if (categoria == 5) {
                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    itensManualCondutaSetorial[escolhaExclusao - 1] = null;
                                    System.out.println("\nManual de conduta setorial excluído com sucesso!");
                                }
                                break;

                            case 5:
                                System.out.println("\nSaindo do programa...");
                                input.close();
                                return;
                        }
                    } while (menuEscolha != 6);
                    break;


                case 3:
                    Locale localeDE = new Locale("de", "DE");
                    ResourceBundle messages_de = ResourceBundle.getBundle("messages", localeDE);

                    manualMotor.setNomeProduto(messages_de.getString("manualMotorTitulo"));
                    manualMotor.setComoUsar(messages_de.getString("manualMotorDesc"));
                    manualMotor.setExemploPratico(messages_de.getString("manualMotorEx"));

                    manualGerador.setNomeProduto(messages_de.getString("manualGeradorTitulo"));
                    manualGerador.setComoUsar(messages_de.getString("manualGeradorDesc"));
                    manualGerador.setExemploPratico(messages_de.getString("manualGeradorEx"));

                    procedimentoEletrico.setNomeProduto(messages_de.getString("procedEletricoTitulo"));
                    procedimentoEletrico.setComoUsar(messages_de.getString("procedEletricoDesc"));
                    procedimentoEletrico.setExemploPratico(messages_de.getString("procedEletricoEx"));

                    procedimentoChoque.setNomeProduto(messages_de.getString("procedChoqueTitulo"));
                    procedimentoEletrico.setComoUsar(messages_de.getString("procedChoqueDesc"));
                    procedimentoChoque.setExemploPratico(messages_de.getString("procedChoqueEx"));

                    manutencaoReparoMotorEletrico.setNomeProduto(messages_de.getString("reparoMotorTitulo"));
                    manutencaoReparoMotorEletrico.setDescricaoManutencao(messages_de.getString("reparoMotorDesc"));
                    manutencaoReparoMotorEletrico.setExemploPratico(messages_de.getString("reparoMotorEx"));

                    manutencaoReparoTransformadores.setNomeProduto(messages_de.getString("reparoTransfTitulo"));
                    manutencaoReparoTransformadores.setDescricaoManutencao(messages_de.getString("reparoTransfDesc"));
                    manutencaoReparoTransformadores.setExemploPratico(messages_de.getString("reparoTransfEx"));

                    testeDiagnosticoMotores.setNomeProduto(messages_de.getString("testeMotorTitulo"));
                    testeDiagnosticoMotores.setDescricaoDiagnostico(messages_de.getString("testeMotorDesc"));
                    testeDiagnosticoMotores.setexemploPratico(messages_de.getString("testeMotorEx"));

                    testeDiagnosticoFalhas.setNomeProduto(messages_de.getString("testeFalhasTitulo"));
                    testeDiagnosticoFalhas.setDescricaoDiagnostico(messages_de.getString("testeFalhasDesc"));
                    testeDiagnosticoFalhas.setexemploPratico(messages_de.getString("testeFalhasEx"));

                    manualCondutaSetorialMontagem.setNomeSetor(messages_de.getString("manualMontagemTitulo"));
                    manualCondutaSetorialMontagem.setCondutaEsperada(messages_de.getString("manualMontagemDesc"));
                    manualCondutaSetorialMontagem.setObservacoes(messages_de.getString("manualMontagemEx"));

                    manualCondutaSetorialManutencao.setNomeSetor(messages_de.getString("manualManutencaoTitulo"));
                    manualCondutaSetorialManutencao.setCondutaEsperada(messages_de.getString("manualManutencaoDesc"));
                    manualCondutaSetorialManutencao.setObservacoes(messages_de.getString("manualManutencaoEx"));


                    do {
                        System.out.println(messages_de.getString("menu"));
                        System.out.print("\nIhre Auswahl: ");
                        menuEscolha = input.nextInt();
                        System.out.println();

                        switch (menuEscolha) {
                            case 1:
                                System.out.println("\nIn welcher Anleitung möchten Sie registrieren?" + messages_de.getString("categoriaOrientacoes"));
                                System.out.print("\nIhre Auswahl: ");
                                int resposta = input.nextInt();
                                System.out.println();

                                continuarCadastro = true;
                                while (continuarCadastro) {
                                    switch (resposta) {
                                        case 1:
                                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                                if (itensManualDeOperacao[i] == null) {
                                                    ManualDeOperacao novo = new ManualDeOperacao();
                                                    novo.cadastrarProdutoOperacao(1);
                                                    itensManualDeOperacao[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                                if (itensProcedimentodeSeguranca[i] == null) {
                                                    ProcedimentodeSeguranca novo = new ProcedimentodeSeguranca();
                                                    novo.cadastrarProdutoSegurança(1);
                                                    itensProcedimentodeSeguranca[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                                if (itensManutencaoReparo[i] == null) {
                                                    ManutencaoReparo novo = new ManutencaoReparo();
                                                    novo.cadastrarProdutoReparo(1);
                                                    itensManutencaoReparo[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                                if (itensTesteDiagnostico[i] == null) {
                                                    TesteDiagnostico novo = new TesteDiagnostico();
                                                    novo.cadastrarProdutoDiagnostico(1);
                                                    itensTesteDiagnostico[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                                if (itensManualCondutaSetorial[i] == null) {
                                                    ManualCondutaSetorial novo = new ManualCondutaSetorial();
                                                    novo.cadastrarProdutoSetor(1);
                                                    itensManualCondutaSetorial[i] = novo;
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Bitte geben Sie eine gültige Nummer zum Registrieren ein.");
                                    }
                                    System.out.println("\nMöchten Sie ein weiteres Element registrieren? (1 - Ja / 0 - Nein)");
                                    System.out.print("Ihre Auswahl: ");
                                    int continuar = input.nextInt();
                                    System.out.println();
                                    if (continuar == 0) continuarCadastro = false;
                                }
                                break;

                            case 2:
                                do {
                                    System.out.println(messages_de.getString("categoriaOrientacoes"));
                                    System.out.print("\nIhre Auswahl: ");
                                    categoria = input.nextInt();
                                    System.out.println();

                                    int encontrados = 0;
                                    if (categoria == 1) {
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManualDeOperacao[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nKein Element in dieser Kategorie gefunden!");
                                            System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nZurück zum Menü...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWelches Element möchten Sie suchen?");
                                            System.out.print("\nIhre Auswahl: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            if (escolhaPesquisa > 0 && escolhaPesquisa <= itensManualDeOperacao.length && itensManualDeOperacao[escolhaPesquisa - 1] != null) {
                                                itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(1);
                                            } else {
                                                System.out.println("Ungültiges oder nicht registriertes Element!");
                                            }
                                        }
                                    } else if (categoria == 2) {
                                        for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                            if (itensProcedimentodeSeguranca[i] != null) {
                                                System.out.println((i + 1) + " - " + itensProcedimentodeSeguranca[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nKein Element in dieser Kategorie gefunden!");
                                            System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nZurück zum Menü...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWelches Element möchten Sie suchen?");
                                            System.out.print("\nIhre Auswahl: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            if (escolhaPesquisa > 0 && escolhaPesquisa <= itensProcedimentodeSeguranca.length && itensProcedimentodeSeguranca[escolhaPesquisa - 1] != null) {
                                                itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(1);
                                            } else {
                                                System.out.println("Ungültiges oder nicht registriertes Element!");
                                            }
                                        }
                                    } else if (categoria == 3) {
                                        for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                            if (itensManutencaoReparo[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManutencaoReparo[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nKein Element in dieser Kategorie gefunden!");
                                            System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nZurück zum Menü...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWelches Element möchten Sie suchen?");
                                            System.out.print("\nIhre Auswahl: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            if (escolhaPesquisa > 0 && escolhaPesquisa <= itensManutencaoReparo.length && itensManutencaoReparo[escolhaPesquisa - 1] != null) {
                                                itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(1);
                                            } else {
                                                System.out.println("Ungültiges oder nicht registriertes Element!");
                                            }
                                        }
                                    } else if (categoria == 4) {
                                        for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                            if (itensTesteDiagnostico[i] != null) {
                                                System.out.println((i + 1) + " - " + itensTesteDiagnostico[i].nomeProduto);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nKein Element in dieser Kategorie gefunden!");
                                            System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nZurück zum Menü...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWelches Element möchten Sie suchen?");
                                            System.out.print("\nIhre Auswahl: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            if (escolhaPesquisa > 0 && escolhaPesquisa <= itensTesteDiagnostico.length && itensTesteDiagnostico[escolhaPesquisa - 1] != null) {
                                                itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(1);
                                            } else {
                                                System.out.println("Ungültiges oder nicht registriertes Element!");
                                            }
                                        }
                                    } else if (categoria == 5) {
                                        for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                            if (itensManualCondutaSetorial[i] != null) {
                                                System.out.println((i + 1) + " - " + itensManualCondutaSetorial[i].nomeSetor);
                                                encontrados++;
                                            }
                                        }
                                        if (encontrados == 0) {
                                            System.out.println("\nKein Element in dieser Kategorie gefunden!");
                                            System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                            retorno = input.nextInt();
                                            if (retorno == 0) {
                                                System.out.println("\nZurück zum Menü...");
                                                break;
                                            }
                                        } else {
                                            System.out.print("\nWelches Element möchten Sie suchen?");
                                            System.out.print("\nIhre Auswahl: ");
                                            int escolhaPesquisa = input.nextInt();
                                            System.out.println();
                                            if (escolhaPesquisa > 0 && escolhaPesquisa <= itensManualCondutaSetorial.length && itensManualCondutaSetorial[escolhaPesquisa - 1] != null) {
                                                itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(1);
                                            } else {
                                                System.out.println("Ungültiges oder nicht registriertes Element!");
                                            }
                                        }
                                    }
                                    System.out.println("\n\nMöchten Sie ein weiteres Element suchen? (1 - Ja / 0 - Nein)");
                                    System.out.print("Ihre Auswahl: ");
                                    int continuar = input.nextInt();
                                    System.out.println();
                                    if (continuar == 1) continuarCadastro = true;
                                    else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);
                                break;

                            case 3:
                                System.out.println(messages_de.getString("categoriaOrientacoes"));
                                System.out.print("\nIhre Auswahl: ");
                                categoria = input.nextInt();
                                System.out.println();

                                if (categoria == 1) {
                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }
                                    System.out.print("\nIhre Auswahl: ");
                                    int escolhaEdicao = input.nextInt();
                                    System.out.println();
                                    if (escolhaEdicao > 0 && escolhaEdicao <= itensManualDeOperacao.length && itensManualDeOperacao[escolhaEdicao - 1] != null) {
                                        itensManualDeOperacao[escolhaEdicao - 1].editar(1);
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 2) {
                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    if (escolhaEdicao > 0 && escolhaEdicao <= itensProcedimentodeSeguranca.length && itensProcedimentodeSeguranca[escolhaEdicao - 1] != null) {
                                        itensProcedimentodeSeguranca[escolhaEdicao - 1].editar(1);
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 3) {
                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    if (escolhaEdicao > 0 && escolhaEdicao <= itensManutencaoReparo.length && itensManutencaoReparo[escolhaEdicao - 1] != null) {
                                        itensManutencaoReparo[escolhaEdicao - 1].editar(1);
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 4) {
                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    if (escolhaEdicao > 0 && escolhaEdicao <= itensTesteDiagnostico.length && itensTesteDiagnostico[escolhaEdicao - 1] != null) {
                                        itensTesteDiagnostico[escolhaEdicao - 1].editar(1);
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 5) {
                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }
                                    int escolhaEdicao = input.nextInt();
                                    if (escolhaEdicao > 0 && escolhaEdicao <= itensManualCondutaSetorial.length && itensManualCondutaSetorial[escolhaEdicao - 1] != null) {
                                        itensManualCondutaSetorial[escolhaEdicao - 1].editar(1);
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                }
                                continue;

                            case 4:
                                System.out.println("\n\nGeben Sie die Kategorie ein, die Sie löschen möchten: ");
                                System.out.println(messages_de.getString("categoriaOrientacoes"));
                                System.out.print("\nIhre Auswahl: ");
                                categoria = input.nextInt();
                                System.out.println();

                                if (categoria == 1) {
                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    if (escolhaExclusao > 0 && escolhaExclusao <= itensManualDeOperacao.length && itensManualDeOperacao[escolhaExclusao - 1] != null) {
                                        itensManualDeOperacao[escolhaExclusao - 1] = null;
                                        System.out.println("\nBedienungsanleitung erfolgreich gelöscht!");
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 2) {
                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    if (escolhaExclusao > 0 && escolhaExclusao <= itensProcedimentodeSeguranca.length && itensProcedimentodeSeguranca[escolhaExclusao - 1] != null) {
                                        itensProcedimentodeSeguranca[escolhaExclusao - 1] = null;
                                        System.out.println("\nSicherheitsverfahren erfolgreich gelöscht!");
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 3) {
                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    if (escolhaExclusao > 0 && escolhaExclusao <= itensManutencaoReparo.length && itensManutencaoReparo[escolhaExclusao - 1] != null) {
                                        itensManutencaoReparo[escolhaExclusao - 1] = null;
                                        System.out.println("\nWartungs- und Reparaturanleitung erfolgreich gelöscht!");
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 4) {
                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    if (escolhaExclusao > 0 && escolhaExclusao <= itensTesteDiagnostico.length && itensTesteDiagnostico[escolhaExclusao - 1] != null) {
                                        itensTesteDiagnostico[escolhaExclusao - 1] = null;
                                        System.out.println("\nDiagnose und Test erfolgreich gelöscht!");
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                } else if (categoria == 5) {
                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }
                                    int escolhaExclusao = input.nextInt();
                                    if (escolhaExclusao > 0 && escolhaExclusao <= itensManualCondutaSetorial.length && itensManualCondutaSetorial[escolhaExclusao - 1] != null) {
                                        itensManualCondutaSetorial[escolhaExclusao - 1] = null;
                                        System.out.println("\nSektorverhaltensanleitung erfolgreich gelöscht!");
                                    } else {
                                        System.out.println("Ungültiges oder nicht registriertes Element!");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("\nProgramm wird beendet...");
                                input.close();
                                return;
                        }
                    } while (menuEscolha != 6);
                    break;
            }
        }
    }
}