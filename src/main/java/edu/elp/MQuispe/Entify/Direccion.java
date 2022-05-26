package edu.elp.MQuispe.Entify;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
@Inheritance( strategy = InheritanceType.JOINED )
public class Direccion  extends  Persona{

   // @OneToOne

   // @JoinColumn(name="HOME_ADDRESS_ID")

  //  private Address address;

    @Column(name = "calle", length = 10, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 10, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 10, nullable = false)
    private String estado;

    @Column(name = "codigoPostal", length = 10, nullable = false)
    private String codigoPostal;

    @Column(name = "pais", length = 10, nullable = false)
    private String pais;

    public Direccion() {
    }



    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
