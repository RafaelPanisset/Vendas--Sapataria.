package model;
/**
*
* @author Rafael 
*/
public class ModelUsuario {

    private int idUsuario;
    private String  usuNome;
    private String usoLogin;
    private String usoSenha;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * return pk_idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de usuNome
    * @param pUsuNome
    */
    public void setUsuNome(String  pUsuNome){
        this.usuNome = pUsuNome;
    }
    /**
    * return usuNome
    */
    public String  getUsuNome(){
        return this.usuNome;
    }

    /**
    * seta o valor de usoLogin
    * @param pUsoLogin
    */
    public void setUsoLogin(String pUsoLogin){
        this.usoLogin = pUsoLogin;
    }
    /**
    * return usoLogin
    */
    public String getUsoLogin(){
        return this.usoLogin;
    }

    /**
    * seta o valor de usoSenha
    * @param pUsoSenha
    */
    public void setUsoSenha(String pUsoSenha){
        this.usoSenha = pUsoSenha;
    }
    /**
    * return usoSenha
    */
    public String getUsoSenha(){
        return this.usoSenha;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::usuNome = " + this.usuNome + "::usoLogin = " + this.usoLogin + "::usoSenha = " + this.usoSenha +  "}";
    }
}