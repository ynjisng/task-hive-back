package br.com.ufape.bcc.taskhive.negocio.basicas;

public class Papel {
    //atributos
    private long id;
    private Usuario usuario;
    private String nome;
    private String descricao;
    //metodos
    //construtor
    public Papel() {}
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
}
