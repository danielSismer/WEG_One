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
                        System.out.println("\nYour choice: ");
                        menuEscolha = input.nextInt();

                        switch (menuEscolha) {
                            case 1:

                                System.out.println("\nIn which orientation would you like to register?" + messages_en.getString("categoryOrientations"));
                                System.out.println("\nYour selection: ");

                                int resposta = input.nextInt();

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

                                    System.out.println("Would you like to register another item? (1 - Yes / 0 - No)");

                                    int continuar = input.nextInt();
                                    if (continuar == 0) {
                                        continuarCadastro = false;
                                    }
                                }

                                break;

                            case 2:
                                do {
                                    System.out.println(messages_en.getString("categoryOrientations"));
                                    System.out.println("\nYour selection: ");
                                    categoria = input.nextInt();

                                    if (categoria == 1) {

                                        for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                            if (itensManualDeOperacao[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);
                                            } else if (itensManualDeOperacao[1] == itensManualDeOperacao[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNo items found in this category!");
                                                System.out.println("Type 0 to return to the menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nReturning to the menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(3);
                                        }

                                    } else if (categoria == 2) {

                                        for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                            if (itensProcedimentodeSeguranca[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);
                                            } else if (itensProcedimentodeSeguranca[1] == itensProcedimentodeSeguranca[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNo items found in this category!");
                                                System.out.println("Type 0 to return to the menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nReturning to the menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(3);
                                        }

                                    } else if (categoria == 3) {

                                        for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                            if (itensManutencaoReparo[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManutencaoReparo[cont].nomeProduto);
                                            } else if (itensManutencaoReparo[1] == itensManutencaoReparo[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNo items found in this category!");
                                                System.out.println("Type 0 to return to the menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nReturning to the menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(3);
                                        }

                                    } else if (categoria == 4) {

                                        for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                            if (itensTesteDiagnostico[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensTesteDiagnostico[cont].nomeProduto);
                                            } else if (itensTesteDiagnostico[1] == itensTesteDiagnostico[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNo items found in this category!");
                                                System.out.println("Type 0 to return to the menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nReturning to the menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(3);
                                        }

                                    } else if (categoria == 5) {

                                        for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                            if (itensManualCondutaSetorial[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualCondutaSetorial[cont].nomeSetor);
                                            } else if (itensManualCondutaSetorial[1] == itensManualCondutaSetorial[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNo items found in this category!");
                                                System.out.println("Type 0 to return to the menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nReturning to the menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nWhich item would you like to search for? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(3);
                                        }

                                    }

                                    System.out.println("Would you like to search for another item? (1 - Yes / 0 - No)");
                                    int continuar = input.nextInt();
                                    if (continuar == 1) {
                                        continuarCadastro = true;
                                    } else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);

                                break;

                            case 3:
                                System.out.print(messages_en.getString("categoryOrientations"));
                                System.out.println("\nYour selection: ");
                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

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
                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println(i + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualDeOperacao[escolhaExclusao] = null;

                                    System.out.println("\nOperation manual successfully deleted!");

                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println(i + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensProcedimentodeSeguranca[escolhaExclusao] = null;

                                    System.out.println("\nSecurity procedure successfully deleted!");

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println(i + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManutencaoReparo[escolhaExclusao] = null;

                                    System.out.println("\nMaintenance and repair manual successfully deleted!");

                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println(i + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensTesteDiagnostico[escolhaExclusao] = null;

                                    System.out.println("\nDiagnostic and testing successfully deleted!");

                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println(i + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualCondutaSetorial[escolhaExclusao] = null;

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
                        System.out.println("\nSua Escolha: ");
                        menuEscolha = input.nextInt();

                        switch (menuEscolha) {
                            case 1:

                                System.out.println("\nEm qual orientação você deseja cadastrar?" + messages_pt.getString("categoriaOrientacoes"));
                                System.out.println("\nDigite a sua escolha");
                                int resposta = input.nextInt();

                                continuarCadastro = true;

                                while (continuarCadastro) {
                                    switch (resposta) {
                                        case 1:
                                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                                if (itensManualDeOperacao[i] == null) {
                                                    ManualDeOperacao novocadastro = new ManualDeOperacao();
                                                    novocadastro.cadastrarProdutoOperacao(2);
                                                    itensManualDeOperacao[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                                if (itensProcedimentodeSeguranca[i] == null) {
                                                    ProcedimentodeSeguranca novocadastro = new ProcedimentodeSeguranca();
                                                    novocadastro.cadastrarProdutoSegurança(2);
                                                    itensProcedimentodeSeguranca[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                                if (itensManutencaoReparo[i] == null) {
                                                    ManutencaoReparo novocadastro = new ManutencaoReparo();
                                                    novocadastro.cadastrarProdutoReparo(2);
                                                    itensManutencaoReparo[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                                if (itensTesteDiagnostico[i] == null) {
                                                    TesteDiagnostico novocadastro = new TesteDiagnostico();
                                                    novocadastro.cadastrarProdutoDiagnostico(2);

                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                                if (itensManualCondutaSetorial[i] == null) {
                                                    ManualCondutaSetorial novocadastro = new ManualCondutaSetorial();
                                                    novocadastro.cadastrarProdutoSetor(2);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Por favor, digite um número válido para registrar.");
                                    }

                                    System.out.println("Você gostaria de registrar outro item? (1 - Sim / 0 - Não)");

                                    int continuar = input.nextInt();
                                    if (continuar == 0) {
                                        continuarCadastro = false;
                                    }
                                }

                                break;

                            case 2:
                                do {
                                    System.out.println(messages_pt.getString("categoriaOrientacoes"));
                                    System.out.println("\nDigite a sua escolha");
                                    categoria = input.nextInt();

                                    if (categoria == 1) {

                                        for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                            if (itensManualDeOperacao[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);
                                            } else if (itensManualDeOperacao[1] == itensManualDeOperacao[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNenhum item encontrado nesta categoria!");
                                                System.out.println("Digite 0 para retornar ao menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRetornando ao menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nQual item você gostaria de buscar? ");

                                            int escolhaPesquisa = input.nextInt();

                                            itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(2);
                                        }

                                    } else if (categoria == 2) {

                                        for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                            if (itensProcedimentodeSeguranca[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);
                                            } else if (itensProcedimentodeSeguranca[1] == itensProcedimentodeSeguranca[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNenhum item encontrado nesta categoria!");
                                                System.out.println("Digite 0 para retornar ao menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRetornando ao menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nQual item você gostaria de buscar? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(2);
                                        }

                                    } else if (categoria == 3) {

                                        for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                            if (itensManutencaoReparo[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManutencaoReparo[cont].nomeProduto);
                                            } else if (itensManutencaoReparo[1] == itensManutencaoReparo[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNenhum item encontrado nesta categoria!");
                                                System.out.println("Digite 0 para retornar ao menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRetornando ao menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nQual item você gostaria de buscar? ");

                                            int escolhaPesquisa = input.nextInt();

                                            itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(2);
                                        }

                                    } else if (categoria == 4) {

                                        for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                            if (itensTesteDiagnostico[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensTesteDiagnostico[cont].nomeProduto);
                                            } else if (itensTesteDiagnostico[1] == itensTesteDiagnostico[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNenhum item encontrado nesta categoria!");
                                                System.out.println("Digite 0 para retornar ao menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRetornando ao menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nQual item você gostaria de buscar? ");

                                            int escolhaPesquisa = input.nextInt();

                                            itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(2);
                                        }

                                    } else if (categoria == 5) {

                                        for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                            if (itensManualCondutaSetorial[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualCondutaSetorial[cont].nomeSetor);
                                            } else if (itensManualCondutaSetorial[1] == itensManualCondutaSetorial[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nNenhum item encontrado nesta categoria!");
                                                System.out.println("Digite 0 para retornar ao menu");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRetornando ao menu...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nQual item você gostaria de buscar? ");

                                            int escolhaPesquisa = input.nextInt();

                                            itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(2);
                                        }

                                    }

                                    System.out.println("Você gostaria de pesquisar outro item? (1 - Sim / 0 - Não)");

                                    int continuar = input.nextInt();
                                    if (continuar == 1) {
                                        continuarCadastro = true;
                                    } else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);

                                break;

                            case 3:
                                System.out.print(messages_pt.getString("categoriaOrientacoes"));
                                System.out.println("\nDigite a sua escolha");
                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

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
                                System.out.println("\nDigite a categoria que você gostaria de deletar: ");
                                System.out.println(messages_pt.getString("categoriaOrientacoes"));
                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println(i + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualDeOperacao[escolhaExclusao] = null;

                                    System.out.println("\nManual de operação deletado com sucesso!");

                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println(i + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensProcedimentodeSeguranca[escolhaExclusao] = null;

                                    System.out.println("\nProcedimento de segurança deletado com sucesso!");

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println(i + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManutencaoReparo[escolhaExclusao] = null;

                                    System.out.println("\nManual de manutenção e reparo deletado com sucesso!");

                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println(i + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensTesteDiagnostico[escolhaExclusao] = null;

                                    System.out.println("\nDiagnóstico e testes deletados com sucesso!");

                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println(i + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualCondutaSetorial[escolhaExclusao] = null;

                                    System.out.println("\nManual de conduta setorial deletado com sucesso!");

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
                        System.out.println("\nIhre Auswahl: ");

                        menuEscolha = input.nextInt();


                        switch (menuEscolha) {
                            case 1:
                                System.out.println("\nIn welcher Ausrichtung möchten Sie sich registrieren?" + messages_de.getString("categoriaOrientacoes"));
                                System.out.println("\nIhre Auswahl: ");
                                int resposta = input.nextInt();

                                continuarCadastro = true;

                                while (continuarCadastro) {


                                    switch (resposta) {
                                        case 1:
                                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                                if (itensManualDeOperacao[i] == null) {
                                                    ManualDeOperacao novocadastro = new ManualDeOperacao();
                                                    novocadastro.cadastrarProdutoOperacao(1);
                                                    itensManualDeOperacao[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                                if (itensProcedimentodeSeguranca[i] == null) {
                                                    ProcedimentodeSeguranca novocadastro = new ProcedimentodeSeguranca();
                                                    novocadastro.cadastrarProdutoSegurança(1);
                                                    itensProcedimentodeSeguranca[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                                if (itensManutencaoReparo[i] == null) {
                                                    ManutencaoReparo novocadastro = new ManutencaoReparo();
                                                    novocadastro.cadastrarProdutoReparo(1);
                                                    itensManutencaoReparo[i] = novocadastro;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                                if (itensTesteDiagnostico[i] == null) {
                                                    TesteDiagnostico novocadastro = new TesteDiagnostico();
                                                    novocadastro.cadastrarProdutoDiagnostico(1);

                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                                if (itensManualCondutaSetorial[i] == null) {
                                                    ManualCondutaSetorial novocadastro = new ManualCondutaSetorial();
                                                    novocadastro.cadastrarProdutoSetor(1);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Bitte geben Sie eine gültige Nummer zum Registrieren ein.");
                                    }

                                    System.out.println("Möchten Sie einen weiteren Artikel registrieren? (1 - Ja / 0 - Nein)");

                                    int continuar = input.nextInt();
                                    if (continuar == 0) {
                                        continuarCadastro = false;
                                    }
                                }

                                break;

                            case 2:
                                do {
                                    System.out.println(messages_de.getString("categoriaOrientacoes"));
                                    System.out.println("\nIhre Auswahl: ");
                                    categoria = input.nextInt();

                                    if (categoria == 1) {

                                        for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                            if (itensManualDeOperacao[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);
                                            } else if (itensManualDeOperacao[1] == itensManualDeOperacao[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nKeine Artikel in dieser Kategorie gefunden!");
                                                System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRückkehr zum Menü...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nNach welchem Artikel möchten Sie suchen? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManualDeOperacao[escolhaPesquisa - 1].pesquisar(1);
                                        }

                                    } else if (categoria == 2) {

                                        for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                            if (itensProcedimentodeSeguranca[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);
                                            } else if (itensProcedimentodeSeguranca[1] == itensProcedimentodeSeguranca[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nKeine Artikel in dieser Kategorie gefunden!");
                                                System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRückkehr zum Menü...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nNach welchem Artikel möchten Sie suchen? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensProcedimentodeSeguranca[escolhaPesquisa - 1].pesquisar(1);
                                        }

                                    } else if (categoria == 3) {

                                        for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                            if (itensManutencaoReparo[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManutencaoReparo[cont].nomeProduto);
                                            } else if (itensManutencaoReparo[1] == itensManutencaoReparo[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nKeine Artikel in dieser Kategorie gefunden!");
                                                System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRückkehr zum Menü...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nNach welchem Artikel möchten Sie suchen? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManutencaoReparo[escolhaPesquisa - 1].pesquisar(1);
                                        }

                                    } else if (categoria == 4) {

                                        for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                            if (itensTesteDiagnostico[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensTesteDiagnostico[cont].nomeProduto);
                                            } else if (itensTesteDiagnostico[1] == itensTesteDiagnostico[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nKeine Artikel in dieser Kategorie gefunden!");
                                                System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRückkehr zum Menü...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nNach welchem Artikel möchten Sie suchen? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensTesteDiagnostico[escolhaPesquisa - 1].pesquisar(1);
                                        }

                                    } else if (categoria == 5) {

                                        for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                            if (itensManualCondutaSetorial[cont] != null) {
                                                System.out.println((cont + 1) + " - " + itensManualCondutaSetorial[cont].nomeSetor);
                                            } else if (itensManualCondutaSetorial[1] == itensManualCondutaSetorial[cont]) {
                                                verificarVazio = 1;

                                                System.out.println("\nKeine Artikel in dieser Kategorie gefunden!");
                                                System.out.println("Geben Sie 0 ein, um zum Menü zurückzukehren");
                                                retorno = input.nextInt();

                                                if (retorno == 0) {
                                                    System.out.println("\nRückkehr zum Menü...");
                                                    break;
                                                }
                                                break;
                                            }
                                        }

                                        if (verificarVazio == 1) {
                                            break;

                                        } else {
                                            System.out.print("\nNach welchem Artikel möchten Sie suchen? ");
                                            int escolhaPesquisa = input.nextInt();

                                            itensManualCondutaSetorial[escolhaPesquisa - 1].pesquisar(1);
                                        }

                                    }

                                    System.out.println("Möchten Sie einen weiteren Artikel registrieren? (1 - Ja / 0 - Nein)");

                                    int continuar = input.nextInt();
                                    if (continuar == 1) {
                                        continuarCadastro = true;
                                    } else {
                                        continuarCadastro = false;
                                        break;
                                    }
                                } while (continuarCadastro);

                                break;

                            case 3:
                                System.out.print(messages_de.getString("categoriaOrientacoes"));
                                System.out.println("\nIhre Auswahl: ");

                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensManualDeOperacao[escolhaEdicao - 1].editar(1);

                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println((i + 1) + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensProcedimentodeSeguranca[escolhaEdicao - 1].editar(1);

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensManutencaoReparo[escolhaEdicao - 1].editar(1);

                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println((i + 1) + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensTesteDiagnostico[escolhaEdicao - 1].editar(1);

                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println((i + 1) + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    int escolhaEdicao = input.nextInt();

                                    itensManualCondutaSetorial[escolhaEdicao - 1].editar(1);
                                }

                                continue;

                            case 4:
                                System.out.println("\n\nGeben Sie die Kategorie ein, die Sie löschen möchten: ");
                                System.out.println(messages_de.getString("categoriaOrientacoes"));
                                categoria = input.nextInt();

                                if (categoria == 1) {

                                    for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                        if (itensManualDeOperacao[i] != null) {
                                            System.out.println(i + ": " + itensManualDeOperacao[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualDeOperacao[escolhaExclusao] = null;

                                    System.out.println("\nBetriebsanleitung erfolgreich gelöscht!");


                                } else if (categoria == 2) {

                                    for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                        if (itensProcedimentodeSeguranca[i] != null) {
                                            System.out.println(i + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensProcedimentodeSeguranca[escolhaExclusao] = null;

                                    System.out.println("\nSicherheitsverfahren erfolgreich gelöscht!");

                                } else if (categoria == 3) {

                                    for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                        if (itensManutencaoReparo[i] != null) {
                                            System.out.println(i + ": " + itensManutencaoReparo[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManutencaoReparo[escolhaExclusao] = null;

                                    System.out.println("\nSicherheitsverfahren erfolgreich gelöscht!");


                                } else if (categoria == 4) {

                                    for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                        if (itensTesteDiagnostico[i] != null) {
                                            System.out.println(i + ": " + itensTesteDiagnostico[i].nomeProduto);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensTesteDiagnostico[escolhaExclusao] = null;

                                    System.out.println("\nSicherheitsverfahren erfolgreich gelöscht!");


                                } else if (categoria == 5) {

                                    for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                        if (itensManualCondutaSetorial[i] != null) {
                                            System.out.println(i + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                        }
                                    }

                                    int escolhaExclusao = input.nextInt();

                                    itensManualCondutaSetorial[escolhaExclusao] = null;

                                    System.out.println("\nSicherheitsverfahren erfolgreich gelöscht!");


                                }
                            break;

                            case 5:
                                System.out.println("\nVerlasse das Programm...");
                                input.close();
                                return;
                        }

                    } while (menuEscolha != 6);
                    break;
            }
        }
    }
}