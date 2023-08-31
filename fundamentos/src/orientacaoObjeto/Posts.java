
package orientacaoObjeto;

public class Posts implements ClassificacaoPost{
   private String usuario;
   private String TituloDoPost;
   private int compartilhamentos;
   private int favoritados;

    public Posts(String usuario, String TituloDoPost, int compartilhamentos, int favoritados) {
        this.usuario = usuario;
        this.TituloDoPost = TituloDoPost;
        this.compartilhamentos = compartilhamentos;
        this.favoritados = favoritados;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTituloDoPost() {
        return TituloDoPost;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public int getFavoritados() {
        return favoritados;
    }

    @Override
    public String toString() {
        return "Posts{" + "usuario=" + usuario + ", TituloDoPost=" + TituloDoPost + ", compartilhamentos=" + compartilhamentos + ", favoritados=" + favoritados + '}';
    }
   public int comum(int qtdEstrelas){
   return COMUM;
   }
   public int legal(int qtdEstrelas){
   return LEGAL;
   }
   public int super_legal(int qtdEstrelas){
   return SUPER_LEGAL;
   }
}
