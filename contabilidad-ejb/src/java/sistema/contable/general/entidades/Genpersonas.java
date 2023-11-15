/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author UES_BRYAN
 */
@Entity
@Table(name = "GENPERSONAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genpersonas.findAll", query = "SELECT g FROM Genpersonas g")
    , @NamedQuery(name = "Genpersonas.findByIdpersonas", query = "SELECT g FROM Genpersonas g WHERE g.idpersonas = :idpersonas")
    , @NamedQuery(name = "Genpersonas.findByPnombre", query = "SELECT g FROM Genpersonas g WHERE g.pnombre = :pnombre")
    , @NamedQuery(name = "Genpersonas.findBySnombre", query = "SELECT g FROM Genpersonas g WHERE g.snombre = :snombre")
    , @NamedQuery(name = "Genpersonas.findByPapellido", query = "SELECT g FROM Genpersonas g WHERE g.papellido = :papellido")
    , @NamedQuery(name = "Genpersonas.findBySapellido", query = "SELECT g FROM Genpersonas g WHERE g.sapellido = :sapellido")
    , @NamedQuery(name = "Genpersonas.findByFchanac", query = "SELECT g FROM Genpersonas g WHERE g.fchanac = :fchanac")
    , @NamedQuery(name = "Genpersonas.findByFchacrea", query = "SELECT g FROM Genpersonas g WHERE g.fchacrea = :fchacrea")
    , @NamedQuery(name = "Genpersonas.findByUsuaricrea", query = "SELECT g FROM Genpersonas g WHERE g.usuaricrea = :usuaricrea")
    , @NamedQuery(name = "Genpersonas.findByTercernombre", query = "SELECT g FROM Genpersonas g WHERE g.tercernombre = :tercernombre")
    , @NamedQuery(name = "Genpersonas.findBySexo", query = "SELECT g FROM Genpersonas g WHERE g.sexo = :sexo")})
public class Genpersonas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSONAS")
    private BigInteger idpersonas;
    @Size(max = 45)
    @Column(name = "PNOMBRE")
    private String pnombre;
    @Size(max = 45)
    @Column(name = "SNOMBRE")
    private String snombre;
    @Size(max = 45)
    @Column(name = "PAPELLIDO")
    private String papellido;
    @Size(max = 45)
    @Column(name = "SAPELLIDO")
    private String sapellido;
    @Column(name = "FCHANAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchanac;
    @Column(name = "FCHACREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchacrea;
    @Size(max = 45)
    @Column(name = "USUARICREA")
    private String usuaricrea;
    @Size(max = 100)
    @Column(name = "TERCERNOMBRE")
    private String tercernombre;
    @Size(max = 1)
    @Column(name = "SEXO")
    private String sexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genpersonas")
    private List<Genemail> genemailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genpersonas")
    private List<Gentelefonos> gentelefonosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genpersonas")
    private List<Gendirecciones> gendireccionesList;

    public Genpersonas() {
    }

    public Genpersonas(BigInteger idpersonas) {
        this.idpersonas = idpersonas;
    }

    public BigInteger getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(BigInteger idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public Date getFchanac() {
        return fchanac;
    }

    public void setFchanac(Date fchanac) {
        this.fchanac = fchanac;
    }

    public Date getFchacrea() {
        return fchacrea;
    }

    public void setFchacrea(Date fchacrea) {
        this.fchacrea = fchacrea;
    }

    public String getUsuaricrea() {
        return usuaricrea;
    }

    public void setUsuaricrea(String usuaricrea) {
        this.usuaricrea = usuaricrea;
    }

    public String getTercernombre() {
        return tercernombre;
    }

    public void setTercernombre(String tercernombre) {
        this.tercernombre = tercernombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @XmlTransient
    public List<Genemail> getGenemailList() {
        return genemailList;
    }

    public void setGenemailList(List<Genemail> genemailList) {
        this.genemailList = genemailList;
    }

    @XmlTransient
    public List<Gentelefonos> getGentelefonosList() {
        return gentelefonosList;
    }

    public void setGentelefonosList(List<Gentelefonos> gentelefonosList) {
        this.gentelefonosList = gentelefonosList;
    }

    @XmlTransient
    public List<Gendirecciones> getGendireccionesList() {
        return gendireccionesList;
    }

    public void setGendireccionesList(List<Gendirecciones> gendireccionesList) {
        this.gendireccionesList = gendireccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonas != null ? idpersonas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genpersonas)) {
            return false;
        }
        Genpersonas other = (Genpersonas) object;
        if ((this.idpersonas == null && other.idpersonas != null) || (this.idpersonas != null && !this.idpersonas.equals(other.idpersonas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.contable.general.entidades.Genpersonas[ idpersonas=" + idpersonas + " ]";
    }
    
}
