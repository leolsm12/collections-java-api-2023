package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListTarefa listaTarefa = new ListTarefa();
        System.out.println("o nunmero total de taresfas na lista é :" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println("o nunmero total de taresfas na lista é :" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("o nunmero total de taresfas na lista é :" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
