package net.weg.apresentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginAdm {

    public void clickLoginAdm(boolean temaClaroAtivo) {
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
        painelLogin.setBounds(480, 200, 975, 600);
        painelFundo.add(painelLogin);

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 25));
        labelUsuario.setBounds(80, 30, 200, 30);
        painelLogin.add(labelUsuario);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(80, 70, 820, 70);
        campoUsuario.setFont(new Font("Arial", Font.BOLD, 34));
        painelLogin.add(campoUsuario);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.WHITE);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 25));
        labelSenha.setBounds(80, 180, 200, 30);
        painelLogin.add(labelSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(80, 220, 720, 70);
        campoSenha.setFont(new Font("Arial", Font.BOLD, 34));
        painelLogin.add(campoSenha);

        ArredondamentoDeBotao botaoOlho = new ArredondamentoDeBotao("👁️",6);
        botaoOlho.setFont(new Font("SansSerif", Font.PLAIN, 38));
        botaoOlho.setFocusable(false);
        botaoOlho.setBounds(820, 220, 80, 70);

        botaoOlho.addActionListener(new ActionListener() {
            private boolean mostrando = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (mostrando) {
                    campoSenha.setEchoChar('•');
                    mostrando = false;
                } else {
                    campoSenha.setEchoChar((char) 0);
                    mostrando = true;
                }
            }
        });

        painelLogin.add(botaoOlho);

        ArredondamentoDeBotao botaoLogar = new ArredondamentoDeBotao("Logar",6);
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setBounds(340, 380, 300, 80);
        botaoLogar.setBorderPainted(false);
        botaoLogar.setFocusPainted(false);
        painelLogin.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                if (authenticateUserAndRegisterLogin(email, senha)) {
                    TelaLogada.main(new String[]{});
                    LoginADM.dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginADM, "Usuário ou senha incorretos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBounds(0, 0, 1920, 80);
        painelFundo.add(headerPanel);

        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);
        botaoIdioma.setBorderPainted(false);
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setContentAreaFilled(false);
        botaoIdioma.setOpaque(false);
        botaoIdioma.setBorderPainted(false);

        JButton botaoVoltar = new JButton("◀️");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 25));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setForeground(Color.WHITE);
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setOpaque(false);
        botaoVoltar.setBorderPainted(false);

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

    private boolean authenticateUserAndRegisterLogin(String email, String senha) {
        boolean authenticated = false;

        try (Connection conn = getConnection()) {
            String sql = "SELECT id FROM usuarios WHERE email = ? AND senha = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, senha);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        authenticated = true;
                        int usuarioId = rs.getInt("id");

                        // 2. Inserir registro de login na tabela logins
                        String insertSql = "INSERT INTO logins (usuario_id) VALUES (?)";
                        try (PreparedStatement psInsert = conn.prepareStatement(insertSql)) {
                            psInsert.setInt(1, usuarioId);
                            psInsert.executeUpdate();
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return authenticated;
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://maglev.proxy.rlwy.net:21239/railway";
        String user = "root";
        String password = "rapOEQXmJZLYFiltlqGiDkyUWGUVTQMJ";

        return DriverManager.getConnection(url, user, password);
    }
}









