import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Tela_inicial {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema com Menu Lateral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(new BorderLayout());



        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(45, 62, 80));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, frame.getHeight()));
        menuLateral.setVisible(false);

        String[] opcoes = {
                "Cadastrar Orientação",
                "Pesquisar Orientação",
                "Editar Orientação",
                "Excluir Orientação",
                "Sair"
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
                    JOptionPane.showMessageDialog(frame, "Você clicou em: " + opcao);
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

        // Controle de visibilidade do menu
        final boolean[] menuVisivel = {false};
        botao3Linhas.addActionListener(e -> {
            menuVisivel[0] = !menuVisivel[0];
            menuLateral.setVisible(menuVisivel[0]);
            frame.revalidate();
        });

        // Evento do botão de pesquisa
        botaoPesquisa.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Funcionalidade de pesquisa aqui.");
        });

        frame.add(menuLateral, BorderLayout.WEST);
        frame.add(painelConteudo, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
