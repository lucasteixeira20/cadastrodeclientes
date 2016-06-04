package bean;

public class Cliente {
    private String Nome;
    private String Telefone;
    private String Email;

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }
}