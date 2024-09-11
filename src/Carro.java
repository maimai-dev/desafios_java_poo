public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = 2024;

    void fichaTecnicaCarro(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    public int idadeCarro(){
        return anoAtual - ano;
    }
}
