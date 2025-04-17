
    public class MotoresPortao {

        private String marca;
        private String modelo;
        private String NumerodeSerie;
        private String tipoMotor;
        private String dataInstalacao;

        public MotoresPortao() {
            this.marca = "WEG";
            this.modelo = "IC410 - TFSV - B14E";
            this.NumerodeSerie = "12";
            this.tipoMotor = "C";
            this.dataInstalacao = "2020-01-11";


        }



        public void ImprimirMotores() {


            System.out.println("DOCUMENTAÇÃO SOBRE MANUTENÇÃO DE MOTORES \n ");

            System.out.println("Especificações do motor: \n ");


            System.out.println("Marca: " + marca );
            System.out.println("modelo: "+modelo );
            System.out.println("Numero de serie: " + NumerodeSerie );
            System.out.println("Tipo do motor: " + tipoMotor );
            System.out.println("Data instalação: " + dataInstalacao );


            System.out.println("Cronograma de manutenção \n");

            System.out.println("SEMANALMENTE: \n" +
                    "-Verificar funcionamento geral do motor e abertura/fechamento do portão.\n" +
                    "-Verificar se há objetos ou sujeira no trilho ou cremalheira\n" +
                    "-Verificar ruídos anormais ou trepidações\n");

            System.out.println("MENSALMENTE: \n" +
                    "-Limpeza geral da parte externa do motor e painel de controle\n" +
                    "-Testar fim de curso (se o portão para corretamente)\n" +
                    "-Checar cremalheira ou trilho por desgaste ou oxidação\n");

            System.out.println("TRIMESTRALMENTE: \n" +
                    "-Testar tempo de abertura/fechamento e alinhamento do portão\n" +
                    "-Testar a força do motor e fazer ajuste, se necessário\n");

            System.out.println("ANUALMENTE: \n  " +
                    "-Substituição preventiva do capacitor (se muito antigo)\n" +
                    "-Verificação e limpeza da placa eletrônica do motor\n" +
                    "-Revisão completa do motor e redutor (engrenagens internas)\n");




            System.out.println("FERRAMENTAS UTILIZADAS:  \n " +
                    "-Extratores de Rolamentos\n" +
                    "-Chaves de Torque\n" +
                    "-Análise de vibrações\n" +
                    "-Weg Motor Scan\n" +
                    "-Weg Motion Fleet Management\n" +
                    "-Alinhadores a Laser\n" +
                    "-Multímetros e Alicates amperímetros\n" +
                    "-Testadores de resistência de enrolamentos\n");




            System.out.println("ETAPAS: \n" +
                    "-Medir resistência de isolamento com megômetro\n" +
                    "-Verificar tensão e corrente em carga\n" +
                    "-Checar aquecimento de enrolamentos\n");

        }








    }


