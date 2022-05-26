package edu.elp.MQuispe.Entify.Dao;

import edu.elp.MQuispe.Entify.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPersonaDao extends JpaRepository<Persona,Long> {

    @Query("SELECT p FROM Persona p WHERE p.nombre = ?1")
    Persona buscarPersona(String nombre);

    Persona findByNombre(String nombre);


}