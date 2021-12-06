package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Alumno;
import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.repositories.AlumnoRepository;
import com.ibm.academia.apirest.repositories.PersonaRepository;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO 
{
	@Autowired

	public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository) 
	{
		super(repository);
	}

	@Override
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	//ESTE ES EL EXCLUSIVO DEL ALUMNO REPOSITORY
//	@Override
//	public Iterable<Persona> buscarAlumnoPorNombreCarrera(String nombre) {
//		// TODO Auto-generated method stub
//		return ((AlumnoRepository) repository).buscarAlumnoPorNombreCarrera(nombre);//TENGO QUE CASTEARLO 
//	}

}