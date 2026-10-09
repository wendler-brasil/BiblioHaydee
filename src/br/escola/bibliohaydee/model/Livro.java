package br.escola.bibliohaydee.model;

import br.escola.bibliohaydee.model.Autor;

public class Livro {
    public String titulo;
    int ISBN;
    public int anoDePublicacao;
    public String genero;
    public Boolean disponibilidade;
    Autor autor = new Autor("Wendler", "Brasil", 2009);

    public Livro() {

        titulo = "Wendler é foda";
        anoDePublicacao = 2010;
        genero = "comédia";
        disponibilidade = true;


    }

    @Override
    public String toString() {

        if (autor.nome != " ") {



            return "título : " + titulo +
                    "\nanoDePublicação: " + anoDePublicacao +
                    "\ngenero: " + genero +
                    "\nAutor: " + autor.nome;

        }
        return "Não tem autor";
    }

}
