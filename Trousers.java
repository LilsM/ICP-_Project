/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "trousers", catalog = "Project2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Trousers.findAll", query = "SELECT t FROM Trousers t")
    , @NamedQuery(name = "Trousers.findById", query = "SELECT t FROM Trousers t WHERE t.id = :id")
    , @NamedQuery(name = "Trousers.findByName", query = "SELECT t FROM Trousers t WHERE t.name = :name")
    , @NamedQuery(name = "Trousers.findByPrice", query = "SELECT t FROM Trousers t WHERE t.price = :price")
    , @NamedQuery(name = "Trousers.findByAvailability", query = "SELECT t FROM Trousers t WHERE t.availability = :availability")})
public class Trousers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "availability")
    private Boolean availability;

    public Trousers() {
    }

    public Trousers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        Boolean oldAvailability = this.availability;
        this.availability = availability;
        changeSupport.firePropertyChange("availability", oldAvailability, availability);
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
        if (!(object instanceof Trousers)) {
            return false;
        }
        Trousers other = (Trousers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project2.Trousers[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
