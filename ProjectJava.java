import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ProjectJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // objetos para a classe manual de operação
        ManualDeOperacao manualMotor = new ManualDeOperacao();
        ManualDeOperacao manualGerador = new ManualDeOperacao();

        String[] itensManualDeOperacao = new String[20];

        itensManualDeOperacao[0] = manualMotor.nomeProduto;
        itensManualDeOperacao[1] = manualGerador.nomeProduto;

        // objetos para a classe procedimentos de segurança
        ProcedimentodeSeguranca procedimentoEletrico = new ProcedimentodeSeguranca();
        ProcedimentodeSeguranca procedimentoChoque = new ProcedimentodeSeguranca();

        String[] itensProcedimentodeSeguranca = new String[20];

        itensProcedimentodeSeguranca[0] = procedimentoChoque.nomeProduto;
        itensProcedimentodeSeguranca[1] = procedimentoEletrico.nomeProduto;

        ManutencaoReparo manutencaoReparo01 = new ManutencaoReparo();
        ManutencaoReparo manutencaoReparo02 = new ManutencaoReparo();

        String [] itensManutencaoReparo = new String[20];

        itensManutencaoReparo [0] = manutencaoReparo01.nomeProduto;
        itensManutencaoReparo [1] = manutencaoReparo02.nomeProduto;

        TesteDiagnostico testeDiagnostico1 = new TesteDiagnostico();
        TesteDiagnostico testeDiagnostico2 = new TesteDiagnostico();

        String [] itensTesteDiagnostico = new String[20];

        itensTesteDiagnostico [0] = testeDiagnostico1.nomeProduto;
        itensTesteDiagnostico [1] = testeDiagnostico2.nomeProduto;

        ManualCondutaSetorial manualCondutaSetorial01 = new ManualCondutaSetorial();
        ManualCondutaSetorial manualCondutaSetorial2 = new ManualCondutaSetorial();

        String [] itensManualCondutaSetorial = new String[20];

        itensManualCondutaSetorial [0] = manualCondutaSetorial01.nomeSetor;
        itensManualCondutaSetorial [1] = manualCondutaSetorial2.nomeSetor;

        // setar valores para manualMotor
        manualMotor.setNomeProduto("Motores Elétricos WEG");
        manualMotor.setComoUsar("Antes de iniciar a operação do motor, verifique a integridade dos cabos de alimentação " +
                "e a conexão correta à rede elétrica. Aumente gradualmente a carga no motor para evitar picos de corrente no início da " +
                "operação. Monitore a temperatura do motor durante as primeiras horas de operação, especialmente em motores de alta potência.");
        manualMotor.setExemploPratico("Em motores WEG de indução, sempre verifique a configuração de partida (estrela-triângulo ou partida direta) conforme a especificação " +
                "do fabricante para evitar sobrecarga no momento da partida.\n");

        //setar valores para manualGerador
        manualGerador.setNomeProduto("Operação de Geradores WEG");
        manualGerador.setComoUsar("Descrição: Certifique-se de que o gerador está corretamente instalado e com os níveis de óleo e combustível adequados. Durante a " +
                "operação, monitore constantemente os parâmetros de tensão e corrente. Evite sobrecarga, pois pode danificar o gerador e" +
                " reduzir a vida útil dos componentes.");
        manualGerador.setExemploPratico("Exemplo Prático: Para geradores WEG de maior capacidade, é recomendado o uso de sistemas de monitoramento remoto para verificar" +
                " a performance e o status dos componentes, como nível de combustível e temperatura.");

        // setar valores para Procedimentoeletrico
        procedimentoEletrico.setNomeProduto("");
        procedimentoEletrico.setComoUsar("");
        procedimentoEletrico.setExemploPratico("");

        // setar valores para procedimentosChoque
        procedimentoChoque.setNomeProduto("");
        procedimentoEletrico.setComoUsar("");
        procedimentoChoque.setExemploPratico("");

        String orientacaoPT[] = {

        };
        String orientacaoUS[] = {

        };
        String orientacaoDE[] = {

        };

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

                            break;

                        case 2:
                            System.out.println("1-Manual de operação\n 2-Procedimento de Segurança \n 3-Manutenção e Reparos " +
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

                            while(itensManualDeOperacao != null){
                                for (int i = 0; i <= itensManualDeOperacao.length; i++) {
                                    System.out.println(i);
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