package extecelagem;

public class vendedores extends funcionario {
    protected double vendas;

    public vendedores(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void registrarVenda(double valor) {
        this.vendas = this.vendas + valor;
    }

    @Override
    public double salarioLiquido() {
        this.salarioLiquido = salarioBase + (vendas * 0.03);
        super.soma();
        return this.salarioLiquido;
    }

    @Override
    public void novoMes() {
        this.vendas = 0;
        super.novoMes();
    }
}
