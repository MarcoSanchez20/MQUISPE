package edu.elp.MQuispe.Entify;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Profesor extends Persona{

    @Column(name = "salario",length = 12)
    private String salario;

    public Profesor() {
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
