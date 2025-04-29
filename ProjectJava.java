import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class ProjectJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ManualDeOperacao [] itensManualDeOperacao = new ManualDeOperacao[20];
        ManualCondutaSetorial [] itensManualCondutaSetorial = new ManualCondutaSetorial[20];
        ProcedimentodeSeguranca [] itensProcedimentodeSeguranca = new ProcedimentodeSeguranca[20];
        TesteDiagnostico [] itensTesteDiagnostico = new TesteDiagnostico[20];
        ManutencaoReparo [] itensManutencaoReparo = new ManutencaoReparo[20];

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

        itensManutencaoReparo [0] = manutencaoReparoMotorEletrico;
        itensManutencaoReparo [1] = manutencaoReparoTransformadores;


        TesteDiagnostico testeDiagnosticoMotores = new TesteDiagnostico();
        TesteDiagnostico testeDiagnosticoFalhas = new TesteDiagnostico();

        itensTesteDiagnostico [0] = testeDiagnosticoMotores;
        itensTesteDiagnostico [1] = testeDiagnosticoFalhas;


        ManualCondutaSetorial manualCondutaSetorialMontagem = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorialManutencao = new ManualCondutaSetorial();

        itensManualCondutaSetorial [0] = manualCondutaSetorialMontagem;
        itensManualCondutaSetorial [1] = manualCondutaSetorialManutencao;

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

                    String[] menuOpcoes = {" 1- Cadastrar Orientação: ", " 2- Pesquisar Orientação: ", " 3- Editar Orientação: ",
                            " 4- Excluir Orientação: ", " 5- Sair: "};

                    switch (menuEscolha) {
                        case 1:
                            System.out.println(" Em qual orientação você deseja fazer um novo cadastro?  " + messages_pt.getString("cadastroOrientacoes"));
                            System.out.println("\nSua escolha: ");
                            int resposta = input.nextInt();


                            break;


                        case 2:
                            System.out.println(messages_pt.getString("categoriaOrientacoes"));
                            int categoria = input.nextInt();


                            if (categoria == 1) {

                                for ( int cont = 0; cont < itensManualDeOperacao.length; cont++) {

                                    if ( itensManualDeOperacao[cont] != null){

                                        System.out.println((cont+1) +  " - " +itensManualDeOperacao[cont].nomeProduto);

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

                                for ( int cont = 0; cont < itensProcedimentodeSeguranca.length; cont++) {

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

                                for ( int cont = 0; cont < itensManutencaoReparo.length; cont++) {
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
                            }
                            else if (categoria == 5) {
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
                              for ( int cont =0; cont < itensManutencaoReparo.length; cont++) {
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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[0].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[0].exemploPratico = exemploEditado;

                                  }

                              }
                              else if (escolha == 2) {
                                  System.out.println(itensManutencaoReparo[1]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManutencaoReparo[1].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[1].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[1].exemploPratico = exemploEditado;

                                  }

                              }

                              else if (escolha == 3) {
                                  System.out.println(itensManutencaoReparo[2]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManutencaoReparo[2].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[2].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[2].exemploPratico = exemploEditado;

                                  }

                              }
                              else if (escolha == 4) {
                                  System.out.println(itensManutencaoReparo[3]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManutencaoReparo[3].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[3].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[3].exemploPratico = exemploEditado;

                                  }
                              }
                              else if (escolha == 5) {
                                  System.out.println(itensManutencaoReparo[4]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManutencaoReparo[4].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[4].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[4].exemploPratico = exemploEditado;

                                  }
                              }
                              else if (escolha == 6) {
                                  System.out.println(itensManutencaoReparo[5]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManutencaoReparo[5].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[5].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[6].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[7].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[8].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManutencaoReparo[9].descricaoManutencao= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[9].exemploPratico = exemploEditado;

                                  }

                              }

                          }

                          else if ( categoria == 2 ){
                              for ( int cont =0; cont < itensProcedimentodeSeguranca.length; cont++) {
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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[0].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[0].exemploPratico = exemploEditado;

                                  }

                             }

                              else if (escolha == 2) {
                                  System.out.println(itensProcedimentodeSeguranca[1]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[1].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[1].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[1].exemploPratico = exemploEditado;

                                  }


                              }

                              else if ( categoria == 3 ){
                                  System.out.println(itensProcedimentodeSeguranca[2]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[2].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[2].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[2].exemploPratico = exemploEditado;

                                  }

                              }

                              else if ( categoria == 4 ){
                                  System.out.println(itensProcedimentodeSeguranca[3]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[3].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[3].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[3].exemploPratico = exemploEditado;

                                  }

                              }

                              else if (categoria == 5 ) {

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

                              }
                              else if (categoria == 6 ) {
                                  System.out.println(itensProcedimentodeSeguranca[5]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[5].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[5].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[5].exemploPratico = exemploEditado;

                                  }

                              }

                              else if (categoria == 7 ) {

                                  System.out.println(itensProcedimentodeSeguranca[6]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[6].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[6].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[6].exemploPratico = exemploEditado;

                                  }

                              }
                              else if ( categoria == 8 ) {

                                  System.out.println(itensProcedimentodeSeguranca[7]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[7].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[7].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[7].exemploPratico = exemploEditado;

                                  }

                              }
                              else if ( categoria == 9 ) {
                                  System.out.println(itensProcedimentodeSeguranca[8]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[8].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[8].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[8].exemploPratico = exemploEditado;

                                  }

                              }

                          }

                            break;


                        case 4:
                            System.out.println("\n\nDigite qual orientação você deseja excluir: ");




                            for (int i = 0; i < itensManualDeOperacao.length; i++) {
                                if(itensManualDeOperacao[i] != null){
                                    System.out.println(i + ": " + itensManualDeOperacao[i]);
                                }
                            }


                            int escolhaExclusao = input.nextInt();


                            itensManualDeOperacao[escolhaExclusao] = null;


                            System.out.println("\nManual de Operação excluído com êxito!");




                    }




                } while (menuEscolha != 5);
                break;


            case 3:
                Locale localeDE = new Locale("de", "DE");
                ResourceBundle messages_de = ResourceBundle.getBundle("messages", localeDE);


                do {
                    System.out.println(messages_de.getString("menu"));
                    System.out.println("\nSua escolha: ");
                    menuEscolha = input.nextInt();
                } while (menuEscolha != 5);


                break;


            default:
                System.out.println("\n\nEscolha uma linguagem disponível, por favor.");


        }




    }
}
