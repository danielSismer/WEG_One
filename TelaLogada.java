import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TelaLogada {

    public static void main(String[] args) {

        OpcoesDoMenu ClickMenu = new OpcoesDoMenu();
        LoginAdm GestaoDeUsuarios = new LoginAdm();


        JFrame TelaMenus = new JFrame("Sistema com Menu Lateral");
        TelaMenus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaMenus.setSize(900, 600);
        TelaMenus.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaMenus.setLayout(new BorderLayout());



        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(null);
        menuLateral.setPreferredSize(new Dimension(230, TelaMenus.getHeight()));
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





        String[] opcoesCadastro = {
                "Manual de Operação",
                "Manutenção de Transformadores",
                "Procedimento de Segurança para Instalação de Equipamentos Elétricos",
                "Procedimento de Segurança para Operações com Risco de Choque Elétrico",
                "Procedimento de Segurança para Testes de Funcionamento de Motores",
                "Procedimento de Segurança para Diagnóstico de Falhas em Motores",
                " Procedimento de Segurança para Diagnóstico e Manutenção de Sistemas de Automação",
                " Procedimento Operacional no Setor de Manutenção",
                ""




        };







        JButton botaoCadastrar = new JButton("Cadastrar Orientações");
        botaoCadastrar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoCadastrar.setMaximumSize(new Dimension(180, 50));
        botaoCadastrar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoCadastrar.setFocusPainted(false);
        botaoCadastrar.setBackground(new Color(52, 152, 219));
        botaoCadastrar.setForeground(Color.WHITE);
        botaoCadastrar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoCadastrar.setBounds(9, 134, 210, 50);
        menuLateral.add(botaoCadastrar);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClickMenu.ClickCadastrar();

            }
        });


        JButton botaoPesquisar = new JButton("Pesquisar Orientações");
        botaoPesquisar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoPesquisar.setMaximumSize(new Dimension(180, 50));
        botaoPesquisar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoPesquisar.setFocusPainted(false);
        botaoPesquisar.setBackground(new Color(52, 152, 219));
        botaoPesquisar.setForeground(Color.WHITE);
        botaoPesquisar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoPesquisar.setBounds(9, 69, 210, 50);
        menuLateral.add(botaoPesquisar);


        botaoPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClickMenu.ClickPesquisar();

            }
        });


        JButton botaoEditar = new JButton("Editar Orientações");
        botaoEditar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoEditar.setMaximumSize(new Dimension(180, 50));
        botaoEditar.setFont(new Font("Arial", Font.BOLD, 14));
        botaoEditar.setFocusPainted(false);
        botaoEditar.setBackground(new Color(52, 152, 219));
        botaoEditar.setForeground(Color.WHITE);
        botaoEditar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoEditar.setBounds(9, 199, 210, 50);
        menuLateral.add(botaoEditar);



        botaoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClickMenu.ClickEditar();

            }
        });


        JButton botaoExcluir = new JButton("Excluir Orientações");
        botaoExcluir.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoExcluir.setMaximumSize(new Dimension(180, 50));
        botaoExcluir.setFont(new Font("Arial", Font.BOLD, 14));
        botaoExcluir.setFocusPainted(false);
        botaoExcluir.setBackground(new Color(52, 152, 219));
        botaoExcluir.setForeground(Color.WHITE);
        botaoExcluir.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoExcluir.setBounds(9, 264, 210, 50);
        menuLateral.add(botaoExcluir);



        botaoExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClickMenu.ClickExcluir();

            }
        });



        JButton botaoSair = new JButton("Sair");
        botaoSair.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoSair.setMaximumSize(new Dimension(180, 50));
        botaoSair.setFont(new Font("Arial", Font.BOLD, 14));
        botaoSair.setFocusPainted(false);
        botaoSair.setBackground(new Color(52, 152, 219));
        botaoSair.setForeground(Color.WHITE);
        botaoSair.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoSair.setBounds(9, 329, 210, 50);
        menuLateral.add(botaoSair);


        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClickMenu.ClickSair();

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

                GestaoDeUsuarios.clickLoginAdm();

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
            TelaMenus.revalidate();
        });




        botaoIdioma.addActionListener(e -> {
            JOptionPane.showMessageDialog(TelaMenus, "Funcionalidade de pesquisa aqui.");
        });


        TelaMenus.add(menuLateral, BorderLayout.WEST);
        TelaMenus.add(painelConteudo, BorderLayout.CENTER);


        TelaMenus.setLocationRelativeTo(null);
        TelaMenus.setVisible(true);
    }
}