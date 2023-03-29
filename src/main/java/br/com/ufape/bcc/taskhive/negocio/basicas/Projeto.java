package br.com.ufape.bcc.taskhive.negocio.basicas;

public class Projeto {
    //atributos
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
}
