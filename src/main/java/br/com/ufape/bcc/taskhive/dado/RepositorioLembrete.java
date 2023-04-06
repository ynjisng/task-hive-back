package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;

public interface RepositorioLembrete extends JpaRepository<Lembrete, String>{
    public Lembrete findByNome(String titulo);
}
