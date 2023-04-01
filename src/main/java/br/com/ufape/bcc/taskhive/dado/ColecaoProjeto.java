package br.com.ufape.bcc.taskhive.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Projeto;

@Repository
public interface ColecaoProjeto extends JpaRepository<Projeto, Long> {
    public List<Projeto> findByNomeContaining(String nome);
}
