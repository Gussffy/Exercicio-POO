package gustavo.example;

// Classe que representa um Artista
public class Artista {

    //Atributos da classe
    String nome; // Nome do Artista

    //Construtor da classe Artista
    public Artista(String nome) {
        this.nome = nome;
    }

    //Método equals para comparar se dois artistas possuem o mesmo nome
    @Override
    public boolean equals(Object obj) {

       if (obj instanceof Artista) { // Verifica se o objeto é uma instância de Artista
           Artista artista1 = (Artista) obj; // Faz o casting do objeto para Artista
           return this.nome.equals(artista1.nome);//Compara os nomes dos artistas
       }
       return false; // Retorna falso se o objeto não for uma instância de Artista
    }

    // Método toString para retornar a representação em string do Artista
    @Override
    public String toString() {
       return this.nome;

    }
}
