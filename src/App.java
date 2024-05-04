import modelo.Movie;

public class App {
    public static void main(String[] args) {

        Movie matrix = new Movie();
        matrix.setNombre("Matrix");
        matrix.setDuracion(120);
        matrix.setFechaDeLanzamiento(1999);;

        matrix.mostrarFicha();
        
            // System.out.println("Hello, World!");
            // // System.out.println("Pelicula Matrix");

            // // Declaracion de variables
            // int fechaDeLanzamiento = 1999;
            // boolean incluidoEnElPlanBasico = true;
            // String nombre = "Matrix";
            // String sinopsis = """
            //         La mejor pelicula del fin del milenio
            //         """;

            // double mediaEvaluacionUsuario = 0 ;

            // System.out.println("Pelicula: " + nombre);
            // System.out.println(fechaDeLanzamiento);
            // System.out.println(incluidoEnElPlanBasico);

            // if (fechaDeLanzamiento >= 2023) {
            //     System.out.println("Pelicula Popular en el momento");
            // }else{
            //     System.out.println("Pelicula Retro");
            // }

            // for (int i = 0; i < 3; i++) {
            //     Scanner teclado = new Scanner(System.in);
            //     System.out.println("Que nota le darias a Matrix?");
            //     double notaMatrix = teclado.nextDouble();
            //     mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            // }

            // System.out.println("La media es: " + mediaEvaluacionUsuario / 3);

            // //gracias
    }
}
