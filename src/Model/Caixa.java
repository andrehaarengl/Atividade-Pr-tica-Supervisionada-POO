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

    public Caixa(int codigoCaixa) {
        this.codigoCaixa = codigoCaixa;
    }

    private int codigoCaixa;
    private int codigoOperador;

    public int getCodigoCaixa() {
        return codigoCaixa;
    }

    public void setCodigoCaixa(int codigoCaixa) {
        this.codigoCaixa = codigoCaixa;
    }

    public int getCodigoOperador() {
        return codigoOperador;
    }

    public void setCodigoOperador(int codigoOperador) {
        this.codigoOperador = codigoOperador;
    }
}
