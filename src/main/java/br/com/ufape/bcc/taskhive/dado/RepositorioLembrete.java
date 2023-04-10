package br.com.ufape.bcc.taskhive.dado;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ufape.bcc.taskhive.negocio.basicas.Lembrete;

public interface RepositorioLembrete extends JpaRepository<Lembrete, String>{
    public Lembrete findByTitulo(String titulo);
}
