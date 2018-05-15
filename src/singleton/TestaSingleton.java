/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class TestaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-> Testando a classe singleton usando uma classe de manipulação\n");
        ManipularAluno ma = new ManipularAluno();
        ma.adicionar("Carlos");
        ma.adicionar("Jose");
        ma.adicionar("Zezinho");
        ma.retornar();
        
        System.out.println("\n-> Testando a classe singleton diretamente pelo main "
                         + "para ver se as alterações persistem.\n");
        
        SingletonAlunos alunos = SingletonAlunos.getInstancia();
        alunos.remover("Jose");
        alunos.retornarLista();
        alunos.salvar("Josefino");
        alunos.buscar("Tarantino");
        alunos.buscar("Carlos");
        
        System.out.println("\n-> Testando novamente pela classe de manipulação\n");
        ma.retornar();
        
    }
}
