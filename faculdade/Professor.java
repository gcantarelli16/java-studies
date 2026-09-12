/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfaculdade;

/**
 *
 * @author gabri
 */
public class Professor extends Pessoa {
    
    protected int QntdAula = 0;
    protected String curso;
    
    
    public Professor(String nome, int rg, int qntdFilhos, String curso) {
        super(nome, rg, qntdFilhos);
        this.curso = curso;
    }
    
    public void registraAulas(int QntdAula) {
        this.QntdAula = QntdAula + this.QntdAula;
    }

    @Override
    public double calcularSalario() {
        this.totalSalario = (QntdAula * 40) + (qntdFilhos * 100);
        return this.totalSalario;
    }

    @Override
    public void hollerith() {
        System.out.println("\nCurso: " + curso);
        super.hollerith(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getQntdAula() {
        return QntdAula;
    }

    public void setQntdAula(int QntdAula) {
        this.QntdAula = QntdAula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void zerarMes() {
        super.zerarMes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        this.QntdAula = 0;
    }
    
    
    
    
    
    
}
