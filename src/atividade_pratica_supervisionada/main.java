/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica_supervisionada;

import DAO.CaixaDAO;
import DAO.ClienteDAO;
import Model.Caixa;
import Model.Cliente;
import Model.Funcionario;
import Model.Produto;
import Model.Vendedor;
import java.util.List;

/**
 *
 * @author andre
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Cliente clie = new Cliente();
//
//        Funcionario func = new Funcionario();
//        Vendedor vende = new Vendedor();
//        vende.venderProduto(new Produto(1, "sabonete", 0, 0), 10);
//        
        //System.out.println(clie.consultarProdutos());
//        List<Produto> nome = clie.consultarProdutoByName(new Produto(0, "sabonete", 0, 0));
//        
//        for (Produto p: nome){
//            System.out.println(p);
//        }
//        
//        CaixaDAO caixaDao = new CaixaDAO();
//        caixaDao.inserirCaixa(new Funcionario(0, 0, "Vendedor"));
//        Cliente cliente = new Cliente();
//        cliente.setNome("Andre");
//        cliente.setSobreNome("Haarengl");
//        cliente.setIdade(22);
//        cliente.setCodigoCliente(0);
//        ClienteDAO clienteDao = new ClienteDAO();
//        clienteDao.inserirCliente(cliente);

    Vendedor vend = new Vendedor();
    vend.venderProduto(new Produto(2, "", 0, 0), 10);


    }

}
