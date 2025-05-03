import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class OpcoesDoMenu {

    private JFrame TelaMenu;

    public void ClickCadastrar() {

        JFrame telaDeCadastro = new JFrame("Cadastro");
        telaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeCadastro.setSize(900, 600);
        telaDeCadastro.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaDeCadastro.setLayout(new BorderLayout());
        telaDeCadastro.setVisible(true);

        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, telaDeCadastro.getHeight()));
        menuLateral.setVisible(false);

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        telaDeCadastro.add(headerPanel, BorderLayout.NORTH);

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

                telaDeCadastro.setVisible(false);

            }
        });

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










        JButton fecharMenu = new JButton("☰");
        fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
        fecharMenu.setFocusPainted(false);
        fecharMenu.setBackground(new Color(0, 87, 156));
        fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fecharMenu.setForeground(Color.WHITE);
        fecharMenu.setBounds(9, 19, 50, 30);
        fecharMenu.setVisible(true);
        menuLateral.add(fecharMenu);


        JButton pasta1 = new JButton("Manual de operação");
        pasta1.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta1.setMaximumSize(new Dimension(180, 50));
        pasta1.setFont(new Font("Arial", Font.BOLD, 14));
        pasta1.setFocusPainted(false);
        pasta1.setBackground(new Color(52, 152, 219));
        pasta1.setForeground(Color.WHITE);
        pasta1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta1.setBounds(14, 69, 240, 50);
        menuLateral.add(pasta1);


        String[] opcoes = {
                "Botao 1",
                "Botao 2"

        };


        pasta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel menuLateral1 = new JPanel();
                menuLateral1.setBackground(new Color(45, 62, 80));
                menuLateral1.setBackground(new Color(0, 87, 156));
                menuLateral1.setLayout(new BoxLayout(menuLateral1, BoxLayout.Y_AXIS));
                menuLateral1.setPreferredSize(new Dimension(200, TelaPesquisar.getHeight()));


                TelaPesquisar.add(menuLateral1, BorderLayout.WEST);
                menuLateral.setVisible(false);

                menuLateral1.add(Box.createVerticalStrut(69));


                menuLateral1.setLayout(new BoxLayout(menuLateral1, BoxLayout.Y_AXIS));

                JButton botao = null;
                try {
                    new ConexaoBanco();
                    Connection conn = ConexaoBanco.getConexao();

                    String sql = "SELECT titulo FROM orientacoes WHERE tipo_id = 1 ORDER BY titulo ASC";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();

                    while (rs.next()) {
                        String titulo = rs.getString("titulo");

                        botao = new JButton(titulo);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(180, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);

                        botao = new JButton(titulo);
                        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botao.setMaximumSize(new Dimension(180, 50));
                        botao.setFont(new Font("Arial", Font.BOLD, 14));
                        botao.setFocusPainted(false);
                        botao.setBackground(new Color(52, 152, 219));
                        botao.setForeground(Color.WHITE);


                        botao.addActionListener(f -> {
                            JOptionPane.showMessageDialog(null, "Você clicou em: " + titulo);
                        });

                        menuLateral1.add(botao);
                        menuLateral1.add(Box.createVerticalStrut(15));


                    }

                    rs.close();
                    stmt.close();

                    menuLateral1.revalidate();
                    menuLateral1.repaint();
                } catch (Exception f) {
                    f.printStackTrace();
                }




                menuLateral1.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(180, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral1.add(botaoRetornar);


                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        menuLateral.setVisible(true);
                        menuLateral1.setVisible(false);
                        menuLateral.setVisible(true);
                        menuLateral1.setVisible(true);

                    }
                });


            }
        });

        JButton pasta2 = new JButton("Procedimento de Segurança");
        pasta2.setAlignmentX(Component.CENTER_ALIGNMENT);
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
                menuLateral2.setBackground(new Color(45, 62, 80));
                menuLateral2.setBackground(new Color(0, 87, 156));
                menuLateral2.setLayout(new BoxLayout(menuLateral2, BoxLayout.Y_AXIS));
                menuLateral2.setPreferredSize(new Dimension(200, TelaPesquisar.getHeight()));


                TelaPesquisar.add(menuLateral2, BorderLayout.WEST);
                menuLateral.setVisible(false);

                menuLateral2.add(Box.createVerticalStrut(69));




                menuLateral2.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(180, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral2.add(botaoRetornar);


                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        menuLateral.setVisible(true);
                        menuLateral2.setVisible(false);
                        menuLateral.setVisible(true);
                        menuLateral2.setVisible(true);

                    }
                });






            }
        });


        JButton pasta3 = new JButton("Manutenção e Reparos");
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



            }
        });

        JButton pasta4 = new JButton("Testes e Diagnóstico");
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



            }
        });

        JButton pasta5 = new JButton("Manual de Conduta");
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

        botao3Linhas.addActionListener(e -> {
            menuLateral.setVisible(true);
            botao3Linhas.setVisible(false);
            fecharMenu.setVisible(true);
            headerPanel.revalidate();
            headerPanel.repaint();
        });

        fecharMenu.addActionListener(e -> {
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




        JPanel painelCentral = new JPanel();
        painelCentral.setBackground(new Color(255, 255, 255));
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);



        JButton botaoRetornar = new JButton("Retornar");
        botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoRetornar.setMaximumSize(new Dimension(180, 50));
        botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoRetornar.setFocusPainted(false);
        botaoRetornar.setBackground(new Color(52, 152, 219));
        botaoRetornar.setForeground(Color.WHITE);
        botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoRetornar.setLayout(null);
        botaoRetornar.setBounds(14, 734, 240, 50);
        menuLateral.add(botaoRetornar);

        botaoRetornar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TelaPesquisar.setVisible(false);

            }
        });




        try {
            ImageIcon icon = new ImageIcon("WegOne.jpg");
            Image imagem = icon.getImage().getScaledInstance(750, 450, Image.SCALE_SMOOTH);
            JLabel labelImagem = new JLabel(new ImageIcon(imagem));
            labelImagem.setAlignmentX(Component.CENTER_ALIGNMENT);


            JLabel mensagem = new JLabel("");
            mensagem.setFont(new Font("Arial", Font.BOLD, 22));
            mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
            mensagem.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
            mensagem.setBackground(Color.WHITE);


            painelCentral.add(Box.createVerticalGlue());
            painelCentral.add(labelImagem);
            painelCentral.add(mensagem);
            painelCentral.add(Box.createVerticalGlue());
        } catch (Exception ex) {
            ex.printStackTrace();
            painelCentral.add(new JLabel("Erro ao carregar imagem."));
        }


        painelConteudo.add(painelCentral, BorderLayout.CENTER);




        boolean[] menuVisivel = {false};
        botao3Linhas.addActionListener(e -> {
            menuVisivel[0] = !menuVisivel[0];
            menuLateral.setVisible(menuVisivel[0]);
            TelaPesquisar.revalidate();
        });




        botaoIdioma.addActionListener(e -> {
            JOptionPane.showMessageDialog(TelaPesquisar, "Funcionalidade de pesquisa aqui.");
        });


        TelaPesquisar.add(menuLateral, BorderLayout.WEST);
        TelaPesquisar.add(painelConteudo, BorderLayout.CENTER);


        TelaPesquisar.setLocationRelativeTo(null);
        TelaPesquisar.setVisible(true);

    };
























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

}