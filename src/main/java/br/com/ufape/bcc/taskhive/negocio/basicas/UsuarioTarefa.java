package br.com.ufape.bcc.taskhive.negocio.basicas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UsuarioTarefa {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idUsuario;
    private long idTarefa;
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
    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public long getIdTarefa() {
        return idTarefa;
    }
    public void setIdTarefa(long idTarefa) {
        this.idTarefa = idTarefa;
    }
}
