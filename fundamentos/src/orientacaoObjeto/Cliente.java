
package orientacaoObjeto;

public class Cliente {
    private String nome; 
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
            return "Cliente{" + "nome=" + nome + '}';
        } else {
        }
        return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
    }
    
}
