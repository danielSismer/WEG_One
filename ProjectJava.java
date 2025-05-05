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
        ManualDeOperacao manualCadastro = new ManualDeOperacao();
        itensManualDeOperacao[0] = manualMotor;
        itensManualDeOperacao[1] = manualGerador;
        itensManualDeOperacao[2] = manualCadastro;

        ProcedimentodeSeguranca procedimentoEletrico = new ProcedimentodeSeguranca();
        ProcedimentodeSeguranca procedimentoChoque = new ProcedimentodeSeguranca();
        ProcedimentodeSeguranca procedimentoCadastro = new ProcedimentodeSeguranca();
        itensProcedimentodeSeguranca[0] = procedimentoChoque;
        itensProcedimentodeSeguranca[1] = procedimentoEletrico;
        itensProcedimentodeSeguranca[2] = procedimentoCadastro;

        ManutencaoReparo manutencaoReparoMotorEletrico = new ManutencaoReparo();
        ManutencaoReparo manutencaoReparoTransformadores = new ManutencaoReparo();
        ManutencaoReparo manutencaoReparoCadastro = new ManutencaoReparo();

        itensManutencaoReparo[0] = manutencaoReparoMotorEletrico;
        itensManutencaoReparo[1] = manutencaoReparoTransformadores;
        itensManutencaoReparo[2] = manutencaoReparoCadastro;

        TesteDiagnostico testeDiagnosticoMotores = new TesteDiagnostico();
        TesteDiagnostico testeDiagnosticoFalhas = new TesteDiagnostico();
        TesteDiagnostico testeDiagnosticoCadastro = new TesteDiagnostico();

        itensTesteDiagnostico[0] = testeDiagnosticoMotores;
        itensTesteDiagnostico[1] = testeDiagnosticoFalhas;
        itensTesteDiagnostico[2] = testeDiagnosticoCadastro;

        ManualCondutaSetorial manualCondutaSetorialMontagem = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorialManutencao = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorialCadastro = new ManualCondutaSetorial();

        itensManualCondutaSetorial[0] = manualCondutaSetorialMontagem;
        itensManualCondutaSetorial[1] = manualCondutaSetorialManutencao;
        itensManualCondutaSetorial[2] = manualCondutaSetorialCadastro;

        int escolha, menuEscolha = 0;

        System.out.println("\nEscolha o idioma que você deseja: \n");
        System.out.println("EN-US\t\tPT-BR\t\tDE-DE");
        System.out.println("  1\t\t  2\t\t  3");
        escolha = input.nextInt();

        switch (escolha) {

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

                            System.out.println(" In which orientation would you like to register? " + messages_en.getString("signOrientations"));
                            System.out.println("\nYour choice: ");
                            int resposta = input.nextInt();

                            boolean continuarCadastro = true;

                            while (continuarCadastro) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {

                                    }
                                }

                                switch (resposta) {
                                    case 1:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCadastro.cadastrarProdutoOperacao();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                procedimentoCadastro.cadastrarProdutoSegurança();
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manutencaoReparoCadastro.cadastrarProdutoReparo();
                                                break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                testeDiagnosticoCadastro.cadastrarProdutoDiagnostico();
                                                break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCondutaSetorialCadastro.cadastrarProdutoSetor();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("Please, type in a valid number to register.");
                                }

                                System.out.println("Would you like to register another item? (1 - Yes / 0 - No)");
                                int continuar = input.nextInt();
                                if (continuar == 0) {
                                    continuarCadastro = false;
                                }
                            }

                            break;

                        case 2:
                            System.out.println(messages_en.getString("categoryOrientations"));
                            int categoria = input.nextInt();


                            if (categoria == 1) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {

                                    if (itensManualDeOperacao[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);

                                    }
                                }

                                System.out.print("Type here: ");
                                escolha = input.nextInt();
                                System.out.println("\n");


                                if (escolha == 1) {

                                    System.out.println(itensManualDeOperacao[0]);

                                } else if (escolha == 2) {

                                    System.out.println(itensManualDeOperacao[1]);

                                } else if (escolha == 3) {

                                    System.out.println(itensManualDeOperacao[2]);

                                } else if (escolha == 4) {

                                    System.out.println(itensManualDeOperacao[3]);

                                } else if (escolha == 5) {

                                    System.out.println(itensManualDeOperacao[4]);

                                } else if (escolha == 6) {

                                    System.out.println(itensManualDeOperacao[5]);

                                } else if (escolha == 7) {

                                    System.out.println(itensManualDeOperacao[6]);

                                } else if (escolha == 8) {

                                    System.out.println(itensManualDeOperacao[7]);

                                } else if (escolha == 9) {

                                    System.out.println(itensManualDeOperacao[8]);

                                } else if (escolha == 10) {

                                    System.out.println(itensManualDeOperacao[9]);

                                }


                            } else if (categoria == 2) {

                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {

                                    if (itensProcedimentodeSeguranca[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);

                                    }
                                }
                                System.out.print("Type here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensProcedimentodeSeguranca[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensProcedimentodeSeguranca[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensProcedimentodeSeguranca[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);

                                }

                            } else if (categoria == 3) {

                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Type here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManutencaoReparo[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManutencaoReparo[8]);
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Type here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensTesteDiagnostico[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensTesteDiagnostico[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Type here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualCondutaSetorial[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManualCondutaSetorial[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManualCondutaSetorial[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManualCondutaSetorial[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManualCondutaSetorial[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManualCondutaSetorial[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManualCondutaSetorial[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManualCondutaSetorial[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManualCondutaSetorial[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensManualCondutaSetorial[9]);

                                }
                            }

                            break;

                        case 3:
                            System.out.print(messages_en.getString("categoryOrientations") + "\nType here: ");
                            categoria = input.nextInt();

                            if (categoria == 1) {
                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {
                                        System.out.println(itensManualDeOperacao[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Which item would you like to edit? \nType here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualDeOperacao[0]);

                                    System.out.print("What would you like to edit? \n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensManualDeOperacao[1]);

                                    System.out.print("What would you like to edit? \n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[1].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 3) {
                                    System.out.println(itensManualDeOperacao[2]);

                                    System.out.print("What would you like to edit? \n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[2].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 4) {
                                    System.out.println(itensManualDeOperacao[3]);

                                    System.out.print("What would you like to edit? \n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManualDeOperacao[4]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManualDeOperacao[5]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[5].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 7) {
                                    System.out.println(itensManualDeOperacao[6]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[6].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 8) {
                                    System.out.println(itensManualDeOperacao[7]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[7].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 9) {
                                    System.out.println(itensManualDeOperacao[8]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[8].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 10) {
                                    System.out.println(itensManualDeOperacao[9]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[9].exemploPratico = exemploEditado;

                                    }
                                }

                            } else if (categoria == 2) {
                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                    if (itensProcedimentodeSeguranca[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("What item would you like to edit? \nType here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].exemploPratico = exemploEditado;

                                    }


                                } else if (categoria == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 5) {

                                    System.out.println(itensProcedimentodeSeguranca[4]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 7) {

                                    System.out.println(itensProcedimentodeSeguranca[6]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 8) {

                                    System.out.println(itensProcedimentodeSeguranca[7]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);


                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].exemploPratico = exemploEditado;

                                    }

                                }

                            } else if (categoria == 3) {
                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("What item would you like to edit? \nType here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[0].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[0].exemploPratico = exemploEditado;

                                    }


                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[1].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[2].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[2].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 4) {

                                    System.out.println(itensManutencaoReparo[3]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[3].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[4].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[5].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[5].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[6].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[6].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[7].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[7].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 9) {

                                    System.out.println(itensManutencaoReparo[8]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[8].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[8].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[9].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[9].exemploPratico = exemploEditado;

                                    }
                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Which item would you like to edit? \nType here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[0].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {

                                    System.out.println(itensTesteDiagnostico[1]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[1].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3)
                                    System.out.println(itensTesteDiagnostico[2]);

                                System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                int escolhaEditar = input.nextInt();

                                if (escolhaEditar == 1) {
                                    System.out.print("What name would you like to inform? \nType here: ");
                                    String nomeEditado = input.nextLine();

                                    itensTesteDiagnostico[2].nomeProduto = nomeEditado;
                                } else if (escolhaEditar == 2) {
                                    System.out.print("What description would you like to inform? \nType here: ");
                                    String descricaoEditado = input.nextLine();

                                    itensTesteDiagnostico[2].exemploPratico = descricaoEditado;
                                } else if (escolhaEditar == 3) {

                                    System.out.print("What example would you like to inform? \nType here: ");
                                    String exemploEditado = input.nextLine();

                                    itensTesteDiagnostico[2].exemploPratico = exemploEditado;

                                } else if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[3].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[4].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[5].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[5].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[6].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[6].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[7].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[7].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[8].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[8].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[9].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[9].exemploPratico = exemploEditado;

                                    }
                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Which item would you like to edit? \nType here: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 2) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 4) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.print("What would you like to edit?" + "\n1 - Name \n2 - Description \n3 - Example");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("What name would you like to inform? \nType here: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("What description would you like to inform? \nType here: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("What example would you like to inform? \nType here: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].observacoes = exemploEditado;

                                    }
                                }
                            }

                            break;


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
                    }

                } while (menuEscolha != 5);

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
                    System.out.println("\nSua escolha: ");
                    menuEscolha = input.nextInt();

                    switch (menuEscolha) {
                        case 1:

                            System.out.println(" Em qual orientação você deseja fazer um novo cadastro?  " + messages_pt.getString("cadastroOrientacoes"));
                            System.out.println("\nSua escolha: ");
                            int resposta = input.nextInt();

                            boolean continuarCadastro = true;

                            while (continuarCadastro) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {


                                    }
                                }

                                switch (resposta) {
                                    case 1:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCadastro.cadastrarProdutoOperacao();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                procedimentoCadastro.cadastrarProdutoSegurança();
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manutencaoReparoCadastro.cadastrarProdutoReparo();
                                                break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                testeDiagnosticoCadastro.cadastrarProdutoDiagnostico();
                                                break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCondutaSetorialCadastro.cadastrarProdutoSetor();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("Por favor, digite um número válido para fazer um novo cadastro.");
                                }

                                System.out.println("Deseja cadastrar outro item? (1 - Sim / 0 - Não)");
                                int continuar = input.nextInt();
                                if (continuar == 0) {
                                    continuarCadastro = false;
                                }
                            }

                            break;


                        case 2:
                            System.out.println(messages_pt.getString("categoriaOrientacoes"));
                            int categoria = input.nextInt();


                            if (categoria == 1) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {

                                    if (itensManualDeOperacao[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);

                                    }

                                }

                                System.out.print("Digite aqui: ");
                                escolha = input.nextInt();
                                System.out.println("\n");


                                if (escolha == 1) {

                                    System.out.println(itensManualDeOperacao[0]);

                                } else if (escolha == 2) {

                                    System.out.println(itensManualDeOperacao[1]);

                                } else if (escolha == 3) {

                                    System.out.println(itensManualDeOperacao[2]);

                                } else if (escolha == 4) {

                                    System.out.println(itensManualDeOperacao[3]);

                                } else if (escolha == 5) {

                                    System.out.println(itensManualDeOperacao[4]);

                                } else if (escolha == 6) {

                                    System.out.println(itensManualDeOperacao[5]);

                                } else if (escolha == 7) {

                                    System.out.println(itensManualDeOperacao[6]);

                                } else if (escolha == 8) {

                                    System.out.println(itensManualDeOperacao[7]);

                                } else if (escolha == 9) {

                                    System.out.println(itensManualDeOperacao[8]);

                                } else if (escolha == 10) {

                                    System.out.println(itensManualDeOperacao[9]);

                                }


                            } else if (categoria == 2) {

                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {

                                    if (itensProcedimentodeSeguranca[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);

                                    }
                                }
                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensProcedimentodeSeguranca[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensProcedimentodeSeguranca[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensProcedimentodeSeguranca[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);

                                }

                            } else if (categoria == 3) {

                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManutencaoReparo[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManutencaoReparo[8]);
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensTesteDiagnostico[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensTesteDiagnostico[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualCondutaSetorial[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManualCondutaSetorial[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManualCondutaSetorial[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManualCondutaSetorial[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManualCondutaSetorial[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManualCondutaSetorial[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManualCondutaSetorial[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManualCondutaSetorial[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManualCondutaSetorial[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensManualCondutaSetorial[9]);

                                }
                            }

                            break;

                        case 3:
                            System.out.print("1-Manual de operação \n 2-Procedimento de Segurança \n 3-Manutenção e Reparos \n 4-Testes e Diagnóstico \n 5-Manual de Conduta e Operações Setoriais  \nDigite aqui:");
                            categoria = input.nextInt();

                            if (categoria == 1) {
                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {
                                        System.out.println(itensManualDeOperacao[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Qual item deseja editar? \nDigite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualDeOperacao[0]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensManualDeOperacao[1]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[1].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 3) {
                                    System.out.println(itensManualDeOperacao[2]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[2].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 4) {
                                    System.out.println(itensManualDeOperacao[3]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManualDeOperacao[4]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManualDeOperacao[5]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[5].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 7) {
                                    System.out.println(itensManualDeOperacao[6]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[6].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 8) {
                                    System.out.println(itensManualDeOperacao[7]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[7].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 9) {
                                    System.out.println(itensManualDeOperacao[8]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[8].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 10) {
                                    System.out.println(itensManualDeOperacao[9]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[9].exemploPratico = exemploEditado;

                                    }

                                }

                            } else if (categoria == 2) {
                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                    if (itensProcedimentodeSeguranca[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Qual item deseja editar? \nDigite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].exemploPratico = exemploEditado;

                                    }


                                } else if (categoria == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 5) {

                                    System.out.println(itensProcedimentodeSeguranca[4]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 7) {

                                    System.out.println(itensProcedimentodeSeguranca[6]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 8) {

                                    System.out.println(itensProcedimentodeSeguranca[7]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);


                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].exemploPratico = exemploEditado;

                                    }

                                }

                            } else if (categoria == 3) {
                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Qual item deseja editar? \nDigite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[0].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[0].exemploPratico = exemploEditado;

                                    }


                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[1].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[2].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[2].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 4) {

                                    System.out.println(itensManutencaoReparo[3]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[3].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[4].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[5].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[5].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[6].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[6].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[7].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[7].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 9) {

                                    System.out.println(itensManutencaoReparo[8]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[8].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[8].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[9].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[9].exemploPratico = exemploEditado;

                                    }
                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Qual item deseja editar? \nDigite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[0].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {

                                    System.out.println(itensTesteDiagnostico[1]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[1].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3)
                                    System.out.println(itensTesteDiagnostico[2]);

                                System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                int escolhaEditar = input.nextInt();

                                if (escolhaEditar == 1) {
                                    System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                    String nomeEditado = input.nextLine();

                                    itensTesteDiagnostico[2].nomeProduto = nomeEditado;
                                } else if (escolhaEditar == 2) {
                                    System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                    String descricaoEditado = input.nextLine();

                                    itensTesteDiagnostico[2].exemploPratico = descricaoEditado;
                                } else if (escolhaEditar == 3) {

                                    System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                    String exemploEditado = input.nextLine();

                                    itensTesteDiagnostico[2].exemploPratico = exemploEditado;

                                } else if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[3].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[4].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[5].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[5].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[6].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[6].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[7].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[7].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[8].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[8].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[9].exemploPratico = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[9].exemploPratico = exemploEditado;

                                    }
                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Qual item deseja editar? \nDigite aqui:");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 2) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 4) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].observacoes = exemploEditado;

                                    }
                                }


                            }

                            break;


                        case 4:
                            System.out.println("\n\nDigite qual categoria de orientação você deseja excluir: ");
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

                                System.out.println("\nManual de Operação excluído com êxito!");

                            } else if (categoria == 2) {

                                for (int i = 0; i < itensProcedimentodeSeguranca.length; i++) {
                                    if (itensProcedimentodeSeguranca[i] != null) {
                                        System.out.println(i + ": " + itensProcedimentodeSeguranca[i].nomeProduto);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensProcedimentodeSeguranca[escolhaExclusao] = null;

                                System.out.println("\nProcedimento de segurança excluído com êxito!");

                            } else if (categoria == 3) {

                                for (int i = 0; i < itensManutencaoReparo.length; i++) {
                                    if (itensManutencaoReparo[i] != null) {
                                        System.out.println(i + ": " + itensManutencaoReparo[i].nomeProduto);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensManutencaoReparo[escolhaExclusao] = null;

                                System.out.println("\nManual de manutenção e reparo excluído com êxito!");

                            } else if (categoria == 4) {

                                for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                    if (itensTesteDiagnostico[i] != null) {
                                        System.out.println(i + ": " + itensTesteDiagnostico[i].nomeProduto);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensTesteDiagnostico[escolhaExclusao] = null;

                                System.out.println("\nTeste e diagnóstico excluído com êxito!");

                            } else if (categoria == 5) {

                                for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                    if (itensManualCondutaSetorial[i] != null) {
                                        System.out.println(i + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensManualCondutaSetorial[escolhaExclusao] = null;

                                System.out.println("\nManual de conduta setorial excluído com êxito!");

                            }

                    }


                } while (menuEscolha != 5);
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
                    System.out.println("\nIhre Wahl: ");
                    menuEscolha = input.nextInt();

                    switch (menuEscolha) {
                        case 1:

                            System.out.println("In welcher Ausrichtung möchten Sie sich neu anmelden?  " + messages_de.getString("cadastroOrientacoes"));
                            System.out.println("\nSua escolha: ");
                            int resposta = input.nextInt();

                            boolean continuarCadastro = true;

                            while (continuarCadastro) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {


                                    }
                                }

                                switch (resposta) {
                                    case 1:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCadastro.cadastrarProdutoOperacao();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                procedimentoCadastro.cadastrarProdutoSegurança();
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manutencaoReparoCadastro.cadastrarProdutoReparo();
                                                break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                testeDiagnosticoCadastro.cadastrarProdutoDiagnostico();
                                                break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                            if (itensManualDeOperacao[i] != null) {
                                                manualCondutaSetorialCadastro.cadastrarProdutoSetor();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("\nBitte geben Sie eine gültige Nummer ein, um eine neue Registrierung zu erstellen.");
                                }

                                System.out.println("Möchten Sie einen weiteren Artikel registrieren? (1 - Ja / 0 - Nein)");
                                int continuar = input.nextInt();
                                if (continuar == 0) {
                                    continuarCadastro = false;
                                }
                            }

                            break;

                        case 2:
                            System.out.println(messages_de.getString("categoriaOrientacoes"));
                            int categoria = input.nextInt();


                            if (categoria == 1) {

                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {

                                    if (itensManualDeOperacao[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensManualDeOperacao[cont].nomeProduto);

                                    }

                                }

                                System.out.print("Geben Sie hier ein: ");
                                escolha = input.nextInt();
                                System.out.println("\n");


                                if (escolha == 1) {

                                    System.out.println(itensManualDeOperacao[0]);

                                } else if (escolha == 2) {

                                    System.out.println(itensManualDeOperacao[1]);

                                } else if (escolha == 3) {

                                    System.out.println(itensManualDeOperacao[2]);

                                } else if (escolha == 4) {

                                    System.out.println(itensManualDeOperacao[3]);

                                } else if (escolha == 5) {

                                    System.out.println(itensManualDeOperacao[4]);

                                } else if (escolha == 6) {

                                    System.out.println(itensManualDeOperacao[5]);

                                } else if (escolha == 7) {

                                    System.out.println(itensManualDeOperacao[6]);

                                } else if (escolha == 8) {

                                    System.out.println(itensManualDeOperacao[7]);

                                } else if (escolha == 9) {

                                    System.out.println(itensManualDeOperacao[8]);

                                } else if (escolha == 10) {

                                    System.out.println(itensManualDeOperacao[9]);

                                }


                            } else if (categoria == 2) {

                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {

                                    if (itensProcedimentodeSeguranca[cont] != null) {

                                        System.out.println((cont + 1) + " - " + itensProcedimentodeSeguranca[cont].nomeProduto);

                                    }
                                }
                                System.out.print("Geben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensProcedimentodeSeguranca[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensProcedimentodeSeguranca[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensProcedimentodeSeguranca[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);

                                }

                            } else if (categoria == 3) {

                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Geben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManutencaoReparo[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManutencaoReparo[8]);
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }
                                System.out.print("Geben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensTesteDiagnostico[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensTesteDiagnostico[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Geben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualCondutaSetorial[0]);

                                } else if (escolha == 2) {
                                    System.out.println(itensManualCondutaSetorial[1]);

                                } else if (escolha == 3) {
                                    System.out.println(itensManualCondutaSetorial[2]);

                                } else if (escolha == 4) {
                                    System.out.println(itensManualCondutaSetorial[3]);

                                } else if (escolha == 5) {
                                    System.out.println(itensManualCondutaSetorial[4]);

                                } else if (escolha == 6) {
                                    System.out.println(itensManualCondutaSetorial[5]);

                                } else if (escolha == 7) {
                                    System.out.println(itensManualCondutaSetorial[6]);

                                } else if (escolha == 8) {
                                    System.out.println(itensManualCondutaSetorial[7]);

                                } else if (escolha == 9) {
                                    System.out.println(itensManualCondutaSetorial[8]);

                                } else if (escolha == 10) {
                                    System.out.println(itensManualCondutaSetorial[9]);

                                }
                            }

                            break;

                        case 3:
                            System.out.print(messages_de.getString("categoriaOrientacoes") + "\nGeben Sie hier ein: ");
                            categoria = input.nextInt();

                            if (categoria == 1) {
                                for (int cont = 0; cont < itensManualDeOperacao.length; cont++) {
                                    if (itensManualDeOperacao[cont] != null) {
                                        System.out.println(itensManualDeOperacao[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Welchen Artikel möchten Sie bearbeiten?\n" +
                                        "Geben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualDeOperacao[0]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensManualDeOperacao[1]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.println(itensManualDeOperacao[2]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[2].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 4) {
                                    System.out.println(itensManualDeOperacao[3]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManualDeOperacao[4]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManualDeOperacao[5]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[5].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 7) {
                                    System.out.println(itensManualDeOperacao[6]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[6].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 8) {
                                    System.out.println(itensManualDeOperacao[7]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[7].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 9) {
                                    System.out.println(itensManualDeOperacao[8]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[8].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 10) {
                                    System.out.println(itensManualDeOperacao[9]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualDeOperacao[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualDeOperacao[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualDeOperacao[9].exemploPratico = exemploEditado;

                                    }

                                }

                            } else if (categoria == 2) {
                                for (int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {
                                    if (itensProcedimentodeSeguranca[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Welchen Artikel möchten Sie bearbeiten? \nGeben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensProcedimentodeSeguranca[0]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensProcedimentodeSeguranca[1]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[1].exemploPratico = exemploEditado;

                                    }


                                } else if (categoria == 3) {
                                    System.out.println(itensProcedimentodeSeguranca[2]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[2].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 4) {
                                    System.out.println(itensProcedimentodeSeguranca[3]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[3].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 5) {

                                    System.out.println(itensProcedimentodeSeguranca[4]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[4].exemploPratico = exemploEditado;

                                    }
                                } else if (categoria == 6) {
                                    System.out.println(itensProcedimentodeSeguranca[5]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[5].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 7) {

                                    System.out.println(itensProcedimentodeSeguranca[6]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[6].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 8) {

                                    System.out.println(itensProcedimentodeSeguranca[7]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[7].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 9) {
                                    System.out.println(itensProcedimentodeSeguranca[8]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[8].exemploPratico = exemploEditado;

                                    }

                                } else if (categoria == 10) {
                                    System.out.println(itensProcedimentodeSeguranca[9]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].comoUsar = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensProcedimentodeSeguranca[9].exemploPratico = exemploEditado;

                                    }
                                }

                            } else if (categoria == 3) {
                                for (int cont = 0; cont < itensManutencaoReparo.length; cont++) {
                                    if (itensManutencaoReparo[cont] != null) {
                                        System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Welches Element möchten Sie bearbeiten? \nGeben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManutencaoReparo[0]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[0].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[0].exemploPratico = exemploEditado;

                                    }


                                } else if (escolha == 2) {
                                    System.out.println(itensManutencaoReparo[1]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[1].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[1].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.println(itensManutencaoReparo[2]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[2].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[2].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[2].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 4) {
                                    System.out.println(itensManutencaoReparo[3]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[3].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[3].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManutencaoReparo[4]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[4].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[4].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManutencaoReparo[5]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[5].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[5].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensManutencaoReparo[6]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[6].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[6].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensManutencaoReparo[7]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[7].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[7].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.println(itensManutencaoReparo[8]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[8].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[8].exemploPratico = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensManutencaoReparo[9]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManutencaoReparo[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManutencaoReparo[9].descricaoManutencao = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManutencaoReparo[9].exemploPratico = exemploEditado;

                                    }
                                }

                            } else if (categoria == 4) {
                                for (int cont = 0; cont < itensTesteDiagnostico.length; cont++) {
                                    if (itensTesteDiagnostico[cont] != null) {
                                        System.out.println(itensTesteDiagnostico[cont].nomeProduto);
                                    }
                                }

                                System.out.print("Welches Element möchten Sie bearbeiten? \nGeben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensTesteDiagnostico[0]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[0].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[0].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[0].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 2) {
                                    System.out.println(itensTesteDiagnostico[1]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[1].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[1].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[1].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 3)
                                    System.out.println(itensTesteDiagnostico[2]);

                                System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                int escolhaEditar = input.nextInt();

                                if (escolhaEditar == 1) {
                                    System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                    String nomeEditado = input.nextLine();

                                    itensTesteDiagnostico[2].nomeProduto = nomeEditado;
                                } else if (escolhaEditar == 2) {
                                    System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                    String descricaoEditado = input.nextLine();

                                    itensTesteDiagnostico[2].descricaoDiagnostico = descricaoEditado;
                                } else {

                                    System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                    String exemploEditado = input.nextLine();

                                    itensTesteDiagnostico[2].exemploPratico = exemploEditado;

                                }

                                if (escolha == 4) {
                                    System.out.println(itensTesteDiagnostico[3]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[3].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[3].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[3].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 5) {
                                    System.out.println(itensTesteDiagnostico[4]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[4].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[4].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[4].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 6) {
                                    System.out.println(itensTesteDiagnostico[5]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[5].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[5].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[5].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 7) {
                                    System.out.println(itensTesteDiagnostico[6]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[6].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[6].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[6].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 8) {
                                    System.out.println(itensTesteDiagnostico[7]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[7].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[7].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[7].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 9) {
                                    System.out.println(itensTesteDiagnostico[8]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[8].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[8].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[8].exemploPratico = exemploEditado;

                                    }

                                } else if (escolha == 10) {
                                    System.out.println(itensTesteDiagnostico[9]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensTesteDiagnostico[9].nomeProduto = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensTesteDiagnostico[9].descricaoDiagnostico = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensTesteDiagnostico[9].exemploPratico = exemploEditado;

                                    }
                                }
                            } else if (categoria == 5) {
                                for (int cont = 0; cont < itensManualCondutaSetorial.length; cont++) {
                                    if (itensManualCondutaSetorial[cont] != null) {
                                        System.out.println(itensManualCondutaSetorial[cont].nomeSetor);
                                    }
                                }

                                System.out.print("Welches Element möchten Sie bearbeiten? \nGeben Sie hier ein: ");
                                escolha = input.nextInt();

                                if (escolha == 1) {
                                    System.out.println(itensManualCondutaSetorial[0]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[0].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 2) {
                                    System.out.println(itensManualCondutaSetorial[1]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[1].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 3) {
                                    System.out.println(itensManualCondutaSetorial[2]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[2].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 4) {
                                    System.out.println(itensManualCondutaSetorial[3]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[3].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 5) {
                                    System.out.println(itensManualCondutaSetorial[4]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[4].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 6) {
                                    System.out.println(itensManualCondutaSetorial[5]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[5].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 7) {
                                    System.out.println(itensManualCondutaSetorial[6]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[6].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 8) {
                                    System.out.println(itensManualCondutaSetorial[7]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[7].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 9) {
                                    System.out.println(itensManualCondutaSetorial[8]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[8].observacoes = exemploEditado;

                                    }
                                } else if (escolha == 10) {
                                    System.out.println(itensManualCondutaSetorial[9]);

                                    System.out.print("Was möchten Sie bearbeiten? \n1 - Name \n2 - Beschreibung \n3 - Beispiel\n");
                                    int escolhaEditar = input.nextInt();

                                    if (escolhaEditar == 1) {
                                        System.out.print("Welchen Namen möchten Sie eingeben? \nGeben Sie hier ein: ");
                                        String nomeEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].nomeSetor = nomeEditado;
                                    } else if (escolhaEditar == 2) {
                                        System.out.print("Welche Beschreibung möchten Sie angeben? \nGeben Sie hier ein: ");
                                        String descricaoEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].condutaEsperada = descricaoEditado;
                                    } else {

                                        System.out.print("Welches Beispiel möchten Sie berichten? \nGeben Sie hier ein: ");
                                        String exemploEditado = input.nextLine();

                                        itensManualCondutaSetorial[9].observacoes = exemploEditado;

                                    }
                                }
                            }

                            break;

                        case 4:
                            System.out.println("\n\nGeben Sie an, welche Art von Beratung Sie ausschließen möchten: ");
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

                                System.out.println("\nWartungs- und Reparaturhandbuch erfolgreich gelöscht!");

                            } else if (categoria == 4) {

                                for (int i = 0; i < itensTesteDiagnostico.length; i++) {
                                    if (itensTesteDiagnostico[i] != null) {
                                        System.out.println(i + ": " + itensTesteDiagnostico[i].nomeProduto);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensTesteDiagnostico[escolhaExclusao] = null;

                                System.out.println("\nTest und Diagnose erfolgreich ausgeschlossen!");

                            } else if (categoria == 5) {

                                for (int i = 0; i < itensManualCondutaSetorial.length; i++) {
                                    if (itensManualCondutaSetorial[i] != null) {
                                        System.out.println(i + ": " + itensManualCondutaSetorial[i].nomeSetor);
                                    }
                                }

                                int escolhaExclusao = input.nextInt();

                                itensManualCondutaSetorial[escolhaExclusao] = null;

                                System.out.println("\nVerhaltenshandbuch der Industrie erfolgreich gelöscht!");

                            }

                    }

                } while (menuEscolha != 5);

                break;

            default:
                System.out.println("\n\nEscolha uma linguagem disponível, por favor.");

        }
    }
}