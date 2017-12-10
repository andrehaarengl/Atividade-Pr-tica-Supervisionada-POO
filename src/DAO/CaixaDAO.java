/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Caixa;
import Model.Funcionario;
import Model.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  
 * @author andre
 */
public class CaixaDAO {
    
    public CaixaDAO(){
        
    }
    
    
     public boolean inserirCaixa(Funcionario funcionario) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "insert into Caixa values(null,?)";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setInt(1, funcionario.getCofigoFuncionario());
                
                int q = pstmt.executeUpdate(comando);
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
