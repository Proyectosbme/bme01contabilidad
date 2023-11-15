/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "SEGUSUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segusuarios.findAll", query = "SELECT s FROM Segusuarios s")
    , @NamedQuery(name = "Segusuarios.findByIdusuarios", query = "SELECT s FROM Segusuarios s WHERE s.segusuariosPK.idusuarios = :idusuarios")
    , @NamedQuery(name = "Segusuarios.findByIdcoduser", query = "SELECT s FROM Segusuarios s WHERE s.segusuariosPK.idcoduser = :idcoduser")
    , @NamedQuery(name = "Segusuarios.findByIdpersona", query = "SELECT s FROM Segusuarios s WHERE s.segusuariosPK.idpersona = :idpersona")})
public class Segusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegusuariosPK segusuariosPK;
    @JoinColumn(name = "IDPERFIL", referencedColumnName = "IDPERFIL")
    @ManyToOne
    private Segperfiles idperfil;

    public Segusuarios() {
    }

    public Segusuarios(SegusuariosPK segusuariosPK) {
        this.segusuariosPK = segusuariosPK;
    }

    public Segusuarios(BigInteger idusuarios, BigInteger idcoduser, BigInteger idpersona) {
        this.segusuariosPK = new SegusuariosPK(idusuarios, idcoduser, idpersona);
    }

    public SegusuariosPK getSegusuariosPK() {
        return segusuariosPK;
    }

    public void setSegusuariosPK(SegusuariosPK segusuariosPK) {
        this.segusuariosPK = segusuariosPK;
    }

    public Segperfiles getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Segperfiles idperfil) {
        this.idperfil = idperfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segusuariosPK != null ? segusuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segusuarios)) {
            return false;
        }
        Segusuarios other = (Segusuarios) object;
        if ((this.segusuariosPK == null && other.segusuariosPK != null) || (this.segusuariosPK != null && !this.segusuariosPK.equals(other.segusuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Segusuarios[ segusuariosPK=" + segusuariosPK + " ]";
    }
    
}
