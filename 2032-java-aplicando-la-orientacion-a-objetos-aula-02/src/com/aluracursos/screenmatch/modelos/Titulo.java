package com.aluracursos.screenmatch.modelos;

// Clase base `Titulo` que contiene atributos y métodos comunes para películas y series
public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;

    // Métodos getters para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // Métodos setters para modificar los valores de los atributos privados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDelasEvaluaciones() {
        return totalDelasEvaluaciones;
    }

    // Método para mostrar la ficha técnica de la película o serie
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    }

    // Método para evaluar el título. Agrega la nota dada y aumenta el contador de evaluaciones.
    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    // Método para calcular la media de las evaluaciones dadas
    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }
}
