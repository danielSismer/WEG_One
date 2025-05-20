package net.weg.apresentation;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;






public class OpcoesDoMenu {




    private JFrame TelaMenu;




    public void ClickCadastrar() {




        JFrame TelaCadastrar = new JFrame("Sistema com Menu Lateral");
        TelaCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaCadastrar.setSize(900, 600);
        TelaCadastrar.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaCadastrar.setLayout(null);
        TelaCadastrar.setVisible(true);


        JPanel painelFundo2 = new JPanel();
        painelFundo2.setLayout(null);
        painelFundo2.setBackground(Color.WHITE);
        painelFundo2.setBounds(0, 0, 1920, 1080);
        TelaCadastrar.add(painelFundo2);


        JPanel painelCadastrarOrientacao = new JPanel();
        painelCadastrarOrientacao.setLayout(null);
        painelCadastrarOrientacao.setBackground(new Color(0, 87, 156));
        painelCadastrarOrientacao.setBounds(235, 200, 1450, 700);
        painelFundo2.add(painelCadastrarOrientacao);


        JLabel labelTitulo = new JLabel("Criar Orientação:");
        labelTitulo.setForeground(Color.WHITE);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        labelTitulo.setBounds(30, 30, 200, 30);
        painelFundo2.add(labelTitulo);
        labelTitulo.setVisible(false);


        JLabel msgmCadastrar = new JLabel("Titulo da Orientação:");
        msgmCadastrar.setForeground(Color.WHITE);
        msgmCadastrar.setFont(new Font("Arial", Font.BOLD, 25));
        msgmCadastrar.setBounds(60, 60, 400, 30);
        painelCadastrarOrientacao.add(msgmCadastrar);


        JTextField campoCadastrar = new JTextField();
        campoCadastrar.setBounds(60, 100, 640, 50);
        campoCadastrar.setFont(new Font("Arial", Font.BOLD, 25));
        painelCadastrarOrientacao.add(campoCadastrar);


        JTextField campoTipoDePasta = new JTextField();
        campoTipoDePasta.setBounds(750, 100, 240, 50);
        campoTipoDePasta.setFont(new Font("Arial", Font.BOLD, 25));
        painelCadastrarOrientacao.add(campoTipoDePasta);

        JLabel LabelTipoPasta = new JLabel("Digite o id do tipo de Orientação:");
        LabelTipoPasta.setForeground(Color.WHITE);
        LabelTipoPasta.setFont(new Font("Arial", Font.BOLD, 25));
        LabelTipoPasta.setBounds(750, 60, 400, 30);
        painelCadastrarOrientacao.add(LabelTipoPasta);

        JLabel labelDescricao = new JLabel("Descrição:");
        labelDescricao.setForeground(Color.WHITE);
        labelDescricao.setFont(new Font("Arial", Font.BOLD, 25));
        labelDescricao.setBounds(60, 200, 400, 30);
        painelCadastrarOrientacao.add(labelDescricao);


        JLabel labelExemploPratico = new JLabel("Exemplo Prático:");
        labelExemploPratico.setForeground(Color.WHITE);
        labelExemploPratico.setFont(new Font("Arial", Font.BOLD, 25));
        labelExemploPratico.setBounds(750, 200, 400, 30);
        painelCadastrarOrientacao.add(labelExemploPratico);


        JTextArea campoCadastrarDescricao = new JTextArea();
        campoCadastrarDescricao.setFont(new Font("Arial", Font.BOLD, 17));
        campoCadastrarDescricao.setLineWrap(true);
        campoCadastrarDescricao.setWrapStyleWord(true);
        campoCadastrarDescricao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JScrollPane rolagem = new JScrollPane(campoCadastrarDescricao);
        rolagem.setBounds(60, 240, 640, 240);
        painelCadastrarOrientacao.add(rolagem);




        JTextArea campoCadastrarExemploPratico = new JTextArea();
        campoCadastrarExemploPratico.setFont(new Font("Arial", Font.BOLD, 17));
        campoCadastrarExemploPratico.setLineWrap(true);
        campoCadastrarExemploPratico.setWrapStyleWord(true);
        campoCadastrarExemploPratico.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JScrollPane rolagem2 = new JScrollPane(campoCadastrarExemploPratico);
        rolagem2.setBounds(750, 240, 640, 240);
        painelCadastrarOrientacao.add(rolagem2);




        ArredondamentoDeBotao botaoCadastrarOrientacao = new ArredondamentoDeBotao("Cadastrar Orientação",6);
        botaoCadastrarOrientacao.setFont(new Font("Arial", Font.BOLD, 20));
        botaoCadastrarOrientacao.setBounds(570, 550, 340, 65);
        painelCadastrarOrientacao.add(botaoCadastrarOrientacao);


        botaoCadastrarOrientacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tituloSQL = campoCadastrar.getText();
                String descricaoSQL = campoCadastrarDescricao.getText();
                String exemploSQL = campoCadastrarExemploPratico.getText();
                String TipoPastaSQL = campoTipoDePasta.getText();

                try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {

                    String sql = "INSERT INTO orientacoes (titulo, descricao, exemplo, tipo_id) VALUES (?,?,?,?)";
                    PreparedStatement stmt = conexao.prepareStatement(sql);

                    stmt.setString(1, tituloSQL);
                    stmt.setString(2, descricaoSQL);
                    stmt.setString(3, exemploSQL);
                    stmt.setString(4, TipoPastaSQL);


                    int linhasAfetadas = stmt.executeUpdate();

                    if (linhasAfetadas > 0) {
                        JOptionPane.showMessageDialog(null, "Orientação cadastrada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar orientação.");
                    }

                    stmt.close();

                } catch (SQLException f) {
                    f.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + f.getMessage());
                }
            }
        });





        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBounds(0, 0, 1920, 80);
        painelFundo2.add(headerPanel);


        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);
        botaoIdioma.setBorderPainted(false);
        botaoIdioma.setFocusPainted(false);


        JButton botaoVoltar = new JButton("◀️");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 25));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setForeground(Color.WHITE);
        botaoVoltar.setBorderPainted(false);
        botaoVoltar.setFocusPainted(false);




        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                TelaCadastrar.setVisible(false);




            }
        });




        headerPanel.add(botaoVoltar);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoIdioma);






    }


    public void ClickPesquisar() {


            JFrame TelaPesquisar = new JFrame("Sistema com Menu Lateral");
            TelaPesquisar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            TelaPesquisar.setSize(900, 600);
            TelaPesquisar.setExtendedState(JFrame.MAXIMIZED_BOTH);
            TelaPesquisar.setLayout(new BorderLayout());




            JPanel menuLateral = new JPanel();
            menuLateral.setBackground(new Color(0, 87, 156));
            menuLateral.setLayout(null);
            menuLateral.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));




            ArredondamentoDeBotao fecharMenu = new ArredondamentoDeBotao("☰",6);
            fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
            fecharMenu.setFocusPainted(false);
            fecharMenu.setBackground(new Color(0, 87, 156));
            fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            fecharMenu.setForeground(Color.WHITE);
            fecharMenu.setBounds(9, 19, 50, 30);
            fecharMenu.setVisible(true);
            menuLateral.add(fecharMenu);




            JPanel painelCentral = new JPanel();
            painelCentral.setBackground(new Color(255, 255, 255));
            painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
            painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);
            painelCentral.setVisible(true);


            painelCentral.add(Box.createVerticalGlue());


            ArredondamentoDeBotao pasta1 = new ArredondamentoDeBotao("Manual de Operação",6);
            pasta1.setMaximumSize(new Dimension(180, 50));
            pasta1.setFont(new Font("Arial", Font.BOLD, 14));
            pasta1.setFocusPainted(false);
            pasta1.setBackground(new Color(52, 152, 219));
            pasta1.setForeground(Color.WHITE);
            pasta1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            pasta1.setBounds(14, 69, 240, 50);
            menuLateral.add(pasta1);




            pasta1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {




                    JPanel menuLateral1 = new JPanel();
                    menuLateral1.setBackground(new Color(0, 87, 156));
                    menuLateral1.setLayout(new BoxLayout(menuLateral1, BoxLayout.Y_AXIS));
                    menuLateral1.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));




                    TelaPesquisar.add(menuLateral1, BorderLayout.WEST);
                    menuLateral.setVisible(false);




                    menuLateral1.add(Box.createVerticalStrut(69));




                    ArrayList<Orientacao> orientacoes1 = new ArrayList<>();




                    try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                        String sql = "SELECT titulo, descricao, exemplo FROM orientacoes WHERE tipo_id = 1";
                        PreparedStatement stmt = conexao.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();




                        while (rs.next()) {
                            String titulo1 = rs.getString("titulo");
                            String descricao1 = rs.getString("descricao");
                            String exemplo1 = rs.getString("exemplo");
                            orientacoes1.add(new Orientacao(titulo1, descricao1, exemplo1));
                        }




                        rs.close();
                        stmt.close();
                    } catch (SQLException f) {
                        f.printStackTrace();
                    }




                    JLabel tituloPasta1 = new JLabel("");
                    tituloPasta1.setHorizontalAlignment(SwingConstants.CENTER);
                    tituloPasta1.setVerticalAlignment(SwingConstants.TOP);
                    tituloPasta1.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel mensagem1 = new JLabel("");
                    mensagem1.setHorizontalAlignment(SwingConstants.CENTER);
                    mensagem1.setVerticalAlignment(SwingConstants.TOP);
                    mensagem1.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel exemplo1 = new JLabel("");
                    exemplo1.setHorizontalAlignment(SwingConstants.CENTER);
                    exemplo1.setVerticalAlignment(SwingConstants.TOP);
                    exemplo1.setAlignmentX(Component.CENTER_ALIGNMENT);


                    painelCentral.removeAll();
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(tituloPasta1);
                    painelCentral.add(Box.createVerticalStrut(10));
                    painelCentral.add(mensagem1);
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(exemplo1);
                    painelCentral.revalidate();
                    painelCentral.repaint();




                    for (Orientacao orientacao : orientacoes1) {
                        ArredondamentoDeBotao botao = new ArredondamentoDeBotao(orientacao.getTitulo(),6);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(245, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);
                        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral1.add(botao);
                        menuLateral1.add(Box.createVerticalStrut(15));




                        botao.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                tituloPasta1.setText("<html><body style='width: 700px'>" + orientacao.getTitulo() + "</body></html>");
                                tituloPasta1.setFont(new Font("Arial", Font.BOLD, 22));
                                tituloPasta1.setAlignmentX(Component.CENTER_ALIGNMENT);
                                tituloPasta1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                tituloPasta1.setBackground(Color.WHITE);
                                tituloPasta1.setVisible(true);


                                mensagem1.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                                mensagem1.setFont(new Font("Arial", Font.BOLD, 22));
                                mensagem1.setAlignmentX(Component.CENTER_ALIGNMENT);
                                mensagem1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                mensagem1.setBackground(Color.WHITE);
                                mensagem1.setVisible(true);


                                exemplo1.setText("<html><body style='width: 700px'>" + orientacao.getExemplo() + "</body></html>");
                                exemplo1.setFont(new Font("Arial", Font.BOLD, 22));
                                exemplo1.setAlignmentX(Component.CENTER_ALIGNMENT);
                                exemplo1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                exemplo1.setBackground(Color.WHITE);
                                exemplo1.setVisible(true);




                            }
                        });
                    }




                    menuLateral1.add(Box.createVerticalStrut(750));
                    ArredondamentoDeBotao botaoRetornar = new ArredondamentoDeBotao("Retornar",6);
                    botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botaoRetornar.setMaximumSize(new Dimension(245, 50));
                    botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                    botaoRetornar.setFocusPainted(false);
                    botaoRetornar.setBackground(new Color(52, 152, 219));
                    botaoRetornar.setForeground(Color.WHITE);
                    botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral1.add(botaoRetornar);








                    botaoRetornar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            menuLateral1.setVisible(false);
                            menuLateral.setVisible(true);
                            mensagem1.setVisible(false);
                            painelCentral.removeAll();


                        }




                    });
                }
            });




            ArredondamentoDeBotao pasta2 = new ArredondamentoDeBotao("Procedimento de Segurança",6);
            pasta2.setMaximumSize(new Dimension(180, 50));
            pasta2.setFont(new Font("Arial", Font.BOLD, 14));
            pasta2.setFocusPainted(false);
            pasta2.setBackground(new Color(52, 152, 219));
            pasta2.setForeground(Color.WHITE);
            pasta2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            pasta2.setBounds(14, 134, 240, 50);
            menuLateral.add(pasta2);




            pasta2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {




                    JPanel menuLateral2 = new JPanel();
                    menuLateral2.setBackground(new Color(0, 87, 156));
                    menuLateral2.setLayout(new BoxLayout(menuLateral2, BoxLayout.Y_AXIS));
                    menuLateral2.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));




                    TelaPesquisar.getContentPane().add(menuLateral2, BorderLayout.WEST);
                    TelaPesquisar.revalidate();
                    TelaPesquisar.repaint();
                    menuLateral.setVisible(false);




                    menuLateral2.add(Box.createVerticalStrut(69));




                    ArrayList<Orientacao> orientacoes2 = new ArrayList<>();




                    try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                        String sql = "SELECT titulo, descricao, exemplo FROM orientacoes WHERE tipo_id = 2";
                        PreparedStatement stmt = conexao.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();




                        while (rs.next()) {
                            String titulo2 = rs.getString("titulo");
                            String descricao2 = rs.getString("descricao");
                            String exemplo2 = rs.getString("exemplo");
                            orientacoes2.add(new Orientacao(titulo2, descricao2, exemplo2));
                        }




                        rs.close();
                        stmt.close();
                    } catch (SQLException f) {
                        f.printStackTrace();
                    }




                    JLabel tituloPasta2 = new JLabel("");
                    tituloPasta2.setHorizontalAlignment(SwingConstants.CENTER);
                    tituloPasta2.setVerticalAlignment(SwingConstants.TOP);
                    tituloPasta2.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel mensagem2 = new JLabel("");
                    mensagem2.setHorizontalAlignment(SwingConstants.CENTER);
                    mensagem2.setVerticalAlignment(SwingConstants.TOP);
                    mensagem2.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel exemplo2 = new JLabel("");
                    exemplo2.setHorizontalAlignment(SwingConstants.CENTER);
                    exemplo2.setVerticalAlignment(SwingConstants.TOP);
                    exemplo2.setAlignmentX(Component.CENTER_ALIGNMENT);


                    painelCentral.removeAll();
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(tituloPasta2);
                    painelCentral.add(Box.createVerticalStrut(10));
                    painelCentral.add(mensagem2);
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(exemplo2);
                    painelCentral.revalidate();
                    painelCentral.repaint();


                    for (Orientacao orientacao : orientacoes2) {
                        ArredondamentoDeBotao botao = new ArredondamentoDeBotao(orientacao.getTitulo(),6);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(245, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);
                        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral2.add(botao);
                        menuLateral2.add(Box.createVerticalStrut(15));


                        botao.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                tituloPasta2.setText("<html><body style='width: 700px'>" + orientacao.getTitulo() + "</body></html>");
                                tituloPasta2.setFont(new Font("Arial", Font.BOLD, 22));
                                tituloPasta2.setAlignmentX(Component.CENTER_ALIGNMENT);
                                tituloPasta2.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                tituloPasta2.setBackground(Color.WHITE);
                                tituloPasta2.setVisible(true);


                                mensagem2.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                                mensagem2.setFont(new Font("Arial", Font.BOLD, 22));
                                mensagem2.setAlignmentX(Component.CENTER_ALIGNMENT);
                                mensagem2.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                mensagem2.setBackground(Color.WHITE);
                                mensagem2.setVisible(true);


                                exemplo2.setText("<html><body style='width: 700px'>" + orientacao.getExemplo() + "</body></html>");
                                exemplo2.setFont(new Font("Arial", Font.BOLD, 22));
                                exemplo2.setAlignmentX(Component.CENTER_ALIGNMENT);
                                exemplo2.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                exemplo2.setBackground(Color.WHITE);
                                exemplo2.setVisible(true);


                            }
                        });
                    }




                    menuLateral2.add(Box.createVerticalStrut(750));
                    ArredondamentoDeBotao botaoRetornar2 = new ArredondamentoDeBotao("Retornar",6);
                    botaoRetornar2.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botaoRetornar2.setMaximumSize(new Dimension(245, 50));
                    botaoRetornar2.setFont(new Font("Arial", Font.BOLD, 14));
                    botaoRetornar2.setFocusPainted(false);
                    botaoRetornar2.setBackground(new Color(52, 152, 219));
                    botaoRetornar2.setForeground(Color.WHITE);
                    botaoRetornar2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral2.add(botaoRetornar2);








                    botaoRetornar2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            menuLateral2.setVisible(false);
                            menuLateral.setVisible(true);
                            mensagem2.setVisible(false);
                            painelCentral.removeAll();


                        }




                    });




                }
            });




            ArredondamentoDeBotao pasta3 = new ArredondamentoDeBotao("Manutenção e Reparos",6);
            pasta3.setAlignmentX(Component.CENTER_ALIGNMENT);
            pasta3.setMaximumSize(new Dimension(180, 50));
            pasta3.setFont(new Font("Arial", Font.BOLD, 14));
            pasta3.setFocusPainted(false);
            pasta3.setBackground(new Color(52, 152, 219));
            pasta3.setForeground(Color.WHITE);
            pasta3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            pasta3.setBounds(14, 199, 240, 50);
            menuLateral.add(pasta3);




            pasta3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {




                    JPanel menuLateral3 = new JPanel();
                    menuLateral3.setBackground(new Color(0, 87, 156));
                    menuLateral3.setLayout(new BoxLayout(menuLateral3, BoxLayout.Y_AXIS));
                    menuLateral3.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                    TelaPesquisar.getContentPane().add(menuLateral3, BorderLayout.WEST);
                    TelaPesquisar.revalidate();
                    TelaPesquisar.repaint();
                    menuLateral.setVisible(false);




                    menuLateral3.add(Box.createVerticalStrut(69));
                    ArrayList<Orientacao> orientacoes2 = new ArrayList<>();


                    try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                        String sql = "SELECT titulo, descricao, exemplo FROM orientacoes WHERE tipo_id = 3";
                        PreparedStatement stmt = conexao.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();




                        while (rs.next()) {
                            String titulo3 = rs.getString("titulo");
                            String descricao3 = rs.getString("descricao");
                            String exemplo3 = rs.getString("exemplo");
                            orientacoes2.add(new Orientacao(titulo3, descricao3, exemplo3));
                        }




                        rs.close();
                        stmt.close();
                    } catch (SQLException f) {
                        f.printStackTrace();
                    }


                    JLabel tituloPasta3 = new JLabel("");
                    tituloPasta3.setHorizontalAlignment(SwingConstants.CENTER);
                    tituloPasta3.setVerticalAlignment(SwingConstants.TOP);
                    tituloPasta3.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel mensagem3 = new JLabel("");
                    mensagem3.setHorizontalAlignment(SwingConstants.CENTER);
                    mensagem3.setVerticalAlignment(SwingConstants.TOP);
                    mensagem3.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel exemplo3 = new JLabel("");
                    exemplo3.setHorizontalAlignment(SwingConstants.CENTER);
                    exemplo3.setVerticalAlignment(SwingConstants.TOP);
                    exemplo3.setAlignmentX(Component.CENTER_ALIGNMENT);


                    painelCentral.removeAll();
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(tituloPasta3);
                    painelCentral.add(Box.createVerticalStrut(10));
                    painelCentral.add(mensagem3);
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(exemplo3);
                    painelCentral.revalidate();
                    painelCentral.repaint();


                    for (Orientacao orientacao : orientacoes2) {
                        ArredondamentoDeBotao botao = new ArredondamentoDeBotao(orientacao.getTitulo(),6);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(245, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);
                        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral3.add(botao);
                        menuLateral3.add(Box.createVerticalStrut(15));




                        botao.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                tituloPasta3.setText("<html><body style='width: 700px'>" + orientacao.getTitulo() + "</body></html>");
                                tituloPasta3.setFont(new Font("Arial", Font.BOLD, 22));
                                tituloPasta3.setAlignmentX(Component.CENTER_ALIGNMENT);
                                tituloPasta3.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                tituloPasta3.setBackground(Color.WHITE);
                                tituloPasta3.setVisible(true);


                                mensagem3.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                                mensagem3.setFont(new Font("Arial", Font.BOLD, 22));
                                mensagem3.setAlignmentX(Component.CENTER_ALIGNMENT);
                                mensagem3.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                mensagem3.setBackground(Color.WHITE);
                                mensagem3.setVisible(true);


                                exemplo3.setText("<html><body style='width: 700px'>" + orientacao.getExemplo() + "</body></html>");
                                exemplo3.setFont(new Font("Arial", Font.BOLD, 22));
                                exemplo3.setAlignmentX(Component.CENTER_ALIGNMENT);
                                exemplo3.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                exemplo3.setBackground(Color.WHITE);
                                exemplo3.setVisible(true);


                            }
                        });




                    }




                    menuLateral3.add(Box.createVerticalStrut(750));
                    ArredondamentoDeBotao botaoRetornar = new ArredondamentoDeBotao("Retornar",6);
                    botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botaoRetornar.setMaximumSize(new Dimension(245, 50));
                    botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                    botaoRetornar.setFocusPainted(false);
                    botaoRetornar.setBackground(new Color(52, 152, 219));
                    botaoRetornar.setForeground(Color.WHITE);
                    botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral3.add(botaoRetornar);




                    botaoRetornar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {




                            menuLateral.setVisible(true);
                            menuLateral3.setVisible(false);
                            mensagem3.setVisible(false);
                            painelCentral.removeAll();


                        }
                    });




                }
            });






            ArredondamentoDeBotao pasta4 = new ArredondamentoDeBotao("Testes e Diagnóstico",6);
            pasta4.setAlignmentX(Component.CENTER_ALIGNMENT);
            pasta4.setMaximumSize(new Dimension(180, 50));
            pasta4.setFont(new Font("Arial", Font.BOLD, 14));
            pasta4.setFocusPainted(false);
            pasta4.setBackground(new Color(52, 152, 219));
            pasta4.setForeground(Color.WHITE);
            pasta4.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            pasta4.setBounds(14, 264, 240, 50);
            menuLateral.add(pasta4);




            pasta4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    JPanel menuLateral4 = new JPanel();
                    menuLateral4.setBackground(new Color(0, 87, 156));
                    menuLateral4.setLayout(new BoxLayout(menuLateral4, BoxLayout.Y_AXIS));
                    menuLateral4.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                    TelaPesquisar.getContentPane().add(menuLateral4, BorderLayout.WEST);
                    TelaPesquisar.revalidate();
                    TelaPesquisar.repaint();
                    menuLateral.setVisible(false);


                    menuLateral4.add(Box.createVerticalStrut(69));
                    ArrayList<Orientacao> orientacoes4 = new ArrayList<>();


                    try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                        String sql = "SELECT titulo, descricao, exemplo FROM orientacoes WHERE tipo_id = 4";
                        PreparedStatement stmt = conexao.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();


                        while (rs.next()) {
                            String titulo4 = rs.getString("titulo");
                            String descricao4 = rs.getString("descricao");
                            String exemplo4 = rs.getString("exemplo");
                            orientacoes4.add(new Orientacao(titulo4, descricao4, exemplo4));
                        }


                        rs.close();
                        stmt.close();
                    } catch (SQLException f) {
                        f.printStackTrace();
                    }


                    JLabel tituloPasta4 = new JLabel("");
                    tituloPasta4.setHorizontalAlignment(SwingConstants.CENTER);
                    tituloPasta4.setVerticalAlignment(SwingConstants.TOP);
                    tituloPasta4.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel mensagem4 = new JLabel("");
                    mensagem4.setHorizontalAlignment(SwingConstants.CENTER);
                    mensagem4.setVerticalAlignment(SwingConstants.TOP);
                    mensagem4.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel exemplo4 = new JLabel("");
                    exemplo4.setHorizontalAlignment(SwingConstants.CENTER);
                    exemplo4.setVerticalAlignment(SwingConstants.TOP);
                    exemplo4.setAlignmentX(Component.CENTER_ALIGNMENT);


                    painelCentral.removeAll();
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(tituloPasta4);
                    painelCentral.add(Box.createVerticalStrut(10));
                    painelCentral.add(mensagem4);
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(exemplo4);
                    painelCentral.revalidate();
                    painelCentral.repaint();


                    for (Orientacao orientacao : orientacoes4) {
                        ArredondamentoDeBotao botao = new ArredondamentoDeBotao(orientacao.getTitulo(),6);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(245, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);
                        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral4.add(botao);
                        menuLateral4.add(Box.createVerticalStrut(15));


                        botao.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                tituloPasta4.setText("<html><body style='width: 700px'>" + orientacao.getTitulo() + "</body></html>");
                                tituloPasta4.setFont(new Font("Arial", Font.BOLD, 22));
                                tituloPasta4.setAlignmentX(Component.CENTER_ALIGNMENT);
                                tituloPasta4.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                tituloPasta4.setBackground(Color.WHITE);
                                tituloPasta4.setVisible(true);


                                mensagem4.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                                mensagem4.setFont(new Font("Arial", Font.BOLD, 22));
                                mensagem4.setAlignmentX(Component.CENTER_ALIGNMENT);
                                mensagem4.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                mensagem4.setBackground(Color.WHITE);
                                mensagem4.setVisible(true);


                                exemplo4.setText("<html><body style='width: 700px'>" + orientacao.getExemplo() + "</body></html>");
                                exemplo4.setFont(new Font("Arial", Font.BOLD, 22));
                                exemplo4.setAlignmentX(Component.CENTER_ALIGNMENT);
                                exemplo4.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                exemplo4.setBackground(Color.WHITE);
                                exemplo4.setVisible(true);
                            }
                        });
                    }


                    menuLateral4.add(Box.createVerticalStrut(750));
                    ArredondamentoDeBotao botaoRetornar = new ArredondamentoDeBotao("Retornar",6);
                    botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botaoRetornar.setMaximumSize(new Dimension(245, 50));
                    botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                    botaoRetornar.setFocusPainted(false);
                    botaoRetornar.setBackground(new Color(52, 152, 219));
                    botaoRetornar.setForeground(Color.WHITE);
                    botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral4.add(botaoRetornar);


                    botaoRetornar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            menuLateral.setVisible(true);
                            menuLateral4.setVisible(false);
                            mensagem4.setVisible(false);
                            painelCentral.removeAll();
                        }
                    });
                }
            });






            ArredondamentoDeBotao pasta5 = new ArredondamentoDeBotao("Manual de Conduta",6);
            pasta5.setAlignmentX(Component.CENTER_ALIGNMENT);
            pasta5.setMaximumSize(new Dimension(180, 50));
            pasta5.setFont(new Font("Arial", Font.BOLD, 14));
            pasta5.setFocusPainted(false);
            pasta5.setBackground(new Color(52, 152, 219));
            pasta5.setForeground(Color.WHITE);
            pasta5.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            pasta5.setBounds(14, 329, 240, 50);
            menuLateral.add(pasta5);




            pasta5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    JPanel menuLateral5 = new JPanel();
                    menuLateral5.setBackground(new Color(0, 87, 156));
                    menuLateral5.setLayout(new BoxLayout(menuLateral5, BoxLayout.Y_AXIS));
                    menuLateral5.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                    TelaPesquisar.getContentPane().add(menuLateral5, BorderLayout.WEST);
                    TelaPesquisar.revalidate();
                    TelaPesquisar.repaint();
                    menuLateral.setVisible(false);


                    menuLateral5.add(Box.createVerticalStrut(69));
                    ArrayList<Orientacao> orientacoes5 = new ArrayList<>();


                    try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                        String sql = "SELECT titulo, descricao, exemplo FROM orientacoes WHERE tipo_id = 5";
                        PreparedStatement stmt = conexao.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();


                        while (rs.next()) {
                            String titulo5 = rs.getString("titulo");
                            String descricao5 = rs.getString("descricao");
                            String exemplo5 = rs.getString("exemplo");
                            orientacoes5.add(new Orientacao(titulo5, descricao5, exemplo5));
                        }


                        rs.close();
                        stmt.close();
                    } catch (SQLException f) {
                        f.printStackTrace();
                    }


                    JLabel tituloPasta5 = new JLabel("");
                    tituloPasta5.setHorizontalAlignment(SwingConstants.CENTER);
                    tituloPasta5.setVerticalAlignment(SwingConstants.TOP);
                    tituloPasta5.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel mensagem5 = new JLabel("");
                    mensagem5.setHorizontalAlignment(SwingConstants.CENTER);
                    mensagem5.setVerticalAlignment(SwingConstants.TOP);
                    mensagem5.setAlignmentX(Component.CENTER_ALIGNMENT);


                    JLabel exemplo5 = new JLabel("");
                    exemplo5.setHorizontalAlignment(SwingConstants.CENTER);
                    exemplo5.setVerticalAlignment(SwingConstants.TOP);
                    exemplo5.setAlignmentX(Component.CENTER_ALIGNMENT);


                    painelCentral.removeAll();
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(tituloPasta5);
                    painelCentral.add(Box.createVerticalStrut(10));
                    painelCentral.add(mensagem5);
                    painelCentral.add(Box.createVerticalStrut(20));
                    painelCentral.add(exemplo5);
                    painelCentral.revalidate();
                    painelCentral.repaint();


                    for (Orientacao orientacao : orientacoes5) {
                        ArredondamentoDeBotao botao = new ArredondamentoDeBotao(orientacao.getTitulo(),6);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(245, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);
                        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral5.add(botao);
                        menuLateral5.add(Box.createVerticalStrut(15));


                        botao.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                tituloPasta5.setText("<html><body style='width: 700px'>" + orientacao.getTitulo() + "</body></html>");
                                tituloPasta5.setFont(new Font("Arial", Font.BOLD, 22));
                                tituloPasta5.setAlignmentX(Component.CENTER_ALIGNMENT);
                                tituloPasta5.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                tituloPasta5.setBackground(Color.WHITE);
                                tituloPasta5.setVisible(true);


                                mensagem5.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                                mensagem5.setFont(new Font("Arial", Font.BOLD, 22));
                                mensagem5.setAlignmentX(Component.CENTER_ALIGNMENT);
                                mensagem5.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                mensagem5.setBackground(Color.WHITE);
                                mensagem5.setVisible(true);


                                exemplo5.setText("<html><body style='width: 700px'>" + orientacao.getExemplo() + "</body></html>");
                                exemplo5.setFont(new Font("Arial", Font.BOLD, 22));
                                exemplo5.setAlignmentX(Component.CENTER_ALIGNMENT);
                                exemplo5.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                exemplo5.setBackground(Color.WHITE);
                                exemplo5.setVisible(true);




                            }
                        });
                    }


                    menuLateral5.add(Box.createVerticalStrut(750));
                    ArredondamentoDeBotao botaoRetornar = new ArredondamentoDeBotao("Retornar",6);
                    botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botaoRetornar.setMaximumSize(new Dimension(245, 50));
                    botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                    botaoRetornar.setFocusPainted(false);
                    botaoRetornar.setBackground(new Color(52, 152, 219));
                    botaoRetornar.setForeground(Color.WHITE);
                    botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral5.add(botaoRetornar);


                    botaoRetornar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            menuLateral.setVisible(true);
                            menuLateral5.setVisible(false);
                            mensagem5.setVisible(false);
                            painelCentral.removeAll();
                        }
                    });
                }
            });






            JPanel painelConteudo = new JPanel(new BorderLayout());
            painelConteudo.setBackground(new Color(255, 255, 255));




            JPanel headerPanel = new JPanel();
            headerPanel.setBackground(new Color(0, 87, 156));
            headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));




            JButton botao3Linhas = new JButton("☰");
            botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 30));
            botao3Linhas.setFocusPainted(false);
            botao3Linhas.setBackground(new Color(0, 87, 156));
            botao3Linhas.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            botao3Linhas.setForeground(Color.WHITE);
            botao3Linhas.setBounds(-3, 0, 50, 30);
            botao3Linhas.setVisible(false);




            botao3Linhas.addActionListener(f -> {
                menuLateral.setVisible(true);
                botao3Linhas.setVisible(false);
                fecharMenu.setVisible(true);
                headerPanel.revalidate();
                headerPanel.repaint();
            });




            fecharMenu.addActionListener(f -> {
                menuLateral.setVisible(false);
                botao3Linhas.setVisible(true);
                fecharMenu.setVisible(false);
                headerPanel.revalidate();
                headerPanel.repaint();
            });




            JButton botaoIdioma = new JButton("\uD83C\uDDE7\uD83C\uDDF7");
            botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
            botaoIdioma.setFocusPainted(false);
            botaoIdioma.setBackground(new Color(0, 87, 156));
            botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            botaoIdioma.setForeground(Color.WHITE);




            JButton botaoUsuario = new JButton("\uD83D\uDC64");
            botaoUsuario.setFont(new Font("SansSerif", Font.PLAIN, 30));
            botaoUsuario.setFocusPainted(false);
            botaoUsuario.setBackground(new Color(0, 87, 156));
            botaoUsuario.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            botaoUsuario.setForeground(Color.WHITE);
            botaoUsuario.setLayout(null);
            botao3Linhas.setBounds(30, 40, 50, 30);




            botaoUsuario.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {




                }
            });




            headerPanel.add(botao3Linhas, BorderLayout.WEST);
            headerPanel.add(Box.createHorizontalGlue());
            headerPanel.add(botaoUsuario, BorderLayout.EAST);
            headerPanel.add(botaoIdioma, BorderLayout.LINE_END);




            painelConteudo.add(headerPanel, BorderLayout.NORTH);




            ArredondamentoDeBotao botaoRetornar = new ArredondamentoDeBotao("Retornar",6);
            botaoRetornar.setFocusPainted(false);
            botaoRetornar.setBackground(new Color(52, 152, 219));
            botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
            botaoRetornar.setForeground(Color.WHITE);
            botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            botaoRetornar.setLayout(null);
            botaoRetornar.setBounds(14, 950, 240, 50);
            menuLateral.add(botaoRetornar);




            botaoRetornar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {




                    TelaPesquisar.setVisible(false);




                }
            });




            painelConteudo.add(painelCentral, BorderLayout.CENTER);




            boolean[] menuVisivel = {false};
            botao3Linhas.addActionListener(g -> {
                menuVisivel[0] = !menuVisivel[0];
                menuLateral.setVisible(menuVisivel[0]);
                TelaPesquisar.revalidate();
            });




            botaoIdioma.addActionListener(h -> {
                JOptionPane.showMessageDialog(TelaPesquisar, "Funcionalidade de pesquisa aqui.");
            });




            TelaPesquisar.add(menuLateral, BorderLayout.WEST);
            TelaPesquisar.add(painelConteudo, BorderLayout.CENTER);




            TelaPesquisar.setLocationRelativeTo(null);
            TelaPesquisar.setVisible(true);




        }






        public void ClickEditar() {




        JFrame telaDeEditar = new JFrame("Editar Orientação");
        telaDeEditar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeEditar.setSize(900, 600);
        telaDeEditar.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaDeEditar.setLayout(new BorderLayout());
        telaDeEditar.setVisible(true);




        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, telaDeEditar.getHeight()));
        menuLateral.setVisible(false);




        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        telaDeEditar.add(headerPanel, BorderLayout.NORTH);




        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoIdioma.setForeground(Color.WHITE);
        headerPanel.add(botaoIdioma, BorderLayout.EAST);




        JButton botaoVoltar = new JButton("◀\uFE0F");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setForeground(new Color(255, 255, 255));
        headerPanel.add(botaoVoltar, BorderLayout.WEST);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                telaDeEditar.setVisible(false);




            }
        });
    }




    public void ClickExcluir() {




        JFrame telaDeExcluir = new JFrame("Excluir Orientação");
        telaDeExcluir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeExcluir.setSize(900, 600);
        telaDeExcluir.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaDeExcluir.setLayout(new BorderLayout());
        telaDeExcluir.setVisible(true);




        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, telaDeExcluir.getHeight()));
        menuLateral.setVisible(false);




        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        telaDeExcluir.add(headerPanel, BorderLayout.NORTH);




        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoIdioma.setForeground(Color.WHITE);
        headerPanel.add(botaoIdioma, BorderLayout.EAST);




        JButton botaoVoltar = new JButton("◀\uFE0F");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setForeground(new Color(255, 255, 255));
        headerPanel.add(botaoVoltar, BorderLayout.WEST);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                telaDeExcluir.setVisible(false);




            }
        });
    }




    public void ClickSair() {
        System.exit(0);
    }


    public class Orientacao {
        private String titulo;
        private String descricao;
        private String exemplo;

        public Orientacao(String titulo, String descricao , String exemplo) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.exemplo = exemplo;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public String getExemplo() {
            return exemplo;
        }
    }


}














































































