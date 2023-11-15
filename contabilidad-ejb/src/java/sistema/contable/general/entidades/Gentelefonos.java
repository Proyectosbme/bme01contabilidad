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
@Table(name = "GENTELEFONOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gentelefonos.findAll", query = "SELECT g FROM Gentelefonos g")
    , @NamedQuery(name = "Gentelefonos.findByIdpersona", query = "SELECT g FROM Gentelefonos g WHERE g.gentelefonosPK.idpersona = :idpersona")
    , @NamedQuery(name = "Gentelefonos.findByModtel", query = "SELECT g FROM Gentelefonos g WHERE g.gentelefonosPK.modtel = :modtel")
    , @NamedQuery(name = "Gentelefonos.findByCattel", query = "SELECT g FROM Gentelefonos g WHERE g.gentelefonosPK.cattel = :cattel")
    , @NamedQuery(name = "Gentelefonos.findByCortel", query = "SELECT g FROM Gentelefonos g WHERE g.gentelefonosPK.cortel = :cortel")
    , @NamedQuery(name = "Gentelefonos.findByTelefono", query = "SELECT g FROM Gentelefonos g WHERE g.telefono = :telefono")})
public class Gentelefonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GentelefonosPK gentelefonosPK;
    @Size(max = 45)
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumns({
        @JoinColumn(name = "MODTEL", referencedColumnName = "CODMOD", insertable = false, updatable = false)
        , @JoinColumn(name = "CATTEL", referencedColumnName = "CODCAT", insertable = false, updatable = false)
        , @JoinColumn(name = "CORTEL", referencedColumnName = "CODCOR", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Gencorrelativos gencorrelativos;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONAS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Genpersonas genpersonas;

    public Gentelefonos() {
    }

    public Gentelefonos(GentelefonosPK gentelefonosPK) {
        this.gentelefonosPK = gentelefonosPK;
    }

    public Gentelefonos(BigInteger idpersona, BigInteger modtel, BigInteger cattel, BigInteger cortel) {
        this.gentelefonosPK = new GentelefonosPK(idpersona, modtel, cattel, cortel);
    }

    public GentelefonosPK getGentelefonosPK() {
        return gentelefonosPK;
    }

    public void setGentelefonosPK(GentelefonosPK gentelefonosPK) {
        this.gentelefonosPK = gentelefonosPK;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (gentelefonosPK != null ? gentelefonosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gentelefonos)) {
            return false;
        }
        Gentelefonos other = (Gentelefonos) object;
        if ((this.gentelefonosPK == null && other.gentelefonosPK != null) || (this.gentelefonosPK != null && !this.gentelefonosPK.equals(other.gentelefonosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Gentelefonos[ gentelefonosPK=" + gentelefonosPK + " ]";
    }
    
}
