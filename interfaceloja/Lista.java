
package interfaceloja;

public class Lista {
    
    private final ItemEstoqueInt[] lista;
    private int quantidade;

    public Lista(int capacidade) {
        lista = new ItemEstoqueInt[capacidade];
        quantidade = 0;
    }
    
    public int add(ItemEstoqueInt item) {
        if (quantidade >= lista.length) {
            return -1;
        } 
        
        int indice = quantidade;
        
        lista[quantidade] = item;
        
        quantidade ++;
        
        return indice;
    }  
    
    public boolean incUnits (int index, int qtd) {
        
        if (index > quantidade) {  
            return false;
        }
        
        lista[index].incUnits(qtd);
        return true;
    }
    
    public boolean decUnits (int index, int qtd) {
        
        if (quantidade <= index) {  
            return false;
        }
        
        lista[index].decUnits(qtd);
        return true;
    }
    
    public void listAll() {
    
        double total = 0;
        
        for (int i = 0; i <= quantidade; i++) {
            if (lista[i] != null) {
                lista[i].print();

                total = total + (lista[i].getPrice() * lista[i].getUnits());

                System.out.println("\nValor Total: " + total);
            }
        }
    }
    
    
}
