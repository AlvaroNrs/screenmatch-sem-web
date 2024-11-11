package br.com.alura.screenmatch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//O Command Line Runner permite que alguma ação seja executada logo após a inicialização
//do Spring Boot (assim que o aplicativo é iniciado)
public class ScreenmatchApplicationTests implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplicationTests.class, args);
	}

	//Esse run vai ser chamado dentro do main
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro Projeto Spring Sem Web");
	}
}
