package edu.elp.MQuispe.Service;

import edu.elp.MQuispe.Entify.Profesor;

import java.util.List;

public interface IProfesorService {

    //Listar Profesores
    List<Profesor> listaProfesores();

    //Buscar Profesores por su codigo
    Profesor obtenerProfesorByCodigo(String codProfesor);

    List<Profesor> listaProfesor();
}
