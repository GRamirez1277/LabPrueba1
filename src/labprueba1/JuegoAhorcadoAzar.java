package labprueba1;

import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    private String[] palabrasPosibles;
    private Random random;

    public JuegoAhorcadoAzar(String[] palabrasPosibles) {
        this.palabrasPosibles = palabrasPosibles;
        this.random = new Random();
        seleccionarPalabraAleatoria();
    }

    private void seleccionarPalabraAleatoria() {
        int indiceAleatorio = random.nextInt(palabrasPosibles.length);
        palabraSecreta = palabrasPosibles[indiceAleatorio];
        palabraActual = "_".repeat(palabraSecreta.length());
    }

    @Override
    public void actualizarPalabraActual(char letra) {
        StringBuilder nuevaPalabraActual = new StringBuilder(palabraActual);

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                nuevaPalabraActual.setCharAt(i, letra);
            }
        }

        palabraActual = nuevaPalabraActual.toString();
    }

    @Override
    public boolean verificarLetra(char letra) {
        return palabraSecreta.contains(String.valueOf(letra));
    }

    @Override
    public boolean hasGanado() {
        return palabraActual.equals(palabraSecreta);
    }

    @Override
    public void inicializarPalabraSecreta() {
        seleccionarPalabraAleatoria();
    }

    public void jugar() {
        // Implementa la lógica del juego aquí
    }
}

