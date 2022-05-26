package edu.elp.MQuispe.Service;

import edu.elp.MQuispe.Entify.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> listaEstudiantes();

    Estudiante obtenerEstudianteByCodigo(String codigo);

    Estudiante obtenerEstudianteByDireccion(String direccion);

    Estudiante obtenerEstudianteByNombre(String nombre);
}
