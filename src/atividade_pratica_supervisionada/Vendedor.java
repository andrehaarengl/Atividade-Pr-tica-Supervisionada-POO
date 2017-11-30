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
public class Vendedor extends Funcionario {

    public Vendedor() {

    }
    /*
    Esse método vai subtrar um produto do estoque
    */
    public void venderProduto(int produ, int qutProdu, String nomeProdu) {
        Caixa caixa = new Caixa();
        caixa.venderProduo(nomeProdu,produ,qutProdu);
        Arquivo arquivo = new Arquivo();
		arquivo.setLocalDiretorio("./ProdutosBD/");;
		arquivo.criarDiretorio(arquivo.getLocalDiretorio());
		arquivo.setArquivo("CadastroGerente.txt");
		arquivo.criaArquivo(arquivo.getArquivo());

		
        
    }
    
}
