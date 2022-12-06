package Lexico;
import java.io.*;
public class TesteAnalisador {
    public static void main(String[] args) throws IOException {
       String arq = "C:/Users/Carlos Eduardo/Desktop/CIENCIAS COMPUTACAO/8° Periodo/Compiladores/AULA 08/projeto/SQLbr/arquivoDeTeste.TXT";
       BufferedReader in = new BufferedReader(new FileReader (arq));
       Lexer analise = new Lexer(in);
       while (true){
           Token token = analise.yylex();
           if (token==null) break; //EOF
       }
    }
}