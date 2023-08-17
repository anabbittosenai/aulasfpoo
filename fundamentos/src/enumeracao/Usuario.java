/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String name;
    private String email;
    private boolean ativo;
    private TipoUsuarioEnum tipo; 

    public Usuario(String name, String email, boolean ativo, TipoUsuarioEnum tipo) {
        this.name = name;
        this.email = email;
        this.ativo = ativo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", email=" + email + ", ativo=" + ativo + ", tipo=" + tipo + '}';
    }
    
    
    
}
