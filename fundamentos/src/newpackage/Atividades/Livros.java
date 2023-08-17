/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;

/**
 *
 * @author Aluno
 */
public class Livros {
    private  String Generos;

    public Livros(String Generos) {
        this.Generos = Generos;
    }

    public String getGeneros() {
        return Generos;
    }

    @Override
    public String toString() {
        return "Livros{" + "Generos=" + Generos + '}';
    }
    
}
