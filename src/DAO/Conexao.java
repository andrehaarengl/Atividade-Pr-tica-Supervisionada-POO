/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Mensagens;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class Conexao {

    public static final String URL = "jdbc:mysql://localhost/Mercado";
    public static final String USU = "root";
    public static final String SENHA = "18231322";
    public static Connection con = null;
    public static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection abreConexao() throws SQLException {
        try {
            con = DriverManager.getConnection(URL, USU, SENHA);
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
            e.printStackTrace();
            Mensagens.erro("Problemas na Conexão", null);
        }
        return con;
    }

    public static void fechaConexao() {
        if (con != null) {
            try {
                con.close();
                con = null;
            } catch (SQLException ex) {
                Mensagens.erro("Erro ao fechar conexao", null);
            }
        }
    }

    public static Connection getCon() {
        return con;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getCon());
            abreConexao();
            System.out.println(getCon());
            fechaConexao();
            System.out.println(getCon());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
