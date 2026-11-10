
package cursoinf;

public class Turma {
    
    private String nome;
    private int totalAulas;
    private Aluno[] lista;
    private int quantidade;
    
    public Turma(String nome, int total_aulas) {
        lista = new Aluno[20];
        quantidade = 0;
        this.totalAulas = total_aulas;
        this.nome = nome;
    }
        
    public void matricularAluno(Aluno al) throws Exception{
        if (quantidade >= 20) {
            throw new Exception("Turma Lotada!");
        }
        
        for (int i = 0; i < quantidade; i++) {          
            if (lista[i].getCodigo() == al.getCodigo()) {
                throw new Exception("Codigo Existe!");
            } 
        } 
        
        al.setMedia(0.0);
        al.setFaltas(0);  
        lista[quantidade] = al;
        quantidade++;
    }
    
    public int buscarAluno(int codigo) {
        for (int i = 0; i < quantidade; i++) {          
            if (lista[i].getCodigo() == codigo) {
                return i;
            } 
        } 
        return -1;
    }
    
    public void registrarFalta(int codigo) throws Exception {   
        int i = lancarExcecao(codigo);
        
        lista[i].setFaltas(lista[i].getFaltas()+1);
    }
    
    public void atribuirMedia(int codigo, double media) throws Exception {      
        int i = lancarExcecao(codigo);
        
        if (media >= 0 && media <= 10) {
            lista[i].setMedia(media);
        }        
    }
    
    public void listarTodos() {
        System.out.println("Curso: " + this.nome);
        System.out.println("------------------------------");
        
        for (int i = 0; i < quantidade; i++) {
            
            System.out.println("Código: " + lista[i].getCodigo());
            System.out.println("Nome: " + lista[i].getNome());
            System.out.println("Média final: " + lista[i].getMedia());
            System.out.println("Faltas: " + lista[i].getFaltas());
            System.out.println("Frequência: " + calcularPresenca(i));
            System.out.println("------------------------------");
        }      
    }
    
    public void listarAprovados() {
        System.out.println("Curso: " + this.nome);
        System.out.println("------------------------------");
        
        for (int i = 0; i < quantidade; i++) {
            
            if (lista[i].getMedia() >= 6 && calcularPresenca(i) >= 75) {
            
            System.out.println("Código: " + lista[i].getCodigo());
            System.out.println("Nome: " + lista[i].getNome());
            System.out.println("Média final: " + lista[i].getMedia());
            System.out.println("Faltas: " + lista[i].getFaltas());
            System.out.println("Frequência: " + calcularPresenca(i));
            System.out.println("------------------------------");
            
            }
        }      
    }
    
    public int lancarExcecao(int codigo) throws Exception {
        
        int i = buscarAluno(codigo);
        
        if (i == -1) {
            throw new Exception("Aluno não encontrado!");
        }
        return i;
    }
    
    public double calcularPresenca (int i) {
        return 100 - ((lista[i].getFaltas() * 100) / this.totalAulas);
    }
    
}
