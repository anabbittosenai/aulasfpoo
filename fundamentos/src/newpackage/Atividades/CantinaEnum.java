/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;

import com.sun.source.util.DocSourcePositions;

/**
 *
 * @author Aluno
 */
public enum CantinaEnum {
    BOMBOM_DE_MORANGO("Bombom de Morango"),
    DORITOS("Doritos"),
    DISCAT("Discat"),
    FANTA_UVA("Fanta Uva"),
    DOCE_DE_ABOBORA("Doce de Abobora"),
    MORANGOS("Morangos"),
    SUCO_DE_CAIXINHA("Suco de Caxinha"),
    PASTEL("Pastel");
    
    private String cantina;

    private CantinaEnum(String cantina) {
        this.cantina = cantina;
    }

    public void setCantina(String cantina) {
        this.cantina = cantina;
    }

    @Override
    public String toString() {
        return "CantinaEnum{" + "cantina=" + cantina + '}';
    }
    
    
}
