/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package exfaculdade;
/**
 *
 * @author gabri
 */
public class Funcionario extends Pessoa{
    
    protected String departamento;
    protected int faltas;
    protected double funcSalario;

    public Funcionario(String nome, int rg, int qntdFilhos, String departamento, double funcSalario) {
        super(nome, rg, qntdFilhos);
        this.departamento = departamento;
        this.funcSalario = funcSalario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void hollerith() {
        System.out.println("\nDepartamento: " + departamento);
        super.hollerith(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void registraFalta () {
        this.faltas = this.faltas + 1;
    }

    @Override
    public double calcularSalario() {
        this.totalSalario = funcSalario - ((faltas * funcSalario) / 20) + 42 + (100 * qntdFilhos);
        return this.totalSalario;
    }

    @Override
    public void zerarMes() {
        super.zerarMes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        this.faltas = 0;
    }
    
    
    
    
}
