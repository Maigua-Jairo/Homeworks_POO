import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int numero;
        int resultado;
        //Resultados
        System.out.print("Ingrese el numero(del 1 al 10): ");//Pedir un numero al usuario
        numero=sc.nextInt();
        if(numero>=1 && numero<=10) {
            for (int i = 1; i <= 10; i++) {
                resultado = numero * i;
                System.out.println(numero + "*" + i + "=" + resultado);
            }
        }else {
            System.out.println("El numero no es valido");
        }
    }
}
