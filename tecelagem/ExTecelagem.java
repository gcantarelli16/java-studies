
package extecelagem;

public class ExTecelagem {

    public static void main(String[] args) {

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
