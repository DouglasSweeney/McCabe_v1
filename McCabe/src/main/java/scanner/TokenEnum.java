//
// File:    Scanner.java
// Created: 4/28/2020
// Author:  Douglas Sweeney
//
// History: 
//           v1.0     4/28/2020        Douglas Sweeney
//
package main.java.scanner;

/**
 * Keep track of the enumeration of the tokens representing the keywords/identifiers.
 * 
 * @author dks
 * @since 1.0
 */
public enum TokenEnum {
	NONE,
	TILDE,
	LPAREN,
    RPAREN,
    LBRACE,
    RBRACE,
    LBRACKET,
    RBRACKET,
    SEMICOLON,
    COMMA,
    PERIOD,
    QUESTION_MARK,
    COLON,
    EQUAL_EQUAL,
    EQUALS,
    NOT_EQUALS,
    NOT,
    OR_EQUALS,
    OR,
    OROR,
    CARET_EQUALS,
    CARET,
    MOD_EQUALS,	
    MOD,
    MULTIPLY_EQUALS,
    ASTERISK,
    DIVIDE_EQUALS,
    DIVIDE,
    PLUS_EQUALS,
    INCREMENT,
    PLUS,
    DECREMENT,
    MINUS,
    AMPERSAND_AMPERSAND,
    AMPERSAND,
    GT_EQUALS,
    UNSIGNED_SHIFT_RIGHT,
    UNSIGNED_SHIFT_RIGHT_EQUALS,
    SHIFT_RIGHT,
    SHIFT_RIGHT_EQUALS,
    GT,
    LESS_EQUALS,
    SHIFT_LEFT,
    SHIFT_LEFT_EQUALS,
    LESS,
    STRING_LITERAL,	
    EOF,
    BASE16_INTEGER,
    BASE2_INTEGER,
    BASE8_INTEGER,
    LONG_LITERAL,
    IDENTIFIER,
    ABSTRACT,
    ASSERT,
    BOOLEAN,
    BREAK,
    BYTE,
    CASE,
    CATCH,
    CHAR,
    CLASS,
    CONST,
    CONTINUE,
    DEFAULT,
    DO,
    DOUBLE,
    ELSE,
    ENUM,
    EXTENDS,
    FALSE,
    FINAL,
    FINALLY,
    FLOAT,
    FOR,
    IF,
    GOTO,
    IMPLEMENTS,
    IMPORT,
    INSTANCEOF,
    INT,
    INTERFACE,
    LONG,
    NATIVE,
    NEW,
    NULL,
    PACKAGE,
    PRIVATE,
    PROTECTED,
    PUBLIC,
    RETURN,
    SHORT,
    STATIC,
    STRICTFP,
    SUPER,
    SWITCH,
    SYNCHRONIZED,
    THIS,
    THROW,
    THROWS,
    TRANSIENT,
    TRUE,
    TRY,
    VOID,
    VOLATILE,
    WHILE,
    TEST_ANNOTATION,
}
