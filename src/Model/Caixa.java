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
public class Caixa {

    public Caixa() {

    }

    private int codigoCaixa;
    private String nomeOperador;
    private int codigoOperador;
    /*
        Esse médoto faz uma subtraçao do determinado protudo, e sua respectiva 
        quantidade
        São passados por parâmetro Nome do produto, codigo do protudo e a sua 
        quantidade a ser subtraida
    
    */
    public void venderProduo(String produto, int codigoProduto, int qutProduto){
        Estoque estoque = new Estoque();
        
    }
	public int getCodigoCaixa() {
		return codigoCaixa;
	}
	public void setCodigoCaixa(int codigoCaixa) {
		this.codigoCaixa = codigoCaixa;
	}
	public String getNomeOperador() {
		return nomeOperador;
	}
	public void setNomeOperador(String nomeOperador) {
		this.nomeOperador = nomeOperador;
	}
	public int getCodigoOperador() {
		return codigoOperador;
	}
	public void setCodigoOperador(int codigoOperador) {
		this.codigoOperador = codigoOperador;
	}
}
