/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfaculdade;

/**
 *
 * @author gabri
 */
public abstract class Pessoa {
    
    protected String nome;
    protected int rg;
    protected int qntdFilhos;
    protected double totalSalario;

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

    public int getQntdFilhos() {
        return qntdFilhos;
    }

    public void setQntdFilhos(int qntdFilhos) {
        this.qntdFilhos = qntdFilhos;
    }

    public Pessoa(String nome, int rg, int qntdFilhos) {
        this.nome = nome;
        this.rg = rg;
        this.qntdFilhos = qntdFilhos;
    }
    
    public abstract double calcularSalario(); 


    
    public void hollerith() {
        System.out.println("Nome: " + nome + "\nRG: " + rg + "\nQuantidade de FIlhos: " + qntdFilhos + "\nSalario: " + totalSalario);
    }
    
    public void zerarMes() {
        this.totalSalario = 0;
    }
}
