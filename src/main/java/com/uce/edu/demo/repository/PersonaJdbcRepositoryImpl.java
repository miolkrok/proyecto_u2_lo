package com.uce.edu.demo.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.Persona;

@Repository
public class PersonaJdbcRepositoryImpl implements IPersonaJdbcRepository {
	
	private static Logger LOG = Logger.getLogger(PersonaJdbcRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Persona buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Persona>(Persona.class));

	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into persona(id,nombre,apellido)values(?,?,?) ",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido() });
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update persona SET nombre= ?,apellido= ? where id=?",
				new Object[] { persona.getNombre(), persona.getApellido(), persona.getId() });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		LOG.info("Se elimino de la base de datos: " +id);
		this.jdbcTemplate.update("delete from persona where id=?", new Object[] { id });
	}

}
