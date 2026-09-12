/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author gabri
 */
public class producao extends funcionario{
    
    public int horasd;
    public int horasn;

    public producao(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
    }

    public int getHorasd() {
        return horasd;
    }

    public void setHorasd(int horasd) {
        this.horasd = horasd;
    }

    public int getHorasn() {
        return horasn;
    }

    public void setHorasn(int horasn) {
        this.horasn = horasn;
    }
    
    public void registrarHorasDiurnas(int horasd) {
        this.horasd = this.horasd + horasd;
    }
    
    public void registrarHorasNorturnas(int horasn) {
        this.horasn = this.horasn + horasn;
    }
    
    @Override
    public double salarioLiquido() {
        this.salarioLiquido = (this.salarioBase * horasd) + ((this.salarioBase * horasn)*1.3);
        super.soma();
        return this.salarioLiquido;
    }   

    @Override
    public void novoMes() {
        this.horasd = 0;
        this.horasn = 0;
        super.novoMes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hollerith() {
        super.hollerith(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
