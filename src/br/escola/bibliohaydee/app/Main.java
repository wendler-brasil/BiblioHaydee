package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Livro;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Wendler", 12843, 2010, "Masculino", true);


        System.out.print(livro.toString());

    }


}
