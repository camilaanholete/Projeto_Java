public class Main {
    public static void main(String[] args) {

        System.out.println("Aprendendo Screen Match");
        System.out.println("Filme: Harry Potter e Reliquias da Morte");

        int anoDeLancamento = 2012;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.4 + 6.4 + 8.5) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Harry Potter e Reliquias da Morte 
                Filme de bruxaria
                Super legal!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);



    }
}