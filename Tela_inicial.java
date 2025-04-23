import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class Tela_inicial {
    public static void main(String[] args) {


        JFrame TelaMenus = new JFrame("Sistema com Menu Lateral");
        TelaMenus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaMenus.setSize(900, 600);
        TelaMenus.setLayout(new BorderLayout());






        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(45, 62, 80));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, TelaMenus.getHeight()));
        menuLateral.setVisible(false);


        String[] opcoes = {
                "Cadastrar Orientação",
                "Editar Orientação",
                "Excluir Orientação",
                "Sair"
        };


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




        for (String opcao : opcoes) {
            JButton botao = new JButton(opcao);
            botao.setAlignmentX(Component.CENTER_ALIGNMENT);
            botao.setMaximumSize(new Dimension(180, 50));
            botao.setFont(new Font("Arial", Font.BOLD, 14));
            botao.setFocusPainted(false);
            botao.setBackground(new Color(52, 152, 219));
            botao.setForeground(Color.WHITE);
            botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));






            botao.addActionListener(e -> {
                if (opcao.equals("Sair")) {
                    System.exit(0);
                } else {


                }
            });
            botao.addActionListener(e -> {
                if (opcao.equals("Cadastrar Orientação")) {


                    TelaMenus.setVisible(false);




                    JFrame telaDeCadastro = new JFrame("Cadastro");
                    telaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    telaDeCadastro.setSize(900, 600);
                    telaDeCadastro.setLayout(new BorderLayout());
                    telaDeCadastro.setVisible(true);


                } else {


                }


            });




            botao.addActionListener(e -> {
                if (opcao.equals("Editar Orientação")) {


                    TelaMenus.setVisible(false);




                    JFrame telaDeEditar = new JFrame("Editar Orientação");
                    telaDeEditar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    telaDeEditar.setSize(900, 600);
                    telaDeEditar.setLayout(new BorderLayout());
                    telaDeEditar.setVisible(true);


                } else {


                }


            });




            botao.addActionListener(e -> {
                if (opcao.equals("Excluir Orientação")) {


                    TelaMenus.setVisible(false);




                    JFrame telaDeExcluir = new JFrame("Excluir Orientação");
                    telaDeExcluir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    telaDeExcluir.setSize(900, 600);
                    telaDeExcluir.setLayout(new BorderLayout());
                    telaDeExcluir.setVisible(true);


                } else {


                }


            });






            menuLateral.add(Box.createRigidArea(new Dimension(0, 15)));
            menuLateral.add(botao);
        }




        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(Color.WHITE);


        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.WHITE);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));




        JButton botao3Linhas = new JButton("☰");
        botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao3Linhas.setFocusPainted(false);
        botao3Linhas.setBackground(Color.WHITE);
        botao3Linhas.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));


        // Botão Pesquisa (com ícone de lupa)
        JButton botaoPesquisa = new JButton("🔍");
        botaoPesquisa.setFont(new Font("SansSerif", Font.PLAIN, 20));
        botaoPesquisa.setFocusPainted(false);
        botaoPesquisa.setBackground(Color.WHITE);
        botaoPesquisa.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));




        headerPanel.add(botao3Linhas, BorderLayout.WEST);
        headerPanel.add(botaoPesquisa, BorderLayout.EAST);


        painelConteudo.add(headerPanel, BorderLayout.NORTH);




        JPanel painelCentral = new JPanel();
        painelCentral.setBackground(new Color(25, 25, 30));
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);






        try {
            ImageIcon icon = new ImageIcon("WegOne-imagen.jpg");
            Image imagem = icon.getImage().getScaledInstance(400, 250, Image.SCALE_SMOOTH);
            JLabel labelImagem = new JLabel(new ImageIcon(imagem));
            labelImagem.setAlignmentX(Component.CENTER_ALIGNMENT);


            JLabel mensagem = new JLabel("Bem-vindo ao WegOne");
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




        final boolean[] menuVisivel = {false};
        botao3Linhas.addActionListener(e -> {
            menuVisivel[0] = !menuVisivel[0];
            menuLateral.setVisible(menuVisivel[0]);
            TelaMenus.revalidate();
        });




        botaoPesquisa.addActionListener(e -> {
            JOptionPane.showMessageDialog(TelaMenus, "Funcionalidade de pesquisa aqui.");
        });


        TelaMenus.add(menuLateral, BorderLayout.WEST);
        TelaMenus.add(painelConteudo, BorderLayout.CENTER);


        TelaMenus.setLocationRelativeTo(null);
        TelaMenus.setVisible(true);
    }
}
