package br.escola.bibliohaydee.model;

import br.escola.bibliohaydee.model.Autor;



public class Livro {


    private String titulo;
    private int isbn;
    private int anoDePublicacao;
    private String genero;
    private Boolean disponibilidade;


    Autor autor = new Autor("Wendler", "Brasil", 2009);


    public Livro(String titulo, int isbn, int anoDePublicacao, String genero, Boolean disponibilidade) {

        this.titulo = titulo;
        this.isbn = isbn;
        this.anoDePublicacao = anoDePublicacao;
        this.genero = genero;
        this.disponibilidade = disponibilidade;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() +
                " | ISBN : " + getIsbn() +
                "\nAutor : " + getAutor() +
                "\nAno de publicação: " + getAnoDePublicacao() +
                " | Gênero: " + getGenero() +
                " | Disponibilidade : " + (getDisponibilidade() ? "disponível" : "emprestado");
    }
}
