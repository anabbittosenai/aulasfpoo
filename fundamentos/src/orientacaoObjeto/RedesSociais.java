
package orientacaoObjeto;

import enumeracao.TipoUsuarioEnum;
import enumeracao.Usuario;

public class RedesSociais {
    public static void main(String[] args) {
    int qtdeEstrelas = 0;  
        
    Posts postagem1 = new Posts("aninha", "gatinhos fofos", 300, 400);
        System.out.println(postagem1);
    qtdeEstrelas = postagem1.comum(1);
         Posts postagem2 = new Posts("fernandinho", "tutorial de como fazer panquecas", 3500, 4000);
        System.out.println(postagem2);
    qtdeEstrelas = postagem1.comum(5);
     Posts postagem3 = new Posts("Cachinhos", "como custurar", 30, 10);
        System.out.println(postagem3);
    qtdeEstrelas = postagem1.comum(3);
     Posts postagem4 = new Posts("joão", "Como custumizar roupa velha", 0, 4);
        System.out.println(postagem4);
    qtdeEstrelas = postagem1.comum(1);
    }
}
