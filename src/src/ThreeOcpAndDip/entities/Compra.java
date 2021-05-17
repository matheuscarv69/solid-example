package src.ThreeOcpAndDip.entities;

public class Compra {

    private int id;
    private double valor;
    private String cidade;

    public Compra(double valor, String cidade) {
        this.id = id;
        this.valor = valor;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
