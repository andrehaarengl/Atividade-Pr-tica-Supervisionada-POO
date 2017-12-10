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
public class Produto {

    public Produto() {

    }

    public Produto(int codigoProduto, String nomeProduto, double valorProduto, int quntProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quntProduto = quntProduto;
    }

    private int codigoProduto;
    private String nomeProduto;
    private double valorProduto;
    private int quntProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuntProduto() {
        return quntProduto;
    }

    public void setQuntProduto(int quntProduto) {
        this.quntProduto = quntProduto;
    }

    public String toString() {
        String resul = null;

        resul = "Nome : " + this.nomeProduto + "Valor : " + this.valorProduto + 
                "Quantidade : " + this.quntProduto;

        return resul;
    }

}
