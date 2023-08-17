/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;

/**
 *
 * @author Aluno
 */
public class Enumeração {
    public static void main(String[] args) {
        
        Livros livros = new Livros(EnumLivros.DRAMA.getGeneros());
        System.out.println(livros);      
        Livros livros1 = new Livros(EnumLivros.FANTASIA.getGeneros());
        System.out.println(livros1);
        Livros livros2 = new Livros(EnumLivros.ROMANCE.getGeneros());
        System.out.println(livros2);
        Livros livros3 = new Livros(EnumLivros.SUSPENCE.getGeneros());
        System.out.println(livros3);
        Livros livros4 = new Livros(EnumLivros.TERROR.getGeneros());
        System.out.println(livros4);
        
        Cantina cantina = new Cantina(CantinaEnum.BOMBOM_DE_MORANGO.ge)
    }
    
}