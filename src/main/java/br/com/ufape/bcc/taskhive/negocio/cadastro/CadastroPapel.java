package br.com.ufape.bcc.taskhive.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufape.bcc.taskhive.dado.RepositorioPapel;
import br.com.ufape.bcc.taskhive.negocio.basicas.Papel;

@Service
public class CadastroPapel implements InterfaceCadastroPapel {
    @Autowired
    private RepositorioPapel colecaoPapel;

    @Override
    public Papel procurarPapelId(long id) {
        return colecaoPapel.findById(id);
    }

    @Override
    public Papel salvarPapel(Papel p) {
        return colecaoPapel.save(p);
    }

    @Override
    public List<Papel> listarPapeis() {
        return colecaoPapel.findAll();
    }
}
