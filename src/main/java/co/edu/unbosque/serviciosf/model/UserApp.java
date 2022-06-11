package co.edu.unbosque.serviciosf.model;

public class UserApp {

    private String name;
    private String email;
    private String password;
    private String role;
    private Float fcoins;

    public UserApp(){}

    public UserApp(String nombre, String correo, String clave, String accion, Float monedas){
        name = nombre;
        email = correo;
        password = clave;
        role = accion;
        fcoins = monedas;
    }

    @Override
    public String toString() {
        return "UserApp{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", fcoins=" + fcoins +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Float getFcoins() {
        return fcoins;
    }

    public void setFcoins(Float fcoins) {
        this.fcoins = fcoins;
    }
}
