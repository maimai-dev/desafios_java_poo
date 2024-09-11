import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacao;
    double numTotalAvaliacao;
    double mediaAvaliacao;

    void fichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        numTotalAvaliacao++;

    }

    public double pegaMedia(){
        return somaAvaliacao / numTotalAvaliacao;
    }
}
