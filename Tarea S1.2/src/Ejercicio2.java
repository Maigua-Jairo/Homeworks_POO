import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Variables
        int valores;
        int numero;
        int contador=0;

        //Resultados
        System.out.println("¿Cuantos numeros desea ingresar?: ");
        valores=sc.nextInt();

        for(int i=1; i<=valores;i++) { //Creamos un bucle for para ingresar la cantidad de numeros del usuario
            System.out.println("Ingrese el valor del numero " + i+" :");
            numero = sc.nextInt();

            if (numero % 2 == 0) {//Condicional para determinar los numeros pares
                contador += 1; //Sumamos 1 a la variable para determinar la cantidad de numeros pares
            }
        }
        System.out.println("La cantidad de numeros pares ingresados es: " + contador);
    }
}
