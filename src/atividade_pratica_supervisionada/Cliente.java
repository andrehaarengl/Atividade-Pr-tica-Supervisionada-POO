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
public class Cliente extends Pessoa{
    
    public Cliente(){
        
    }
    
    public void consultarProduto(String produto){
    	Arquivo arquivo = new Arquivo();
		arquivo.setLocalDiretorio("./ProdutosBD/");;
		arquivo.criarDiretorio(arquivo.getLocalDiretorio());
		arquivo.setArquivo("CadastroGerente.txt");
		arquivo.criaArquivo(arquivo.getArquivo());
        arquivo.lerConteudoArquivo(arquivo.getArquivo(), "Sabonete:2.7:2");
        arquivo.lerConteudoArquivo(arquivo.getArquivo(), "");
    }
    
}
