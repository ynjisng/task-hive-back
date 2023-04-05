package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioProjeto;
import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;

@Service
public class CadastroProjeto implements InterfaceCadastroProjeto {
    @Autowired
    private RepositorioProjeto colecaoProjeto;

    @Override
    public List<Projeto> procurarProjetoNome(String nome) {
        return colecaoProjeto.findByNomeContaining(nome);
    }

    @Override
    public Projeto procurarProjetoId(long id) {
        return colecaoProjeto.findById(id).orElse(null);
    }

    @Override
    public List<Projeto> listarProjetos() {
        return colecaoProjeto.findAll();
    }

    @Override
    public void deletarProjetoId(long id) {
        colecaoProjeto.deleteById(id);
    }

    @Override
    public Projeto salvarProjeto(Projeto entity) {
        return colecaoProjeto.save(entity);
    }

    @Override
    public void deletarProjeto(Projeto projeto) {
        colecaoProjeto.delete(projeto);
    }
}
