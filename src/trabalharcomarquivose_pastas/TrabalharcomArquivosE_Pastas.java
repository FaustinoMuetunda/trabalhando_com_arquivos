/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalharcomarquivose_pastas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author faust
 */
public class TrabalharcomArquivosE_Pastas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escrita em um arquivo

        String[] lines = new String[]{"Como um podcast é em forma de conversa", "compensa criarmos um roteiro?", "Ou uma organização das ideias seria melhor"};
        String path = "D:\\OneDrive\\OneDrive - Universidade da Beira Interior\\UDEMY\\POO\\trabalharcomArquivosE_Pastas\\src\\out.txt";

        
        //o path, true-indica que nao quero recriar o arquivo. Mas sim, adicionar o que já existe. Quando não usamos, ele destroe tudo que tem e cria de novo com o arquivo existente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
