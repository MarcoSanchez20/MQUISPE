package edu.elp.MQuispe.Entify;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona{

    @Column(name = "codigo", length = 10, nullable = false)
    private static String codigo;

    @Column(name = "serie",length = 8)
    private static String serie;

    public Estudiante () {
    }

    public Estudiante(Long idpersona, Long idprofesor, Long idasignatura, String nombre, String telefono, String email) {
        super(idpersona, idprofesor, idasignatura, nombre, telefono, email);
    }

    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String codigo) {
        Estudiante.codigo = codigo;
    }

    public static String getSerie() {
        return serie;
    }

    public static void setSerie(String serie) {
        Estudiante.serie = serie;
    }
}
