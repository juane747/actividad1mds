public class Usuario{
    public int idUsuario;
    public String nombreUsuario;
    public String userName;
    public String password;
    public String email;

    public Usuario(){

    }

    public Usuario(int id, String nombre, String user, String pass, String correo){
        this.idUsuario=id;
        this.nombreUsuario=nombre;
        this.userName=user;
        this.password=pass;
        this.email=correo;
    }

    public int getidUsuaio(){
        return idUsuario;
    }

    public void setidUsuario(int idUsuario){
        this.idUsuario=idUsuario;
    }

    public String getnombreUsuario(){
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }

    public String getuserName(){
        return userName;
    }

    public void setuserName(String userName){
        this.userName=userName;
    }

    public String getpassword(){
        return password;
    }

    public void setidUsuario(String password){
        this.password=password;
    }

    public String getemail(){
        return email;
    }

    public void setemail(String email){
        this.email=email;
    }

      public void ModificarUsuario(String us){
        this.nombreUsuario = us;
        System.out.println("El nuevo nombre del usuario es: "+this.nombreUsuario);
    }

    public String toString(){
      try{
      return "No. Usuario: "+this.idUsuario+" |Nombre: "+this.nombreUsuario+" | Username: "+this.userName+" | E-mail: "+this.email;
      }catch(NullPointerException npe){
        return "sin valores";
      }
    }
}
