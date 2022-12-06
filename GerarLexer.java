package Lexico;
import java.io.*;

public class GerarLexer {
    public static void main(String[] args) throws IOException {
       String arq = "C:/Users/Carlos Eduardo/Desktop/CIENCIAS COMPUTACAO/8° Periodo/Compiladores/AULA 08/projeto/SQLbr/src/Lexico/gramatica.flex";
       gerarLexer(arq);
    }
    public static void gerarLexer( String arq) {
        File file = new File(arq);
    }
}