package edu.elp.MQuispe.Service.Impl;

import edu.elp.MQuispe.Entify.Dao.IPersonaDao;
import edu.elp.MQuispe.Entify.Persona;
import edu.elp.MQuispe.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {


    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for(Persona persona:personaList ){
            System.out.println(persona.toString());
        }
        return personaList;
    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return null;
    }

    @Override
    public Persona obtenerPersonaBynombre(String nombre) {
        return this.personaDao.buscarPersona(nombre);
    }
}