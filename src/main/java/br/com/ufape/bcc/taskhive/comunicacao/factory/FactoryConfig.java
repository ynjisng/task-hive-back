package br.com.ufape.bcc.taskhive.comunicacao.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

@Configuration
public class FactoryConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }

}
