import java.util.Scanner;
public class Producto {
    String nombre;
    double precio;
    double cantidad;
   //Metodo constructor con parámetros
    public Producto(String nombre, double precio,double cantidad) {
       this.nombre=nombre;
       this.precio=precio;
       this.cantidad=cantidad;
   }
   //Constructor vacío
   public Producto(){
        nombre="No registrado";
        precio=0.0;
        cantidad=0.0;
   }
   //Constructor con valores fijos
    public Producto(String nombreFijo){
        nombre=nombreFijo;
        precio=20;
        cantidad=10;
    }
    //Mostrar
    public void Mostrar(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: " + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("======================");

    }

    //Creacion de los tres objetos para cada constructor
    public static void main(String[] args){
        Scanner datos= new Scanner(System.in);
        System.out.println("============ Registro de Productos EPN ==============");
        System.out.println("Ingrese el nombre del nuevo producto: ");
        String nombre=datos.nextLine();
        System.out.println("Ingrese el precio del nuevo producto: ");
        double precio=datos.nextDouble();
        System.out.println("Ingrese cantidad del nuevo producto: ");
        double cantidad=datos.nextDouble();

        //Objetos
        Producto producto1=new Producto();
        Producto producto2=new Producto("Queso");
        Producto producto3=new Producto(nombre,precio,cantidad);
        System.out.println("Producto1: " );
        producto1.Mostrar();
        System.out.println("Producto2: " );
        producto2.Mostrar();
        System.out.println("Producto3: " );
        producto3.Mostrar();

        //Cierre del Scanner
        datos.close();
    }
}
