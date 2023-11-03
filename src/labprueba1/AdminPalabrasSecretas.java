package labprueba1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdminPalabrasSecretas {
    private List<String> palabras;

    public AdminPalabrasSecretas() {
        palabras = new ArrayList<>();
    }

    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public String seleccionarPalabraAleatoria() {
        if (palabras.isEmpty()) {
            throw new IllegalStateException("No hay palabras en la lista.");
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(palabras.size());
        return palabras.get(indiceAleatorio);
    }
}
