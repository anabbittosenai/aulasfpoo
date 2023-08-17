/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;


/**
 *
 * @author Aluno
 */
public enum EnumLivros {
    TERROR("Terror"),
    ROMANCE("Romance"),
    SUSPENCE("Suspense"),
    DRAMA("Drama"),
    FANTASIA("Fantasia");
    private String generos;

    private EnumLivros(String generos) {
        this.generos = generos;
    }

    public String getGeneros() {
        return this.generos;    
    }
    
    @Override
    public String toString() {
        return "EnumLivros{" + "generos=" + generos + '}';
    }
    
}
