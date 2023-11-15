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
import javax.persistence.JoinColumns;
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
@Table(name = "GENCORRELATIVOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gencorrelativos.findAll", query = "SELECT g FROM Gencorrelativos g")
    , @NamedQuery(name = "Gencorrelativos.findByCodmod", query = "SELECT g FROM Gencorrelativos g WHERE g.gencorrelativosPK.codmod = :codmod")
    , @NamedQuery(name = "Gencorrelativos.findByCodcat", query = "SELECT g FROM Gencorrelativos g WHERE g.gencorrelativosPK.codcat = :codcat")
    , @NamedQuery(name = "Gencorrelativos.findByCodcor", query = "SELECT g FROM Gencorrelativos g WHERE g.gencorrelativosPK.codcor = :codcor")
    , @NamedQuery(name = "Gencorrelativos.findByDescripcion", query = "SELECT g FROM Gencorrelativos g WHERE g.descripcion = :descripcion")})
public class Gencorrelativos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GencorrelativosPK gencorrelativosPK;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gencorrelativos")
    private List<Genemail> genemailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gencorrelativos")
    private List<Gentelefonos> gentelefonosList;
    @JoinColumns({
        @JoinColumn(name = "CODMOD", referencedColumnName = "CODMOD", insertable = false, updatable = false)
        , @JoinColumn(name = "CODCAT", referencedColumnName = "CODCAT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Gencatalogos gencatalogos;
    @JoinColumn(name = "CODMOD", referencedColumnName = "CODMOD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Segnmodulos segnmodulos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gencorrelativos")
    private List<Gendirecciones> gendireccionesList;

    public Gencorrelativos() {
    }

    public Gencorrelativos(GencorrelativosPK gencorrelativosPK) {
        this.gencorrelativosPK = gencorrelativosPK;
    }

    public Gencorrelativos(BigInteger codmod, BigInteger codcat, BigInteger codcor) {
        this.gencorrelativosPK = new GencorrelativosPK(codmod, codcat, codcor);
    }

    public GencorrelativosPK getGencorrelativosPK() {
        return gencorrelativosPK;
    }

    public void setGencorrelativosPK(GencorrelativosPK gencorrelativosPK) {
        this.gencorrelativosPK = gencorrelativosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Genemail> getGenemailList() {
        return genemailList;
    }

    public void setGenemailList(List<Genemail> genemailList) {
        this.genemailList = genemailList;
    }

    @XmlTransient
    public List<Gentelefonos> getGentelefonosList() {
        return gentelefonosList;
    }

    public void setGentelefonosList(List<Gentelefonos> gentelefonosList) {
        this.gentelefonosList = gentelefonosList;
    }

    public Gencatalogos getGencatalogos() {
        return gencatalogos;
    }

    public void setGencatalogos(Gencatalogos gencatalogos) {
        this.gencatalogos = gencatalogos;
    }

    public Segnmodulos getSegnmodulos() {
        return segnmodulos;
    }

    public void setSegnmodulos(Segnmodulos segnmodulos) {
        this.segnmodulos = segnmodulos;
    }

    @XmlTransient
    public List<Gendirecciones> getGendireccionesList() {
        return gendireccionesList;
    }

    public void setGendireccionesList(List<Gendirecciones> gendireccionesList) {
        this.gendireccionesList = gendireccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gencorrelativosPK != null ? gencorrelativosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gencorrelativos)) {
            return false;
        }
        Gencorrelativos other = (Gencorrelativos) object;
        if ((this.gencorrelativosPK == null && other.gencorrelativosPK != null) || (this.gencorrelativosPK != null && !this.gencorrelativosPK.equals(other.gencorrelativosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Gencorrelativos[ gencorrelativosPK=" + gencorrelativosPK + " ]";
    }
    
}
