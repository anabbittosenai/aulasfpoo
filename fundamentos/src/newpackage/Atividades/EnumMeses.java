/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;
/**
 *
 * @author Aluno
 */
public enum EnumMeses {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIU("Abriu"),
    MAIO("Maio"),
    JULHO("Julho"),
    JUNHO("Junho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DESEMBRO("Desembro");
    private String Meses;

    private EnumMeses(String Meses) {
        this.Meses = Meses;
    }

    public void setMeses(String Meses) {
        this.Meses = Meses;
    }

    @Override
    public String toString() {
        return "EnumMeses{" + "Meses=" + Meses + '}';
    }
    
}
