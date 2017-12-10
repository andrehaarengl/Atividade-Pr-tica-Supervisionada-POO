/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Cliente extends Pessoa {

    public Cliente() {

    }

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /*
    
     */
    public List<Produto> consultarProdutos() {
        List<Produto> result = new ArrayList<>();
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto";
                PreparedStatement pstmt = con.prepareStatement(comando);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Produto a = new Produto();
                    a.setCodigoProduto(rs.getInt("idProduto"));
                    a.setNomeProduto(rs.getString("Nome"));
                    a.setValorProduto(rs.getDouble("Valor"));
                    a.setQuntProduto(rs.getInt("Quantidade"));
                    result.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na Consulta", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Produto> consultarProdutoByName(Produto produto) {
        List<Produto> result = new ArrayList<>();
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto where Nome = ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setString(1, produto.getNomeProduto());
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Produto a = new Produto();
                    a.setCodigoProduto(rs.getInt("idProduto"));
                    a.setNomeProduto(rs.getString("Nome"));
                    a.setValorProduto(rs.getDouble("Valor"));
                    a.setQuntProduto(rs.getInt("Quantidade"));
                    result.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na Consulta", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Produto> consultarProdrutoByIdDois(Produto produto) {
        //
        List<Produto> result = new ArrayList<>();
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto where idProduto= ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setInt(1, produto.getCodigoProduto());
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Produto a = new Produto();
                    a.setCodigoProduto(rs.getInt("idProduto"));
                    a.setNomeProduto(rs.getString("Nome"));
                    a.setValorProduto(rs.getDouble("Valor"));
                    a.setQuntProduto(rs.getInt("Quantidade"));
                    result.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na Consulta", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public Produto consultarProdrutoById(int cdProduto) {
        Produto result = null;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto where idProduto= ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setInt(1, cdProduto);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                Produto a = new Produto();
                a.setCodigoProduto(rs.getInt("idProduto"));
                a.setNomeProduto(rs.getString("Nome"));
                a.setValorProduto(rs.getDouble("Valor"));
                a.setQuntProduto(rs.getInt("Quantidade"));
                result = a;
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na Consulta", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

//    public String toString() {
//        String result = null;
//
//        return result;
//    }

}
