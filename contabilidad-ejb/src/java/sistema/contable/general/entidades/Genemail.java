/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "GENEMAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genemail.findAll", query = "SELECT g FROM Genemail g")
    , @NamedQuery(name = "Genemail.findByIdpersona", query = "SELECT g FROM Genemail g WHERE g.genemailPK.idpersona = :idpersona")
    , @NamedQuery(name = "Genemail.findByModemail", query = "SELECT g FROM Genemail g WHERE g.genemailPK.modemail = :modemail")
    , @NamedQuery(name = "Genemail.findByCatemail", query = "SELECT g FROM Genemail g WHERE g.genemailPK.catemail = :catemail")
    , @NamedQuery(name = "Genemail.findByCoremail", query = "SELECT g FROM Genemail g WHERE g.genemailPK.coremail = :coremail")
    , @NamedQuery(name = "Genemail.findByEmail", query = "SELECT g FROM Genemail g WHERE g.email = :email")})
public class Genemail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GenemailPK genemailPK;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "EMAIL")
    private String email;
    @JoinColumns({
        @JoinColumn(name = "MODEMAIL", referencedColumnName = "CODMOD", insertable = false, updatable = false)
        , @JoinColumn(name = "CATEMAIL", referencedColumnName = "CODCAT", insertable = false, updatable = false)
        , @JoinColumn(name = "COREMAIL", referencedColumnName = "CODCOR", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Gencorrelativos gencorrelativos;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONAS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Genpersonas genpersonas;

    public Genemail() {
    }

    public Genemail(GenemailPK genemailPK) {
        this.genemailPK = genemailPK;
    }

    public Genemail(GenemailPK genemailPK, String email) {
        this.genemailPK = genemailPK;
        this.email = email;
    }

    public Genemail(BigInteger idpersona, BigInteger modemail, BigInteger catemail, BigInteger coremail) {
        this.genemailPK = new GenemailPK(idpersona, modemail, catemail, coremail);
    }

    public GenemailPK getGenemailPK() {
        return genemailPK;
    }

    public void setGenemailPK(GenemailPK genemailPK) {
        this.genemailPK = genemailPK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (genemailPK != null ? genemailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genemail)) {
            return false;
        }
        Genemail other = (Genemail) object;
        if ((this.genemailPK == null && other.genemailPK != null) || (this.genemailPK != null && !this.genemailPK.equals(other.genemailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Genemail[ genemailPK=" + genemailPK + " ]";
    }
    
}
