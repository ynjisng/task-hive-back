package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Projeto {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    private boolean arquivado;
    private boolean excluido;
    //metodos
    //construtores
    public Projeto() {}
    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isArquivado() {
        return arquivado;
    }
    public void setArquivado(boolean arquivado) {
        this.arquivado = arquivado;
    }
    public boolean isExcluido() {
        return excluido;
    }
    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }
    //outros metodos
    public float gerarPercentualConclusao(List<TarefaAbstrata> tarefas) {
        Date conclusao;
        int totalTarefas = 0, totalTarefasConcluidas = 0;
        for (TarefaAbstrata t : tarefas) {
            totalTarefas++;
            conclusao = t.getData_conclusao();
            if (conclusao != null) {
                totalTarefasConcluidas++;
            }
        }
        if (totalTarefas == 0) {
            return 100.0f;
        } else {
            return ((float) totalTarefasConcluidas / totalTarefas) * 100;
        }
    }
}
