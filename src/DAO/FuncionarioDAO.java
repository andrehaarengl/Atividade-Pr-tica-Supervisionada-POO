/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionario;
import Model.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class FuncionarioDAO {
    
    public FuncionarioDAO(){
        
    }
    
    
    public boolean inserirFuncionario(Funcionario funcionario) {
        boolean result = false;
        try {
            Connection con = Conexao.abreConexao();
            try {
                String comando = "insert into Funcionario values(null,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(comando);
                pstmt.setString(1, funcionario.getNome() + " " + funcionario.getSobreNome());
                pstmt.setInt(2, funcionario.getIdade());
                pstmt.setDouble(3, funcionario.getSalarioFixo());
                pstmt.setString(4, funcionario.getTipoFuncionario());
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
