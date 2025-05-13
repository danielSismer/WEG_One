package net.weg.apresentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginAdm {

    public void clickLoginAdm() {
        JFrame LoginADM = new JFrame("Login do Adm");
        LoginADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginADM.setExtendedState(JFrame.MAXIMIZED_BOTH);
        LoginADM.setLayout(null);

        JPanel painelFundo = new JPanel();
        painelFundo.setLayout(null);
        painelFundo.setBackground(Color.WHITE);
        painelFundo.setBounds(0, 0, 1920, 1080);
        LoginADM.add(painelFundo);

        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(null);
        painelLogin.setBackground(new Color(0, 87, 156));
        painelLogin.setBounds(520, 200, 500, 400);
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

        JButton botaoLogar = new JButton("Logar");
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setBounds(150, 290, 200, 50);
        painelLogin.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                if (authenticateUser(email, senha)) {
                    TelaLogada.main(new String[]{});
                    LoginADM.dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginADM, "Usuário ou senha incorretos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBounds(0, 0, 1920, 80);
        painelFundo.add(headerPanel);

        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);

        JButton botaoVoltar = new JButton("◀️");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 25));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setForeground(Color.WHITE);

        headerPanel.add(botaoVoltar);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoIdioma);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginADM.dispose();
            }
        });

        LoginADM.setVisible(true);
    }

    private boolean authenticateUser(String email, String senha) {
        boolean authenticated = false;

        try (Connection conn = getConnection()) {
            String sql = "SELECT 1 FROM usuarios WHERE email = ? AND senha = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, senha);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        authenticated = true;
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return authenticated;
    }

    private Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway";
        String user = "root";
        String password = "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb";

        return DriverManager.getConnection(url, user, password);
    }
}