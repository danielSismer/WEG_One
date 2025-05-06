package net.weg.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TesteConexaoBanco {
    public static void main(String[] args) {
        ConexaoBanco conexaoBanco = null;
        Connection conexao = null;

        try {
            conexaoBanco = new ConexaoBanco();
            conexao = conexaoBanco.getConexao();

            if (conexao != null) {
                Statement stmt = conexao.createStatement();
                String sql = "SELECT * FROM usuarios LIMIT 10";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    System.out.println("id: " + rs.getString("id"));

                }

                rs.close();
                stmt.close();
                conexaoBanco.confirmarTransacao();
            } else {
                System.err.println("Falha ao conectar ao banco de dados.");
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            ConexaoBanco.cancelarTransacao();
        } finally {
            try {
                if (conexaoBanco != null) {
                    conexaoBanco.fechar();
                    System.out.println("Conexão fechada.");
                }
            } catch (Exception e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
