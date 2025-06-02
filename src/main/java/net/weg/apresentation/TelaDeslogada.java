package net.weg.apresentation;








import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
















public class TelaDeslogada extends JFrame {




    public static void main(String[] args) {








        OpcoesDoMenu ClickMenu = new OpcoesDoMenu();
        LoginAdm LoginADM = new LoginAdm();
        TemaEscuro TemaEscuro = new TemaEscuro();
        TemaClaro TemaClaro = new TemaClaro();
















        JFrame TelaMenus = new JFrame("Sistema com Menu Lateral");
        TemaClaro.mudarTema(TelaMenus);
        TelaMenus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaMenus.setSize(900, 600);
        TelaMenus.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaMenus.setLayout(new BorderLayout());








        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(null);
        menuLateral.setPreferredSize(new Dimension(230, TelaMenus.getHeight()));
        menuLateral.setVisible(false);
        menuLateral.setBackground(new Color(0, 87, 156));








        JButton fecharMenu = new JButton("\u2630");
        fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
        fecharMenu.setFocusPainted(false);
        fecharMenu.setContentAreaFilled(false);
        fecharMenu.setOpaque(false);
        fecharMenu.setForeground(Color.WHITE);
        fecharMenu.setBorderPainted(false);
        fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fecharMenu.setBounds(9, 19, 50, 30);
        fecharMenu.setVisible(false);
        menuLateral.add(fecharMenu);




        JPanel painelCentral = new JPanel();




        ArredondamentoDeBotao botaoPesquisar = new ArredondamentoDeBotao("Pesquisar Orientações",6);
        botaoPesquisar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoPesquisar.setMaximumSize(new Dimension(180, 50));
        botaoPesquisar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoPesquisar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoPesquisar.setBackground(new Color(51, 181, 229));
        botaoPesquisar.setBounds(9, 69, 210, 50);
        botaoPesquisar.setForeground(Color.WHITE);




        menuLateral.add(botaoPesquisar);




        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(new Color(255, 255, 255));




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




        painelCentral.add(Box.createVerticalGlue());
        painelCentral.add(labelImagem);
        painelCentral.add(Box.createVerticalGlue());




        botaoPesquisar.addActionListener(e -> ClickMenu.ClickPesquisar());








        ArredondamentoDeBotao loginADM = new ArredondamentoDeBotao("Login do ADM",6);
        loginADM.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginADM.setMaximumSize(new Dimension(180, 50));
        loginADM.setFont(new Font("Arial", Font.BOLD, 14));
        loginADM.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        loginADM.setBounds(9, 134, 210, 50);
        loginADM.setBackground(new Color(51, 181, 229));
        loginADM.setForeground(Color.WHITE);
        menuLateral.add(loginADM);




        boolean[] temaClaroAtivo = {true};




        loginADM.addActionListener(e -> LoginADM.clickLoginAdm(temaClaroAtivo[0]));








        ArredondamentoDeBotao botaoSair = new ArredondamentoDeBotao("Sair",6);
        botaoSair.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoSair.setMaximumSize(new Dimension(180, 50));
        botaoSair.setFont(new Font("Arial", Font.BOLD, 14));
        botaoSair.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoSair.setBounds(9, 199, 210, 50);
        botaoSair.setBackground(new Color(51, 181, 229));
        botaoSair.setForeground(Color.WHITE);








        menuLateral.add(botaoSair);








        botaoSair.addActionListener(e -> ClickMenu.ClickSair());




















        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));








        JButton botao3Linhas = new JButton("\u2630");
        botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 30));
        botao3Linhas.setFocusPainted(false);
        botao3Linhas.setContentAreaFilled(false);
        botao3Linhas.setOpaque(false);
        botao3Linhas.setBorderPainted(false);
        botao3Linhas.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botao3Linhas.setForeground(Color.WHITE);
        botao3Linhas.setBounds(-3, 0, 50, 30);












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
            loginADM.setBackground(new Color(0, 0, 0));
            botaoSair.setBackground(new Color(0, 0, 0));
            botaoTemaClaro.setVisible(false);
            botaoTema.setVisible(true);
            SwingUtilities.updateComponentTreeUI(TelaMenus);
            TelaMenus.repaint();




            try {
                ImageIcon icon = new ImageIcon("src/main/java/net/weg/apresentation/DarkThemeWegOne.jpg");
                Image imagem = icon.getImage().getScaledInstance(1980, 950, Image.SCALE_SMOOTH);
                labelImagem.setIcon(new ImageIcon(imagem));
            } catch (Exception ex) {
                ex.printStackTrace();
                labelImagem.setText("Erro ao carregar imagem.");
            }




        });




        botaoTema.addActionListener(e -> {
            TemaClaro.mudarTema(TelaMenus);
            headerPanel.setBackground(new Color(0, 87, 156));
            menuLateral.setBackground(new Color(0, 87, 156));
            botaoPesquisar.setBackground(new Color(51, 181, 229));
            loginADM.setBackground(new Color(51, 181, 229));
            botaoSair.setBackground(new Color(51, 181, 229));
            botaoTema.setBackground(new Color(0, 87, 156));
            botaoTemaClaro.setVisible(true);
            botaoTema.setVisible(false);
            SwingUtilities.updateComponentTreeUI(TelaMenus);
            TelaMenus.repaint();




            try {
                ImageIcon icon = new ImageIcon("src/main/java/net/weg/apresentation/WegOne.jpg");
                Image imagem = icon.getImage().getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
                labelImagem.setIcon(new ImageIcon(imagem));
            } catch (Exception ex) {
                ex.printStackTrace();
                labelImagem.setText("Erro ao carregar imagem.");
            }




        });








        botaoTemaClaro.setVisible(true);
        botaoTema.setVisible(false);
        SwingUtilities.updateComponentTreeUI(TelaMenus);
        TelaMenus.repaint();
        temaClaroAtivo[0] = true;








        headerPanel.add(botao3Linhas);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoTemaClaro);
        headerPanel.add(botaoTema);




        painelConteudo.add(headerPanel, BorderLayout.NORTH);




        painelCentral.setBackground(new Color(255, 255, 255));
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);




        painelConteudo.add(painelCentral, BorderLayout.CENTER);




        TelaMenus.add(menuLateral, BorderLayout.WEST);
        TelaMenus.add(painelConteudo, BorderLayout.CENTER);




        TelaMenus.setLocationRelativeTo(null);
        TelaMenus.setVisible(true);
    }
}