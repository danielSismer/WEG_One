import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdm {

    public void clickLoginAdm () {

       Index.main(new String[]{});

        JFrame LoginADM = new JFrame("Login do Adm");
        LoginADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginADM.setExtendedState(JFrame.MAXIMIZED_BOTH);
        LoginADM.setSize(900, 600);
        LoginADM.setLayout(null);


        JPanel painelFundo = new JPanel();
        painelFundo.setLayout(null);
        painelFundo.setBackground(Color.WHITE);
        painelFundo.setBounds(0, 0, 1920, 1080);
        LoginADM.add(painelFundo);


        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(null);
        painelLogin.setBackground(new Color(0, 87, 156));
        painelLogin.setBounds(700, 300, 500, 400);
        painelFundo.add(painelLogin);

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 25));
        labelUsuario.setBounds(30, 30, 200, 30);
        painelLogin.add(labelUsuario);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(30, 70, 440, 50);
        campoUsuario.setFont(new Font("Arial", Font.BOLD, 25));
        painelLogin.add(campoUsuario);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.WHITE);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 25));
        labelSenha.setBounds(30, 140, 500, 30);
        painelLogin.add(labelSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(30, 180, 440, 50);
        campoSenha.setFont(new Font("Arial", Font.BOLD, 25));
        painelLogin.add(campoSenha);



        painelLogin.add(Box.createVerticalStrut(30));



        JButton botaoLogar = new JButton("Logar");
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setBounds(150, 260, 200, 50);
        painelLogin.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Index.main(new String[]{});

            }
        });


        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBounds(0, 0, 1920, 80);
        painelFundo.add(headerPanel);

        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setBounds(1800, 20, 60, 40);
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);


        JButton botaoVoltar = new JButton("◀️");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoVoltar.setBounds(20, 20, 60, 40);
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setForeground(Color.WHITE);


        headerPanel.add(botaoVoltar);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoIdioma);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginADM.setVisible(false);
            }
        });

        LoginADM.setVisible(true);
    }
}
