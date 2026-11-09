
package interfaceloja;

public class InterfaceLoja {

    public static void main(String[] args) {
        
        Lista lista1 = new Lista(5);
        
        Roupa camiseta = new Roupa("Camiseta", 2, 40.99, 2);
        Roupa calca = new Roupa("Calca", 1, 90.00, 4);
        
        lista1.add(camiseta); 
        lista1.add(calca);
        
        lista1.incUnits(0, 1);
        lista1.decUnits(1, 2);
        
        lista1.listAll();

        
        
    }
    
}
