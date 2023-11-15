/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "SEGPANTALLAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segpantallas.findAll", query = "SELECT s FROM Segpantallas s")
    , @NamedQuery(name = "Segpantallas.findByIdpantalla", query = "SELECT s FROM Segpantallas s WHERE s.segpantallasPK.idpantalla = :idpantalla")
    , @NamedQuery(name = "Segpantallas.findByNombre", query = "SELECT s FROM Segpantallas s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Segpantallas.findByUrl", query = "SELECT s FROM Segpantallas s WHERE s.url = :url")
    , @NamedQuery(name = "Segpantallas.findByIdmodulo", query = "SELECT s FROM Segpantallas s WHERE s.segpantallasPK.idmodulo = :idmodulo")})
public class Segpantallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegpantallasPK segpantallasPK;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 100)
    @Column(name = "URL")
    private String url;
    @OneToMany(mappedBy = "segpantallas")
    private List<Segmenu> segmenuList;
    @JoinColumn(name = "IDMODULO", referencedColumnName = "CODMOD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Segnmodulos segnmodulos;

    public Segpantallas() {
    }

    public Segpantallas(SegpantallasPK segpantallasPK) {
        this.segpantallasPK = segpantallasPK;
    }

    public Segpantallas(BigInteger idpantalla, BigInteger idmodulo) {
        this.segpantallasPK = new SegpantallasPK(idpantalla, idmodulo);
    }

    public SegpantallasPK getSegpantallasPK() {
        return segpantallasPK;
    }

    public void setSegpantallasPK(SegpantallasPK segpantallasPK) {
        this.segpantallasPK = segpantallasPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public List<Segmenu> getSegmenuList() {
        return segmenuList;
    }

    public void setSegmenuList(List<Segmenu> segmenuList) {
        this.segmenuList = segmenuList;
    }

    public Segnmodulos getSegnmodulos() {
        return segnmodulos;
    }

    public void setSegnmodulos(Segnmodulos segnmodulos) {
        this.segnmodulos = segnmodulos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segpantallasPK != null ? segpantallasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segpantallas)) {
            return false;
        }
        Segpantallas other = (Segpantallas) object;
        if ((this.segpantallasPK == null && other.segpantallasPK != null) || (this.segpantallasPK != null && !this.segpantallasPK.equals(other.segpantallasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Segpantallas[ segpantallasPK=" + segpantallasPK + " ]";
    }
    
}
