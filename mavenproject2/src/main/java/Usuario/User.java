package Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.AgendaVirtual;
/**
 *
 * @author Sergio Garcia
 */
public class User implements java.io.Serializable {
    /**
     * Datos del usuario: user,password,name,lastName,email,direction,cellPhone
     * Cada usuario contiene una agenda virtual en la que el usuario interactuará en todo momento.
     * imgPerfil es un auxiliar para la imagen de perfil del usuario
     */
    private String user,password,name,lastName,email,direction,cellPhone;
    private AgendaVirtual agendaVirtual;
    private Icon imgPerfil;
    /**
     * Constructor de la clase User (usuario)
     */
    public User(String user, String password, String name, String lastName, String email, String direction, String cellPhone){
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.direction = direction;
        this.cellPhone = cellPhone;
        agendaVirtual = new AgendaVirtual();
        imgPerfil = new ImageIcon(new ImageIcon(getClass().getResource("/ImagenesPerfil/img0.jpg")).getImage().getScaledInstance(125,125,java.awt.Image.SCALE_SMOOTH));
    }
    //Retorna la imagen de perfil
    public Icon getImgPerfil(){
        return imgPerfil;
    }
    //Cambia la imagen de perfil
    public void setImgPerfil(Icon imagen){
        imgPerfil = imagen;
    }
    //Devuelve el apellido del usuario
    public String getLastName() {
        return lastName;
    }
    //Cambia apellido del usuario
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Devueve el email del usuario
    public String getEmail() {
        return email;
    }
    //Cambia email del usuario
    public void setEmail(String email) {
        this.email = email;
    }
    //Devuelve la direccion del usuario
    public String getDirection() {
        return direction;
    }
    //Cambia la direccion del usuario
    public void setDirection(String direction) {
        this.direction = direction;
    }
    //Retorna el numero celular del usuario
    public String getCellPhone() {
        return cellPhone;
    }
    //Cambia el numero celular del usuario.
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
    //Devuelve el usuario con el que el usuario ingresa a su agenda virtual
    public String getUser() {
        return user;
    }
    //devuelve la contraseña
    public String getPassword() {
        return password;
    }
    //cambia la contraseña
    public void setPassword(String password) {
        this.password = password;
    }
    //Devuelve la agendaVirtual
    public AgendaVirtual getAgendaVirtual() {
        return agendaVirtual;
    }
    //Devuelve el nombre del usuario
    public String getName(){
        return name;
    }
    //Cambia el nombre del usuario
    public void setName(String name){
        this.name = name;
    }

}
