/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.jpa;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DESARROLLO
 */
@Entity
@Table(name = "nombre", catalog = "avasus", schema = "organizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nombre.findAll", query = "SELECT n FROM Nombre n")
    , @NamedQuery(name = "Nombre.findById", query = "SELECT n FROM Nombre n WHERE n.id = :id")
    , @NamedQuery(name = "Nombre.findByAbreviatura", query = "SELECT n FROM Nombre n WHERE n.abreviatura = :abreviatura")
    , @NamedQuery(name = "Nombre.findByRazonSocial", query = "SELECT n FROM Nombre n WHERE n.razonSocial = :razonSocial")
    , @NamedQuery(name = "Nombre.findByRuc", query = "SELECT n FROM Nombre n WHERE n.ruc = :ruc")
    , @NamedQuery(name = "Nombre.findByFecIni", query = "SELECT n FROM Nombre n WHERE n.fecIni = :fecIni")
    , @NamedQuery(name = "Nombre.findByLockReg", query = "SELECT n FROM Nombre n WHERE n.lockReg = :lockReg")
    , @NamedQuery(name = "Nombre.findByFecUpd", query = "SELECT n FROM Nombre n WHERE n.fecUpd = :fecUpd")
    , @NamedQuery(name = "Nombre.findByFirstUser", query = "SELECT n FROM Nombre n WHERE n.firstUser = :firstUser")
    , @NamedQuery(name = "Nombre.findByLastUser", query = "SELECT n FROM Nombre n WHERE n.lastUser = :lastUser")
    , @NamedQuery(name = "Nombre.findByFirstOid", query = "SELECT n FROM Nombre n WHERE n.firstOid = :firstOid")
    , @NamedQuery(name = "Nombre.findByLastOid", query = "SELECT n FROM Nombre n WHERE n.lastOid = :lastOid")
    , @NamedQuery(name = "Nombre.findByContacto", query = "SELECT n FROM Nombre n WHERE n.contacto = :contacto")
    , @NamedQuery(name = "Nombre.findByDireccion", query = "SELECT n FROM Nombre n WHERE n.direccion = :direccion")
    , @NamedQuery(name = "Nombre.findByTelefono", query = "SELECT n FROM Nombre n WHERE n.telefono = :telefono")
    , @NamedQuery(name = "Nombre.findByCodRef", query = "SELECT n FROM Nombre n WHERE n.codRef = :codRef")})
public class Nombre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "abreviatura", nullable = false, length = 64)
    private String abreviatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "razon_social", nullable = false, length = 256)
    private String razonSocial;
    @Size(max = 15)
    @Column(name = "ruc", length = 15)
    private String ruc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_ini", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lock_reg", nullable = false)
    private short lockReg;
    @Column(name = "fec_upd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecUpd;
    @Size(max = 15)
    @Column(name = "first_user", length = 15)
    private String firstUser;
    @Size(max = 15)
    @Column(name = "last_user", length = 15)
    private String lastUser;
    @Column(name = "first_oid")
    private BigInteger firstOid;
    @Column(name = "last_oid")
    private BigInteger lastOid;
    @Size(max = 128)
    @Column(name = "contacto", length = 128)
    private String contacto;
    @Size(max = 256)
    @Column(name = "direccion", length = 256)
    private String direccion;
    @Size(max = 25)
    @Column(name = "telefono", length = 25)
    private String telefono;
    @Column(name = "cod_ref")
    private Integer codRef;

    public Nombre() {
    }

    public Nombre(Long id) {
        this.id = id;
    }

    public Nombre(Long id, String abreviatura, String razonSocial, Date fecIni, short lockReg) {
        this.id = id;
        this.abreviatura = abreviatura;
        this.razonSocial = razonSocial;
        this.fecIni = fecIni;
        this.lockReg = lockReg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public short getLockReg() {
        return lockReg;
    }

    public void setLockReg(short lockReg) {
        this.lockReg = lockReg;
    }

    public Date getFecUpd() {
        return fecUpd;
    }

    public void setFecUpd(Date fecUpd) {
        this.fecUpd = fecUpd;
    }

    public String getFirstUser() {
        return firstUser;
    }

    public void setFirstUser(String firstUser) {
        this.firstUser = firstUser;
    }

    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }

    public BigInteger getFirstOid() {
        return firstOid;
    }

    public void setFirstOid(BigInteger firstOid) {
        this.firstOid = firstOid;
    }

    public BigInteger getLastOid() {
        return lastOid;
    }

    public void setLastOid(BigInteger lastOid) {
        this.lastOid = lastOid;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCodRef() {
        return codRef;
    }

    public void setCodRef(Integer codRef) {
        this.codRef = codRef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nombre)) {
            return false;
        }
        Nombre other = (Nombre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "empresa.jpa.Nombre[ id=" + id + " ]";
    }
    
}
