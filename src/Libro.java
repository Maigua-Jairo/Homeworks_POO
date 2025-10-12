import java.util.Scanner;
public class Libro{
        String titulo;
        String autor;
        String anioPublicacion;
    //Creamos el constructor, debe llevar el mismo nombre de la clase
    public Libro(String titulo, String autor, String anioPublicacion) {
         this.titulo = titulo; //Asignamos el parámetro "titulo" al atributo de la clase "titulo"
        this.autor = autor;
         this.anioPublicacion = anioPublicacion;
        }
    //Creamos la funcion para mostrar la informacion del libro
    public void mostrarInformacion(){
        System.out.println("El libro '"+titulo+"'"+" fue creado por "+autor+" y se publicó en el año de "+anioPublicacion);
    }
    //Crear el metodo para ingresar los datos
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("========= REGISTRO DE LIBROS EPN ==========");
        System.out.println("Ingrese el titulo del libro:");
        String titulo=datos.nextLine();
        System.out.println("Ingrese el autor:");
        String autor=datos.nextLine();
        System.out.println("Ingrese el año de publicacion:");
        String anioPublicacion=datos.nextLine();

        //Datos del segundo libro
        System.out.println("Ingrese el titulo del segundo libro:");
        String titulo2=datos.nextLine();
        System.out.println("Ingrese el autor:");
        String autor2=datos.nextLine();
        System.out.println("Ingrese el año de publicacion:");
        String anioPublicacion2=datos.nextLine();

        //Declaramos los objetos que usaremos
        Libro libro1=new Libro(titulo,autor,anioPublicacion);
        libro1.mostrarInformacion();
        Libro libro2=new Libro(titulo2,autor2,anioPublicacion2);
        libro2.mostrarInformacion();
    } //
}