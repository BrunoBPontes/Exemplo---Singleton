/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Aluno
 */
public class ManipularAluno {
    private SingletonAlunos alunos;
    
    public ManipularAluno(){
        this.alunos = SingletonAlunos.getInstancia();
    }
    
    public void adicionar(String aluno){
        alunos.salvar(aluno);
    }
    
    public void excluir(String aluno){
        alunos.remover(aluno);
    }
    
    public void buscar(String aluno){
        alunos.buscar(aluno);
    }
    
    public void retornar(){
        alunos.retornarLista();
    }
}
