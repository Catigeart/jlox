package lox;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 9:22 2021/1/28
 */
public class Token {

    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line; // 为什么要将Line信息存放在这里？

    Token (TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }

}
