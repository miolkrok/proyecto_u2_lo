package com.uce.edu.demo.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.EstudianteTo;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{
	
	private static Logger LOG = Logger.getLogger(EstudianteRepositoryImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EstudianteTo buscarPorId(int id) {
		// TODO Auto-generated method stub
		LOG.info("el estudiante buscado es el: " +id);
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<EstudianteTo>(EstudianteTo.class));
	}

	@Override
	public void insertar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		LOG.info("Se guardo en la base de datos el estudiante: " +estudiante);
		this.jdbcTemplate.update("insert into estudiante(id,nombre,apellido,edad,carrera)values(?,?,?,?,?) ",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getCarrera() });
	}

	@Override
	public void actualizar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		LOG.info("Se guardo en la base de datos el estudiante: " + estudiante);
		this.jdbcTemplate.update("update estudiante SET nombre= ?,apellido= ?, edad=?,carrera=? where id=?",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(),estudiante.getEdad(),estudiante.getCarrera(), estudiante.getId() });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		LOG.info("Se elimino de la base de datos: " +id);
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });
	}

}
