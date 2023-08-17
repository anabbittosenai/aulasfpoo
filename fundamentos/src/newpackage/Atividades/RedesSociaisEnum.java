/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Atividades;

import com.sun.source.tree.WhileLoopTree;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public enum RedesSociaisEnum {
    TIKTOK("TikTok"),
    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook");
    
    private String redesSociais; 

    private RedesSociaisEnum(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    public void setRedesSociais(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    @Override
    public String toString() {
        return "RedesSociaisEnum{" + "redesSociais=" + redesSociais + '}';
    }
   
    
}
