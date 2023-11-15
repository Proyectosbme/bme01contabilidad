/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "SEGPERFILES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segperfiles.findAll", query = "SELECT s FROM Segperfiles s")
    , @NamedQuery(name = "Segperfiles.findByIdperfil", query = "SELECT s FROM Segperfiles s WHERE s.idperfil = :idperfil")
    , @NamedQuery(name = "Segperfiles.findByNombre", query = "SELECT s FROM Segperfiles s WHERE s.nombre = :nombre")})
public class Segperfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERFIL")
    private BigDecimal idperfil;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinTable(name = "SEGMENUSXPERFIL", joinColumns = {
        @JoinColumn(name = "IDPERFIL", referencedColumnName = "IDPERFIL")}, inverseJoinColumns = {
        @JoinColumn(name = "IDMENU", referencedColumnName = "IDMENU")})
    @ManyToMany
    private List<Segmenu> segmenuList;
    @OneToMany(mappedBy = "idperfil")
    private List<Segusuarios> segusuariosList;

    public Segperfiles() {
    }

    public Segperfiles(BigDecimal idperfil) {
        this.idperfil = idperfil;
    }

    public BigDecimal getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BigDecimal idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Segmenu> getSegmenuList() {
        return segmenuList;
    }

    public void setSegmenuList(List<Segmenu> segmenuList) {
        this.segmenuList = segmenuList;
    }

    @XmlTransient
    public List<Segusuarios> getSegusuariosList() {
        return segusuariosList;
    }

    public void setSegusuariosList(List<Segusuarios> segusuariosList) {
        this.segusuariosList = segusuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperfil != null ? idperfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segperfiles)) {
            return false;
        }
        Segperfiles other = (Segperfiles) object;
        if ((this.idperfil == null && other.idperfil != null) || (this.idperfil != null && !this.idperfil.equals(other.idperfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Segperfiles[ idperfil=" + idperfil + " ]";
    }
    
}
