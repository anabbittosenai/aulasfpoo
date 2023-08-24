/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

public enum MarchaEnum {
    
    PRIMEIRA_MARCHA("Primeira marcha", 1),
    SEGUNGA_MARCHA("Segunda marcha", 2),
    TERCEIRA_MARCHA("Terceira marcha", 3),
    QUARTA_MARCHA("Quarta marcha", 4),
    QUINTA_MARCHA("Quinta marcha", 5),
    MARCHA_RE("Marcha ré", -1),
    Neutro("Neutro", 0);
    
    private String marchas;
    private  int numeromarcha;

    private MarchaEnum(String marchas, int numeroMarcha) {
        this.marchas = marchas;
        this.numeromarcha = numeromarcha;
    }

    public String getMarchas() {
        return marchas;
    }
    public int getNumeroMarcha() {
    return numeromarcha;
    }
    
    
}
