package br.escola.bibliohaydee.model;


import java.util.Scanner;

public class Autor {

    private String nome;


    private String nacionalidade;
    private int anoDeNascimento;

    public Autor(String nome, String nacionalidade, int anoDeNascimento) {

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoDeNascimento = anoDeNascimento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoDeNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return  getNome() + " | Nacionalidade: " + getNacionalidade() + " | Ano de nascimento: " + getAnoDeNascimento();
    }

}
