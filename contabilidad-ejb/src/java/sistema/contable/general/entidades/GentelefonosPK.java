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
public class GentelefonosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSONA")
    private BigInteger idpersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODTEL")
    private BigInteger modtel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATTEL")
    private BigInteger cattel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CORTEL")
    private BigInteger cortel;

    public GentelefonosPK() {
    }

    public GentelefonosPK(BigInteger idpersona, BigInteger modtel, BigInteger cattel, BigInteger cortel) {
        this.idpersona = idpersona;
        this.modtel = modtel;
        this.cattel = cattel;
        this.cortel = cortel;
    }

    public BigInteger getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(BigInteger idpersona) {
        this.idpersona = idpersona;
    }

    public BigInteger getModtel() {
        return modtel;
    }

    public void setModtel(BigInteger modtel) {
        this.modtel = modtel;
    }

    public BigInteger getCattel() {
        return cattel;
    }

    public void setCattel(BigInteger cattel) {
        this.cattel = cattel;
    }

    public BigInteger getCortel() {
        return cortel;
    }

    public void setCortel(BigInteger cortel) {
        this.cortel = cortel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        hash += (modtel != null ? modtel.hashCode() : 0);
        hash += (cattel != null ? cattel.hashCode() : 0);
        hash += (cortel != null ? cortel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GentelefonosPK)) {
            return false;
        }
        GentelefonosPK other = (GentelefonosPK) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        if ((this.modtel == null && other.modtel != null) || (this.modtel != null && !this.modtel.equals(other.modtel))) {
            return false;
        }
        if ((this.cattel == null && other.cattel != null) || (this.cattel != null && !this.cattel.equals(other.cattel))) {
            return false;
        }
        if ((this.cortel == null && other.cortel != null) || (this.cortel != null && !this.cortel.equals(other.cortel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.GentelefonosPK[ idpersona=" + idpersona + ", modtel=" + modtel + ", cattel=" + cattel + ", cortel=" + cortel + " ]";
    }
    
}
