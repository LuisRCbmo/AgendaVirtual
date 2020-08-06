package Usuario;
import java.util.ArrayList;
import Notificaciones.Notificacion;
/**
 *
 * @author Sergio Garcia
 */
public class Users implements java.io.Serializable{
    /**
     * Users Lista de usuarios ingresados
     * Ya viene intergrado con una cuenta de Administrador para el acceso de la agenda sin crear cuenta extra.
     */
    private Notificacion notificacion;
    private ArrayList<User> users;
    private User Admin = new User("Admin", "Password","Administrador", "Aministrador", "Administrador@gmail.com", "Bolviar Avenue", "123456");
    //Inicializacion de los valores
    public Users() {
        users = new ArrayList();
        users.add(Admin);
    }
    //Verifica el estado del usuario y la contraseña, al comprobarlas, se otorga el acceso a su cuenta de Agenda Virtual
    public int login(User user) {
        int res1 = -1;
        if (user.getUser().equals(Admin.getUser()) && user.getPassword().equals(Admin.getPassword())) {
            res1 = 0;
        }else{
            for(int i = 0 ; i < users.size() ; i++){
                if (user.getUser().equals(users.get(i).getUser()) && user.getPassword().equals(users.get(i).getPassword())){
                    res1 = i;
                }
            }
        }
        if(res1 == -1){
            notificacion.NotificacionEscrita("No se pudo acceder.", "No existe usuario con esas credenciales", "/Iconos/Advertencia.png");
        }
        return res1;
    }
    //Crea un nuevo uusario
    public boolean addUser(User user) {
        boolean res = true;//se añade usuario
        for(int i = 0 ; i < users.size() && res ; i++){
            if(user.getUser().equals(users.get(i).getUser())){
               res = false;
            }
        }
        if(res == true){
            users.add(user);
        }
        return res;
    }
    //Devuelve la lista de los usuarios registrados hasta el momento.
    public ArrayList<User> getUsers(){
        return users;
    }
}
