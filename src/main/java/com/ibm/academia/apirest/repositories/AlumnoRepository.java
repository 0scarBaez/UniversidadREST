package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioAlumnos")
public interface AlumnoRepository extends PersonaRepository 
{
	//MÉTODO EXCLUSIVO PARA ALUMNO REPOSITORY
	
	//@Query("select a from Alumno a where a.carrera.nombre = ?1") //COMO BUSCO LAS CARRERAS DEL ALUMNO DEBEMOS HACER ALGO ESPECIAL (NOOBS)
	@Query("select a from Alumno a join fetch a.carrera c where c.nombre = ?1")
	public Iterable<Persona> buscarAlumnoPorNombreCarrera(String nombre);
}