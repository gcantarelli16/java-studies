package exfaculdade;

public class Funcionario extends Pessoa {
    protected String departamento;
    protected int faltas;
    protected double funcSalario;

    public Funcionario(String nome, int rg, int qntdFilhos, String departamento, double funcSalario) {
        super(nome, rg, qntdFilhos);
        this.departamento = departamento;
        this.funcSalario = funcSalario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void hollerith() {
        System.out.println("\nDepartamento: " + departamento);
        super.hollerith();
    }

    public void registraFalta() {
        this.faltas = this.faltas + 1;
    }

    @Override
    public double calcularSalario() {
        this.totalSalario = funcSalario - ((faltas * funcSalario) / 20) + 42 + (100 * qntdFilhos);
        return this.totalSalario;
    }

    @Override
    public void zerarMes() {
        super.zerarMes();
        this.faltas = 0;
    }
}
