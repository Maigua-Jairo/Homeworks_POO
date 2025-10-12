import java.util.Scanner;

public class CuentaBancaria {
    private String nombreTitutlar;
    private double saldo;

    //Constructor con valores fijos
    public CuentaBancaria(String nombreTitutlar, double saldo) {
        this.nombreTitutlar=nombreTitutlar;
        this.saldo=saldo;
    }

    //Metodo de consulta de saldo
    public void MostrarInformacion(){
        System.out.println("Sr. "+nombreTitutlar+" su saldo actual es: "+saldo);
    }
    //Metodo para depositar dinero
    public void depositar(double monto){
        if(saldo>0 && monto>0){ //Condicion para determinar si el cliente posee saldo suficiente o ingresa un monto válido
            saldo=saldo+monto;
            System.out.println("Su depósito se realizó con éxito. Gracias por usar nuestros servicios :)");
        }else {
            System.out.println("Saldo o monto insuficiente");
        }

    }
    //Metodo para el retiro de diner
    public void retirar(double monto2){
        if(saldo>0 && monto2>0) {
            saldo = saldo - monto2;
            System.out.println("Su dinero fue retirado éxito. Gracias por usar nuestros servicios :)");
        }else {
            System.out.println("Saldo o monto insuficiente");
        }
    }

    //Clase principal
    public static void main(String [] args) {
        Scanner datos = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("Jairo Maigua", 450); //Objeto
        System.out.println("============== BANCO EPN ================");
        //Validacion de nombre de cuenta
        while (true) {
            System.out.println("Por favor ingrese el nombre de la cuenta");
            String nombre = datos.nextLine();
            if (nombre.equals("Jairo Maigua")) {
                System.out.println("======== Bienvenido " + nombre + " ===========");
                break;
            } else {
                System.out.println("Usuario incorrecto. Intente de nuevo");
            }
        }
        //Menu de opciones
        int opcion;
        do {
            System.out.println("¿Qué deseas hacer hoy?");
            System.out.println("1. Ver estado de la cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("Ingresa una opcion:");
            opcion = datos.nextInt();
            switch (opcion) {
                case 1:
                    cuenta.MostrarInformacion();
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea depositar: ");
                    double monto = datos.nextDouble();
                    cuenta.depositar(monto);
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea retirar: ");
                    double monto2 = datos.nextDouble();
                    cuenta.retirar(monto2);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios :)");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }while(opcion!=4);
        datos.close();
    }
    }


