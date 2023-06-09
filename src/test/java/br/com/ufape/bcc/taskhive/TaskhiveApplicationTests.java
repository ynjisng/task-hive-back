package br.com.ufape.bcc.taskhive;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;

@SpringBootTest
class TaskhiveApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
    private DataSource dataSource;

    @Test
    public void testDatabaseConnection() {
        System.out.println("Testing database connection...");
        System.out.println("dataSource: " + dataSource);
        assertNotNull(dataSource);
	}
    
    @AfterAll
    @Transactional
    public static void tearDown() {        
        System.out.println("Closing database connection...");
        // Rola de volta todas as transações abertas antes de desconectar o banco de dados. 
    }

}
