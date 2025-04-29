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

        manualMotor.setNomeProduto("Motores Elétricos WEG");
        manualMotor.setComoUsar("Antes de iniciar a operação do motor, verifique a integridade dos cabos de alimentação e a conexão correta à rede elétrica. Aumente gradualmente a carga no motor para evitar picos de corrente no início da operação. Monitore a temperatura do motor durante as primeiras horas de operação, especialmente em motores de alta potência.");
        manualMotor.setExemploPratico("Em motores WEG de indução, sempre verifique a configuração de partida (estrela-triângulo ou partida direta) conforme a especificação do fabricante para evitar sobrecarga no momento da partida.\n");


        manualGerador.setNomeProduto("Operação de Geradores WEG");
        manualGerador.setComoUsar("Descrição: Certifique-se de que o gerador está corretamente instalado e com os níveis de óleo e combustível adequados. Durante a operação, monitore constantemente os parâmetros de tensão e corrente. Evite sobrecarga, pois pode danificar o gerador e reduzir a vida útil dos componentes.");
        manualGerador.setExemploPratico("Exemplo Prático: Para geradores WEG de maior capacidade, é recomendado o uso de sistemas de monitoramento remoto para verificar a performance e o status dos componentes, como nível de combustível e temperatura.");

        procedimentoEletrico.setNomeProduto("Procedimento de Segurança para Instalação de Equipamentos Elétricos");
        procedimentoEletrico.setComoUsar("Descrição: Antes de iniciar a instalação de qualquer equipamento elétrico, como motores e transformadores WEG, desconecte toda a alimentação elétrica e realize o aterramento adequado. Utilize ferramentas isoladas e verifique o ambiente quanto à presença de materiais inflamáveis ou risco de curto-circuito.");
        procedimentoEletrico.setExemploPratico("Exemplo Prático: Durante a instalação de um transformador WEG, garanta que o painel de controle esteja devidamente identificado e sinalizado para evitar conexões erradas que possam causar falhas no sistema.");

        procedimentoChoque.setNomeProduto("Operações com Risco de Choque Elétrico");
        procedimentoEletrico.setComoUsar("Descrição: Sempre use equipamentos de proteção individual (EPIs) adequados, como luvas isolantes e botas de segurança, antes de realizar qualquer manutenção ou inspeção em equipamentos energizados. Durante a operação de equipamentos de alta tensão, siga os procedimentos de bloqueio e etiquetagem (LOTO) para garantir que o sistema esteja desligado.");
        procedimentoChoque.setExemploPratico("Exemplo Prático: No caso de manutenção de transformadores WEG de alta tensão, desconecte a alimentação elétrica, utilize chaves de bloqueio e verifique com um multímetro a ausência de tensão nos terminais.");

        manutencaoReparoMotorEletrico.setNomeProduto("Manutenção de Motores Elétricos");
        manutencaoReparoMotorEletrico.setDescricaoManutencao("Descrição: Realize inspeções regulares nos rolamentos, verificando ruídos anormais ou aquecimento excessivo. Lubrifique os rolamentos conforme as instruções do fabricante e substitua-os se necessário. Verifique a conexão dos terminais elétricos e a presença de sinais de desgaste ou corrosão.");
        manutencaoReparoMotorEletrico.setExemploPratico("Exemplo Prático: Para motores WEG, recomenda-se a realização de manutenção preventiva a cada 1.000 horas de operação, incluindo a verificação do alinhamento do motor e o teste de resistência do isolamento.");

        manutencaoReparoTransformadores.setNomeProduto("Reparo de Transformadores");
        manutencaoReparoTransformadores.setDescricaoManutencao("Descrição: Quando realizar reparos em transformadores WEG, sempre faça uma análise cuidadosa da situação de cada componente, como bobinas e buchas. Caso haja falha nas buchas ou nos isoladores, substitua-os imediatamente. Em caso de curto-circuito no interior do transformador, realize testes de resistência de isolamento e verifique o nível de óleo.");
        manutencaoReparoTransformadores.setExemploPratico("Exemplo Prático: Se um transformador WEG apresentar aquecimento excessivo, além de verificar o nível de óleo, examine o radiador e limpe as ventoinhas para garantir uma boa dissipação de calor.");

        testeDiagnosticoMotores.setNomeProduto("Testes de Funcionamento de Motores");
        testeDiagnosticoMotores.setDescricaoDiagnostico("Descrição: Para garantir que o motor WEG está operando corretamente, execute testes de partida em vazio, monitorando a corrente elétrica e a rotação. Após a operação, verifique a temperatura do motor e as vibrações para identificar possíveis falhas mecânicas.");
        testeDiagnosticoMotores.setexemploPratico("Exemplo Prático: Durante os testes de carga, monitore a eficiência do motor e se a corrente está dentro dos parâmetros especificados pelo fabricante para evitar danos ao equipamento");

        testeDiagnosticoFalhas.setNomeProduto("Diagnóstico de Falhas em Sistemas de Automação");
        testeDiagnosticoFalhas.setDescricaoDiagnostico("Descrição: No diagnóstico de falhas em sistemas de automação da WEG, como controladores e inversores de frequência, utilize ferramentas de diagnóstico de comunicação como modbus ou ethernet para verificar possíveis falhas de comunicação. Revise os logs de erros e teste os sensores e atuadores para garantir que todos os sistemas estão funcionando corretamente.");
        testeDiagnosticoFalhas.setexemploPratico("Exemplo Prático: Para sistemas de automação WEG com inversores de frequência, execute um teste de carga variável para identificar falhas em processos de controle de velocidade e torque.");

        manualCondutaSetorialMontagem.setNomeSetor("Conduta no Setor de Montagem");
        manualCondutaSetorialMontagem.setCondutaEsperada("No setor de montagem, os colaboradores devem seguir rigorosamente os procedimentos de segurança e as normas de qualidade da WEG. Devem garantir que as ferramentas e equipamentos estejam sempre em boas condições, realizando inspeções periódicas e manutenções preventivas.");
        manualCondutaSetorialMontagem.setObservacoes("Ao montar motores elétricos WEG, é fundamental verificar se as peças estão corretamente alinhadas e se todas as conexões elétricas estão firmemente apertadas, prevenindo falhas e retrabalho.");

        manualCondutaSetorialManutencao.setNomeSetor("Procedimentos Operacionais no Setor de Manutenção");
        manualCondutaSetorialManutencao.setCondutaEsperada("Conduta Esperada: No setor de manutenção, os técnicos devem seguir processos específicos de diagnóstico e reparo, sempre utilizando os EPIs adequados e ferramentas apropriadas. É obrigatório registrar todas as manutenções e trocas de componentes no sistema de gestão da empresa de forma precisa e atualizada.");
        manualCondutaSetorialManutencao.setObservacoes(" Durante a manutenção de um inversor de frequência WEG, o técnico deve inspecionar cuidadosamente os componentes eletrônicos internos (como resistores e capacitores) e realizar testes de isolamento, assegurando a integridade e segurança do equipamento. ");

        int escolha, menuEscolha = 0;


        System.out.println("\nEscolha o idioma que você deseja: \n");
        System.out.println("EN-US\t\tPT-BR\t\tDE-DE");
        System.out.println("  1\t\t  2\t\t  3");
        escolha = input.nextInt();


        switch (escolha) {


            case 1:
                Locale localeEN = new Locale("en", "US");
                ResourceBundle messages_en = ResourceBundle.getBundle("messages", localeEN);


                do {


                    System.out.println(messages_en.getString("menu"));
                    System.out.println("\nSua escolha: ");
                    menuEscolha = input.nextInt();




                } while (menuEscolha != 5);


                break;


            case 2:
                Locale localePT = new Locale("pt", "BR");
                ResourceBundle messages_pt = ResourceBundle.getBundle("messages", localePT);


                do {


                    System.out.println(messages_pt.getString("menu"));
                    System.out.println("\nSua escolha: ");
                    menuEscolha = input.nextInt();

                    String[] menuOpcoes = {" 1- Cadastrar Orientação: ", " 2- Pesquisar Orientação: ", " 3- Editar Orientação: ",
                            " 4- Excluir Orientação: ", " 5- Sair: "};

                    switch (menuEscolha) {
                        case 1:
                            System.out.println(" Em qual orientação você deseja fazer um novo cadastro?  " + messages_pt.getString("Orientacoes"));
                            int resposta = input.nextInt();


                            break;


                        case 2:
                            System.out.println("1-Manual de operação \n 2-Procedimento de Segurança \n 3-Manutenção e Reparos " +
                                    "\n 4-Testes e Diagnóstico \n 5-Manual de Conduta e Operações Setoriais  ");
                            int categoria = input.nextInt();


                            if (categoria == 1) {

                                for ( int cont = 0; cont < itensManualDeOperacao.length; cont++) {

                                    if ( itensManualDeOperacao[cont] != null){

                                        System.out.println((cont+1) +  " - " +itensManualDeOperacao[cont].nomeProduto);

                                    }

                                }

                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();


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

                            }

                            else if (categoria == 4) {
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
                              for ( int cont =0; cont < itensManualDeOperacao.length; cont++) {
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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[0].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[0].exemploPratico = exemploEditado;

                                  }

                              }
                              else if (escolha == 2) {
                                  System.out.println(itensManualDeOperacao[1]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualDeOperacao[1].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[1].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[1].exemploPratico = exemploEditado;

                                  }

                              }

                              else if (escolha == 3) {
                                  System.out.println(itensManualDeOperacao[2]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualDeOperacao[2].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[2].comoUsar = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[2].exemploPratico = exemploEditado;

                                  }

                              }
                              else if (escolha == 4) {
                                  System.out.println(itensManualDeOperacao[3]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualDeOperacao[3].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[3].comoUsar = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[3].exemploPratico = exemploEditado;

                                  }
                              }
                              else if (escolha == 5) {
                                  System.out.println(itensManualDeOperacao[4]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualDeOperacao[4].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[4].comoUsar = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[4].exemploPratico = exemploEditado;

                                  }
                              }
                              else if (escolha == 6) {
                                  System.out.println(itensManualDeOperacao[5]);

                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualDeOperacao[5].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[5].comoUsar = descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[6].comoUsar = descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[7].comoUsar = descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[8].comoUsar = descricaoEditado;
                                  }

                                  else {

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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualDeOperacao[9].comoUsar = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualDeOperacao[9].exemploPratico = exemploEditado;

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

                              else if ( categoria == 10 ) {
                                  System.out.println(itensProcedimentodeSeguranca[9]);


                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[9].nomeProduto = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[9].comoUsar= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensProcedimentodeSeguranca[9].exemploPratico = exemploEditado;

                                  }

                              }

                          }

                          else if ( categoria == 3 ) {
                              for ( int cont =0; cont < itensManutencaoReparo.length; cont++) {
                                  if (itensManutencaoReparo[cont] != null) {
                                      System.out.println(itensManutencaoReparo[cont].nomeProduto);
                                  }
                              }

                              System.out.print("Qual item deseja editar? \nDigite aqui:");
                              escolha = input.nextInt();

                              if ( escolha == 1 ) {
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

                              else if (escolha == 2 ){
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

                              else if ( escolha == 3 ) {
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

                                      itensManutencaoReparo[2].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[2].exemploPratico = exemploEditado;

                                  }
                              }

                              else if ( escolha == 4 ) {

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

                                      itensManutencaoReparo[3].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[3].exemploPratico = exemploEditado;

                                  }
                              }

                              else if ( escolha == 5 ) {
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

                              else if ( escolha == 6 ) {
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
                              }

                              else if ( escolha == 7 ) {
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

                                      itensManutencaoReparo[6].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[6].exemploPratico = exemploEditado;

                                  }
                              }

                              else if ( escolha == 8 ){
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

                                      itensManutencaoReparo[7].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[7].exemploPratico = exemploEditado;

                                  }
                              }

                              else if ( escolha == 9 ) {

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

                                      itensManutencaoReparo[8].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo [8].exemploPratico = exemploEditado;

                                  }
                              }

                              else if ( escolha == 10 ) {
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

                                      itensManutencaoReparo[9].descricaoManutencao = descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManutencaoReparo[9].exemploPratico = exemploEditado;

                                  }
                              }

                          }
                          else if (categoria == 4 ) {
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

                              }



                          else if (escolha == 4) {
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
                          }

                          else if ( categoria == 5 ){
                              for ( int cont =0; cont < itensManualCondutaSetorial.length; cont++) {
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
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[0].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[0].observacoes = exemploEditado;

                                  }
                              }

                              else if (escolha == 2 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[1].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[1].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[1].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 3 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[2].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[2].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[2].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 4 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[3].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[3].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[3].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 5 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[4].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[4].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[4].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 6 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[5].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[5].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[5].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 7 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[6].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[6].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[6].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 8 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[7].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[7].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[7].observacoes = exemploEditado;

                                  }
                              }

                              else if ( escolha == 9 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[8].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[8].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[8].observacoes = exemploEditado;

                                  }
                              }

                              else if (escolha == 10 ){
                                  System.out.print("O que deseja editar? \n1 - Nome \n2 - Descrição \n3 - Exemplo");
                                  int escolhaEditar = input.nextInt();

                                  if (escolhaEditar == 1) {
                                      System.out.print("Qual o Nome que Deseja Informar? \nDigite aqui:");
                                      String nomeEditado = input.nextLine();

                                      itensManualCondutaSetorial[9].nomeSetor = nomeEditado;
                                  }

                                  else if (escolhaEditar == 2) {
                                      System.out.print("Qual a Descrição que Deseja Informar ? \nDigite aqui:");
                                      String descricaoEditado = input.nextLine();

                                      itensManualCondutaSetorial[9].condutaEsperada= descricaoEditado;
                                  }

                                  else {

                                      System.out.print("Qual o Exemplo que Deseja Informar? \nDigite aqui: ");
                                      String exemploEditado = input.nextLine();

                                      itensManualCondutaSetorial[9].observacoes = exemploEditado;

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
