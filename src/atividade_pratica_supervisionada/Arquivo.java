/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica_supervisionada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Arquivo extends Diretorio {
	public Arquivo() {

	}

	private String arquivo;

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void criaArquivo(String arqui) {
		String diretorio;
		diretorio = getLocalDiretorio();
		arqui = getArquivo();
		if (diretorio == null) {
			System.out.println("Diretorio não definido");
		} else {
			try {
				File arquivo = new File(diretorio + arqui);
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

	public void apagarArquivo(String arqui) {
		String diretorio;
		diretorio = getLocalDiretorio();
		arqui = getArquivo();
		File arquivo = new File(diretorio + arqui);
		arquivo.delete();
	}

	/*
	 * Método retorna tudo que está na lista de produtos
	 */
	public void lerArquivo(String arqui) {
		String diretorio;
		diretorio = getLocalDiretorio();
		try {
			FileReader ler = new FileReader(diretorio + arqui);
			BufferedReader lerBuf = new BufferedReader(ler);
			String linha = lerBuf.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = lerBuf.readLine();
			}
			lerBuf.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/*
	 * Método para achar determinado produto Ainda preceisa ser implementado
	 * corretamente
	 */
	public void lerConteudoArquivo(String arqui, String conteu) {
		String diretorio=null,linha=null;
		diretorio = getLocalDiretorio();
		try {
			FileReader ler = new FileReader(diretorio + arqui);
			BufferedReader lerBuf = new BufferedReader(ler);
			linha = lerBuf.readLine();
			if (linha.equals(null)) {
				System.out.println("Arquivo Vazio");
			} else {
				if (linha.equals(conteu)) {
					System.out.println(linha);
				}else {		
				}
				lerBuf.close();
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Não exite o arquivo");
//			System.out.println(e);
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Não existem Produtos Cadastrados");
		}
	}

	/*
	 * Médoto adiciona produto ao final do arquivo
	 */
	public void escreverArquivo(String arqui, String conteudo) {
		String diretorio;
		diretorio = getLocalDiretorio();
		try {
			FileWriter escre = new FileWriter(diretorio + arqui, true);
			BufferedWriter escreBuf = new BufferedWriter(escre);
			escreBuf.write(conteudo);
			escreBuf.newLine();
			escreBuf.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
