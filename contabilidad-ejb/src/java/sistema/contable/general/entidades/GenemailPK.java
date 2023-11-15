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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author UES_BRYAN
 */
@Embeddable
public class GenemailPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSONA")
    private BigInteger idpersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODEMAIL")
    private BigInteger modemail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATEMAIL")
    private BigInteger catemail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COREMAIL")
    private BigInteger coremail;

    public GenemailPK() {
    }

    public GenemailPK(BigInteger idpersona, BigInteger modemail, BigInteger catemail, BigInteger coremail) {
        this.idpersona = idpersona;
        this.modemail = modemail;
        this.catemail = catemail;
        this.coremail = coremail;
    }

    public BigInteger getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(BigInteger idpersona) {
        this.idpersona = idpersona;
    }

    public BigInteger getModemail() {
        return modemail;
    }

    public void setModemail(BigInteger modemail) {
        this.modemail = modemail;
    }

    public BigInteger getCatemail() {
        return catemail;
    }

    public void setCatemail(BigInteger catemail) {
        this.catemail = catemail;
    }

    public BigInteger getCoremail() {
        return coremail;
    }

    public void setCoremail(BigInteger coremail) {
        this.coremail = coremail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        hash += (modemail != null ? modemail.hashCode() : 0);
        hash += (catemail != null ? catemail.hashCode() : 0);
        hash += (coremail != null ? coremail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GenemailPK)) {
            return false;
        }
        GenemailPK other = (GenemailPK) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        if ((this.modemail == null && other.modemail != null) || (this.modemail != null && !this.modemail.equals(other.modemail))) {
            return false;
        }
        if ((this.catemail == null && other.catemail != null) || (this.catemail != null && !this.catemail.equals(other.catemail))) {
            return false;
        }
        if ((this.coremail == null && other.coremail != null) || (this.coremail != null && !this.coremail.equals(other.coremail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.GenemailPK[ idpersona=" + idpersona + ", modemail=" + modemail + ", catemail=" + catemail + ", coremail=" + coremail + " ]";
    }
    
}
