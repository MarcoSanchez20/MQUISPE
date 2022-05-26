package edu.elp.MQuispe.Service;

import edu.elp.MQuispe.Entify.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura getPersonaByAsignatura(String curso);

    List<Asignatura> curso();

    List<Asignatura> curso(String asignatura);
}
