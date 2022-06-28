package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;


@SpringBootApplication
public class ProyectoU2LoApplication implements CommandLineRunner{
	
	private static Logger LOG = Logger.getLogger(ProyectoU2LoApplication.class);
	
	@Autowired
	private IPersonaJdbcService personaJdbcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		Persona persona = new Persona();
		persona.setId(4);
		persona.setNombre("Borrar");
		persona.setApellido("Cayambe");
		
//		this.personaJdbcService.guardar(persona);
		Persona persona1 = new Persona();
		persona1.setId(1);
		persona1.setNombre("A");
		persona1.setApellido("B");
		
//		this.personaJdbcService.actualizar(persona1);
		
		this.personaJdbcService.eliminar(4);
		Persona per = this.personaJdbcService.buscarPorId(1);
		LOG.info("La persona es: "+ per);
	}

}
