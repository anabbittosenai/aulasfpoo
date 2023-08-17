/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;

/**
 *
 * @author Aluno
 */
public class Cantina {
    
    private String itens;

    public Cantina(String itens) {
        this.itens = itens;
    }
    public String getGeneros() {
        return itens;
       }

    @Override
    public String toString() {
        return "Itens{" + "itens=" + itens + '}';
    }
    
    
    
}
