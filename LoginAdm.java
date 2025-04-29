import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdm {


    public void clickLoginAdm () {

        JFrame LoginADM = new JFrame("Login do Adm");
        LoginADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginADM.setExtendedState(JFrame.MAXIMIZED_BOTH);
        LoginADM.setSize(900, 600);
        LoginADM.setLayout(new BorderLayout());


        JPanel painelFundo = new JPanel(new GridBagLayout());
        painelFundo.setBackground(new Color(255, 255, 255));
        LoginADM.add(painelFundo, BorderLayout.CENTER);


        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(new BoxLayout(painelLogin, BoxLayout.Y_AXIS));
        painelLogin.setBorder(BorderFactory.createEmptyBorder(440, 165, 30, 165));
        painelLogin.setBackground(new Color(0, 87, 156));


        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(new Color(255, 255, 255));
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 25));

        JTextField campoUsuario = new JTextField(10);
        campoUsuario.setMaximumSize(new Dimension(Integer.MAX_VALUE, 110));


        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(new Color(255, 255, 255));
        labelSenha.setFont(new Font("Arial", Font.BOLD, 25));


        JPasswordField campoSenha = new JPasswordField(15);
        campoSenha.setMaximumSize(new Dimension(Integer.MAX_VALUE, 110));

        JButton botaoLogar = new JButton("Logar");
        botaoLogar.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));


        painelLogin.add(labelUsuario);
        painelLogin.add(Box.createVerticalStrut(15));
        painelLogin.add(campoUsuario);
        painelLogin.add(Box.createVerticalStrut(15));
        painelLogin.add(labelSenha);
        painelLogin.add(Box.createVerticalStrut(15));
        painelLogin.add(campoSenha);
        painelLogin.add(Box.createVerticalStrut(15));
        painelLogin.add(botaoLogar);


        painelFundo.add(painelLogin);

        LoginADM.setLocationRelativeTo(null);
        LoginADM.setVisible(true);


        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        LoginADM.add(headerPanel, BorderLayout.NORTH);

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

                LoginADM.setVisible(false);

            }
        });
    }



}