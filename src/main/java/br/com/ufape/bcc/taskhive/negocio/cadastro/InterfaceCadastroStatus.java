package br.com.ufape.bcc.taskhive.negocio.cadastro;

public interface InterfaceCadastroStatus {

    void deletarStatus(String descricao);

    void atualizarStatus(String novaDescricao);
    
}
