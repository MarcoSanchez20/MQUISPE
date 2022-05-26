package edu.elp.MQuispe.Service.Impl;

import edu.elp.MQuispe.Entify.Dao.IEstudianteDao;
import edu.elp.MQuispe.Entify.Estudiante;
import edu.elp.MQuispe.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiantes() {
        List<Estudiante> EstudianteList = this.estudianteDao.findAll();

        for(Estudiante Estudiante:EstudianteList){
            System.out.println(Estudiante.toString());
        }
        return EstudianteList;
    }

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {
        return this.estudianteDao.buscarEstudiante(codigo);
    }

    @Override
    public Estudiante obtenerEstudianteByDireccion(String direccion) {
        return this.estudianteDao.buscarEstudiante(direccion);
    }

    @Override
    public Estudiante obtenerEstudianteByNombre(String nombre) {
        return null;
    }
}