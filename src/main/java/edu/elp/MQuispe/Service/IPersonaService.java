package edu.elp.MQuispe.Service;

import edu.elp.MQuispe.Entify.Persona;

import java.util.List;

public interface IPersonaService {

    //Listar personas
    List<Persona> listaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);

    Persona obtenerPersonaBynombre(String nombre);
}
