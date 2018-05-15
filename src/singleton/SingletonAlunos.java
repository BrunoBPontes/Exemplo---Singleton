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
public class SingletonAlunos {
    private ArrayList<String> listaAlunos = new ArrayList();
    private static SingletonAlunos instancia;
    
    private SingletonAlunos(){};
    
    public static SingletonAlunos getInstancia(){
        if(instancia == null){
            instancia = new SingletonAlunos();
        }
        
        return instancia;
    }
    
    public void salvar(String aluno){
        listaAlunos.add(aluno);
        System.out.println("Aluno " + aluno + " adicionado!");
    }
    
    public void remover(String aluno){
        listaAlunos.remove(aluno);
        System.out.println("Aluno " + aluno + " removido!");
    }
    
    public void buscar(String aluno){
        int msg = 0;
        for(int i = 0; i < listaAlunos.size(); i++){
            if(aluno.equals(listaAlunos.get(i))){
                msg = 1;
            }
        }
        
        switch(msg){
            case 0:
                System.out.println("Aluno " + aluno + " não encontrado!");
                break;
            case 1:
                System.out.println("Aluno " + aluno + " encontrado na lista!");
                break;
            default:
                System.out.println("Algum problema aconteceu!");
                break;
        }
    }
    
    public void retornarLista(){
        System.out.println("************************************");
        System.out.println("Lista de alunos");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println(i + "..:" + listaAlunos.get(i));
        }
        System.out.println("************************************");
    }
    
    
}
