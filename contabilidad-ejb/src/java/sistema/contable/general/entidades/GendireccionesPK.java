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
public class GendireccionesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSONA")
    private BigInteger idpersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODDIR")
    private BigInteger moddir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATDIR")
    private BigInteger catdir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CORDIR")
    private BigInteger cordir;

    public GendireccionesPK() {
    }

    public GendireccionesPK(BigInteger idpersona, BigInteger moddir, BigInteger catdir, BigInteger cordir) {
        this.idpersona = idpersona;
        this.moddir = moddir;
        this.catdir = catdir;
        this.cordir = cordir;
    }

    public BigInteger getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(BigInteger idpersona) {
        this.idpersona = idpersona;
    }

    public BigInteger getModdir() {
        return moddir;
    }

    public void setModdir(BigInteger moddir) {
        this.moddir = moddir;
    }

    public BigInteger getCatdir() {
        return catdir;
    }

    public void setCatdir(BigInteger catdir) {
        this.catdir = catdir;
    }

    public BigInteger getCordir() {
        return cordir;
    }

    public void setCordir(BigInteger cordir) {
        this.cordir = cordir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        hash += (moddir != null ? moddir.hashCode() : 0);
        hash += (catdir != null ? catdir.hashCode() : 0);
        hash += (cordir != null ? cordir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GendireccionesPK)) {
            return false;
        }
        GendireccionesPK other = (GendireccionesPK) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        if ((this.moddir == null && other.moddir != null) || (this.moddir != null && !this.moddir.equals(other.moddir))) {
            return false;
        }
        if ((this.catdir == null && other.catdir != null) || (this.catdir != null && !this.catdir.equals(other.catdir))) {
            return false;
        }
        if ((this.cordir == null && other.cordir != null) || (this.cordir != null && !this.cordir.equals(other.cordir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.GendireccionesPK[ idpersona=" + idpersona + ", moddir=" + moddir + ", catdir=" + catdir + ", cordir=" + cordir + " ]";
    }
    
}
