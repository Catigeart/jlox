package lox;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 11:18 2021/1/29
 */
public class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
