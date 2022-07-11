package com.uce.edu.demo.service.prueba;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("liviano")
public class MatriculaLivianoServiceImpl implements IMatriculaVehiculosService{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		// TODO Auto-generated method stub
		return precio.multiply(new BigDecimal("0.10"));
	}

}
