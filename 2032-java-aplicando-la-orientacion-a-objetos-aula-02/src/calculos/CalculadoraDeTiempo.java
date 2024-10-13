package calculos;

import com.aluracursos.screenmatch.modelos.Titulo;

// Clase `CalculadoraDeTiempo` para calcular la duración total de varios títulos
public class CalculadoraDeTiempo {
    private int tiempoTotal;

    // Método `incluye` que recibe un objeto de tipo Titulo y acumula su duración en minutos
    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    // Método getter para obtener el tiempo total acumulado
    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
