public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.ola();

        System.out.println("*************************************");
        Calculadora calcu1 = new Calculadora();
        int resultado = calcu1.dobrarNumero(5);
        System.out.println(resultado);

        System.out.println("*************************************");
        Musica musica1 = new Musica();
        musica1.titulo = "Beats by Deus";
        musica1.artista = "Yung Buda";
        musica1.anoDeLancamento = 2018;
        musica1.fichaTecnica();
        musica1.avalia(5);
        musica1.avalia(10);
        musica1.avalia(7);
        musica1.avalia(9);
        System.out.println(musica1.pegaMedia());
        System.out.println("*************************************");

        Carro carro1 = new Carro();
        carro1.modelo = "Fiat Uno";
        carro1.ano = 2014;
        carro1.cor = "Branco";
        carro1.fichaTecnicaCarro();
        System.out.println("Este carro possui " + carro1.idadeCarro() + " anos de uso");
        System.out.println("*************************************");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maiara";
        aluno1.idade = 21;
        aluno1.infoAluno();

    }
}
