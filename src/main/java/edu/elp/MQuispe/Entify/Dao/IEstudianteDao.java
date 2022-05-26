package edu.elp.MQuispe.Entify.Dao;

import edu.elp.MQuispe.Entify.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    @Query("SELECT p FROM Estudiante p WHERE p.codigo = ?1")
    Estudiante buscarEstudiante(String codigo);

    Estudiante findByCodigo(String codigo);




}