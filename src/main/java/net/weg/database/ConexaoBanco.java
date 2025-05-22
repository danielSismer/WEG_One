package net.weg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://yamanote.proxy.rlwy.net:40662/weg_one";
    private static final String USUARIO = "root";
    private static final String SENHA = "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb";

    public static Connection getConnection() throws SQLException {
        try {
            // Carregar o driver JDBC do MySQL (pode não ser necessário dependendo do setup do seu ambiente)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelecer a conexão com o banco de dados
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC do MySQL não encontrado.", e);
        }
    }

    public static void main(String[] args) {
        try (Connection conexao = getConnection()) {
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}
