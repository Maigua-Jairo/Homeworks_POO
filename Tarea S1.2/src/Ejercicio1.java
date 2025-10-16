import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in); //Declarar el Scanner
        //Declarar las variables
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        double promedio;

        //Resultados
        System.out.println("====== SISTEMA DE PROMEDIOS EPN ======");
        System.out.print("Ingrese su nombre: ");
        nombre=notas.nextLine();
        System.out.println("Inserte la nota de la materia  de Geometria:");
        nota1=notas.nextDouble();
        System.out.println("Inserte la nota de la materia de Fisica: ");
        nota2=notas.nextDouble();
        System.out.println("Inserte la nota de la materia de Matematicas: ");
        nota3=notas.nextDouble();
        promedio=(nota1+nota2+nota3)/3;
        if ((nota1>=0 && nota1<=10)&& (nota2>=0 && nota2<=10)&&(nota3>=0 && nota3<=10)) { //Validamos que las tres notas sean ingresadas correctamente
            if (promedio >= 7) { //validamos y calculamos el promedio
                System.out.println("Aprobado. Tu nota final es: " +String.format("%.2f",promedio));

            } else {
                System.out.println("Lo sentimos, usted no alcanzo la nota minima para aprobar");
                System.out.println("Su promedio fue: "+String.format("%.2f",promedio));
            }
        }else{
            System.out.println("Error las notas ingresadas deben estar entre 0 a 10.");
        }
    }
}