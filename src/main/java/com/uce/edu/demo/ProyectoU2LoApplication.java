package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectoU2LoApplication implements CommandLineRunner{
	
	private static Logger LOG = Logger.getLogger(ProyectoU2LoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		//Configuracion de logs// log4j
		LOG.info("Hola Mundo");
	}

}
