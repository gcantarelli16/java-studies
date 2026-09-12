/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exfaculdade;

/**
 *
 * @author gabri
 */
public class ExFaculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor p1 = new Professor("Jorge", 1, 2, "Historia");
        Funcionario f1 = new Funcionario("Felipe", 2 , 0, "TI", 2000);
        Funcionario f2 = new Funcionario("Augusto", 3, 1, "Secretaria", 1000);
        
        p1.registraAulas(50);
        f1.registraFalta();
        f1.registraFalta();
        f2.registraFalta();
        
        p1.calcularSalario();
        f1.calcularSalario();
        f2.calcularSalario();
      
        
        p1.hollerith();
        f1.hollerith();
        f2.hollerith();
        
        f2.zerarMes();
        
        f2.hollerith();                
        
    }
    
}
