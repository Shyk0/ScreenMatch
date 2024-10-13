package com.aluracursos.screenmatch.modelos;

// Clase `Pelicula` que extiende la clase base `Titulo`
public class Pelicula extends Titulo {
    private String director;

    // Método setter para establecer el nombre del director
    public void setDirector(String director) {
        this.director = director;
    }

    // Método getter para obtener el nombre del director
    public String getDirector() {
        return director;
    }
}
