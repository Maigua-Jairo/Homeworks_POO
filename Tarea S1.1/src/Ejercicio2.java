//Ejercicio 2
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Linea de codigo para el Scanner
        Scanner clientes = new Scanner(System.in);

        //Variables
        String nombre;
        String cedula;
        String telefono;
        String correo;

        //Sistema para el registro de los clientes
        for (int i = 1; i <= 3; i++) {
            System.out.println("========== REGISTRO DE CLIENTE #" + i + " ==========");
            //Cedula
            System.out.println("Ingrese su cedula: ");
            cedula = clientes.nextLine();
            if (cedula.isEmpty()) { //Usamos la funcion "isEmpty" para validar que el campo no este vacio
                System.out.println("Error. El campo no puede estar vacio"); //Tomar en cuenta que isEmpty funciona solo con variable tipo String
                return;
            }
            System.out.println("Ingrese sus nombres y apellidos: ");
            nombre = clientes.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("Error. El campo no puede estar vacio");
                return;
            }
            System.out.println("Ingrese su numero de telefono: ");
            telefono = clientes.nextLine();
            if (telefono.isEmpty()) {
                System.out.println("Error. El campo no puede estar vacio");
                return;
            }
            System.out.println("Ingrese su correo: ");
            correo = clientes.nextLine();
            if (correo.isEmpty()) {
                System.out.println("Error. El campo no puede estar vacio");
                return;
            }
        //Ficha con los datos del cliente
        System.out.println("======== FICHA DEL CLIENTE ========");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre:" + nombre);
        System.out.println("Telefono:" + telefono);
        System.out.println("Correo:" + correo);
    }
        clientes.close(); //Cerrar el Scanner
 }
}
