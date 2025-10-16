//Ejercicio 3
import java.util.Scanner; //Importar la libreria Scanner

public class Ejercicio3 { //Realizar la linea de comando de la clase
    public static void main(String [] args) {
        //Declarar el Scanner
        Scanner recluta=new Scanner(System.in);

        //Variables
        int edad;
        double altura;

        //Sistema de validacion
        System.out.println("Ingrese la edad del estudiante: ");
         edad=recluta.nextInt();
        System.out.println("Ingrese la altura del estudiante: ");
         altura=recluta.nextDouble();
        if((edad>0 && altura>0)){
           if (edad>=18 && altura>=1.60){
               System.out.println("El estudiante cumple con los requisitos");

           }else {
               System.out.println("El estudiante no cumple con los requisitos");
           }
        }else{
            System.out.println("Error.La edad o la altura del estudiante deben ser positivos");
        }
        recluta.close();
    }
}
