package gustavo.example;

// Classe que representa uma música
public class Musica {

    // Atributos da classe
    String titulo; // Título da música
    int duracao; // Duração da música em segundos
    Artista artista; // Artista que executa a música

    // Construtor da classe Musica
    public Musica(String titulo, int duracao, Artista artista) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
    }

    //Método equals para comparar se duas músicas têm o mesmo título
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Musica) { // Verifica se o objeto é uma instância de Musica
            Musica musica1 = (Musica) obj; // Faz o casting do objeto para Musica
            return this.titulo.equals(musica1.titulo); // Compara os títulos das músicas
        }
        return false; // Retorna falso se o objeto não for uma instância de Musica
    }

    // Método toString para retornar a representação em string da música
    @Override
    public String toString() {
        return this.titulo + " - " + this.artista + " - " + this.duracao;
        // Retorna o título, o artista e a duração da música
    }
}
