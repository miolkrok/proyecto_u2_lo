package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteEdadCarreraCont;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IEmpleadoService;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.service.prueba.IGestorMatriculacionService;
import com.uce.edu.demo.service.prueba.IPropietarioService;
import com.uce.edu.demo.service.prueba.IVehiculoService;

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

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IGestorMatriculacionService gestMatrServ;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;

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

//		PersonaTo persona = new PersonaTo();
//		persona.setId(4);
//		persona.setNombre("Borrar");
//		persona.setApellido("Cayambe");
//
////		this.personaJdbcService.guardar(persona);
//		PersonaTo persona1 = new PersonaTo();
//		persona1.setId(1);
//		persona1.setNombre("A");
//		persona1.setApellido("B");

//		this.personaJdbcService.actualizar(persona1);

//		this.personaJdbcService.eliminar(4);
//		Persona per = this.personaJdbcService.buscarPorId(1);
//		LOG.info("La persona es: "+ per);

//		LOG.info("Lista: " + this.personaJdbcService.buscarTodos());

		////////////////////////// ESTUDIANTE JPA///////////////////////

//		LOG.info("DATO CON JPA ESTUDIANTE: " +this.personaJpaService.buscarPorId(4));
//		
		Estudiante estud = new Estudiante();
//		estud.setId(7);
		estud.setNombre("Ariel");
		estud.setApellido("Salgado");
		estud.setEdad(23);
		estud.setCarrera("Artes");
		
//		this.estudianteJpaService.guardar(estud);
		
		Estudiante estud2 = new Estudiante();
//		estud2.setId(5);
		estud2.setNombre("Leonel");
		estud2.setApellido("Ramos");
		estud2.setEdad(23);
		estud2.setCarrera("Medicina");
//		this.estudianteJpaService.guardar(estud2);
//		this.estudianteJpaService.actualizar(estud2);
//		
//		this.estudianteJpaService.eliminar(6);

		/////////////////////// JPA PRUEBA//////////////////////////
//		Vehiculo vehi = new Vehiculo();
//		vehi.setMarca("ford");
//		vehi.setPlaca("pdo3562");
//		vehi.setPrecio(new BigDecimal(20000));
//		vehi.setTipo("liviano");
//		this.vehiculoService.crear(vehi);
//		vehi.setMarca("FORD");
//		vehi.setPlaca("PDO-3562");
//		this.vehiculoService.actualizar(vehi);
//		Propietario prop = new Propietario();
//		prop.setNombre("LUIS");
//		prop.setApellido("ORTIZ");
//		prop.setCedula("1718496944");
//		prop.setFechaNacimiento(LocalDateTime.of(1997, 5, 19, 0, 20));
//		this.propietarioService.crear(prop);
//		MatriculaVehiculos matr = new MatriculaVehiculos();
//		matr.setPropietario(prop);
//		matr.setVehiculo(vehi);
//		this.gestMatrServ.matricular("PDO-3562", "1718496944");

		///////////////////// JPA////////////////////////////

//		LOG.info("Dato con JPA: " + this.personaJpaService.buscarPorId(3));

		// GUARDAR
		Persona per1 = new Persona();
//		per1.setId(7);
		per1.setNombre("Camila");
		per1.setApellido("Martinez");
		per1.setGenero("F");
		per1.setCedula("1765162562");
//		this.personaJpaService.guardar(per1);

		Persona per2 = new Persona();
//		per1.setId(7);
		per2.setNombre("Aiken");
		per2.setApellido("Salamanca");
		per2.setGenero("F");
		per2.setCedula("1796332654");
//		this.personaJpaService.guardar(per2);

		// ACTUALIZACION
//		Persona per2 = new Persona();
//		per2.setId(1);
//		per2.setNombre("DanielA");
//		per2.setApellido("RuizA");
//		this.personaJpaService.actualizar(per2);
//		
//		//ELIMINACION
//		this.personaJpaService.eliminar(6);

		// BUSCAR POR CEDULA
//		LOG.info("Person encontrada: " + this.personaJpaService.buscarPorCedula("1788451206"));
//		List<Persona> persoApellido = this.personaJpaService.buscarPorApellido("Perez");
//		for(Persona p : persoApellido) {
//		LOG.info("La persona es: " + p);
//	}
//		// BUSCAR POR GENERO
//		List<Persona> persoGenero = this.personaJpaService.buscarPorGenero("M");
//		for(Persona pg : persoGenero) {
//		LOG.info("La persona es: " + pg);
//		}
//		// BUSCAR POR NOMBRE
//		List<Persona> persoNombre = this.personaJpaService.buscarPorNombre("Pepito");
//		for(Persona pb : persoNombre) {
//		LOG.info("La persona es: " + pb);
//		}

//		int resultado = this.personaJpaService.actualizarPorApellido("F", "Martinez");
//		LOG.info("Cantidad de registros actualizados: " +resultado);
//		
//		int resultado2 = this.personaJpaService.eliminarPorGenero("FE");
//		LOG.info("Cantidad de registros actualizados: " +resultado2);

//		//1. TypedQuery
//		Persona persTyped = this.personaJpaService.buscarPorCedulaTyped("1765162562");
//		LOG.info("Person Typed encontrada: " + persTyped);
//		//2. NamedQuery
//		LOG.info("Person Named encontrada: " + this.personaJpaService.buscarPorCedulaNamed("1704115102"));
//		//3.TypedQuery y  NamedQuery
//		LOG.info("Person Typed Named encontrada: " + this.personaJpaService.buscarPorCedulaTypedNamed("1798541541"));
//
//		//4 VARIOS NamedQuery
//		
//		List<Persona> listaPersona = this.personaJpaService.buscarPorNombreApellidoTypedNamed("Aiken", "Salamanca");
//		for(Persona item : listaPersona) {
//		LOG.info("La persona es: " + item);
//		}
		
