package com.ibm.academia.apirest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.entities.Alumno;
import com.ibm.academia.apirest.services.AlumnoDAO;
import com.ibm.academia.apirest.services.CarreraDAO;
import com.ibm.academia.apirest.services.PersonaDAO;
import com.ibm.academia.apirest.services.ProfesorDAO;


@Component
public class Comandos implements CommandLineRunner
{
	@Autowired 
	/*private CarreraDAO carreraDao;*/ //PRUEBA CREATE DE CARRERA. Esta es la inyeccion de carreras
	
	
	/*private AlumnoDAO alumnoDao;*///PRUEBA CREATE DE ALUMNO. Esta es la inyeccion de alumno
	private ProfesorDAO profesorDao; //PRUEBA CREATE DE PROFESOR. Esta es la inyeccion de profesor
	/*private EmpleadoDAO empleadoDao;*/
	
//	@Autowired 
	/*private PersonaDAO personaDao;*/
	
	@Override
	public void run(String... args) throws Exception
	{
		//RELACIONES CARRERA ALUMNO 
		/*Optional<Carrera> carrera = carreraDao.buscarPorId(1);
		
		Iterable<Persona> alumnos= personaDao.buscarTodos();
		alumnos.forEach(alumno ->((Alumno) alumno).setCarrera(carrera.get()));
		alumnos.forEach(alumno ->personaDao.guardar(alumno));*/
		
		/*Optional<Carrera>ingSistemas = carreraDao.buscarPorId(2);        
		Iterable<Persona>alumnosCarrera = ((AlumnoDAO) personaDao).buscarAlumnoPorNombreCarrera(ingSistemas.get().getNombre()); 
		alumnosCarrera.forEach(System.out::println);*/
		
		
		//PRUEBA FIND ALUMNOS
				/*List<Persona> alumnos = (List<Persona>) profesorDao.buscarTodos();
				alumnos.forEach(System.out::println);*/
				

		
		//PRUEBA FIND by id	
		/*Optional<Carrera> oCarrera = carreraDao.buscarPorId(19);
		if (oCarrera.isPresent())
		{
			 carrera = oCarrera.get();
			System.out.println(carrera.toString());
		} 
		else
		{
			System.out.println("carrera no encontrada");
		}*/
		
		
		//PRUEBA ACTUALIZAR CARRERA
		
		/*Carrera carrera = null;
		
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(2);
		if (oCarrera.isPresent())
		{
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
		} 
		else
		{
			System.out.println("carrera no encontrada");
		}
		
		carrera.setCantidadAnios(4);
		carrera.setCantidadMaterias(42);
		carreraDao.guardar(carrera);*/
		
		
		//ejemplo lamda
		
		/*Carrera carrera = null;
		
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(2);
		if (oCarrera.isPresent())
		{
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
		} 
		else
		{
			System.out.println("carrera no encontrada");
		}
		
		carrera.setCantidadAnios(4);
		carrera.setCantidadMaterias(42);
		carreraDao.guardar(carrera);
		
		System.out.println(carreraDao.buscarPorId(17).orElse(new Carrera()).toString());*/ //CON ESTO DIGO QUE SI NO LA ENCUENTRA DEBE INSERTAR UNA CARRERA CON TODOS SUS VALORES NULOS
		
		//PRUEBA ELIMINANDO CARRERAS
		/*Aquí ya sabíamos que el id 3 existía por eso lo eliminamos así sencillo Peeeero si no tocaría buscarlo primero(como en el ejemplo de arriba) y despues eliminarlo*/
		/*carreraDao.eliminarPorId(3);
		System.out.println(carreraDao.buscarPorId(3).orElse(new Carrera()).toString());*/
		
		
		
		//PRUEBA CREATE DE CARRERA
		/*Carrera odontologia = new Carrera(null, "Odontología", 52, 3);
		Carrera carreraGuardada = carreraDao.guardar(odontologia);
		System.out.println(carreraGuardada.toString());*/
		
		//PRUEBA CREATE DE ALUMNO
		/*Direccion direccion = new Direccion("Margo Street", "5", "49005731", "56C", "4", "Florida");
		Persona almumno = new Alumno(null, "Jessee", "Pinkman", "418645590", direccion);
		Persona alumnoCreado = (Alumno) alumnoDao.guardar(almumno);
		System.out.println(alumnoCreado.toString());*/
		
		
		//PRUEBA CREATE DE PROFESOR
		/*BigDecimal bd = new BigDecimal(14.750);
		Direccion direccion = new Direccion("Marietta", "7", "54029876", "42L", "3", "Georgia");
		Profesor profesor = new Profesor(null, "Nariyoshi", "Miyagi", "7841228", direccion, bd);
		Persona profesorCreado = (Profesor) profesorDao.guardar(profesor);
		System.out.println(profesorCreado.toString());*/
		
		//PRUEBA CREATE DE EMPLEADO
		/*BigDecimal bd = new BigDecimal(2.257);
		Direccion direccion = new Direccion("Marietta", "7", "54029876", "42L", "3", "Georgia");
		Empleado empleado = new Empleado(null, "Jorge", "Pérez","745819", direccion, bd, null);
		Persona empleadoCreado = (Empleado) empleadoDao.guardar(empleado);
		System.out.println(empleadoCreado.toString());*/
		
		
		
	}
}
