package Usuario;
import java.util.ArrayList;
import Notificaciones.Notificacion;
/**
 *
 * @author Sergio Garcia
 */
public class Users implements java.io.Serializable{
    private Notificacion notificacion;
    private ArrayList<User> users;
    private User Admin = new User("Admin", "Password","Administrador", "Aministrador", "Administrador@gmail.com", "Bolviar Avenue", "123456");

    public Users() {
        users = new ArrayList();
        users.add(Admin);
    }
    
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

    public ArrayList<User> getUsers(){
        return users;
    }
}
