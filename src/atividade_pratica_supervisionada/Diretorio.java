/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica_supervisionada;

import java.io.File;

/**
 *
 * @author andre
 */
public class Diretorio {
	public Diretorio() {

	}

	private String localDiretorio;

	/*
	 * Método seta o diretorio a ser trabalhado
	 */
	public void setLocalDiretorio(String dire) {
		this.localDiretorio = dire;
	}

	/*
	 * Método retorna o diretorio a ser trabalhado
	 */
	public String getLocalDiretorio() {
		return localDiretorio;
	}

	/*
	 * Método cria diretorio, o diretório e definido pelo método setArquivoLocal;
	 */
	public void criarDiretorio(String dire) {
		try {
			File diretorio = new File(dire);
			diretorio.mkdir();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Método apaga o diretorio, o diretório e definido pelo método setArquivoLocal;
	 */
	public void apagaDiretorio(String dire) {
		try {
			File diretorio = new File(dire);
			diretorio.delete();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	/*
	 * Método lista todos os aquivos que estão no diretorio definido pelo método
	 * setAquivoLocal
	 */
	public void listarArquivosDiretorio() {
		String diretorio;
		diretorio = this.localDiretorio;
		File fil = new File(diretorio);
		String fi[] = fil.list();

		for (int i = 0; i < fi.length; i++) {
			System.out.println(fi[i]);
		}

	}

}
