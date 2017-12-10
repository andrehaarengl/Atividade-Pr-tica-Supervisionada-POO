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
public class Funcionario extends Pessoa {

    public Funcionario() {

    }

    private double salarioFixo;
    private int cofigoFuncionario;

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
