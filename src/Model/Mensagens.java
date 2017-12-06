/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author andre
 */
import java.awt.Component;
import javax.swing.JOptionPane;

/*
    Classe para dar mensagens de erro caso ocorrão falhas na conexão com o banco de dados
 */
public class Mensagens {

    public static void ok(String mensagem, Component comp) {
        JOptionPane.showMessageDialog(comp, mensagem, "OK", JOptionPane.PLAIN_MESSAGE);
    }

    public static void erro(String mensagem, Component comp) {
        JOptionPane.showMessageDialog(comp, mensagem, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
}
