import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class ProjectJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] itensManualDeOperacao = new String[20],  itensManualCondutaSetorial = new String[20], itensProcedimentodeSeguranca = new String[20], itensTesteDiagnostico = new String[20], itensManutencaoReparo = new String[20];

        ManualDeOperacao manualMotor = new ManualDeOperacao();
        ManualDeOperacao manualGerador = new ManualDeOperacao();

        itensManualDeOperacao[0] = manualMotor.nomeProduto;
        itensManualDeOperacao[1] = manualGerador.nomeProduto;


        ProcedimentodeSeguranca procedimentoEletrico = new ProcedimentodeSeguranca();
        ProcedimentodeSeguranca procedimentoChoque = new ProcedimentodeSeguranca();

        itensProcedimentodeSeguranca[0] = procedimentoChoque.nomeProduto;
        itensProcedimentodeSeguranca[1] = procedimentoEletrico.nomeProduto;


        ManutencaoReparo manutencaoReparoMotorEletrico = new ManutencaoReparo();
        ManutencaoReparo manutencaoReparoTransformadores = new ManutencaoReparo();

        itensManutencaoReparo [0] = manutencaoReparoMotorEletrico.nomeProduto;
        itensManutencaoReparo [1] = manutencaoReparoTransformadores.nomeProduto;


        TesteDiagnostico testeDiagnosticoMotores = new TesteDiagnostico();
        TesteDiagnostico testeDiagnosticoFalhas = new TesteDiagnostico();

        itensTesteDiagnostico [0] = testeDiagnosticoMotores.nomeProduto;
        itensTesteDiagnostico [1] = testeDiagnosticoFalhas.nomeProduto;


        ManualCondutaSetorial manualCondutaSetorialMontagem = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorialManutencao = new ManualCondutaSetorial();

        itensManualCondutaSetorial [0] = manualCondutaSetorialMontagem.nomeSetor;
        itensManualCondutaSetorial [1] = manualCondutaSetorialManutencao.nomeSetor;


        manualMotor.setNomeProduto("Motores Elétricos WEG");
        manualMotor.setComoUsar("Antes de iniciar a operação do motor, verifique a integridade dos cabos de alimentação " +
                "e a conexão correta à rede elétrica. Aumente gradualmente a carga no motor para evitar picos de corrente no início da " +
                "operação. Monitore a temperatura do motor durante as primeiras horas de operação, especialmente em motores de alta potência.");
        manualMotor.setExemploPratico("Em motores WEG de indução, sempre verifique a configuração de partida (estrela-triângulo ou partida direta) conforme a especificação " +
                "do fabricante para evitar sobrecarga no momento da partida.\n");


        manualGerador.setNomeProduto("Operação de Geradores WEG");
        manualGerador.setComoUsar("Descrição: Certifique-se de que o gerador está corretamente instalado e com os níveis de óleo e combustível adequados. Durante a " +
                "operação, monitore constantemente os parâmetros de tensão e corrente. Evite sobrecarga, pois pode danificar o gerador e" +
                " reduzir a vida útil dos componentes.");
        manualGerador.setExemploPratico("Exemplo Prático: Para geradores WEG de maior capacidade, é recomendado o uso de sistemas de monitoramento remoto para verificar" +
                " a performance e o status dos componentes, como nível de combustível e temperatura.");



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



        // setar valores para manual de conduta
        manualCondutaSetorialMontagem.setNomeSetor("Conduta no Setor de Montagem");
        manualCondutaSetorialMontagem.setCondutaEsperada("No setor de montagem, os colaboradores devem seguir rigorosamente os procedimentos de segurança e as normas de qualidade da WEG. Devem garantir que as ferramentas e equipamentos estejam sempre em boas condições, realizando inspeções periódicas e manutenções preventivas.");
        manualCondutaSetorialMontagem.setObservacoes("Ao montar motores elétricos WEG, é fundamental verificar se as peças estão corretamente alinhadas e se todas as conexões elétricas estão firmemente apertadas, prevenindo falhas e retrabalho.");


        // setar valores para Procedimentos Operacionais
        manualCondutaSetorialManutencao.setNomeSetor("Procedimentos Operacionais no Setor de Manutenção");
        manualCondutaSetorialManutencao.setCondutaEsperada("Conduta Esperada:\n" +
                "No setor de manutenção, os técnicos devem seguir processos específicos de diagnóstico e reparo, sempre utilizando os EPIs adequados e ferramentas apropriadas. É obrigatório registrar todas as manutenções e trocas de componentes no sistema de gestão da empresa de forma precisa e atualizada.");
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


                                    System.out.println("Nome do Produto: " + itensManualDeOperacao[0]);


                                }


                                System.out.print("Digite aqui:");
                                escolha = input.nextInt();






                                if (escolha == 1) {


                                    System.out.println("Nome do Produto: " + manualMotor.nomeProduto);
                                    System.out.println("Como Usar: " + manualMotor.comoUsar);
                                    System.out.println("Exemplo Pratico: " + manualMotor.exemploPratico);


                                }


                                else if ( escolha == 2) {


                                    System.out.println("Nome do Produto: " + manualGerador.nomeProduto);
                                    System.out.println("Como Usar: " + manualGerador.comoUsar);
                                    System.out.println("Exemplo Pratico: " + manualGerador.exemploPratico);


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
