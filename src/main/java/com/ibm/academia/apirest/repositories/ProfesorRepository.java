package com.ibm.academia.apirest.repositories;

import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository 
{
	//public Iterable<Persona> buscarProfesorPorNombre(String nombre);
}