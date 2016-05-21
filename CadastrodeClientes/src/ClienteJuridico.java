public class ClienteJuridico {
    //Classe com gets e sets
    private String RazaoSocial;
    private String CNPJ;
    private String Telefone;
    private String Email;

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
