package Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.AgendaVirtual;
/**
 *
 * @author Sergio Garcia
 */
public class User implements java.io.Serializable {
    private String user,password,name,lastName,email,direction,cellPhone;
    private AgendaVirtual agendaVirtual;
    private Icon imgPerfil;
    public User(String user, String password, String name, String lastName, String email, String direction, String cellPhone){
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.direction = direction;
        this.cellPhone = cellPhone;
        agendaVirtual = new AgendaVirtual();
        imgPerfil = new ImageIcon(new ImageIcon(getClass().getResource("/imagenesPerfil/img0.jpg")).getImage().getScaledInstance(125,125,java.awt.Image.SCALE_SMOOTH));
    }
    public Icon getImgPerfil(){
        return imgPerfil;
    }
    public void setImgPerfil(Icon imagen){
        imgPerfil = imagen;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AgendaVirtual getAgendaVirtual() {
        return agendaVirtual;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAgendaVirtual(AgendaVirtual agendaVirtual) {
        this.agendaVirtual = agendaVirtual;
    }
    
    
    
}
