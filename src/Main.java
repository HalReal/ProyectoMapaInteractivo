import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Usuario{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opc;

        System.out.println("Bienvenido a nuestro programa.");
        System.out.println("Ingresa la opcion que deseas realizar: \n");
        System.out.println("1. Crear Usuario\n2. Ingresar");
        opc = lector.nextInt();

        switch (opc){
            case 1:
                crearUsuario();
                break;

            case 2:
                //Ingresar, depende del tipo de usuario, permitira aniadir un punto de interes o no
                break;

            default:
        }

    }
}