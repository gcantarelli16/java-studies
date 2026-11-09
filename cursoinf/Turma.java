
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



//Um curso de informática precisa de um sistema para cadastrar seus alunos. Cada turma de alunos usa o laboratório em um horário específico 
//durante a semana e tem no máximo 20 alunos. Crie uma classe para as turmas e outra para os alunos. A classe das turmas precisa ter como atributos o nome do curso, 
//a quantidade total de aulas (int) e a lista de alunos. A classe para os alunos precisa registrar código do aluno (int), 
//seu nome (String), a média final (double) e a quantidade de faltas (int). Todos os atributos devem ser privados e não use construtores padrão. 
//Na classe para os alunos implemente todos os métodos necessários para que a classe para a turma possa fazer todas as operações sem acesso direto aos atributos dos alunos. 

//void listarTodos()
//Lista todos os alunos na saída padrão. A listagem deve incluir o código, o nome, a nota final e a quantidade de faltas e a frequência 
//(porcentagem de presenças em relação à quantidade total de aulas) de cada aluno. No topo da listagem imprima o nome do curso.

//void listarAprovados()
//Lista os alunos aprovados na saída padrão. O aluno é considerado aprovado se teve média maior ou igual a 6.0 e teve pelo menos 75% de frequência. 
//No topo da listagem imprima o nome do curso.

//O método main da aplicação deve testar todos os métodos acima incluindo pelo menos 3 alunos no sistema e capturar todas as exceções lançadas.
