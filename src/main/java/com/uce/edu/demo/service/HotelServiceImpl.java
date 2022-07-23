package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHabitacionRepository;
import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	
	@Autowired
	private IHotelRepository hotelRepository;
	
	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
//		List<Habitacion> habitacions= hotel.getHabitacion();
//		hotel.setHabitacion(habitacions);
		this.hotelRepository.insertar(hotel);
		//Buscar El hotel
//		String nombre = hotel.getNombre();
//		Hotel hotelBuscado = null;
//		for(Habitacion habiItem: habitacions ){
//			habiItem.setHotel(hotelBuscado);
//			this.habitacionRepository.insertar(habiItem);
//		}
	}

}
