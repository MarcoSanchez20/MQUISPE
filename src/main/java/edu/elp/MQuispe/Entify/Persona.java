package edu.elp.MQuispe.Entify;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona",nullable = false)
    private Long idpersona;

    @Column(name = "idprofesor",nullable = false)
    private Long idprofesor;

    @Column(name = "idasignatura",nullable = false)
    private Long idasignatura;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "telefono",length = 50, nullable = false)
    private String telefono;

    @Column(name = "email",length = 50, nullable = false)
    private String email;


    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", idprofesor=" + idprofesor +
                ", idasignatura=" + idasignatura +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Persona(Long idpersona, Long idprofesor, Long idasignatura, String nombre, String telefono, String email) {
        this.idpersona = idpersona;
        this.idprofesor = idprofesor;
        this.idasignatura = idasignatura;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}