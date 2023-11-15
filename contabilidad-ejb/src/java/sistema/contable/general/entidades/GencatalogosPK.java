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
public class GencatalogosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODMOD")
    private BigInteger codmod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODCAT")
    private BigInteger codcat;

    public GencatalogosPK() {
    }

    public GencatalogosPK(BigInteger codmod, BigInteger codcat) {
        this.codmod = codmod;
        this.codcat = codcat;
    }

    public BigInteger getCodmod() {
        return codmod;
    }

    public void setCodmod(BigInteger codmod) {
        this.codmod = codmod;
    }

    public BigInteger getCodcat() {
        return codcat;
    }

    public void setCodcat(BigInteger codcat) {
        this.codcat = codcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmod != null ? codmod.hashCode() : 0);
        hash += (codcat != null ? codcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GencatalogosPK)) {
            return false;
        }
        GencatalogosPK other = (GencatalogosPK) object;
        if ((this.codmod == null && other.codmod != null) || (this.codmod != null && !this.codmod.equals(other.codmod))) {
            return false;
        }
        if ((this.codcat == null && other.codcat != null) || (this.codcat != null && !this.codcat.equals(other.codcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.GencatalogosPK[ codmod=" + codmod + ", codcat=" + codcat + " ]";
    }
    
}
