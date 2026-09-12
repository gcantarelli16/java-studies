/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author gabri
 */
public abstract class funcionario {
    
    protected String nome;
    protected int rg;
    protected double salarioBase;
    protected double somado;
    protected double salarioLiquido;
    
    public abstract double salarioLiquido();
    
    public void hollerith() {
        salarioLiquido();
        System.out.println("Nome: " + nome + " RG: " + rg + " Salario Base: " + salarioBase + " Somas e Descontos: " + somado + " Salario Liquido: " + salarioLiquido);
    }
    
    public void novoMes() {
        this.salarioLiquido = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public void soma() {
        this.somado = this.salarioLiquido - salarioBase;
    }

    public funcionario(String nome, int rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }
    
}
