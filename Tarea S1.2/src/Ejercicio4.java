import  java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Variables
        String nombre;
        int edad;
        double estatura;

        //Ingreso de datos
        System.out.println("Ingrese su nombre:");
        nombre=sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad=sc.nextInt();
        System.out.println("Ingrese su estatura:");
        estatura=sc.nextDouble();

        //Validacion
        if(edad>=18 && estatura>=1.60){ // Validar si la estatura y edad son los adecuados
            System.out.println("Aceptado para el equipo");
        } else{
            System.out.println("No cumple con los requisitos");
        }
        sc.close();
    }
}
