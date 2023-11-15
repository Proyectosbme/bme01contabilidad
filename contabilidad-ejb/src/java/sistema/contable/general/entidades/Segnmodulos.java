/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "SEGNMODULOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segnmodulos.findAll", query = "SELECT s FROM Segnmodulos s")
    , @NamedQuery(name = "Segnmodulos.findByCodmod", query = "SELECT s FROM Segnmodulos s WHERE s.codmod = :codmod")
    , @NamedQuery(name = "Segnmodulos.findByDescripcion", query = "SELECT s FROM Segnmodulos s WHERE s.descripcion = :descripcion")})
public class Segnmodulos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODMOD")
    private BigInteger codmod;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segnmodulos")
    private List<Gencatalogos> gencatalogosList;
    @OneToMany(mappedBy = "modulo")
    private List<Segmenu> segmenuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segnmodulos")
    private List<Segpantallas> segpantallasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segnmodulos")
    private List<Gencorrelativos> gencorrelativosList;

    public Segnmodulos() {
    }

    public Segnmodulos(BigInteger codmod) {
        this.codmod = codmod;
    }

    public BigInteger getCodmod() {
        return codmod;
    }

    public void setCodmod(BigInteger codmod) {
        this.codmod = codmod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Gencatalogos> getGencatalogosList() {
        return gencatalogosList;
    }

    public void setGencatalogosList(List<Gencatalogos> gencatalogosList) {
        this.gencatalogosList = gencatalogosList;
    }

    @XmlTransient
    public List<Segmenu> getSegmenuList() {
        return segmenuList;
    }

    public void setSegmenuList(List<Segmenu> segmenuList) {
        this.segmenuList = segmenuList;
    }

    @XmlTransient
    public List<Segpantallas> getSegpantallasList() {
        return segpantallasList;
    }

    public void setSegpantallasList(List<Segpantallas> segpantallasList) {
        this.segpantallasList = segpantallasList;
    }

    @XmlTransient
    public List<Gencorrelativos> getGencorrelativosList() {
        return gencorrelativosList;
    }

    public void setGencorrelativosList(List<Gencorrelativos> gencorrelativosList) {
        this.gencorrelativosList = gencorrelativosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmod != null ? codmod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segnmodulos)) {
            return false;
        }
        Segnmodulos other = (Segnmodulos) object;
        if ((this.codmod == null && other.codmod != null) || (this.codmod != null && !this.codmod.equals(other.codmod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Segnmodulos[ codmod=" + codmod + " ]";
    }
    
}
