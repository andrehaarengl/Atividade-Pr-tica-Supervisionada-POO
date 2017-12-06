/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class Cliente extends Pessoa {

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    private int codigoCliente; 

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    
    public boolean consultarProdutoById(Produto produto) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto where idProduto = ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setInt(0, produto.getCodigoProduto());
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
    
     public boolean consultarProdutoByName(Produto produto) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto where Nome = ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setString(0, produto.getNomeProduto());
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
    
    
    

}
//        Arquivo arquivo = new Arquivo();
//        arquivo.setLocalDiretorio("./ProdutosBD/");;
//        arquivo.criarDiretorio(arquivo.getLocalDiretorio());
//        arquivo.setArquivo("CadastroGerente.txt");
//        arquivo.criaArquivo(arquivo.getArquivo());
//        arquivo.lerConteudoArquivo(arquivo.getArquivo(), "Sabonete:2.7:2");
//        arquivo.lerConteudoArquivo(arquivo.getArquivo(), "");
