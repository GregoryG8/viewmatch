import java.util.Scanner;

import modelo.Movie;
import modelo.Serie;

public class Main {

    public void Menu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            String menu = """
                    Bienvenido a ViewMatch
                    1) Registrar pelicula
                    2) Registrar serie



                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el ano de la pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    System.out.println("Ingrese duracion en min de la pelicula");
                    int duracion = teclado.nextInt();

                    Movie peliculaUsuario = new Movie();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setDuracion(duracion);
                    peliculaUsuario.mostrarFicha();
                    break;

                case 2:
                    System.out.println("Ingrese el titulo de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el ano de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    System.out.println("Ingrese duracion en min de la serie");
                    int duracionSerie = teclado.nextInt();

                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setDuracion(duracionSerie);
                    serieUsuario.mostrarFicha();
                    break;

                case 9:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