//		//5 NativeQuery
//		LOG.info("Persona Native encontrada: " +this.personaJpaService.buscarPorCedulaNative("1704115102"));
//		LOG.info("Persona NativeNamed encontrada: " +this.personaJpaService.buscarPorCedulaNativeNamed("1704115102"));
		//6 CRITERIA API
//		LOG.info("Persona Criteria API encontrada: " + this.personaJpaService.buscarPorCedulaCriteriaAPI("1704115102"));
		//7 CRITERIA API DINAMICOS
//		List<Persona> listaPersona = this.personaJpaService.buscarDinamicamente("Camila", "Carrion", "F");
//		for(Persona item : listaPersona) {
//		LOG.info("Persona Criteria API Dinamica encontrada: " + item);
//		}
//		List<Persona> listaPersona2 = this.personaJpaService.buscarDinamicamentePredicados("Camila", "martinez", "F");
//		for(Persona item : listaPersona2) {
//		LOG.info("Persona Criteria API Dinamica Predicados encontrada: " + item);
//		}
		//////////////PERSONA SENCILLA///////////////////////
//		List<PersonaSencilla> listaPersonaSencilla = this.personaJpaService.buscarPorApellidoSencillo("Salamanca");
//		for(PersonaSencilla item : listaPersonaSencilla) {
//		LOG.info("La persona sencilla es: " + item);
//		}
		
//		List<PersonaContadorGenero> listaPersonaGenero = this.personaJpaService.consultarCantidadPorGenero();
//		for(PersonaContadorGenero item : listaPersonaGenero) {
//		LOG.info("La persona contada tiene: " + item);
//		}
		
		
//		/////////////////////////tarea 17//////////////////
//		LOG.info("Typed: "+this.estudianteJpaService.buscarPorNombreApellidoTyped("Naomi", "Marcillo"));
//		LOG.info("Typed: "+this.estudianteJpaService.buscarPorEdadApellidoTyped(24, "Marquez"));
//		LOG.info("Named: "+this.estudianteJpaService.buscarPorNombreApellidoNamed("Naomi", "Marcillo"));
//		LOG.info("Named: "+this.estudianteJpaService.buscarPorEdadCarreraNamed(24, "Medicina"));
//		LOG.info("TypedNamed: "+this.estudianteJpaService.buscarPorNombreApellidoTypedNamed("Naomi", "Marcillo"));
//		List<Estudiante> listaEstudiante = this.estudianteJpaService.buscarPorEdadCarreraTypedNamed(23, "Medicina");
//		for(Estudiante item : listaEstudiante) {
//			LOG.info("Estudiante: " +item);
//		}
//		LOG.info("Estudiante Native encontrada: "+this.estudianteJpaService.buscarPorNombreApellidoNative("Naomi", "Marcillo"));
//		LOG.info("Estudiante Native encontrada: "+this.estudianteJpaService.buscarPorEdadCarreraNative(24,"Medicina"));
//		LOG.info("Estudiante NativeNamed encontrada: "+this.estudianteJpaService.buscarPorNombreApellidoNamedNative("Naomi", "Marcillo"));
//		LOG.info("Estudiante NativeNamed encontrada: "+this.estudianteJpaService.buscarPorEdadCarreraNamedNative(24,"Medicina"));
		
//		/////////////////////////tarea 19//////////////////
//		List<Estudiante> listaEstudiante = this.estudianteJpaService.buscaDinamicamentePorNombreApellido("Ariel", "Zaldumbide", 23);
//		for(Estudiante item : listaEstudiante) {
//		LOG.info("Estudiante Criteria API Dinamica encontrada: " + item);
//		}
//		List<Estudiante> listaEstudianteDos = this.estudianteJpaService.buscaDinamicamentePorNombreCarrera("Dario", "Medicina", 24);
//		for(Estudiante item : listaEstudianteDos) {
//		LOG.info("Estudiante Criteria API Dinamica Predicados encontrada: " + item);
//		}
//		/////////////////////////tarea 20//////////////////
//		List<EstudianteSencillo> listaEstudianteSencillo = this.estudianteJpaService.consultarPorCarreraSencilla("Medicina");
//		for(EstudianteSencillo item : listaEstudianteSencillo) {
//		LOG.info("Estudiante Sencillo encontrado: " + item);
//		}
		
//		List<EstudianteEdadCarreraCont> listaEstudianteSencilloCont = this.estudianteJpaService.consultarPorEdadCarreraCont();
//		for(EstudianteEdadCarreraCont item : listaEstudianteSencilloCont) {
//		LOG.info("Estudiante Sencillo Cantidad: " + item);
//		}
		//////CIUDADANO///////////
		Ciudadano ciu1 = new Ciudadano();
		ciu1.setNombre("Luis");
		ciu1.setApellido("Ortiz");
		Empleado emp1 = new Empleado();
		emp1.setCodigoIess("54152");
		emp1.setSalario(new BigDecimal(200));
		emp1.setCiudadano(ciu1);
		ciu1.setEmpleado(emp1);
//		this.ciudadanoService.insertar(ciu1);
		this.empleadoService.insertar(emp1);
	}

}
