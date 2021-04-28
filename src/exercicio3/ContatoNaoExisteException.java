package exercicio3;

/**
 * @author RafaelRodrigues1
 */
public class ContatoNaoExisteException extends RuntimeException {

    public ContatoNaoExisteException(String message) {
        super(message);
    }
}
