
package classes.Atividade;

public class Curso {
    private String nome;
    private String Descricao;
    private String Categoria;
    private String entrar;

    public Curso(String nome, String Descricao, String Categoria) {
        this.nome = nome;
        this.Descricao = Descricao;
        this.Categoria = Categoria;
        this.entrar();
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", Descricao=" + Descricao + ", Categoria=" + Categoria + '}';
    }
    public void entrar() {
    
    }
}
