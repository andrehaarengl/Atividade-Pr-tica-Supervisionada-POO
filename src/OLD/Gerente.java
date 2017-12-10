/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OLD;

/**
 *
 * @author andre
 */
public class Gerente extends Funcionario {

	public Gerente() {

	}

	public void cadastrarProduto(String produto, double valor, int qutProduto) {
		Arquivo arquivo = new Arquivo();
		arquivo.setLocalDiretorio("./ProdutosBD/");;
		arquivo.criarDiretorio(arquivo.getLocalDiretorio());
		arquivo.setArquivo("CadastroGerente.txt");
		arquivo.criaArquivo(arquivo.getArquivo());
		arquivo.escreverArquivo(arquivo.getArquivo(), produto + ":" + valor+":"+qutProduto);
	}

	public void emitirRelatorio() {
		
	}

}
