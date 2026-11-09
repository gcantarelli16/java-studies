
package cursoinf;

public class Aluno {
    
    private int codigo;
    private String nome;
    private double media;
    private int faltas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    
}
