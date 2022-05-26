package edu.elp.MQuispe.Service.Impl;

import edu.elp.MQuispe.Entify.Asignatura;
import edu.elp.MQuispe.Entify.Dao.IAsignaturaDao;
import edu.elp.MQuispe.Service.IAsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsiganturaServiceImpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura getPersonaByAsignatura(String curso) {
        return this.asignaturaDao.findAsignaturaBycurso(curso);
    }

    @Override
    public List<Asignatura> curso() {
        return null;
    }

    @Override
    public List<Asignatura> curso(String asignatura) {
        return null;
    }
}
