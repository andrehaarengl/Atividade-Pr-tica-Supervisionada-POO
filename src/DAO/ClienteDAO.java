/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ClienteDAO {

    public ClienteDAO() {

    }

    public boolean inserirCliente(Cliente cliente) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "insert into Cliente values(null,'?','?')";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setString(1, cliente.getNome() + " " + cliente.getSobreNome());
                pstmt.setInt(2, cliente.getIdade());
                int q = pstmt.executeUpdate();
                if (q != 1) {
                    throw new SQLException("Problemas na inserção");
                }
                result = true;
            } catch (Exception e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na inserção", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Cliente> consultar() {
        List<Cliente> retorno = new ArrayList<>();
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Cliente order by Nome";
                Statement stmt = con.prepareStatement(comando);
                ResultSet rs = stmt.executeQuery(comando);
                while (rs.next()) {

                    Cliente cliente = new Cliente();
                    cliente.setCodigoCliente(rs.getInt("idCliente"));
                    cliente.setNome(rs.getString("Nome"));
                    cliente.setIdade(rs.getInt("Idade"));

                    retorno.add(cliente);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na inserção", null);
            } finally {
                Conexao.fechaConexao();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

}
