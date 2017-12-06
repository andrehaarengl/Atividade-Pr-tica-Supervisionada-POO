/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author andre
 */
public class Gerente extends Funcionario {

    public Gerente() {

    }

    public boolean cadastrarProduto(Produto produto) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "insert into Produto values(null,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setString(1, produto.getNomeProduto());
                pstmt.setDouble(2, produto.getValorProduto());
                pstmt.setInt(3, produto.getQuntProduto());
                int q = pstmt.executeUpdate();
                if (q != 1) {
                    throw new SQLException("Problemas na inserção");
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

        /*
        Arquivo arquivo = new Arquivo();
        arquivo.setLocalDiretorio("./ProdutosBD/");;
        arquivo.criarDiretorio(arquivo.getLocalDiretorio());
        arquivo.setArquivo("CadastroGerente.txt");
        arquivo.criaArquivo(arquivo.getArquivo());
        arquivo.escreverArquivo(arquivo.getArquivo(), produto + ":" + valor + ":" + qutProduto);
         */
        return result;
    }

    /*
    Implementar
     */
    public List<Produto> emitirRelatorioEstoque() {
        Produto result = null;

        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "select * from Produto";
                PreparedStatement pstmt = con.prepareStatement(comando);

            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na inserção", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (List<Produto>) result;
    }

    /*
    Implementar
     */
    public void emitirRelatorioCaixa() {

    }
}
