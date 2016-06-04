package bean;

public class ClienteJuridico extends Cliente{

    private String CNPJ;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }
}
