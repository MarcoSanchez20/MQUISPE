package edu.elp.MQuispe.Service.Impl;

import edu.elp.MQuispe.Entify.Dao.IProfesorDao;
import edu.elp.MQuispe.Entify.Profesor;
import edu.elp.MQuispe.Service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService{

    @Autowired
    private IProfesorDao profesorDao;


    @Override
    public List<Profesor> listaProfesores() {
        List<Profesor> ProfesorList= this.profesorDao.findAll();
        for(Profesor Profesor:ProfesorList){
            System.out.println(Profesor.toString());
        }
            return ProfesorList;
    }

    @Override
    public Profesor obtenerProfesorByCodigo(String codProfesor) {
        return null;
    }

    @Override
    public List<Profesor> listaProfesor() {
        return null;
    }
}
