package br.com.ufape.bcc.taskhive.comunicacao.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.ufape.bcc.taskhive.negocio.basicas.Tarefa;

public class TarefaFactory {
    private final Faker faker;

    @Autowired
    public TarefaFactory(Faker faker) {
        this.faker = faker;
    }

    public Tarefa create() {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(faker.job().keySkills());
        return tarefa;
    }
    
}
