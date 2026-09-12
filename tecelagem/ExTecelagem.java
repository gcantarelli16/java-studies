/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extecelagem;

/**
 *
 * @author gabri
 */
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        administracao a1 = new administracao("Jorge", 1, 1000);
        producao p1 = new producao("Wilton", 2, 30);
        vendedores v1 = new vendedores ("Sergio", 3, 800);
        
        a1.registrarFalta();
        
        p1.registrarHorasDiurnas(20);
        p1.registrarHorasNorturnas(10);
        
        v1.registrarVenda(3000);
        
        a1.hollerith();
        p1.hollerith();
        v1.hollerith();
        
        a1.novoMes();
        p1.novoMes();
        v1.novoMes();
        
        a1.hollerith();
        p1.hollerith();        
        v1.hollerith();

        p1.registrarHorasDiurnas(20);
        p1.registrarHorasNorturnas(10);
        
        p1.hollerith();    
        
    }
    
}
