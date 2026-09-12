/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author gabri
 */
public class administracao extends funcionario{
    
    protected int faltas;

    public administracao( String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public void registrarFalta() {
        this.faltas = this.faltas + 1;
    }

    @Override
    public double salarioLiquido() {
        this.salarioLiquido = salarioBase - ((salarioBase * faltas)/30);
        super.soma();
        return this.salarioLiquido;
    }

    @Override
    public void novoMes() {
        this.faltas = 0;
        super.novoMes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
}
