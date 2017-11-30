/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica_supervisionada;

/**
 *
 * @author andre
 */
public class main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		/*
		 * Cadastro de Produtos
		 * Gerente gerente = new Gerente(); gerente.cadastrarProduto("Sabonete",2.70,2);
		 * 
		 */

		Cliente cliente = new Cliente();
		System.out.println(cliente.consultarProduto("Sabonete"));

	}

}
