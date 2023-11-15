/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "GENCATALOGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gencatalogos.findAll", query = "SELECT g FROM Gencatalogos g")
    , @NamedQuery(name = "Gencatalogos.findByCodmod", query = "SELECT g FROM Gencatalogos g WHERE g.gencatalogosPK.codmod = :codmod")
    , @NamedQuery(name = "Gencatalogos.findByCodcat", query = "SELECT g FROM Gencatalogos g WHERE g.gencatalogosPK.codcat = :codcat")
    , @NamedQuery(name = "Gencatalogos.findByDescripcion", query = "SELECT g FROM Gencatalogos g WHERE g.descripcion = :descripcion")})
public class Gencatalogos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GencatalogosPK gencatalogosPK;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "CODMOD", referencedColumnName = "CODMOD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Segnmodulos segnmodulos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gencatalogos")
    private List<Gencorrelativos> gencorrelativosList;

    public Gencatalogos() {
    }

    public Gencatalogos(GencatalogosPK gencatalogosPK) {
        this.gencatalogosPK = gencatalogosPK;
    }

    public Gencatalogos(BigInteger codmod, BigInteger codcat) {
        this.gencatalogosPK = new GencatalogosPK(codmod, codcat);
    }

    public GencatalogosPK getGencatalogosPK() {
        return gencatalogosPK;
    }

    public void setGencatalogosPK(GencatalogosPK gencatalogosPK) {
        this.gencatalogosPK = gencatalogosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Segnmodulos getSegnmodulos() {
        return segnmodulos;
    }

    public void setSegnmodulos(Segnmodulos segnmodulos) {
        this.segnmodulos = segnmodulos;
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
        hash += (gencatalogosPK != null ? gencatalogosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gencatalogos)) {
            return false;
        }
        Gencatalogos other = (Gencatalogos) object;
        if ((this.gencatalogosPK == null && other.gencatalogosPK != null) || (this.gencatalogosPK != null && !this.gencatalogosPK.equals(other.gencatalogosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Gencatalogos[ gencatalogosPK=" + gencatalogosPK + " ]";
    }
    
}
