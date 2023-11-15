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
public class SegusuariosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIOS")
    private BigInteger idusuarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCODUSER")
    private BigInteger idcoduser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSONA")
    private BigInteger idpersona;

    public SegusuariosPK() {
    }

    public SegusuariosPK(BigInteger idusuarios, BigInteger idcoduser, BigInteger idpersona) {
        this.idusuarios = idusuarios;
        this.idcoduser = idcoduser;
        this.idpersona = idpersona;
    }

    public BigInteger getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(BigInteger idusuarios) {
        this.idusuarios = idusuarios;
    }

    public BigInteger getIdcoduser() {
        return idcoduser;
    }

    public void setIdcoduser(BigInteger idcoduser) {
        this.idcoduser = idcoduser;
    }

    public BigInteger getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(BigInteger idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        hash += (idcoduser != null ? idcoduser.hashCode() : 0);
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegusuariosPK)) {
            return false;
        }
        SegusuariosPK other = (SegusuariosPK) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        if ((this.idcoduser == null && other.idcoduser != null) || (this.idcoduser != null && !this.idcoduser.equals(other.idcoduser))) {
            return false;
        }
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.SegusuariosPK[ idusuarios=" + idusuarios + ", idcoduser=" + idcoduser + ", idpersona=" + idpersona + " ]";
    }
    
}
