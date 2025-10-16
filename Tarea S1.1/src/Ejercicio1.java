//Ejercicio 1
import java.util.Scanner; //Importar la libreria Scanner para el ingreso de datos
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner inventario= new Scanner(System.in);

        //Pedir al usuario cuantos productos se ingresara
        int valor;
        System.out.println("Ingrese la cantidad de productos plasticos a registrar: ");
        valor= inventario.nextInt(); //Usamos el Scanner para ingresar la cantidad de productos

        //Variables
        String nombre;
        int cantidad;
        double precio;
        double Totalproducto;
        double StockTotal=0;

        System.out.println("------------- REGISTRO DE INVENTARIO ---------------");

        for (int i=1;i<=valor; i++ ) { //Usamos el bucle for para el registro de los productos
            System.out.println("Producto" + i +":");

            System.out.println("Ingrese el nombre del producto:");
            inventario.nextLine();//Limpiar el buffer
            nombre=inventario.nextLine();

            System.out.println("Ingrese  la cantidad del producto(stock): ");
            cantidad=inventario.nextInt();

            System.out.println("Ingrese el precio unitario: ");
            precio=inventario.nextDouble();

            Totalproducto=precio*cantidad;

            System.out.println(" Total del producto "+nombre+" es:"+Totalproducto);
            StockTotal+=Totalproducto;
         }
        System.out.println("------------------------------");
        System.out.println("El total de stock es: "+StockTotal);
        inventario.close(); //Cerrar el Scanner para evitar advertencias

    }
    //Diego EPN
}