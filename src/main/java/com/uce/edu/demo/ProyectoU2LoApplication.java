package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2LoApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LoApplication.class);

	@Autowired
	private IPersonaJdbcService personaJdbcService;

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IPersonaJpaService personaJpaService;

	@Autowired
	private IEstudianteJpaService estudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Estudiante estu = new Estudiante();
//		estu.setId(4);
//		estu.setNombre("MICHELLE");
//		estu.setApellido("BENALCAZAR");
//		estu.setEdad(24);
//		estu.setCarrera("CINE");
//		this.estudianteService.guardar(estu);
//		Estudiante estu2 = new Estudiante();
//		estu2.setId(2);
//		estu2.setNombre("GABRIEL");
//		estu2.setApellido("MONTESDEOCA");
//		estu2.setEdad(25);
//		estu2.setCarrera("MEDICINA");
//		this.estudianteService.actualizar(estu2);
//		
//		this.estudianteService.eliminar(3);
//		
//		Estudiante  est = this.estudianteService.buscarPorId(1);
//		LOG.info("El estudiante es: "+est);

		PersonaTo persona = new PersonaTo();
		persona.setId(4);
		persona.setNombre("Borrar");
		persona.setApellido("Cayambe");

//		this.personaJdbcService.guardar(persona);
		PersonaTo persona1 = new PersonaTo();
		persona1.setId(1);
		persona1.setNombre("A");
		persona1.setApellido("B");

//		this.personaJdbcService.actualizar(persona1);

//		this.personaJdbcService.eliminar(4);
//		Persona per = this.personaJdbcService.buscarPorId(1);
//		LOG.info("La persona es: "+ per);

//		LOG.info("Lista: " + this.personaJdbcService.buscarTodos());

		///////////////////// JPA////////////////////////////

//		LOG.info("Dato con JPA: " + this.personaJpaService.buscarPorId(3));
//
//		Persona per1 = new Persona();
//		per1.setId(6);
//		per1.setNombre("Edison");
//		per1.setApellido("Cayambe");
//		// GUARDAR
//		this.personaJpaService.guardar(per1);
//		Persona per2 = new Persona();
//		per2.setId(1);
//		per2.setNombre("Daniel");
//		per2.setApellido("Ruiz");
//		this.personaJpaService.actualizar(per2);
////		
//		this.personaJpaService.eliminar(8);

		//////////////////////////ESTUDIANTE JPA///////////////////////
		
		LOG.info("DATO CON JPA ESTUDIANTE: " +this.personaJpaService.buscarPorId(4));
		
		Estudiante estud = new Estudiante();
		estud.setId(7);
		estud.setNombre("Karen");
		estud.setApellido("Zaldumbide");
		estud.setEdad(23);
		estud.setCarrera("Medicina");
		
		this.estudianteJpaService.guardar(estud);
		
		Estudiante estud2 = new Estudiante();
		estud2.setId(5);
		estud2.setNombre("Naomi");
		estud2.setApellido("Marcillo");
		estud2.setEdad(23);
		estud2.setCarrera("Administracion");
		this.estudianteJpaService.actualizar(estud2);
		
		this.estudianteJpaService.eliminar(6);
	}

}
