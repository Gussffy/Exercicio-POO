package gustavo.example;

public class MusicaArtistaTeste {
    public static void main(String[] args) {

        // Criando objetos Artista com os nomes das bandas
        Artista artista1 = new Artista("Tame Impala"); // Cria um objeto Artista para Tame Impala
        Artista artista2 = new Artista("Gorillaz");// Cria um objeto Artista para Gorillaz
        Artista artista3 = new Artista("Mareux"); // Cria um objeto Artista para Mareux

        // Criando objetos Musica com títulos, durações e artistas
        Musica musica1 = new Musica("Lucidity", 100000, artista1); // Cria um objeto Musica para "Lucidity" com duração de 100000 segundos
        Musica musica2 = new Musica("She´s my collar", 100000, artista2); // Cria um objeto Musica para "She´s my collar" com duração de 100000 segundos
        Musica musica3 = new Musica ("Lovers From The Past", 100000, artista3); // Cria um objeto Música para "Lovers From The Past

        // Imprimindo as informações das músicas no console
        System.out.println(musica1); // Exibe informações da música "Lucidity"
        System.out.println(musica2); // Exibe informações da música "She´s my collar"
        System.out.println(musica3); // Exibe informações da música "Lovers From The Past

        // São minhas Músicas Favoritas :)
    }
}

