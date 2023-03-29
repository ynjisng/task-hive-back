package br.com.ufape.bcc.taskhive.negocio.basicas;

public class UsuarioTarefa {
    //atributos
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
