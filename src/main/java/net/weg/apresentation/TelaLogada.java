package net.weg.apresentation;




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class TelaLogada {




    public static void main(String[] args) {




        boolean[] temaClaroAtivo = {true};








        TemaClaro.mudarTema(new JFrame());




        OpcoesDoMenu ClickMenu = new OpcoesDoMenu();
        LoginAdm GestaoDeUsuarios = new LoginAdm();
        ArredondamentoDeBotao BotaoRedondos = new ArredondamentoDeBotao("Botão", 30);




        JFrame TelaMenus = new JFrame("Sistema com Menu Lateral");
        TelaMenus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaMenus.setSize(900, 600);
        TelaMenus.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaMenus.setLayout(new BorderLayout());




        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(null);
        menuLateral.setPreferredSize(new Dimension(230, TelaMenus.getHeight()));
        menuLateral.setVisible(false);




        JButton fecharMenu = new JButton("☰");
        fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
        fecharMenu.setFocusPainted(false);
        fecharMenu.setBorderPainted(false);
        fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fecharMenu.setBounds(9, 19, 50, 30);
        fecharMenu.setVisible(false);
        fecharMenu.setContentAreaFilled(false);
        fecharMenu.setOpaque(false);
        menuLateral.add(fecharMenu);




        ArredondamentoDeBotao botaoCadastrar = new ArredondamentoDeBotao("Cadastrar Orientações", 6);
        botaoCadastrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoCadastrar.setMaximumSize(new Dimension(180, 50));
        botaoCadastrar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoCadastrar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoCadastrar.setBounds(9, 139, 210, 50);
        menuLateral.add(botaoCadastrar);




        botaoCadastrar.addActionListener(e -> ClickMenu.ClickCadastrar(TelaMenus, !temaClaroAtivo[0]));




        ArredondamentoDeBotao botaoPesquisar = new ArredondamentoDeBotao("Pesquisar Orientações", 6);
        botaoPesquisar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoPesquisar.setMaximumSize(new Dimension(180, 50));
        botaoPesquisar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoPesquisar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoPesquisar.setBounds(9, 74, 210, 50);
        menuLateral.add(botaoPesquisar);




        botaoPesquisar.addActionListener(e -> ClickMenu.ClickPesquisar());




        ArredondamentoDeBotao botaoEditar = new ArredondamentoDeBotao("Editar Orientações", 6);
        botaoEditar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoEditar.setMaximumSize(new Dimension(180, 50));
        botaoEditar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoEditar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoEditar.setBounds(9, 204, 210, 50);
        menuLateral.add(botaoEditar);




        botaoEditar.addActionListener(e -> ClickMenu.ClickEditar(TelaMenus, !temaClaroAtivo[0]));




        ArredondamentoDeBotao botaoSair = new ArredondamentoDeBotao("Sair", 6);
        botaoSair.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoSair.setMaximumSize(new Dimension(180, 50));
        botaoSair.setFont(new Font("Arial", Font.BOLD, 14));
        botaoSair.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoSair.setBounds(9, 270, 210, 50);
        menuLateral.add(botaoSair);




        botaoSair.addActionListener(e -> ClickMenu.ClickSair());




        ArredondamentoDeBotao botaoLogout = new ArredondamentoDeBotao("Sair da Conta", 6);




        JPanel painelCentral = new JPanel();
        painelCentral.setBackground(new Color(255, 255, 255));
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);




        JLabel labelImagem = new JLabel();
        try {
            ImageIcon icon = new ImageIcon("src/main/java/net/weg/apresentation/WegOne.jpg");
            Image imagem = icon.getImage().getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(imagem));
            labelImagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagem.setText("Erro ao carregar imagem.");
        }




        JLabel mensagem = new JLabel("");
        mensagem.setFont(new Font("Arial", Font.BOLD, 22));
        mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        mensagem.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        mensagem.setBackground(Color.WHITE);




        painelCentral.add(Box.createVerticalGlue());
        painelCentral.add(labelImagem);
        painelCentral.add(mensagem);
        painelCentral.add(Box.createVerticalGlue());




        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(new Color(255, 255, 255));




        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));




        JButton botao3Linhas = new JButton("☰");
        botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 30));
        botao3Linhas.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botao3Linhas.setBounds(-3, 0, 50, 30);
        botao3Linhas.setFocusPainted(false);
        botao3Linhas.setContentAreaFilled(false);
        botao3Linhas.setOpaque(false);
        botao3Linhas.setBorderPainted(false);




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








        JButton botaoTemaClaro = new JButton("\uD83D\uDD06");
        botaoTemaClaro.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoTemaClaro.setFocusPainted(false);
        botaoTemaClaro.setContentAreaFilled(false);
        botaoTemaClaro.setOpaque(false);
        botaoTemaClaro.setBorderPainted(false);
        botaoTemaClaro.setBackground(new Color(0, 87, 156));
        botaoTemaClaro.setForeground(Color.WHITE);
        botaoTemaClaro.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoTemaClaro.setVisible(true);




        JButton botaoTema = new JButton("\uD83C\uDF19");
        botaoTema.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoTema.setFocusPainted(false);
        botaoTema.setContentAreaFilled(false);
        botaoTema.setOpaque(false);
        botaoTema.setBorderPainted(false);
        botaoTema.setBackground(new Color(0, 87, 156));
        botaoTema.setForeground(Color.WHITE);
        botaoTema.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoTema.setVisible(false);




        botaoTemaClaro.addActionListener(e -> {
            TemaEscuro.mudarTema(TelaMenus);
            headerPanel.setBackground(new Color(30, 30, 30));
            menuLateral.setBackground(new Color(30, 30, 30));
            botaoTema.setBackground(new Color(255, 255, 255));
            botaoPesquisar.setBackground(new Color(0, 0, 0));
            botaoCadastrar.setMinimumSize(new Dimension(0, 0));
            botaoCadastrar.setBackground(new Color(0, 0, 0));
            botaoSair.setBackground(new Color(0, 0, 0));
            botaoEditar.setBackground(new Color(0, 0, 0));
            botaoLogout.setBackground(new Color(0, 0, 0));




            try {
                ImageIcon icon = new ImageIcon("src/main/java/net/weg/apresentation/DarkThemeWegOne.jpg");
                Image imagem = icon.getImage().getScaledInstance(1980, 950, Image.SCALE_SMOOTH);
                labelImagem.setIcon(new ImageIcon(imagem));
            } catch (Exception ex) {
                ex.printStackTrace();
                labelImagem.setText("Erro ao carregar imagem.");
            }




            botaoTemaClaro.setVisible(false);
            botaoTema.setVisible(true);
            SwingUtilities.updateComponentTreeUI(TelaMenus);
            TelaMenus.repaint();
            temaClaroAtivo[0] = false;
        });




        botaoTema.addActionListener(e -> {
            TemaClaro.mudarTema(TelaMenus);
            headerPanel.setBackground(new Color(0, 87, 156));
            menuLateral.setBackground(new Color(0, 87, 156));
            botaoPesquisar.setBackground(new Color(51, 181, 229));
            botaoSair.setBackground(new Color(51, 181, 229));
            botaoTema.setBackground(new Color(0, 87, 156));
            botaoCadastrar.setBackground(new Color(51, 181, 229));
            botaoEditar.setBackground(new Color(51, 181, 229));
            botaoLogout.setBackground(new Color(51, 181, 229));




            try {
                ImageIcon icon = new ImageIcon("src/main/java/net/weg/apresentation/WegOne.jpg");
                Image imagem = icon.getImage().getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
                labelImagem.setIcon(new ImageIcon(imagem));
            } catch (Exception ex) {
                ex.printStackTrace();
                labelImagem.setText("Erro ao carregar imagem.");
            }




            botaoTemaClaro.setVisible(true);
            botaoTema.setVisible(false);
            SwingUtilities.updateComponentTreeUI(TelaMenus);
            TelaMenus.repaint();
            temaClaroAtivo[0] = true;
        });




        headerPanel.add(botao3Linhas);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoTemaClaro);
        headerPanel.add(botaoTema);




        painelConteudo.add(headerPanel, BorderLayout.NORTH);
        painelConteudo.add(painelCentral, BorderLayout.CENTER);




        botaoLogout.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoLogout.setMaximumSize(new Dimension(180, 50));
        botaoLogout.setFont(new Font("Arial", Font.BOLD, 14));
        botaoLogout.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoLogout.setLayout(null);
        botaoLogout.setBounds(9, 949, 210, 50);
        menuLateral.add(botaoLogout);




        botaoLogout.addActionListener(e -> TelaDeslogada.main(new String[]{}));




        boolean[] menuVisivel = {false};
        botao3Linhas.addActionListener(e -> {
            menuVisivel[0] = !menuVisivel[0];
            menuLateral.setVisible(menuVisivel[0]);
            TelaMenus.revalidate();
        });




        TelaMenus.add(menuLateral, BorderLayout.WEST);
        TelaMenus.add(painelConteudo, BorderLayout.CENTER);




        TelaMenus.setLocationRelativeTo(null);
        TelaMenus.setVisible(true);




        menuLateral.invalidate();
        menuLateral.validate();
        menuLateral.repaint();




        headerPanel.invalidate();
        headerPanel.validate();
        headerPanel.repaint();




        botaoLogout.invalidate();
        botaoLogout.validate();
        botaoLogout.repaint();
    }
}





