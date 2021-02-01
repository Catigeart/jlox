package lox;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 14:13 2021/2/1
 */
class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}
