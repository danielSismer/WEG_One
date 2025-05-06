package net.weg.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static Connection conexao;

    public ConexaoBanco() throws Exception {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return;
            }

            Class.forName("com.mysql.cj.jdbc.Driver");

           conexao = DriverManager.getConnection(
                   "jdbc:mysql://yamanote.proxy.rlwy.net:3306/wegone",
                    "root",
                   "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb"
            );


            conexao.setAutoCommit(false);
            conexao.setTransactionIsolation(
                    Connection.TRANSACTION_READ_COMMITTED);
        } catch (ClassNotFoundException cnf) {
            throw new Exception("Driver não encontrado!");
        } catch (SQLException sql) {
            throw new Exception("Falha ocorrida: " + sql.getMessage());
        }
    }

    public static Connection getConexao() {
        return conexao;
    }

    public void fechar() throws Exception {
        try {
            if (conexao == null || conexao.isClosed()) {
                return;
            }
            conexao.close();
        } catch (SQLException sql) {
            throw new Exception("Falha ocorrida: " + sql.getMessage());
        }
    }

    public static void confirmarTransacao() throws Exception {
        try {
            if (conexao == null || conexao.isClosed()) {
                return;
            }
            conexao.commit();
        } catch (SQLException sql) {
            throw new Exception("Falha ocorrida: " + sql.getMessage());
        }
    }

    public static void cancelarTransacao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                return;
            }
            conexao.rollback();
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }
}
