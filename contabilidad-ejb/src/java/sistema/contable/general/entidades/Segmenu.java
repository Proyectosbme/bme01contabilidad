/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "SEGMENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segmenu.findAll", query = "SELECT s FROM Segmenu s")
    , @NamedQuery(name = "Segmenu.findByIdmenu", query = "SELECT s FROM Segmenu s WHERE s.idmenu = :idmenu")
    , @NamedQuery(name = "Segmenu.findByNombre", query = "SELECT s FROM Segmenu s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Segmenu.findByUsercrea", query = "SELECT s FROM Segmenu s WHERE s.usercrea = :usercrea")
    , @NamedQuery(name = "Segmenu.findByJerarquia", query = "SELECT s FROM Segmenu s WHERE s.jerarquia = :jerarquia")
    , @NamedQuery(name = "Segmenu.findByOrden", query = "SELECT s FROM Segmenu s WHERE s.orden = :orden")})
public class Segmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMENU")
    private BigInteger idmenu;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 45)
    @Column(name = "USERCREA")
    private String usercrea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JERARQUIA")
    private BigInteger jerarquia;
    @Column(name = "ORDEN")
    private BigInteger orden;
    @ManyToMany(mappedBy = "segmenuList")
    private List<Segperfiles> segperfilesList;
    @OneToMany(mappedBy = "menupa")
    private List<Segmenu> segmenuList;
    @JoinColumn(name = "MENUPA", referencedColumnName = "IDMENU")
    @ManyToOne
    private Segmenu menupa;
    @JoinColumn(name = "MODULO", referencedColumnName = "CODMOD")
    @ManyToOne
    private Segnmodulos modulo;
    @JoinColumns({
        @JoinColumn(name = "IDPANTALLA", referencedColumnName = "IDPANTALLA")
        , @JoinColumn(name = "MODULO", referencedColumnName = "IDMODULO")})
    @ManyToOne
    private Segpantallas segpantallas;

    public Segmenu() {
    }

    public Segmenu(BigInteger idmenu) {
        this.idmenu = idmenu;
    }

    public Segmenu(BigInteger idmenu, BigInteger jerarquia) {
        this.idmenu = idmenu;
        this.jerarquia = jerarquia;
    }

    public BigInteger getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(BigInteger idmenu) {
        this.idmenu = idmenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsercrea() {
        return usercrea;
    }

    public void setUsercrea(String usercrea) {
        this.usercrea = usercrea;
    }

    public BigInteger getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(BigInteger jerarquia) {
        this.jerarquia = jerarquia;
    }

    public BigInteger getOrden() {
        return orden;
    }

    public void setOrden(BigInteger orden) {
        this.orden = orden;
    }

    @XmlTransient
    public List<Segperfiles> getSegperfilesList() {
        return segperfilesList;
    }

    public void setSegperfilesList(List<Segperfiles> segperfilesList) {
        this.segperfilesList = segperfilesList;
    }

    @XmlTransient
    public List<Segmenu> getSegmenuList() {
        return segmenuList;
    }

    public void setSegmenuList(List<Segmenu> segmenuList) {
        this.segmenuList = segmenuList;
    }

    public Segmenu getMenupa() {
        return menupa;
    }

    public void setMenupa(Segmenu menupa) {
        this.menupa = menupa;
    }

    public Segnmodulos getModulo() {
        return modulo;
    }

    public void setModulo(Segnmodulos modulo) {
        this.modulo = modulo;
    }

    public Segpantallas getSegpantallas() {
        return segpantallas;
    }

    public void setSegpantallas(Segpantallas segpantallas) {
        this.segpantallas = segpantallas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segmenu)) {
            return false;
        }
        Segmenu other = (Segmenu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Segmenu[ idmenu=" + idmenu + " ]";
    }
    
}
