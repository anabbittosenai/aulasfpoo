
package classes;

public class Aluno {
    private String Nome;
    private String email;
    private int RA;

    public Aluno(String Nome, String email, int RA) {
        this.Nome = Nome;
        this.email = email;
        this.RA = RA;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + Nome + ", email=" + email + ", RA=" + RA + '}';
    }
    
}
