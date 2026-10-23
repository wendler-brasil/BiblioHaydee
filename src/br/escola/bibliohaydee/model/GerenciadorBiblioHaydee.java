package br.escola.bibliohaydee.model;
import java.util.ArrayList;

public class GerenciadorBiblioHaydee {

    private ArrayList <Livro> livros;
    private ArrayList <Autor> autores;


    public GerenciadorBiblioHaydee(){
        livros = new ArrayList<>();
        autores = new ArrayList<>();
    }

    public void adicionarLivros(Livro livro){

        livros.add(livro);

    }

    public void adicionarAutores(Autor autor){

        autores.add(autor);

    }

    public int quantidadeDeLivros(){

        return livros.size();

    }

    public int quantidadeDeAutores(){

        return autores.size();

    }

    public Livro buscarLivroPorTitulo(String titulo){

        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){

                return livro;

            }
        }
        return null;
    }

    public Autor buscarAutorPorNome(String autorNome){

        for (Autor autor : autores){
            if (autor.getNome().equalsIgnoreCase(autorNome)){

                return autor;

            }
        }
        return null;
    }

    public boolean removerLivrosDoAcervo(String tituloLivro){


        return livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(tituloLivro));

    }

    public boolean removerAutoresDoAcervo(String autorNome){


        return autores.removeIf(autor -> autor.getNome().equalsIgnoreCase(autorNome));

    }

    public boolean atualizarTituloLivro(String tituloAtual, String novoTitulo){
        Livro encontrado = buscarLivroPorTitulo(tituloAtual);
            if (encontrado != null){
                encontrado.setTitulo(novoTitulo);
                return true;
            }
            return false;
    }

    public boolean atualizarNomeAutor(String autorAtual, String novoAutor){
        Autor encontrado = buscarAutorPorNome(autorAtual);

        if (encontrado != null){
            encontrado.setNome(novoAutor);
            return true;
        }

        return false;
    }

    public Livro buscarLivroPorAutor(String nomeAutor){

        ArrayList <Livro> livrosEncontrados = new ArrayList<Livro>();

        for (Livro encontrado : livros){

        } //Resolver em casa

        return null;
    }
}