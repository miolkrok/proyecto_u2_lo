package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.Persona;


@SpringBootApplication
public class ProyectoU2LoApplication implements CommandLineRunner{
	
	private static Logger LOG = Logger.getLogger(ProyectoU2LoApplication.class);
	
	@Autowired
	private IPersonaJdbcService personaJdbcService;
	
	@Autowired
	private IEstudianteService estudianteService;

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
		
//		this.personaJdbcService.eliminar(4);
//		Persona per = this.personaJdbcService.buscarPorId(1);
//		LOG.info("La persona es: "+ per);
		
		Estudiante estu = new Estudiante();
		estu.setId(4);
		estu.setNombre("MICHELLE");
		estu.setApellido("BENALCAZAR");
		estu.setEdad(24);
		estu.setCarrera("CINE");
		this.estudianteService.guardar(estu);
		Estudiante estu2 = new Estudiante();
		estu2.setId(2);
		estu2.setNombre("GABRIEL");
		estu2.setApellido("MONTESDEOCA");
		estu2.setEdad(25);
		estu2.setCarrera("MEDICINA");
		this.estudianteService.actualizar(estu2);
		
		this.estudianteService.eliminar(3);
		
		Estudiante  est = this.estudianteService.buscarPorId(1);
		LOG.info("El estudiante es: "+est);
	}

}
