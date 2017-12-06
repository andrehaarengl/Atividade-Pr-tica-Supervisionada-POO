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
public class Funcionario extends Pessoa {

    public Funcionario() {

    }

    public Funcionario(double salarioFixo, int cofigoFuncionario, String tipoFuncionario) {
        this.salarioFixo = salarioFixo;
        this.cofigoFuncionario = cofigoFuncionario;
        this.tipoFuncionario = tipoFuncionario;
    }

    private double salarioFixo;
    private int cofigoFuncionario;
    private String tipoFuncionario;

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public int getCofigoFuncionario() {
        return cofigoFuncionario;
    }

    public void setCofigoFuncionario(int cofigoFuncionario) {
        this.cofigoFuncionario = cofigoFuncionario;
    }

}
