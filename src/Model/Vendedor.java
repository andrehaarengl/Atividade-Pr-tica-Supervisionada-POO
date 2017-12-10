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
public class Vendedor extends Funcionario {

    public Vendedor() {

    }

    /*
    Não feito
     */
    public boolean venderProduto(Produto produto, int quantProduto) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            con.setAutoCommit(false);
            try {
                Cliente cliente = new Cliente();
                produto = cliente.consultarProdrutoById(produto.getCodigoProduto());
                String comando = "update Produto set Quantidade = ? where idProduto = ?";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setInt(1, produto.getQuntProduto() - quantProduto);
                //System.out.println(produto.getQuntProduto() - quantProduto);
                pstmt.setInt(2, produto.getCodigoProduto());

                int q = pstmt.executeUpdate();
                if (q != 1) {
                    throw new SQLException("Problemas na inserção");
                }
                con.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                Mensagens.erro("Problemas na inserção", null);
            } finally {
                Conexao.fechaConexao();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

//    /*
//    Esse método vai subtrar um produto do estoque
//     */
//    public void venderProduto(int produ, int qutProdu, String nomeProdu) {
//        Caixa caixa = new Caixa();
//        caixa.venderProduo(nomeProdu, produ, qutProdu);
//        Arquivo arquivo = new Arquivo();
//        arquivo.setLocalDiretorio("./ProdutosBD/");;
//        arquivo.criarDiretorio(arquivo.getLocalDiretorio());
//        arquivo.setArquivo("CadastroGerente.txt");
//        arquivo.criaArquivo(arquivo.getArquivo();)
//
//    }
}
