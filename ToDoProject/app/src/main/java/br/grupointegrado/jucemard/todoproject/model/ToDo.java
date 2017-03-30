package br.grupointegrado.jucemard.todoproject.model;

/**
 * Created by Jucemar Dias on 28/03/2017.
 */

public class ToDo {
    private String descricao;

    public ToDo (String Descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return null;
    }

}
