package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_04 {

    /**
     * Função Ler Ficheiro
     * @param path imprimirFicheiroConsola
     * @throws FileNotFoundException
     */
    public static void imprimirFicheiroConsola(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        //Instanciar um Scanner para o Ficheiro que foi passado por parametro

       while (leitorFicheiro.hasNextLine()){

           String linha = leitorFicheiro.nextLine();

           System.out.println(linha);



       }

    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirFicheiroConsola("Ficheiros/Exercicio_05.csv");

    }
}
