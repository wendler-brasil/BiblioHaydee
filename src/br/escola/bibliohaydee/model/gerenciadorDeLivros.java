package br.escola.bibliohaydee.model;
import java.util.ArrayList;

public class gerenciadorDeLivros {

    private ArrayList <Livro> livros = new ArrayList<>();

    public void adicionarLivros(Livro livro){
        livros.add(livro);
    }
}
