package labprueba1;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
        this.palabraActual = "_".repeat(palabraSecreta.length());
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
        // Implementa la lógica para inicializar la palabra secreta si es necesario.
    }

    public void jugar() {
        // Implementa la lógica del juego aquí
    }
}



