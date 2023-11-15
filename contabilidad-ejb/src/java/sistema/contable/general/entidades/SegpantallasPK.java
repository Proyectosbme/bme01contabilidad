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
public class SegpantallasPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPANTALLA")
    private BigInteger idpantalla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMODULO")
    private BigInteger idmodulo;

    public SegpantallasPK() {
    }

    public SegpantallasPK(BigInteger idpantalla, BigInteger idmodulo) {
        this.idpantalla = idpantalla;
        this.idmodulo = idmodulo;
    }

    public BigInteger getIdpantalla() {
        return idpantalla;
    }

    public void setIdpantalla(BigInteger idpantalla) {
        this.idpantalla = idpantalla;
    }

    public BigInteger getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(BigInteger idmodulo) {
        this.idmodulo = idmodulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpantalla != null ? idpantalla.hashCode() : 0);
        hash += (idmodulo != null ? idmodulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegpantallasPK)) {
            return false;
        }
        SegpantallasPK other = (SegpantallasPK) object;
        if ((this.idpantalla == null && other.idpantalla != null) || (this.idpantalla != null && !this.idpantalla.equals(other.idpantalla))) {
            return false;
        }
        if ((this.idmodulo == null && other.idmodulo != null) || (this.idmodulo != null && !this.idmodulo.equals(other.idmodulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.SegpantallasPK[ idpantalla=" + idpantalla + ", idmodulo=" + idmodulo + " ]";
    }
    
}
