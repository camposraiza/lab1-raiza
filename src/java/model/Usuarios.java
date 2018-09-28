package model;

public class Usuarios {
    
    private String usuario = null;
    private String senha = null;

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public boolean verficaUsuario(){
    if(this.usuario!=null && this.senha!=null){
    if(this.usuario.equals("usuario") && this.senha.equals("senha"))
        return true;
     }
    return false;
   }
    
 
}

    

