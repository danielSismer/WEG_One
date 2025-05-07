package net.weg.apresentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class TelaLogada extends JFrame {


    OpcoesDoMenu ClickMenu = new OpcoesDoMenu();
    LoginAdm GestaoDeUsuarios = new LoginAdm();


    private ResourceBundle bundle;
    private Locale currentLocale;




    private JButton botaoCadastrar, botaoPesquisar, botaoEditar, botaoExcluir, botaoSair, botaoLogout;


    public TelaLogada() {
        currentLocale = new Locale("pt", "BR");
        bundle = ResourceBundle.getBundle("messages", currentLocale);


        setTitle("Sistema com Menu Lateral");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());


        JPanel menuLateral = new JPanel(null);
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setPreferredSize(new Dimension(230, getHeight()));
        menuLateral.setVisible(false);


        JButton fecharMenu = new JButton("☰");
        fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
        fecharMenu.setFocusPainted(false);
        fecharMenu.setBackground(new Color(0, 87, 156));
        fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fecharMenu.setForeground(Color.WHITE);
        fecharMenu.setBounds(9, 19, 50, 30);
        fecharMenu.setVisible(false);
        menuLateral.add(fecharMenu);






        botaoCadastrar = criarBotao(bundle.getString("register"), 134);
        menuLateral.add(botaoCadastrar);




        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ClickMenu.ClickCadastrar();


            }
        });




        botaoPesquisar = criarBotao(bundle.getString("search"), 69);
        menuLateral.add(botaoPesquisar);


        botaoPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ClickMenu.ClickPesquisar();


            }
        });


        botaoEditar = criarBotao(bundle.getString("edit"), 199);
        menuLateral.add(botaoEditar);


        botaoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ClickMenu.ClickEditar();


            }
        });


        botaoExcluir = criarBotao(bundle.getString("delete"), 264);
        menuLateral.add(botaoExcluir);




        botaoExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ClickMenu.ClickExcluir();


            }
        });






        botaoSair = criarBotao(bundle.getString("exit"), 329);
        menuLateral.add(botaoSair);


        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ClickMenu.ClickSair();


            }
        });




        botaoLogout = criarBotao(bundle.getString("logout"), 944);
        menuLateral.add(botaoLogout);


        botaoLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                TelaDeslogada.main(new String [] {});


            }
        });


        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(Color.WHITE);


        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JButton botao3Linhas = new JButton("☰");
        botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 30));
        botao3Linhas.setBackground(new Color(0, 87, 156));
        botao3Linhas.setForeground(Color.WHITE);
        botao3Linhas.setBorderPainted(false);
        botao3Linhas.setFocusPainted(false);


        botao3Linhas.addActionListener(e -> {
            menuLateral.setVisible(true);
            botao3Linhas.setVisible(false);
            fecharMenu.setVisible(true);
        });


        fecharMenu.addActionListener(e -> {
            menuLateral.setVisible(false);
            botao3Linhas.setVisible(true);
            fecharMenu.setVisible(false);
        });


        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);
        botaoIdioma.setBorderPainted(false);
        botaoIdioma.setFocusPainted(false);


        botaoIdioma.addActionListener(e -> mostrarMenuIdioma(botaoIdioma));


        headerPanel.add(botao3Linhas);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoIdioma);


        painelConteudo.add(headerPanel, BorderLayout.NORTH);


        add(menuLateral, BorderLayout.WEST);
        add(painelConteudo, BorderLayout.CENTER);


        setLocationRelativeTo(null);
        setVisible(true);
    }


    JButton criarBotao(String texto, int y) {
        JButton botao = new JButton(texto);
        botao.setBounds(9, y, 210, 50);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setFocusPainted(false);
        botao.setBackground(new Color(52, 152, 219));
        botao.setForeground(Color.WHITE);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return botao;
    }


    private void mostrarMenuIdioma(Component invocador) {
        JPopupMenu menu = new JPopupMenu();


        JMenuItem br = new JMenuItem("🇧🇷 Português");
        br.addActionListener(e -> trocarIdioma(new Locale("pt", "BR")));


        JMenuItem us = new JMenuItem("🇺🇸 English");
        us.addActionListener(e -> trocarIdioma(new Locale("en", "US")));


        JMenuItem de = new JMenuItem("🇩🇪 Deutsch");
        de.addActionListener(e -> trocarIdioma(new Locale("de", "DE")));


        menu.add(br);
        menu.add(us);
        menu.add(de);


        menu.show(invocador, 0, invocador.getHeight());
    }


    private void trocarIdioma(Locale novoLocale) {
        this.currentLocale = novoLocale;
        this.bundle = ResourceBundle.getBundle("messages", currentLocale);


        botaoCadastrar.setText(bundle.getString("register"));
        botaoPesquisar.setText(bundle.getString("search"));
        botaoEditar.setText(bundle.getString("edit"));
        botaoExcluir.setText(bundle.getString("delete"));
        botaoSair.setText(bundle.getString("exit"));
        botaoLogout.setText(bundle.getString("logout"));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelaLogada::new);
    }
}

