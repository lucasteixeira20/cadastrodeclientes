package bean;

public class Produto {
    private String CodEAN;
    private String Nome;
    private float Valor;
    private int Quantidade;

    public void setCodEAN(String CodEAN) {
        this.CodEAN = CodEAN;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getCodEAN() {
        return CodEAN;
    }

    public String getNome() {
        return Nome;
    }

    public float getValor() {
        return Valor;
    }

    public int getQuantidade() {
        return Quantidade;
    }
    
}