package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int duracion;

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }



    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }



    public double getEvaluacion() {
        return evaluacion;
    }
 



    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }



    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }



    public String getSinopsis() {
        return sinopsis;
    }



    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }



    public int getDuracion() {
        return duracion;
    }



    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarFicha(){
        System.out.println("*** FICHA ***");
        System.out.println("Titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion: " + getDuracion() + " minutos");    
    };

}
