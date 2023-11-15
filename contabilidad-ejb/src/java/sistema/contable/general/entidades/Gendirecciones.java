/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "GENDIRECCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gendirecciones.findAll", query = "SELECT g FROM Gendirecciones g")
    , @NamedQuery(name = "Gendirecciones.findByIdpersona", query = "SELECT g FROM Gendirecciones g WHERE g.gendireccionesPK.idpersona = :idpersona")
    , @NamedQuery(name = "Gendirecciones.findByModdir", query = "SELECT g FROM Gendirecciones g WHERE g.gendireccionesPK.moddir = :moddir")
    , @NamedQuery(name = "Gendirecciones.findByCatdir", query = "SELECT g FROM Gendirecciones g WHERE g.gendireccionesPK.catdir = :catdir")
    , @NamedQuery(name = "Gendirecciones.findByCordir", query = "SELECT g FROM Gendirecciones g WHERE g.gendireccionesPK.cordir = :cordir")
    , @NamedQuery(name = "Gendirecciones.findByDireccion", query = "SELECT g FROM Gendirecciones g WHERE g.direccion = :direccion")})
public class Gendirecciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GendireccionesPK gendireccionesPK;
    @Size(max = 500)
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumns({
        @JoinColumn(name = "MODDIR", referencedColumnName = "CODMOD", insertable = false, updatable = false)
        , @JoinColumn(name = "CATDIR", referencedColumnName = "CODCAT", insertable = false, updatable = false)
        , @JoinColumn(name = "CORDIR", referencedColumnName = "CODCOR", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Gencorrelativos gencorrelativos;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONAS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Genpersonas genpersonas;

    public Gendirecciones() {
    }

    public Gendirecciones(GendireccionesPK gendireccionesPK) {
        this.gendireccionesPK = gendireccionesPK;
    }

    public Gendirecciones(BigInteger idpersona, BigInteger moddir, BigInteger catdir, BigInteger cordir) {
        this.gendireccionesPK = new GendireccionesPK(idpersona, moddir, catdir, cordir);
    }

    public GendireccionesPK getGendireccionesPK() {
        return gendireccionesPK;
    }

    public void setGendireccionesPK(GendireccionesPK gendireccionesPK) {
        this.gendireccionesPK = gendireccionesPK;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Gencorrelativos getGencorrelativos() {
        return gencorrelativos;
    }

    public void setGencorrelativos(Gencorrelativos gencorrelativos) {
        this.gencorrelativos = gencorrelativos;
    }

    public Genpersonas getGenpersonas() {
        return genpersonas;
    }

    public void setGenpersonas(Genpersonas genpersonas) {
        this.genpersonas = genpersonas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gendireccionesPK != null ? gendireccionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gendirecciones)) {
            return false;
        }
        Gendirecciones other = (Gendirecciones) object;
        if ((this.gendireccionesPK == null && other.gendireccionesPK != null) || (this.gendireccionesPK != null && !this.gendireccionesPK.equals(other.gendireccionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Gendirecciones[ gendireccionesPK=" + gendireccionesPK + " ]";
    }
    
}
