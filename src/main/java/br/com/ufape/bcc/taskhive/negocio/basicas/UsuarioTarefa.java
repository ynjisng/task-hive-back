package br.com.ufape.bcc.taskhive.negocio.basicas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class UsuarioTarefa {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Usuario usuario;
    @OneToMany
    private List<TarefaAbstrata> tarefas;
    //metodos
    //construtor
    public UsuarioTarefa() {}
    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<TarefaAbstrata> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<TarefaAbstrata> tarefas) {
        this.tarefas = tarefas;
    }
}
