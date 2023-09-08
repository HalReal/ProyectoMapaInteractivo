import java.util.Scanner;

public class Usuario {
    public String cif;
    public String contrasenia;
    public String nombre;
    public String correo;

    Scanner lector = new Scanner(System.in);
    public static void crearUsuario(){
        System.out.println("Ingrese un nombre");

    }
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
