import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import calculos.CalculadoraDeTiempo;

// Clase `Principal` con el método `main` para ejecutar el programa
public class Principal {
    public static void main(String[] args) {
        // Creación y configuración de la instancia de Pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        // Mostrar información técnica de la película y evaluarla
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Total de Evaluaciones: " + miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Media de Evaluaciones: " + miPelicula.calculaMedia());

        System.out.println("#################################################");

        // Creación y configuración de la instancia de Serie
        Serie hotd = new Serie();
        hotd.setNombre("La casa del dragon");
        hotd.setFechaDeLanzamiento(2022);
        hotd.setTemporadas(1);
        hotd.setMinutosPorEpisodio(50);
        hotd.setEpisodiosPorTemporada(10);
        hotd.muestraFichaTecnica();
        System.out.println("Duración total de la serie en minutos: " + hotd.getDuracionEnMinutos());

        // Usando CalculadoraDeTiempo para acumular duraciones
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);  // Añadiendo duración de la película
        calculadora.incluye(hotd);        // Añadiendo duración de la serie
        System.out.println("Tiempo total acumulado: " + calculadora.getTiempoTotal() + " minutos");
    }
}
