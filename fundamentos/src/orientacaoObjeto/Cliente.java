
package orientacaoObjeto;

public class Cliente implements AluguelFilme, CadastroCliente {
    
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
    public double calcularLocacao(int qtdDias) {
        return qtdDias * AluguelFilme.VALOR_FILME_SIMPLES;
    }
    public double calcularLocacao(int qtdDias, boolean lancamento) {
        return qtdDias * AluguelFilme.VALOR_FILME_LANCAMENTO;
    }

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() > 7) {
            System.out.println("nome" + nome + "do cliente é valido");
            return true;
        } else {
            System.out.println("Nome" + nome + "do cliente é invalido");
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
            System.out.println("Seu email é do Google");
            return true;
        } else {
            System.out.println("Seu email não é do Google");
            return false;
        }
        
    }
}
